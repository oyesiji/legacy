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

import org.primefaces.component.menu.AbstractMenu;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Stack extends AbstractMenu {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Stack";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.StackRenderer";

	private java.lang.String _widgetVar;
	private org.primefaces.model.MenuModel _model;
	private java.lang.String _icon;
	private java.lang.Integer _openSpeed;
	private java.lang.Integer _closeSpeed;
	public Stack() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/stack/assets/stack.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/stack/stack.js");
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

	public org.primefaces.model.MenuModel getModel() {
		if(_model != null )
			return _model;

		ValueExpression ve = getValueExpression("model");
		return ve != null ? (org.primefaces.model.MenuModel) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setModel(org.primefaces.model.MenuModel _model) {
		this._model = _model;
	}

	public java.lang.String getIcon() {
		if(_icon != null )
			return _icon;

		ValueExpression ve = getValueExpression("icon");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setIcon(java.lang.String _icon) {
		this._icon = _icon;
	}

	public int getOpenSpeed() {
		if(_openSpeed != null )
			return _openSpeed;

		ValueExpression ve = getValueExpression("openSpeed");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 300;
	}
	public void setOpenSpeed(int _openSpeed) {
		this._openSpeed = _openSpeed;
	}

	public int getCloseSpeed() {
		if(_closeSpeed != null )
			return _closeSpeed;

		ValueExpression ve = getValueExpression("closeSpeed");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 300;
	}
	public void setCloseSpeed(int _closeSpeed) {
		this._closeSpeed = _closeSpeed;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[6];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _model;
		values[3] = _icon;
		values[4] = _openSpeed;
		values[5] = _closeSpeed;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_model = (org.primefaces.model.MenuModel) values[2];
		_icon = (java.lang.String) values[3];
		_openSpeed = (java.lang.Integer) values[4];
		_closeSpeed = (java.lang.Integer) values[5];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}