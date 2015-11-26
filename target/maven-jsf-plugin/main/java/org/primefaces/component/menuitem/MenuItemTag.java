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
package org.primefaces.component.menuitem;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class MenuItemTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private javax.el.MethodExpression _actionListener;
	private javax.el.MethodExpression _action;
	private javax.el.ValueExpression _immediate;
	private javax.el.ValueExpression _url;
	private javax.el.ValueExpression _target;
	private javax.el.ValueExpression _helpText;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _onclick;
	private javax.el.ValueExpression _update;
	private javax.el.ValueExpression _process;
	private javax.el.ValueExpression _onstart;
	private javax.el.ValueExpression _oncomplete;
	private javax.el.ValueExpression _onerror;
	private javax.el.ValueExpression _onsuccess;
	private javax.el.ValueExpression _global;
	private javax.el.ValueExpression _async;
	private javax.el.ValueExpression _ajax;
	private javax.el.ValueExpression _icon;

	public void release(){
		super.release();
		this._value = null;
		this._actionListener = null;
		this._action = null;
		this._immediate = null;
		this._url = null;
		this._target = null;
		this._helpText = null;
		this._style = null;
		this._styleClass = null;
		this._onclick = null;
		this._update = null;
		this._process = null;
		this._onstart = null;
		this._oncomplete = null;
		this._onerror = null;
		this._onsuccess = null;
		this._global = null;
		this._async = null;
		this._ajax = null;
		this._icon = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.menuitem.MenuItem component = null;
		try {
			component = (org.primefaces.component.menuitem.MenuItem) comp;
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
		if(_url != null) {
			component.setValueExpression("url", _url);
		}
		if(_target != null) {
			component.setValueExpression("target", _target);
		}
		if(_helpText != null) {
			component.setValueExpression("helpText", _helpText);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_onclick != null) {
			component.setValueExpression("onclick", _onclick);
		}
		if(_update != null) {
			component.setValueExpression("update", _update);
		}
		if(_process != null) {
			component.setValueExpression("process", _process);
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
		if(_async != null) {
			component.setValueExpression("async", _async);
		}
		if(_ajax != null) {
			component.setValueExpression("ajax", _ajax);
		}
		if(_icon != null) {
			component.setValueExpression("icon", _icon);
		}
	}

	public String getComponentType() {
		return MenuItem.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return null;
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

	public void setUrl(javax.el.ValueExpression expression){
		this._url = expression;
	}

	public void setTarget(javax.el.ValueExpression expression){
		this._target = expression;
	}

	public void setHelpText(javax.el.ValueExpression expression){
		this._helpText = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setOnclick(javax.el.ValueExpression expression){
		this._onclick = expression;
	}

	public void setUpdate(javax.el.ValueExpression expression){
		this._update = expression;
	}

	public void setProcess(javax.el.ValueExpression expression){
		this._process = expression;
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

	public void setAsync(javax.el.ValueExpression expression){
		this._async = expression;
	}

	public void setAjax(javax.el.ValueExpression expression){
		this._ajax = expression;
	}

	public void setIcon(javax.el.ValueExpression expression){
		this._icon = expression;
	}

}