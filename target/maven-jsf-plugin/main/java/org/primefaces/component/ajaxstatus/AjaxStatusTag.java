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
package org.primefaces.component.ajaxstatus;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class AjaxStatusTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _onstart;
	private javax.el.ValueExpression _oncomplete;
	private javax.el.ValueExpression _onprestart;
	private javax.el.ValueExpression _onsuccess;
	private javax.el.ValueExpression _onerror;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._onstart = null;
		this._oncomplete = null;
		this._onprestart = null;
		this._onsuccess = null;
		this._onerror = null;
		this._style = null;
		this._styleClass = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.ajaxstatus.AjaxStatus component = null;
		try {
			component = (org.primefaces.component.ajaxstatus.AjaxStatus) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_onstart != null) {
			component.setValueExpression("onstart", _onstart);
		}
		if(_oncomplete != null) {
			component.setValueExpression("oncomplete", _oncomplete);
		}
		if(_onprestart != null) {
			component.setValueExpression("onprestart", _onprestart);
		}
		if(_onsuccess != null) {
			component.setValueExpression("onsuccess", _onsuccess);
		}
		if(_onerror != null) {
			component.setValueExpression("onerror", _onerror);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
	}

	public String getComponentType() {
		return AjaxStatus.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.AjaxStatusRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setOnstart(javax.el.ValueExpression expression){
		this._onstart = expression;
	}

	public void setOncomplete(javax.el.ValueExpression expression){
		this._oncomplete = expression;
	}

	public void setOnprestart(javax.el.ValueExpression expression){
		this._onprestart = expression;
	}

	public void setOnsuccess(javax.el.ValueExpression expression){
		this._onsuccess = expression;
	}

	public void setOnerror(javax.el.ValueExpression expression){
		this._onerror = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

}