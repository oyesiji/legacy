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
package org.primefaces.component.chart.pie;

import org.primefaces.component.chart.UIChart;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class PieChart extends UIChart implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.component.chart.PieChart";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.chart.PieChartRenderer";

	private java.lang.Object _categoryField;
	private java.lang.Object _dataField;
	private java.lang.String _seriesStyle;
	public PieChart() {
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

	public java.lang.Object getCategoryField() {
		if(_categoryField != null )
			return _categoryField;

		ValueExpression ve = getValueExpression("categoryField");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setCategoryField(java.lang.Object _categoryField) {
		this._categoryField = _categoryField;
	}

	public java.lang.Object getDataField() {
		if(_dataField != null )
			return _dataField;

		ValueExpression ve = getValueExpression("dataField");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setDataField(java.lang.Object _dataField) {
		this._dataField = _dataField;
	}

	public java.lang.String getSeriesStyle() {
		if(_seriesStyle != null )
			return _seriesStyle;

		ValueExpression ve = getValueExpression("seriesStyle");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSeriesStyle(java.lang.String _seriesStyle) {
		this._seriesStyle = _seriesStyle;
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
		values[1] = _categoryField;
		values[2] = _dataField;
		values[3] = _seriesStyle;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_categoryField = (java.lang.Object) values[1];
		_dataField = (java.lang.Object) values[2];
		_seriesStyle = (java.lang.String) values[3];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}