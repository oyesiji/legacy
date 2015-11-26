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
package org.primefaces.component.chart.series;

import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class ChartSeries extends UIOutput {


	public static final String COMPONENT_TYPE = "org.primefaces.component.chart.ChartSeries";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";

	private java.lang.String _label;
	private java.lang.String _style;
	public ChartSeries() {
		setRendererType(null);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getLabel() {
		if(_label != null )
			return _label;

		ValueExpression ve = getValueExpression("label");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setLabel(java.lang.String _label) {
		this._label = _label;
	}

	public java.lang.String getStyle() {
		if(_style != null )
			return _style;

		ValueExpression ve = getValueExpression("style");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStyle(java.lang.String _style) {
		this._style = _style;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[3];
		values[0] = super.saveState(context);
		values[1] = _label;
		values[2] = _style;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_label = (java.lang.String) values[1];
		_style = (java.lang.String) values[2];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}