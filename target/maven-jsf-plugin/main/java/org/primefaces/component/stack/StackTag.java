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
package org.primefaces.component.stack;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class StackTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _model;
	private javax.el.ValueExpression _icon;
	private javax.el.ValueExpression _openSpeed;
	private javax.el.ValueExpression _closeSpeed;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._model = null;
		this._icon = null;
		this._openSpeed = null;
		this._closeSpeed = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.stack.Stack component = null;
		try {
			component = (org.primefaces.component.stack.Stack) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_model != null) {
			component.setValueExpression("model", _model);
		}
		if(_icon != null) {
			component.setValueExpression("icon", _icon);
		}
		if(_openSpeed != null) {
			component.setValueExpression("openSpeed", _openSpeed);
		}
		if(_closeSpeed != null) {
			component.setValueExpression("closeSpeed", _closeSpeed);
		}
	}

	public String getComponentType() {
		return Stack.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.StackRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setModel(javax.el.ValueExpression expression){
		this._model = expression;
	}

	public void setIcon(javax.el.ValueExpression expression){
		this._icon = expression;
	}

	public void setOpenSpeed(javax.el.ValueExpression expression){
		this._openSpeed = expression;
	}

	public void setCloseSpeed(javax.el.ValueExpression expression){
		this._closeSpeed = expression;
	}

}