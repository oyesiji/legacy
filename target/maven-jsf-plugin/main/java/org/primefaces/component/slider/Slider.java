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
package org.primefaces.component.slider;

import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Slider extends UIOutput {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Slider";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.SliderRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _for;
	private java.lang.String _display;
	private java.lang.Integer _minValue;
	private java.lang.Integer _maxValue;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.Boolean _animate;
	private java.lang.String _type;
	private java.lang.Integer _step;
	private java.lang.Boolean _disabled;
	public Slider() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.slider.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/slider/slider.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getWidgetVar() {
		if(_widgetVar != null )
			return _widgetVar;

		ValueExpression ve = getValueExpression("widgetVar");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setWidgetVar(java.lang.String _widgetVar) {
		this._widgetVar = _widgetVar;
	}

	public java.lang.String getFor() {
		if(_for != null )
			return _for;

		ValueExpression ve = getValueExpression("for");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setFor(java.lang.String _for) {
		this._for = _for;
	}

	public java.lang.String getDisplay() {
		if(_display != null )
			return _display;

		ValueExpression ve = getValueExpression("display");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setDisplay(java.lang.String _display) {
		this._display = _display;
	}

	public int getMinValue() {
		if(_minValue != null )
			return _minValue;

		ValueExpression ve = getValueExpression("minValue");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 0;
	}
	public void setMinValue(int _minValue) {
		this._minValue = _minValue;
	}

	public int getMaxValue() {
		if(_maxValue != null )
			return _maxValue;

		ValueExpression ve = getValueExpression("maxValue");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 100;
	}
	public void setMaxValue(int _maxValue) {
		this._maxValue = _maxValue;
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

	public java.lang.String getStyleClass() {
		if(_styleClass != null )
			return _styleClass;

		ValueExpression ve = getValueExpression("styleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStyleClass(java.lang.String _styleClass) {
		this._styleClass = _styleClass;
	}

	public boolean isAnimate() {
		if(_animate != null )
			return _animate;

		ValueExpression ve = getValueExpression("animate");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setAnimate(boolean _animate) {
		this._animate = _animate;
	}

	public java.lang.String getType() {
		if(_type != null )
			return _type;

		ValueExpression ve = getValueExpression("type");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "horizontal";
	}
	public void setType(java.lang.String _type) {
		this._type = _type;
	}

	public int getStep() {
		if(_step != null )
			return _step;

		ValueExpression ve = getValueExpression("step");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1;
	}
	public void setStep(int _step) {
		this._step = _step;
	}

	public boolean isDisabled() {
		if(_disabled != null )
			return _disabled;

		ValueExpression ve = getValueExpression("disabled");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDisabled(boolean _disabled) {
		this._disabled = _disabled;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[12];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _for;
		values[3] = _display;
		values[4] = _minValue;
		values[5] = _maxValue;
		values[6] = _style;
		values[7] = _styleClass;
		values[8] = _animate;
		values[9] = _type;
		values[10] = _step;
		values[11] = _disabled;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_for = (java.lang.String) values[2];
		_display = (java.lang.String) values[3];
		_minValue = (java.lang.Integer) values[4];
		_maxValue = (java.lang.Integer) values[5];
		_style = (java.lang.String) values[6];
		_styleClass = (java.lang.String) values[7];
		_animate = (java.lang.Boolean) values[8];
		_type = (java.lang.String) values[9];
		_step = (java.lang.Integer) values[10];
		_disabled = (java.lang.Boolean) values[11];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}