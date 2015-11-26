/*
 * Copyright 2009 Prime Technology.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.component.chart.bar;

import org.primefaces.component.chart.UIChart;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class BarChart extends UIChart implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.component.chart.BarChart";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.chart.BarChartRenderer";

	private java.lang.Object _yfield;
	private java.lang.Double _minX;
	private java.lang.Double _maxX;
	private java.lang.String _titleX;
	private java.lang.String _titleY;
	private java.lang.String _labelFunctionX;
	private java.lang.String _labelFunctionY;
	public BarChart() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/datasource/datasource-min.js");
			resourceHolder.addResource("/yui/swf/swf-min.js");
			resourceHolder.addResource("/yui/charts/charts-min.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/charts/charts.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.Object getYfield() {
		if(_yfield != null )
			return _yfield;

		ValueExpression ve = getValueExpression("yfield");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setYfield(java.lang.Object _yfield) {
		this._yfield = _yfield;
	}

	public double getMinX() {
		if(_minX != null )
			return _minX;

		ValueExpression ve = getValueExpression("minX");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : java.lang.Double.MIN_VALUE;
	}
	public void setMinX(double _minX) {
		this._minX = _minX;
	}

	public double getMaxX() {
		if(_maxX != null )
			return _maxX;

		ValueExpression ve = getValueExpression("maxX");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : java.lang.Double.MIN_VALUE;
	}
	public void setMaxX(double _maxX) {
		this._maxX = _maxX;
	}

	public java.lang.String getTitleX() {
		if(_titleX != null )
			return _titleX;

		ValueExpression ve = getValueExpression("titleX");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setTitleX(java.lang.String _titleX) {
		this._titleX = _titleX;
	}

	public java.lang.String getTitleY() {
		if(_titleY != null )
			return _titleY;

		ValueExpression ve = getValueExpression("titleY");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setTitleY(java.lang.String _titleY) {
		this._titleY = _titleY;
	}

	public java.lang.String getLabelFunctionX() {
		if(_labelFunctionX != null )
			return _labelFunctionX;

		ValueExpression ve = getValueExpression("labelFunctionX");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setLabelFunctionX(java.lang.String _labelFunctionX) {
		this._labelFunctionX = _labelFunctionX;
	}

	public java.lang.String getLabelFunctionY() {
		if(_labelFunctionY != null )
			return _labelFunctionY;

		ValueExpression ve = getValueExpression("labelFunctionY");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setLabelFunctionY(java.lang.String _labelFunctionY) {
		this._labelFunctionY = _labelFunctionY;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}

	public void encodePartially(FacesContext facesContext) throws IOException {
		Renderer renderer = getRenderer(facesContext);

		if(renderer instanceof PartialRenderer) {
			((PartialRenderer)renderer).encodePartially(facesContext, this);
		}
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[8];
		values[0] = super.saveState(context);
		values[1] = _yfield;
		values[2] = _minX;
		values[3] = _maxX;
		values[4] = _titleX;
		values[5] = _titleY;
		values[6] = _labelFunctionX;
		values[7] = _labelFunctionY;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_yfield = (java.lang.Object) values[1];
		_minX = (java.lang.Double) values[2];
		_maxX = (java.lang.Double) values[3];
		_titleX = (java.lang.String) values[4];
		_titleY = (java.lang.String) values[5];
		_labelFunctionX = (java.lang.String) values[6];
		_labelFunctionY = (java.lang.String) values[7];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}