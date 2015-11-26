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
package org.primefaces.component.poll;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class PollTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _interval;
	private javax.el.ValueExpression _update;
	private javax.el.MethodExpression _actionListener;
	private javax.el.MethodExpression _action;
	private javax.el.ValueExpression _immediate;
	private javax.el.ValueExpression _onstart;
	private javax.el.ValueExpression _oncomplete;
	private javax.el.ValueExpression _process;
	private javax.el.ValueExpression _onerror;
	private javax.el.ValueExpression _onsuccess;
	private javax.el.ValueExpression _global;
	private javax.el.ValueExpression _async;
	private javax.el.ValueExpression _autoStart;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._interval = null;
		this._update = null;
		this._actionListener = null;
		this._action = null;
		this._immediate = null;
		this._onstart = null;
		this._oncomplete = null;
		this._process = null;
		this._onerror = null;
		this._onsuccess = null;
		this._global = null;
		this._async = null;
		this._autoStart = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.poll.Poll component = null;
		try {
			component = (org.primefaces.component.poll.Poll) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_interval != null) {
			component.setValueExpression("interval", _interval);
		}
		if(_update != null) {
			component.setValueExpression("update", _update);
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
		if(_onstart != null) {
			component.setValueExpression("onstart", _onstart);
		}
		if(_oncomplete != null) {
			component.setValueExpression("oncomplete", _oncomplete);
		}
		if(_process != null) {
			component.setValueExpression("process", _process);
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
		if(_autoStart != null) {
			component.setValueExpression("autoStart", _autoStart);
		}
	}

	public String getComponentType() {
		return Poll.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.PollRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setInterval(javax.el.ValueExpression expression){
		this._interval = expression;
	}

	public void setUpdate(javax.el.ValueExpression expression){
		this._update = expression;
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

	public void setOnstart(javax.el.ValueExpression expression){
		this._onstart = expression;
	}

	public void setOncomplete(javax.el.ValueExpression expression){
		this._oncomplete = expression;
	}

	public void setProcess(javax.el.ValueExpression expression){
		this._process = expression;
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

	public void setAutoStart(javax.el.ValueExpression expression){
		this._autoStart = expression;
	}

}