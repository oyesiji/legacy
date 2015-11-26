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
package org.primefaces.component.autocomplete;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class AutoCompleteTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _converter;
	private javax.el.ValueExpression _immediate;
	private javax.el.ValueExpression _required;
	private javax.el.MethodExpression _validator;
	private javax.el.MethodExpression _valueChangeListener;
	private javax.el.ValueExpression _requiredMessage;
	private javax.el.ValueExpression _converterMessage;
	private javax.el.ValueExpression _validatorMessage;
	private javax.el.ValueExpression _widgetVar;
	private javax.el.MethodExpression _completeMethod;
	private javax.el.ValueExpression _var;
	private javax.el.ValueExpression _itemLabel;
	private javax.el.ValueExpression _itemValue;
	private javax.el.ValueExpression _maxResults;
	private javax.el.ValueExpression _minQueryLength;
	private javax.el.ValueExpression _queryDelay;
	private javax.el.ValueExpression _forceSelection;
	private javax.el.MethodExpression _selectListener;
	private javax.el.ValueExpression _onSelectUpdate;
	private javax.el.ValueExpression _onstart;
	private javax.el.ValueExpression _oncomplete;
	private javax.el.ValueExpression _disabled;

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
		this._widgetVar = null;
		this._completeMethod = null;
		this._var = null;
		this._itemLabel = null;
		this._itemValue = null;
		this._maxResults = null;
		this._minQueryLength = null;
		this._queryDelay = null;
		this._forceSelection = null;
		this._selectListener = null;
		this._onSelectUpdate = null;
		this._onstart = null;
		this._oncomplete = null;
		this._disabled = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.autocomplete.AutoComplete component = null;
		try {
			component = (org.primefaces.component.autocomplete.AutoComplete) comp;
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
		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_completeMethod != null) {
			component.setCompleteMethod(_completeMethod);
		}
		if(_var != null) {
			component.setValueExpression("var", _var);
		}
		if(_itemLabel != null) {
			component.setValueExpression("itemLabel", _itemLabel);
		}
		if(_itemValue != null) {
			component.setValueExpression("itemValue", _itemValue);
		}
		if(_maxResults != null) {
			component.setValueExpression("maxResults", _maxResults);
		}
		if(_minQueryLength != null) {
			component.setValueExpression("minQueryLength", _minQueryLength);
		}
		if(_queryDelay != null) {
			component.setValueExpression("queryDelay", _queryDelay);
		}
		if(_forceSelection != null) {
			component.setValueExpression("forceSelection", _forceSelection);
		}
		if(_selectListener != null) {
			component.setSelectListener(_selectListener);
		}
		if(_onSelectUpdate != null) {
			component.setValueExpression("onSelectUpdate", _onSelectUpdate);
		}
		if(_onstart != null) {
			component.setValueExpression("onstart", _onstart);
		}
		if(_oncomplete != null) {
			component.setValueExpression("oncomplete", _oncomplete);
		}
		if(_disabled != null) {
			component.setValueExpression("disabled", _disabled);
		}
	}

	public String getComponentType() {
		return AutoComplete.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.AutoCompleteRenderer";
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

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setCompleteMethod(javax.el.MethodExpression expression){
		this._completeMethod = expression;
	}

	public void setVar(javax.el.ValueExpression expression){
		this._var = expression;
	}

	public void setItemLabel(javax.el.ValueExpression expression){
		this._itemLabel = expression;
	}

	public void setItemValue(javax.el.ValueExpression expression){
		this._itemValue = expression;
	}

	public void setMaxResults(javax.el.ValueExpression expression){
		this._maxResults = expression;
	}

	public void setMinQueryLength(javax.el.ValueExpression expression){
		this._minQueryLength = expression;
	}

	public void setQueryDelay(javax.el.ValueExpression expression){
		this._queryDelay = expression;
	}

	public void setForceSelection(javax.el.ValueExpression expression){
		this._forceSelection = expression;
	}

	public void setSelectListener(javax.el.MethodExpression expression){
		this._selectListener = expression;
	}

	public void setOnSelectUpdate(javax.el.ValueExpression expression){
		this._onSelectUpdate = expression;
	}

	public void setOnstart(javax.el.ValueExpression expression){
		this._onstart = expression;
	}

	public void setOncomplete(javax.el.ValueExpression expression){
		this._oncomplete = expression;
	}

	public void setDisabled(javax.el.ValueExpression expression){
		this._disabled = expression;
	}

}