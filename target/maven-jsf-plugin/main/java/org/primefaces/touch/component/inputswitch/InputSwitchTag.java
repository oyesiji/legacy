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
package org.primefaces.touch.component.inputswitch;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class InputSwitchTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _converter;
	private javax.el.ValueExpression _immediate;
	private javax.el.ValueExpression _required;
	private javax.el.MethodExpression _validator;
	private javax.el.MethodExpression _valueChangeListener;
	private javax.el.ValueExpression _requiredMessage;
	private javax.el.ValueExpression _converterMessage;
	private javax.el.ValueExpression _validatorMessage;

	public void release(){
		super.release();
		this._value = null;
		this._converter = null;
		this._immediate = null;
		this._required = null;
		this._validator = null;
		this._valueChangeListener = null;
		this._requiredMessage = null;
		this._converterMessage = null;
		this._validatorMessage = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.touch.component.inputswitch.InputSwitch component = null;
		try {
			component = (org.primefaces.touch.component.inputswitch.InputSwitch) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_converter != null) {
			component.setValueExpression("converter", _converter);
		}
		if(_immediate != null) {
			component.setValueExpression("immediate", _immediate);
		}
		if(_required != null) {
			component.setValueExpression("required", _required);
		}
		if(_validator != null) {
			component.addValidator(new javax.faces.validator.MethodExpressionValidator(_validator));
		}
		if(_valueChangeListener != null) {
			component.addValueChangeListener(new javax.faces.event.MethodExpressionValueChangeListener(_valueChangeListener));
		}
		if(_requiredMessage != null) {
			component.setValueExpression("requiredMessage", _requiredMessage);
		}
		if(_converterMessage != null) {
			component.setValueExpression("converterMessage", _converterMessage);
		}
		if(_validatorMessage != null) {
			component.setValueExpression("validatorMessage", _validatorMessage);
		}
	}

	public String getComponentType() {
		return InputSwitch.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.touch.component.InputSwitchRenderer";
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setConverter(javax.el.ValueExpression expression){
		this._converter = expression;
	}

	public void setImmediate(javax.el.ValueExpression expression){
		this._immediate = expression;
	}

	public void setRequired(javax.el.ValueExpression expression){
		this._required = expression;
	}

	public void setValidator(javax.el.MethodExpression expression){
		this._validator = expression;
	}

	public void setValueChangeListener(javax.el.MethodExpression expression){
		this._valueChangeListener = expression;
	}

	public void setRequiredMessage(javax.el.ValueExpression expression){
		this._requiredMessage = expression;
	}

	public void setConverterMessage(javax.el.ValueExpression expression){
		this._converterMessage = expression;
	}

	public void setValidatorMessage(javax.el.ValueExpression expression){
		this._validatorMessage = expression;
	}

}