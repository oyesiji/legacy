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
package org.primefaces.component.editor;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Editor extends UIInput {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Editor";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.EditorRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _width;
	private java.lang.String _height;
	private java.lang.Boolean _resizable;
	private java.lang.String _language;
	private java.lang.String _title;
	private java.lang.Boolean _disabled;
	public Editor() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/menu/assets/skins/sam/menu.css");
			resourceHolder.addResource("/yui/button/assets/skins/sam/button.css");
			resourceHolder.addResource("/yui/resize/assets/skins/sam/resize.css");
			resourceHolder.addResource("/yui/container/assets/skins/sam/container.css");
			resourceHolder.addResource("/yui/editor/assets/skins/sam/editor.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/container/container-min.js");
			resourceHolder.addResource("/yui/menu/menu-min.js");
			resourceHolder.addResource("/yui/button/button-min.js");
			resourceHolder.addResource("/yui/editor/editor-min.js");
			resourceHolder.addResource("/yui/resize/resize-min.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/editor/editor.js");
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
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "500px";
	}
	public void setWidth(java.lang.String _width) {
		this._width = _width;
	}

	public java.lang.String getHeight() {
		if(_height != null )
			return _height;

		ValueExpression ve = getValueExpression("height");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "300px";
	}
	public void setHeight(java.lang.String _height) {
		this._height = _height;
	}

	public boolean isResizable() {
		if(_resizable != null )
			return _resizable;

		ValueExpression ve = getValueExpression("resizable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setResizable(boolean _resizable) {
		this._resizable = _resizable;
	}

	public java.lang.String getLanguage() {
		if(_language != null )
			return _language;

		ValueExpression ve = getValueExpression("language");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setLanguage(java.lang.String _language) {
		this._language = _language;
	}

	public java.lang.String getTitle() {
		if(_title != null )
			return _title;

		ValueExpression ve = getValueExpression("title");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setTitle(java.lang.String _title) {
		this._title = _title;
	}

	public boolean isDisabled() {
		if(_disabled != null )
			return _disabled;

		ValueExpression ve = getValueExpression("disabled");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDisabled(boolean _disabled) {
		this._disabled = _disabled;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[8];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _width;
		values[3] = _height;
		values[4] = _resizable;
		values[5] = _language;
		values[6] = _title;
		values[7] = _disabled;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_width = (java.lang.String) values[2];
		_height = (java.lang.String) values[3];
		_resizable = (java.lang.Boolean) values[4];
		_language = (java.lang.String) values[5];
		_title = (java.lang.String) values[6];
		_disabled = (java.lang.Boolean) values[7];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}