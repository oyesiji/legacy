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
package org.primefaces.component.imageswitch;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class ImageSwitch extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.ImageSwitch";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.ImageSwitchRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.String _effect;
	private java.lang.Integer _speed;
	private java.lang.Integer _slideshowSpeed;
	private java.lang.Boolean _slideshowAuto;
	public ImageSwitch() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/imageswitch/imageswitch.js");
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

	public java.lang.String getEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setEffect(java.lang.String _effect) {
		this._effect = _effect;
	}

	public int getSpeed() {
		if(_speed != null )
			return _speed;

		ValueExpression ve = getValueExpression("speed");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 500;
	}
	public void setSpeed(int _speed) {
		this._speed = _speed;
	}

	public int getSlideshowSpeed() {
		if(_slideshowSpeed != null )
			return _slideshowSpeed;

		ValueExpression ve = getValueExpression("slideshowSpeed");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 3000;
	}
	public void setSlideshowSpeed(int _slideshowSpeed) {
		this._slideshowSpeed = _slideshowSpeed;
	}

	public boolean isSlideshowAuto() {
		if(_slideshowAuto != null )
			return _slideshowAuto;

		ValueExpression ve = getValueExpression("slideshowAuto");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setSlideshowAuto(boolean _slideshowAuto) {
		this._slideshowAuto = _slideshowAuto;
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
		values[4] = _effect;
		values[5] = _speed;
		values[6] = _slideshowSpeed;
		values[7] = _slideshowAuto;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_style = (java.lang.String) values[2];
		_styleClass = (java.lang.String) values[3];
		_effect = (java.lang.String) values[4];
		_speed = (java.lang.Integer) values[5];
		_slideshowSpeed = (java.lang.Integer) values[6];
		_slideshowAuto = (java.lang.Boolean) values[7];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}