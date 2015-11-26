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
package org.primefaces.component.menubutton;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class MenuButtonTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _model;
	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _disabled;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._model = null;
		this._value = null;
		this._style = null;
		this._styleClass = null;
		this._disabled = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.menubutton.MenuButton component = null;
		try {
			component = (org.primefaces.component.menubutton.MenuButton) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_model != null) {
			component.setValueExpression("model", _model);
		}
		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_disabled != null) {
			component.setValueExpression("disabled", _disabled);
		}
	}

	public String getComponentType() {
		return MenuButton.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.MenuButtonRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setModel(javax.el.ValueExpression expression){
		this._model = expression;
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setDisabled(javax.el.ValueExpression expression){
		this._disabled = expression;
	}

}