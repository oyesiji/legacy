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
package org.primefaces.component.commandbutton;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class CommandButtonTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private javax.el.MethodExpression _actionListener;
	private javax.el.MethodExpression _action;
	private javax.el.ValueExpression _immediate;
	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _ajax;
	private javax.el.ValueExpression _async;
	private javax.el.ValueExpression _process;
	private javax.el.ValueExpression _update;
	private javax.el.ValueExpression _onstart;
	private javax.el.ValueExpression _oncomplete;
	private javax.el.ValueExpression _onerror;
	private javax.el.ValueExpression _onsuccess;
	private javax.el.ValueExpression _global;
	private javax.el.ValueExpression _accesskey;
	private javax.el.ValueExpression _alt;
	private javax.el.ValueExpression _dir;
	private javax.el.ValueExpression _disabled;
	private javax.el.ValueExpression _image;
	private javax.el.ValueExpression _label;
	private javax.el.ValueExpression _lang;
	private javax.el.ValueExpression _tabindex;
	private javax.el.ValueExpression _title;
	private javax.el.ValueExpression _type;
	private javax.el.ValueExpression _readonly;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
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

	public void release(){
		super.release();
		this._value = null;
		this._actionListener = null;
		this._action = null;
		this._immediate = null;
		this._widgetVar = null;
		this._ajax = null;
		this._async = null;
		this._process = null;
		this._update = null;
		this._onstart = null;
		this._oncomplete = null;
		this._onerror = null;
		this._onsuccess = null;
		this._global = null;
		this._accesskey = null;
		this._alt = null;
		this._dir = null;
		this._disabled = null;
		this._image = null;
		this._label = null;
		this._lang = null;
		this._tabindex = null;
		this._title = null;
		this._type = null;
		this._readonly = null;
		this._style = null;
		this._styleClass = null;
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
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.commandbutton.CommandButton component = null;
		try {
			component = (org.primefaces.component.commandbutton.CommandButton) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_actionListener != null) {
			component.addActionListener(new javax.faces.event.MethodExpressionActionListener(_actionListener));
		}
		if(_action != null) {
			component.setActionExpression(_action);
		}
		if(_immediate != null) {
			component.setValueExpression("immediate", _immediate);
		}
		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_ajax != null) {
			component.setValueExpression("ajax", _ajax);
		}
		if(_async != null) {
			component.setValueExpression("async", _async);
		}
		if(_process != null) {
			component.setValueExpression("process", _process);
		}
		if(_update != null) {
			component.setValueExpression("update", _update);
		}
		if(_onstart != null) {
			component.setValueExpression("onstart", _onstart);
		}
		if(_oncomplete != null) {
			component.setValueExpression("oncomplete", _oncomplete);
		}
		if(_onerror != null) {
			component.setValueExpression("onerror", _onerror);
		}
		if(_onsuccess != null) {
			component.setValueExpression("onsuccess", _onsuccess);
		}
		if(_global != null) {
			component.setValueExpression("global", _global);
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
		if(_image != null) {
			component.setValueExpression("image", _image);
		}
		if(_label != null) {
			component.setValueExpression("label", _label);
		}
		if(_lang != null) {
			component.setValueExpression("lang", _lang);
		}
		if(_tabindex != null) {
			component.setValueExpression("tabindex", _tabindex);
		}
		if(_title != null) {
			component.setValueExpression("title", _title);
		}
		if(_type != null) {
			component.setValueExpression("type", _type);
		}
		if(_readonly != null) {
			component.setValueExpression("readonly", _readonly);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
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
	}

	public String getComponentType() {
		return CommandButton.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.CommandButtonRenderer";
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setActionListener(javax.el.MethodExpression expression){
		this._actionListener = expression;
	}

	public void setAction(javax.el.MethodExpression expression){
		this._action = expression;
	}

	public void setImmediate(javax.el.ValueExpression expression){
		this._immediate = expression;
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setAjax(javax.el.ValueExpression expression){
		this._ajax = expression;
	}

	public void setAsync(javax.el.ValueExpression expression){
		this._async = expression;
	}

	public void setProcess(javax.el.ValueExpression expression){
		this._process = expression;
	}

	public void setUpdate(javax.el.ValueExpression expression){
		this._update = expression;
	}

	public void setOnstart(javax.el.ValueExpression expression){
		this._onstart = expression;
	}

	public void setOncomplete(javax.el.ValueExpression expression){
		this._oncomplete = expression;
	}

	public void setOnerror(javax.el.ValueExpression expression){
		this._onerror = expression;
	}

	public void setOnsuccess(javax.el.ValueExpression expression){
		this._onsuccess = expression;
	}

	public void setGlobal(javax.el.ValueExpression expression){
		this._global = expression;
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

	public void setImage(javax.el.ValueExpression expression){
		this._image = expression;
	}

	public void setLabel(javax.el.ValueExpression expression){
		this._label = expression;
	}

	public void setLang(javax.el.ValueExpression expression){
		this._lang = expression;
	}

	public void setTabindex(javax.el.ValueExpression expression){
		this._tabindex = expression;
	}

	public void setTitle(javax.el.ValueExpression expression){
		this._title = expression;
	}

	public void setType(javax.el.ValueExpression expression){
		this._type = expression;
	}

	public void setReadonly(javax.el.ValueExpression expression){
		this._readonly = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
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

}