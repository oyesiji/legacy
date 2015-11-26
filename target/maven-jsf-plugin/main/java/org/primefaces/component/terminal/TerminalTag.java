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
package org.primefaces.component.terminal;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class TerminalTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _width;
	private javax.el.ValueExpression _height;
	private javax.el.ValueExpression _welcomeMessage;
	private javax.el.ValueExpression _prompt;
	private javax.el.MethodExpression _commandHandler;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._width = null;
		this._height = null;
		this._welcomeMessage = null;
		this._prompt = null;
		this._commandHandler = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.terminal.Terminal component = null;
		try {
			component = (org.primefaces.component.terminal.Terminal) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_width != null) {
			component.setValueExpression("width", _width);
		}
		if(_height != null) {
			component.setValueExpression("height", _height);
		}
		if(_welcomeMessage != null) {
			component.setValueExpression("welcomeMessage", _welcomeMessage);
		}
		if(_prompt != null) {
			component.setValueExpression("prompt", _prompt);
		}
		if(_commandHandler != null) {
			component.setCommandHandler(_commandHandler);
		}
	}

	public String getComponentType() {
		return Terminal.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.TerminalRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setWidth(javax.el.ValueExpression expression){
		this._width = expression;
	}

	public void setHeight(javax.el.ValueExpression expression){
		this._height = expression;
	}

	public void setWelcomeMessage(javax.el.ValueExpression expression){
		this._welcomeMessage = expression;
	}

	public void setPrompt(javax.el.ValueExpression expression){
		this._prompt = expression;
	}

	public void setCommandHandler(javax.el.MethodExpression expression){
		this._commandHandler = expression;
	}

}