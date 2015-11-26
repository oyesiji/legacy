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
package org.primefaces.component.chart.stackedcolumn;

import org.primefaces.component.chart.UIChart;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class StackedColumnChart extends UIChart implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.component.chart.StackedColumnChart";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.chart.StackedColumnChartRenderer";

	private java.lang.Object _xfield;
	private java.lang.Double _minY;
	private java.lang.Double _maxY;
	public StackedColumnChart() {
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

	public java.lang.Object getXfield() {
		if(_xfield != null )
			return _xfield;

		ValueExpression ve = getValueExpression("xfield");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setXfield(java.lang.Object _xfield) {
		this._xfield = _xfield;
	}

	public double getMinY() {
		if(_minY != null )
			return _minY;

		ValueExpression ve = getValueExpression("minY");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : java.lang.Double.MIN_VALUE;
	}
	public void setMinY(double _minY) {
		this._minY = _minY;
	}

	public double getMaxY() {
		if(_maxY != null )
			return _maxY;

		ValueExpression ve = getValueExpression("maxY");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : java.lang.Double.MIN_VALUE;
	}
	public void setMaxY(double _maxY) {
		this._maxY = _maxY;
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
		Object values[] = new Object[4];
		values[0] = super.saveState(context);
		values[1] = _xfield;
		values[2] = _minY;
		values[3] = _maxY;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_xfield = (java.lang.Object) values[1];
		_minY = (java.lang.Double) values[2];
		_maxY = (java.lang.Double) values[3];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}