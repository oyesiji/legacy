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
package org.primefaces.component.layout;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class LayoutTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _fullPage;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _closeTitle;
	private javax.el.ValueExpression _collapseTitle;
	private javax.el.ValueExpression _expandTitle;
	private javax.el.MethodExpression _closeListener;
	private javax.el.ValueExpression _onCloseUpdate;
	private javax.el.MethodExpression _toggleListener;
	private javax.el.ValueExpression _onToggleUpdate;
	private javax.el.MethodExpression _resizeListener;
	private javax.el.ValueExpression _onResizeUpdate;
	private javax.el.ValueExpression _onResizeComplete;
	private javax.el.ValueExpression _onCloseComplete;
	private javax.el.ValueExpression _onToggleComplete;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._fullPage = null;
		this._style = null;
		this._styleClass = null;
		this._closeTitle = null;
		this._collapseTitle = null;
		this._expandTitle = null;
		this._closeListener = null;
		this._onCloseUpdate = null;
		this._toggleListener = null;
		this._onToggleUpdate = null;
		this._resizeListener = null;
		this._onResizeUpdate = null;
		this._onResizeComplete = null;
		this._onCloseComplete = null;
		this._onToggleComplete = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.layout.Layout component = null;
		try {
			component = (org.primefaces.component.layout.Layout) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_fullPage != null) {
			component.setValueExpression("fullPage", _fullPage);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_closeTitle != null) {
			component.setValueExpression("closeTitle", _closeTitle);
		}
		if(_collapseTitle != null) {
			component.setValueExpression("collapseTitle", _collapseTitle);
		}
		if(_expandTitle != null) {
			component.setValueExpression("expandTitle", _expandTitle);
		}
		if(_closeListener != null) {
			component.setCloseListener(_closeListener);
		}
		if(_onCloseUpdate != null) {
			component.setValueExpression("onCloseUpdate", _onCloseUpdate);
		}
		if(_toggleListener != null) {
			component.setToggleListener(_toggleListener);
		}
		if(_onToggleUpdate != null) {
			component.setValueExpression("onToggleUpdate", _onToggleUpdate);
		}
		if(_resizeListener != null) {
			component.setResizeListener(_resizeListener);
		}
		if(_onResizeUpdate != null) {
			component.setValueExpression("onResizeUpdate", _onResizeUpdate);
		}
		if(_onResizeComplete != null) {
			component.setValueExpression("onResizeComplete", _onResizeComplete);
		}
		if(_onCloseComplete != null) {
			component.setValueExpression("onCloseComplete", _onCloseComplete);
		}
		if(_onToggleComplete != null) {
			component.setValueExpression("onToggleComplete", _onToggleComplete);
		}
	}

	public String getComponentType() {
		return Layout.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.LayoutRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setFullPage(javax.el.ValueExpression expression){
		this._fullPage = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setCloseTitle(javax.el.ValueExpression expression){
		this._closeTitle = expression;
	}

	public void setCollapseTitle(javax.el.ValueExpression expression){
		this._collapseTitle = expression;
	}

	public void setExpandTitle(javax.el.ValueExpression expression){
		this._expandTitle = expression;
	}

	public void setCloseListener(javax.el.MethodExpression expression){
		this._closeListener = expression;
	}

	public void setOnCloseUpdate(javax.el.ValueExpression expression){
		this._onCloseUpdate = expression;
	}

	public void setToggleListener(javax.el.MethodExpression expression){
		this._toggleListener = expression;
	}

	public void setOnToggleUpdate(javax.el.ValueExpression expression){
		this._onToggleUpdate = expression;
	}

	public void setResizeListener(javax.el.MethodExpression expression){
		this._resizeListener = expression;
	}

	public void setOnResizeUpdate(javax.el.ValueExpression expression){
		this._onResizeUpdate = expression;
	}

	public void setOnResizeComplete(javax.el.ValueExpression expression){
		this._onResizeComplete = expression;
	}

	public void setOnCloseComplete(javax.el.ValueExpression expression){
		this._onCloseComplete = expression;
	}

	public void setOnToggleComplete(javax.el.ValueExpression expression){
		this._onToggleComplete = expression;
	}

}