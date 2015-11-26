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
package org.primefaces.component.confirmdialog;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class ConfirmDialogTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _message;
	private javax.el.ValueExpression _header;
	private javax.el.ValueExpression _severity;
	private javax.el.ValueExpression _draggable;
	private javax.el.ValueExpression _modal;
	private javax.el.ValueExpression _width;
	private javax.el.ValueExpression _height;
	private javax.el.ValueExpression _zindex;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _showEffect;
	private javax.el.ValueExpression _hideEffect;
	private javax.el.ValueExpression _position;
	private javax.el.ValueExpression _closeOnEscape;
	private javax.el.ValueExpression _closable;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._message = null;
		this._header = null;
		this._severity = null;
		this._draggable = null;
		this._modal = null;
		this._width = null;
		this._height = null;
		this._zindex = null;
		this._styleClass = null;
		this._showEffect = null;
		this._hideEffect = null;
		this._position = null;
		this._closeOnEscape = null;
		this._closable = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.confirmdialog.ConfirmDialog component = null;
		try {
			component = (org.primefaces.component.confirmdialog.ConfirmDialog) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_message != null) {
			component.setValueExpression("message", _message);
		}
		if(_header != null) {
			component.setValueExpression("header", _header);
		}
		if(_severity != null) {
			component.setValueExpression("severity", _severity);
		}
		if(_draggable != null) {
			component.setValueExpression("draggable", _draggable);
		}
		if(_modal != null) {
			component.setValueExpression("modal", _modal);
		}
		if(_width != null) {
			component.setValueExpression("width", _width);
		}
		if(_height != null) {
			component.setValueExpression("height", _height);
		}
		if(_zindex != null) {
			component.setValueExpression("zindex", _zindex);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_showEffect != null) {
			component.setValueExpression("showEffect", _showEffect);
		}
		if(_hideEffect != null) {
			component.setValueExpression("hideEffect", _hideEffect);
		}
		if(_position != null) {
			component.setValueExpression("position", _position);
		}
		if(_closeOnEscape != null) {
			component.setValueExpression("closeOnEscape", _closeOnEscape);
		}
		if(_closable != null) {
			component.setValueExpression("closable", _closable);
		}
	}

	public String getComponentType() {
		return ConfirmDialog.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.ConfirmDialogRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setMessage(javax.el.ValueExpression expression){
		this._message = expression;
	}

	public void setHeader(javax.el.ValueExpression expression){
		this._header = expression;
	}

	public void setSeverity(javax.el.ValueExpression expression){
		this._severity = expression;
	}

	public void setDraggable(javax.el.ValueExpression expression){
		this._draggable = expression;
	}

	public void setModal(javax.el.ValueExpression expression){
		this._modal = expression;
	}

	public void setWidth(javax.el.ValueExpression expression){
		this._width = expression;
	}

	public void setHeight(javax.el.ValueExpression expression){
		this._height = expression;
	}

	public void setZindex(javax.el.ValueExpression expression){
		this._zindex = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setShowEffect(javax.el.ValueExpression expression){
		this._showEffect = expression;
	}

	public void setHideEffect(javax.el.ValueExpression expression){
		this._hideEffect = expression;
	}

	public void setPosition(javax.el.ValueExpression expression){
		this._position = expression;
	}

	public void setCloseOnEscape(javax.el.ValueExpression expression){
		this._closeOnEscape = expression;
	}

	public void setClosable(javax.el.ValueExpression expression){
		this._closable = expression;
	}

}