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
package org.primefaces.component.calendar;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class CalendarTag extends UIComponentELTag {

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
	private javax.el.ValueExpression _mindate;
	private javax.el.ValueExpression _maxdate;
	private javax.el.ValueExpression _pages;
	private javax.el.ValueExpression _disabled;
	private javax.el.ValueExpression _mode;
	private javax.el.ValueExpression _pattern;
	private javax.el.ValueExpression _locale;
	private javax.el.ValueExpression _popupIcon;
	private javax.el.ValueExpression _popupIconOnly;
	private javax.el.ValueExpression _navigator;
	private javax.el.ValueExpression _timeZone;
	private javax.el.ValueExpression _readOnlyInputText;
	private javax.el.ValueExpression _onSelectUpdate;
	private javax.el.MethodExpression _selectListener;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _inputStyle;
	private javax.el.ValueExpression _inputStyleClass;
	private javax.el.ValueExpression _showButtonPanel;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _effectDuration;
	private javax.el.ValueExpression _showOn;
	private javax.el.ValueExpression _showWeek;
	private javax.el.ValueExpression _showOtherMonths;
	private javax.el.ValueExpression _selectOtherMonths;

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
		this._mindate = null;
		this._maxdate = null;
		this._pages = null;
		this._disabled = null;
		this._mode = null;
		this._pattern = null;
		this._locale = null;
		this._popupIcon = null;
		this._popupIconOnly = null;
		this._navigator = null;
		this._timeZone = null;
		this._readOnlyInputText = null;
		this._onSelectUpdate = null;
		this._selectListener = null;
		this._style = null;
		this._styleClass = null;
		this._inputStyle = null;
		this._inputStyleClass = null;
		this._showButtonPanel = null;
		this._effect = null;
		this._effectDuration = null;
		this._showOn = null;
		this._showWeek = null;
		this._showOtherMonths = null;
		this._selectOtherMonths = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.calendar.Calendar component = null;
		try {
			component = (org.primefaces.component.calendar.Calendar) comp;
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
		if(_mindate != null) {
			component.setValueExpression("mindate", _mindate);
		}
		if(_maxdate != null) {
			component.setValueExpression("maxdate", _maxdate);
		}
		if(_pages != null) {
			component.setValueExpression("pages", _pages);
		}
		if(_disabled != null) {
			component.setValueExpression("disabled", _disabled);
		}
		if(_mode != null) {
			component.setValueExpression("mode", _mode);
		}
		if(_pattern != null) {
			component.setValueExpression("pattern", _pattern);
		}
		if(_locale != null) {
			component.setValueExpression("locale", _locale);
		}
		if(_popupIcon != null) {
			component.setValueExpression("popupIcon", _popupIcon);
		}
		if(_popupIconOnly != null) {
			component.setValueExpression("popupIconOnly", _popupIconOnly);
		}
		if(_navigator != null) {
			component.setValueExpression("navigator", _navigator);
		}
		if(_timeZone != null) {
			component.setValueExpression("timeZone", _timeZone);
		}
		if(_readOnlyInputText != null) {
			component.setValueExpression("readOnlyInputText", _readOnlyInputText);
		}
		if(_onSelectUpdate != null) {
			component.setValueExpression("onSelectUpdate", _onSelectUpdate);
		}
		if(_selectListener != null) {
			component.setSelectListener(_selectListener);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_inputStyle != null) {
			component.setValueExpression("inputStyle", _inputStyle);
		}
		if(_inputStyleClass != null) {
			component.setValueExpression("inputStyleClass", _inputStyleClass);
		}
		if(_showButtonPanel != null) {
			component.setValueExpression("showButtonPanel", _showButtonPanel);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_effectDuration != null) {
			component.setValueExpression("effectDuration", _effectDuration);
		}
		if(_showOn != null) {
			component.setValueExpression("showOn", _showOn);
		}
		if(_showWeek != null) {
			component.setValueExpression("showWeek", _showWeek);
		}
		if(_showOtherMonths != null) {
			component.setValueExpression("showOtherMonths", _showOtherMonths);
		}
		if(_selectOtherMonths != null) {
			component.setValueExpression("selectOtherMonths", _selectOtherMonths);
		}
	}

	public String getComponentType() {
		return Calendar.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.CalendarRenderer";
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

	public void setMindate(javax.el.ValueExpression expression){
		this._mindate = expression;
	}

	public void setMaxdate(javax.el.ValueExpression expression){
		this._maxdate = expression;
	}

	public void setPages(javax.el.ValueExpression expression){
		this._pages = expression;
	}

	public void setDisabled(javax.el.ValueExpression expression){
		this._disabled = expression;
	}

	public void setMode(javax.el.ValueExpression expression){
		this._mode = expression;
	}

	public void setPattern(javax.el.ValueExpression expression){
		this._pattern = expression;
	}

	public void setLocale(javax.el.ValueExpression expression){
		this._locale = expression;
	}

	public void setPopupIcon(javax.el.ValueExpression expression){
		this._popupIcon = expression;
	}

	public void setPopupIconOnly(javax.el.ValueExpression expression){
		this._popupIconOnly = expression;
	}

	public void setNavigator(javax.el.ValueExpression expression){
		this._navigator = expression;
	}

	public void setTimeZone(javax.el.ValueExpression expression){
		this._timeZone = expression;
	}

	public void setReadOnlyInputText(javax.el.ValueExpression expression){
		this._readOnlyInputText = expression;
	}

	public void setOnSelectUpdate(javax.el.ValueExpression expression){
		this._onSelectUpdate = expression;
	}

	public void setSelectListener(javax.el.MethodExpression expression){
		this._selectListener = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setInputStyle(javax.el.ValueExpression expression){
		this._inputStyle = expression;
	}

	public void setInputStyleClass(javax.el.ValueExpression expression){
		this._inputStyleClass = expression;
	}

	public void setShowButtonPanel(javax.el.ValueExpression expression){
		this._showButtonPanel = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setEffectDuration(javax.el.ValueExpression expression){
		this._effectDuration = expression;
	}

	public void setShowOn(javax.el.ValueExpression expression){
		this._showOn = expression;
	}

	public void setShowWeek(javax.el.ValueExpression expression){
		this._showWeek = expression;
	}

	public void setShowOtherMonths(javax.el.ValueExpression expression){
		this._showOtherMonths = expression;
	}

	public void setSelectOtherMonths(javax.el.ValueExpression expression){
		this._selectOtherMonths = expression;
	}

}