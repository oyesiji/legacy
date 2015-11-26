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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class SpinnerTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _converter;
	private javax.el.ValueExpression _immediate;
	private javax.el.ValueExpression _required;
	private javax.el.MethodExpression _validator;
	private javax.el.MethodExpression _valueChangeListener;
	private javax.el.ValueExpression _requiredMessage;
	private javax.el.ValueExpression _converterMessage;
	private javax.el.ValueExpression _validatorMessage;
	private javax.el.ValueExpression _accesskey;
	private javax.el.ValueExpression _alt;
	private javax.el.ValueExpression _dir;
	private javax.el.ValueExpression _disabled;
	private javax.el.ValueExpression _lang;
	private javax.el.ValueExpression _maxlength;
	private javax.el.ValueExpression _onblur;
	private javax.el.ValueExpression _onchange;
	private javax.el.ValueExpression _onclick;
	private javax.el.ValueExpression _ondblclick;
	private javax.el.ValueExpression _onfocus;
	private javax.el.ValueExpression _onkeydown;
	private javax.el.ValueExpression _onkeypress;
	private javax.el.ValueExpression _onkeyup;
	private javax.el.ValueExpression _onmousedown;
	private javax.el.ValueExpression _onmousemove;
	private javax.el.ValueExpression _onmouseout;
	private javax.el.ValueExpression _onmouseover;
	private javax.el.ValueExpression _onmouseup;
	private javax.el.ValueExpression _onselect;
	private javax.el.ValueExpression _readonly;
	private javax.el.ValueExpression _size;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _tabindex;
	private javax.el.ValueExpression _title;
	private javax.el.ValueExpression _stepFactor;
	private javax.el.ValueExpression _min;
	private javax.el.ValueExpression _max;
	private javax.el.ValueExpression _prefix;
	private javax.el.ValueExpression _suffix;
	private javax.el.ValueExpression _showOn;
	private javax.el.ValueExpression _width;

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
		this._accesskey = null;
		this._alt = null;
		this._dir = null;
		this._disabled = null;
		this._lang = null;
		this._maxlength = null;
		this._onblur = null;
		this._onchange = null;
		this._onclick = null;
		this._ondblclick = null;
		this._onfocus = null;
		this._onkeydown = null;
		this._onkeypress = null;
		this._onkeyup = null;
		this._onmousedown = null;
		this._onmousemove = null;
		this._onmouseout = null;
		this._onmouseover = null;
		this._onmouseup = null;
		this._onselect = null;
		this._readonly = null;
		this._size = null;
		this._style = null;
		this._styleClass = null;
		this._tabindex = null;
		this._title = null;
		this._stepFactor = null;
		this._min = null;
		this._max = null;
		this._prefix = null;
		this._suffix = null;
		this._showOn = null;
		this._width = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.spinner.Spinner component = null;
		try {
			component = (org.primefaces.component.spinner.Spinner) comp;
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
		if(_accesskey != null) {
			component.setValueExpression("accesskey", _accesskey);
		}
		if(_alt != null) {
			component.setValueExpression("alt", _alt);
		}
		if(_dir != null) {
			component.setValueExpression("dir", _dir);
		}
		if(_disabled != null) {
			component.setValueExpression("disabled", _disabled);
		}
		if(_lang != null) {
			component.setValueExpression("lang", _lang);
		}
		if(_maxlength != null) {
			component.setValueExpression("maxlength", _maxlength);
		}
		if(_onblur != null) {
			component.setValueExpression("onblur", _onblur);
		}
		if(_onchange != null) {
			component.setValueExpression("onchange", _onchange);
		}
		if(_onclick != null) {
			component.setValueExpression("onclick", _onclick);
		}
		if(_ondblclick != null) {
			component.setValueExpression("ondblclick", _ondblclick);
		}
		if(_onfocus != null) {
			component.setValueExpression("onfocus", _onfocus);
		}
		if(_onkeydown != null) {
			component.setValueExpression("onkeydown", _onkeydown);
		}
		if(_onkeypress != null) {
			component.setValueExpression("onkeypress", _onkeypress);
		}
		if(_onkeyup != null) {
			component.setValueExpression("onkeyup", _onkeyup);
		}
		if(_onmousedown != null) {
			component.setValueExpression("onmousedown", _onmousedown);
		}
		if(_onmousemove != null) {
			component.setValueExpression("onmousemove", _onmousemove);
		}
		if(_onmouseout != null) {
			component.setValueExpression("onmouseout", _onmouseout);
		}
		if(_onmouseover != null) {
			component.setValueExpression("onmouseover", _onmouseover);
		}
		if(_onmouseup != null) {
			component.setValueExpression("onmouseup", _onmouseup);
		}
		if(_onselect != null) {
			component.setValueExpression("onselect", _onselect);
		}
		if(_readonly != null) {
			component.setValueExpression("readonly", _readonly);
		}
		if(_size != null) {
			component.setValueExpression("size", _size);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_tabindex != null) {
			component.setValueExpression("tabindex", _tabindex);
		}
		if(_title != null) {
			component.setValueExpression("title", _title);
		}
		if(_stepFactor != null) {
			component.setValueExpression("stepFactor", _stepFactor);
		}
		if(_min != null) {
			component.setValueExpression("min", _min);
		}
		if(_max != null) {
			component.setValueExpression("max", _max);
		}
		if(_prefix != null) {
			component.setValueExpression("prefix", _prefix);
		}
		if(_suffix != null) {
			component.setValueExpression("suffix", _suffix);
		}
		if(_showOn != null) {
			component.setValueExpression("showOn", _showOn);
		}
		if(_width != null) {
			component.setValueExpression("width", _width);
		}
	}

	public String getComponentType() {
		return Spinner.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.SpinnerRenderer";
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

	public void setAccesskey(javax.el.ValueExpression expression){
		this._accesskey = expression;
	}

	public void setAlt(javax.el.ValueExpression expression){
		this._alt = expression;
	}

	public void setDir(javax.el.ValueExpression expression){
		this._dir = expression;
	}

	public void setDisabled(javax.el.ValueExpression expression){
		this._disabled = expression;
	}

	public void setLang(javax.el.ValueExpression expression){
		this._lang = expression;
	}

	public void setMaxlength(javax.el.ValueExpression expression){
		this._maxlength = expression;
	}

	public void setOnblur(javax.el.ValueExpression expression){
		this._onblur = expression;
	}

	public void setOnchange(javax.el.ValueExpression expression){
		this._onchange = expression;
	}

	public void setOnclick(javax.el.ValueExpression expression){
		this._onclick = expression;
	}

	public void setOndblclick(javax.el.ValueExpression expression){
		this._ondblclick = expression;
	}

	public void setOnfocus(javax.el.ValueExpression expression){
		this._onfocus = expression;
	}

	public void setOnkeydown(javax.el.ValueExpression expression){
		this._onkeydown = expression;
	}

	public void setOnkeypress(javax.el.ValueExpression expression){
		this._onkeypress = expression;
	}

	public void setOnkeyup(javax.el.ValueExpression expression){
		this._onkeyup = expression;
	}

	public void setOnmousedown(javax.el.ValueExpression expression){
		this._onmousedown = expression;
	}

	public void setOnmousemove(javax.el.ValueExpression expression){
		this._onmousemove = expression;
	}

	public void setOnmouseout(javax.el.ValueExpression expression){
		this._onmouseout = expression;
	}

	public void setOnmouseover(javax.el.ValueExpression expression){
		this._onmouseover = expression;
	}

	public void setOnmouseup(javax.el.ValueExpression expression){
		this._onmouseup = expression;
	}

	public void setOnselect(javax.el.ValueExpression expression){
		this._onselect = expression;
	}

	public void setReadonly(javax.el.ValueExpression expression){
		this._readonly = expression;
	}

	public void setSize(javax.el.ValueExpression expression){
		this._size = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setTabindex(javax.el.ValueExpression expression){
		this._tabindex = expression;
	}

	public void setTitle(javax.el.ValueExpression expression){
		this._title = expression;
	}

	public void setStepFactor(javax.el.ValueExpression expression){
		this._stepFactor = expression;
	}

	public void setMin(javax.el.ValueExpression expression){
		this._min = expression;
	}

	public void setMax(javax.el.ValueExpression expression){
		this._max = expression;
	}

	public void setPrefix(javax.el.ValueExpression expression){
		this._prefix = expression;
	}

	public void setSuffix(javax.el.ValueExpression expression){
		this._suffix = expression;
	}

	public void setShowOn(javax.el.ValueExpression expression){
		this._showOn = expression;
	}

	public void setWidth(javax.el.ValueExpression expression){
		this._width = expression;
	}

}