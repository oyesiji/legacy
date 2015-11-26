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
package org.primefaces.component.panel;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class PanelTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _header;
	private javax.el.ValueExpression _footer;
	private javax.el.ValueExpression _toggleable;
	private javax.el.ValueExpression _toggleSpeed;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _collapsed;
	private javax.el.ValueExpression _closable;
	private javax.el.MethodExpression _closeListener;
	private javax.el.ValueExpression _onCloseUpdate;
	private javax.el.ValueExpression _onCloseStart;
	private javax.el.ValueExpression _onCloseComplete;
	private javax.el.ValueExpression _closeSpeed;
	private javax.el.ValueExpression _visible;
	private javax.el.ValueExpression _onToggleUpdate;
	private javax.el.MethodExpression _toggleListener;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._header = null;
		this._footer = null;
		this._toggleable = null;
		this._toggleSpeed = null;
		this._style = null;
		this._styleClass = null;
		this._collapsed = null;
		this._closable = null;
		this._closeListener = null;
		this._onCloseUpdate = null;
		this._onCloseStart = null;
		this._onCloseComplete = null;
		this._closeSpeed = null;
		this._visible = null;
		this._onToggleUpdate = null;
		this._toggleListener = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.panel.Panel component = null;
		try {
			component = (org.primefaces.component.panel.Panel) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_header != null) {
			component.setValueExpression("header", _header);
		}
		if(_footer != null) {
			component.setValueExpression("footer", _footer);
		}
		if(_toggleable != null) {
			component.setValueExpression("toggleable", _toggleable);
		}
		if(_toggleSpeed != null) {
			component.setValueExpression("toggleSpeed", _toggleSpeed);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_collapsed != null) {
			component.setValueExpression("collapsed", _collapsed);
		}
		if(_closable != null) {
			component.setValueExpression("closable", _closable);
		}
		if(_closeListener != null) {
			component.setCloseListener(_closeListener);
		}
		if(_onCloseUpdate != null) {
			component.setValueExpression("onCloseUpdate", _onCloseUpdate);
		}
		if(_onCloseStart != null) {
			component.setValueExpression("onCloseStart", _onCloseStart);
		}
		if(_onCloseComplete != null) {
			component.setValueExpression("onCloseComplete", _onCloseComplete);
		}
		if(_closeSpeed != null) {
			component.setValueExpression("closeSpeed", _closeSpeed);
		}
		if(_visible != null) {
			component.setValueExpression("visible", _visible);
		}
		if(_onToggleUpdate != null) {
			component.setValueExpression("onToggleUpdate", _onToggleUpdate);
		}
		if(_toggleListener != null) {
			component.setToggleListener(_toggleListener);
		}
	}

	public String getComponentType() {
		return Panel.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.PanelRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setHeader(javax.el.ValueExpression expression){
		this._header = expression;
	}

	public void setFooter(javax.el.ValueExpression expression){
		this._footer = expression;
	}

	public void setToggleable(javax.el.ValueExpression expression){
		this._toggleable = expression;
	}

	public void setToggleSpeed(javax.el.ValueExpression expression){
		this._toggleSpeed = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setCollapsed(javax.el.ValueExpression expression){
		this._collapsed = expression;
	}

	public void setClosable(javax.el.ValueExpression expression){
		this._closable = expression;
	}

	public void setCloseListener(javax.el.MethodExpression expression){
		this._closeListener = expression;
	}

	public void setOnCloseUpdate(javax.el.ValueExpression expression){
		this._onCloseUpdate = expression;
	}

	public void setOnCloseStart(javax.el.ValueExpression expression){
		this._onCloseStart = expression;
	}

	public void setOnCloseComplete(javax.el.ValueExpression expression){
		this._onCloseComplete = expression;
	}

	public void setCloseSpeed(javax.el.ValueExpression expression){
		this._closeSpeed = expression;
	}

	public void setVisible(javax.el.ValueExpression expression){
		this._visible = expression;
	}

	public void setOnToggleUpdate(javax.el.ValueExpression expression){
		this._onToggleUpdate = expression;
	}

	public void setToggleListener(javax.el.MethodExpression expression){
		this._toggleListener = expression;
	}

}