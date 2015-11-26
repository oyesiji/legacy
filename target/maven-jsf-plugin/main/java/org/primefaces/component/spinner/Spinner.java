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
package org.primefaces.component.spinner;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Spinner extends UIInput {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Spinner";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.SpinnerRenderer";

	private java.lang.Double _stepFactor;
	private java.lang.Double _min;
	private java.lang.Double _max;
	private java.lang.String _prefix;
	private java.lang.String _suffix;
	private java.lang.String _showOn;
	private java.lang.Integer _width;
	public Spinner() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/spinner/ui.spinner.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/jquery/plugins/spinner/ui.spinner.min.js");
			resourceHolder.addResource("/primefaces/core/core.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public double getStepFactor() {
		if(_stepFactor != null )
			return _stepFactor;

		ValueExpression ve = getValueExpression("stepFactor");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : 1.0;
	}
	public void setStepFactor(double _stepFactor) {
		this._stepFactor = _stepFactor;
	}

	public double getMin() {
		if(_min != null )
			return _min;

		ValueExpression ve = getValueExpression("min");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : java.lang.Double.MIN_VALUE;
	}
	public void setMin(double _min) {
		this._min = _min;
	}

	public double getMax() {
		if(_max != null )
			return _max;

		ValueExpression ve = getValueExpression("max");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : java.lang.Double.MAX_VALUE;
	}
	public void setMax(double _max) {
		this._max = _max;
	}

	public java.lang.String getPrefix() {
		if(_prefix != null )
			return _prefix;

		ValueExpression ve = getValueExpression("prefix");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setPrefix(java.lang.String _prefix) {
		this._prefix = _prefix;
	}

	public java.lang.String getSuffix() {
		if(_suffix != null )
			return _suffix;

		ValueExpression ve = getValueExpression("suffix");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSuffix(java.lang.String _suffix) {
		this._suffix = _suffix;
	}

	public java.lang.String getShowOn() {
		if(_showOn != null )
			return _showOn;

		ValueExpression ve = getValueExpression("showOn");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setShowOn(java.lang.String _showOn) {
		this._showOn = _showOn;
	}

	public int getWidth() {
		if(_width != null )
			return _width;

		ValueExpression ve = getValueExpression("width");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : java.lang.Integer.MIN_VALUE;
	}
	public void setWidth(int _width) {
		this._width = _width;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[8];
		values[0] = super.saveState(context);
		values[1] = _stepFactor;
		values[2] = _min;
		values[3] = _max;
		values[4] = _prefix;
		values[5] = _suffix;
		values[6] = _showOn;
		values[7] = _width;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_stepFactor = (java.lang.Double) values[1];
		_min = (java.lang.Double) values[2];
		_max = (java.lang.Double) values[3];
		_prefix = (java.lang.String) values[4];
		_suffix = (java.lang.String) values[5];
		_showOn = (java.lang.String) values[6];
		_width = (java.lang.Integer) values[7];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}