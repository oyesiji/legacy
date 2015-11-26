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

import org.primefaces.component.menu.AbstractMenu;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class MenuButton extends AbstractMenu {


	public static final String COMPONENT_TYPE = "org.primefaces.component.MenuButton";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.MenuButtonRenderer";

	private java.lang.String _widgetVar;
	private org.primefaces.model.MenuModel _model;
	private java.lang.String _value;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.Boolean _disabled;
	public MenuButton() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/menu/menu.css");
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.button.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/container/container-min.js");
			resourceHolder.addResource("/primefaces/menu/menu.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/button/button.js");
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

	public java.lang.String getValue() {
		if(_value != null )
			return _value;

		ValueExpression ve = getValueExpression("value");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setValue(java.lang.String _value) {
		this._value = _value;
	}

	public java.lang.String getStyle() {
		if(_style != null )
			return _style;

		ValueExpression ve = getValueExpression("style");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStyle(java.lang.String _style) {
		this._style = _style;
	}

	public java.lang.String getStyleClass() {
		if(_styleClass != null )
			return _styleClass;

		ValueExpression ve = getValueExpression("styleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStyleClass(java.lang.String _styleClass) {
		this._styleClass = _styleClass;
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
		Object values[] = new Object[7];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _model;
		values[3] = _value;
		values[4] = _style;
		values[5] = _styleClass;
		values[6] = _disabled;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_model = (org.primefaces.model.MenuModel) values[2];
		_value = (java.lang.String) values[3];
		_style = (java.lang.String) values[4];
		_styleClass = (java.lang.String) values[5];
		_disabled = (java.lang.Boolean) values[6];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}