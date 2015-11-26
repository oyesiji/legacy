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

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Terminal extends UIComponentBase implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Terminal";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.TerminalRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _width;
	private java.lang.String _height;
	private java.lang.String _welcomeMessage;
	private java.lang.String _prompt;
	private javax.el.MethodExpression _commandHandler;
	public Terminal() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/wterm/wterm.css");
			resourceHolder.addResource("/jquery/plugins/wterm/wterm.jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/terminal/terminal.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getWidgetVar() {
		if(_widgetVar != null )
			return _widgetVar;

		ValueExpression ve = getValueExpression("widgetVar");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setWidgetVar(java.lang.String _widgetVar) {
		this._widgetVar = _widgetVar;
	}

	public java.lang.String getWidth() {
		if(_width != null )
			return _width;

		ValueExpression ve = getValueExpression("width");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setWidth(java.lang.String _width) {
		this._width = _width;
	}

	public java.lang.String getHeight() {
		if(_height != null )
			return _height;

		ValueExpression ve = getValueExpression("height");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setHeight(java.lang.String _height) {
		this._height = _height;
	}

	public java.lang.String getWelcomeMessage() {
		if(_welcomeMessage != null )
			return _welcomeMessage;

		ValueExpression ve = getValueExpression("welcomeMessage");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setWelcomeMessage(java.lang.String _welcomeMessage) {
		this._welcomeMessage = _welcomeMessage;
	}

	public java.lang.String getPrompt() {
		if(_prompt != null )
			return _prompt;

		ValueExpression ve = getValueExpression("prompt");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "prime $";
	}
	public void setPrompt(java.lang.String _prompt) {
		this._prompt = _prompt;
	}

	public javax.el.MethodExpression getCommandHandler() {
		return this._commandHandler;
	}

	public void setCommandHandler(javax.el.MethodExpression _commandHandler) {
		this._commandHandler = _commandHandler;
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}

	public void encodePartially(FacesContext facesContext) throws IOException {
		Renderer renderer = getRenderer(facesContext);

		if(renderer instanceof PartialRenderer) {
			((PartialRenderer)renderer).encodePartially(facesContext, this);
		}
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[7];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _width;
		values[3] = _height;
		values[4] = _welcomeMessage;
		values[5] = _prompt;
		values[6] = _commandHandler;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_width = (java.lang.String) values[2];
		_height = (java.lang.String) values[3];
		_welcomeMessage = (java.lang.String) values[4];
		_prompt = (java.lang.String) values[5];
		_commandHandler = (javax.el.MethodExpression) values[6];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}