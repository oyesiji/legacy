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
package org.primefaces.component.notificationbar;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class NotificationBar extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.NotificationBar";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.NotificationBarRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.String _position;
	private java.lang.String _effect;
	private java.lang.String _effectSpeed;
	private java.lang.Boolean _autoDisplay;
	public NotificationBar() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/primefaces/notificationbar/notificationbar.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/notificationbar/notificationbar.js");
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

	public java.lang.String getPosition() {
		if(_position != null )
			return _position;

		ValueExpression ve = getValueExpression("position");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "top";
	}
	public void setPosition(java.lang.String _position) {
		this._position = _position;
	}

	public java.lang.String getEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "fade";
	}
	public void setEffect(java.lang.String _effect) {
		this._effect = _effect;
	}

	public java.lang.String getEffectSpeed() {
		if(_effectSpeed != null )
			return _effectSpeed;

		ValueExpression ve = getValueExpression("effectSpeed");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "normal";
	}
	public void setEffectSpeed(java.lang.String _effectSpeed) {
		this._effectSpeed = _effectSpeed;
	}

	public boolean isAutoDisplay() {
		if(_autoDisplay != null )
			return _autoDisplay;

		ValueExpression ve = getValueExpression("autoDisplay");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setAutoDisplay(boolean _autoDisplay) {
		this._autoDisplay = _autoDisplay;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[8];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _style;
		values[3] = _styleClass;
		values[4] = _position;
		values[5] = _effect;
		values[6] = _effectSpeed;
		values[7] = _autoDisplay;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_style = (java.lang.String) values[2];
		_styleClass = (java.lang.String) values[3];
		_position = (java.lang.String) values[4];
		_effect = (java.lang.String) values[5];
		_effectSpeed = (java.lang.String) values[6];
		_autoDisplay = (java.lang.Boolean) values[7];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}