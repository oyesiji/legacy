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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class SliderTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _converter;
	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _for;
	private javax.el.ValueExpression _display;
	private javax.el.ValueExpression _minValue;
	private javax.el.ValueExpression _maxValue;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _animate;
	private javax.el.ValueExpression _type;
	private javax.el.ValueExpression _step;
	private javax.el.ValueExpression _disabled;

	public void release(){
		super.release();
		this._value = null;
		this._converter = null;
		this._widgetVar = null;
		this._for = null;
		this._display = null;
		this._minValue = null;
		this._maxValue = null;
		this._style = null;
		this._styleClass = null;
		this._animate = null;
		this._type = null;
		this._step = null;
		this._disabled = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.slider.Slider component = null;
		try {
			component = (org.primefaces.component.slider.Slider) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_converter != null) {
			component.setValueExpression("converter", _converter);
		}
		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_for != null) {
			component.setValueExpression("for", _for);
		}
		if(_display != null) {
			component.setValueExpression("display", _display);
		}
		if(_minValue != null) {
			component.setValueExpression("minValue", _minValue);
		}
		if(_maxValue != null) {
			component.setValueExpression("maxValue", _maxValue);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_animate != null) {
			component.setValueExpression("animate", _animate);
		}
		if(_type != null) {
			component.setValueExpression("type", _type);
		}
		if(_step != null) {
			component.setValueExpression("step", _step);
		}
		if(_disabled != null) {
			component.setValueExpression("disabled", _disabled);
		}
	}

	public String getComponentType() {
		return Slider.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.SliderRenderer";
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setConverter(javax.el.ValueExpression expression){
		this._converter = expression;
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setFor(javax.el.ValueExpression expression){
		this._for = expression;
	}

	public void setDisplay(javax.el.ValueExpression expression){
		this._display = expression;
	}

	public void setMinValue(javax.el.ValueExpression expression){
		this._minValue = expression;
	}

	public void setMaxValue(javax.el.ValueExpression expression){
		this._maxValue = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setAnimate(javax.el.ValueExpression expression){
		this._animate = expression;
	}

	public void setType(javax.el.ValueExpression expression){
		this._type = expression;
	}

	public void setStep(javax.el.ValueExpression expression){
		this._step = expression;
	}

	public void setDisabled(javax.el.ValueExpression expression){
		this._disabled = expression;
	}

}