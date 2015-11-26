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
package org.primefaces.component.lightbox;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class LightBox extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.LightBox";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.LightBoxRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.String _transition;
	private java.lang.Integer _speed;
	private java.lang.String _width;
	private java.lang.String _height;
	private java.lang.Boolean _iframe;
	private java.lang.Double _opacity;
	private java.lang.Boolean _visible;
	private java.lang.Boolean _slideshow;
	private java.lang.Integer _slideshowSpeed;
	private java.lang.String _slideshowStartText;
	private java.lang.String _slideshowStopText;
	private java.lang.Boolean _slideshowAuto;
	private java.lang.String _currentTemplate;
	private java.lang.Boolean _overlayClose;
	private java.lang.Boolean _group;
	public LightBox() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/plugins/lightbox/assets/skins/dark/colorbox.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/lightbox/colorbox.js");
			resourceHolder.addResource("/primefaces/core/core.js");
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

	public java.lang.String getTransition() {
		if(_transition != null )
			return _transition;

		ValueExpression ve = getValueExpression("transition");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "elastic";
	}
	public void setTransition(java.lang.String _transition) {
		this._transition = _transition;
	}

	public int getSpeed() {
		if(_speed != null )
			return _speed;

		ValueExpression ve = getValueExpression("speed");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 350;
	}
	public void setSpeed(int _speed) {
		this._speed = _speed;
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

	public boolean isIframe() {
		if(_iframe != null )
			return _iframe;

		ValueExpression ve = getValueExpression("iframe");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setIframe(boolean _iframe) {
		this._iframe = _iframe;
	}

	public double getOpacity() {
		if(_opacity != null )
			return _opacity;

		ValueExpression ve = getValueExpression("opacity");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : 0.85;
	}
	public void setOpacity(double _opacity) {
		this._opacity = _opacity;
	}

	public boolean isVisible() {
		if(_visible != null )
			return _visible;

		ValueExpression ve = getValueExpression("visible");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setVisible(boolean _visible) {
		this._visible = _visible;
	}

	public boolean isSlideshow() {
		if(_slideshow != null )
			return _slideshow;

		ValueExpression ve = getValueExpression("slideshow");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setSlideshow(boolean _slideshow) {
		this._slideshow = _slideshow;
	}

	public int getSlideshowSpeed() {
		if(_slideshowSpeed != null )
			return _slideshowSpeed;

		ValueExpression ve = getValueExpression("slideshowSpeed");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 2500;
	}
	public void setSlideshowSpeed(int _slideshowSpeed) {
		this._slideshowSpeed = _slideshowSpeed;
	}

	public java.lang.String getSlideshowStartText() {
		if(_slideshowStartText != null )
			return _slideshowStartText;

		ValueExpression ve = getValueExpression("slideshowStartText");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSlideshowStartText(java.lang.String _slideshowStartText) {
		this._slideshowStartText = _slideshowStartText;
	}

	public java.lang.String getSlideshowStopText() {
		if(_slideshowStopText != null )
			return _slideshowStopText;

		ValueExpression ve = getValueExpression("slideshowStopText");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSlideshowStopText(java.lang.String _slideshowStopText) {
		this._slideshowStopText = _slideshowStopText;
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

	public java.lang.String getCurrentTemplate() {
		if(_currentTemplate != null )
			return _currentTemplate;

		ValueExpression ve = getValueExpression("currentTemplate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setCurrentTemplate(java.lang.String _currentTemplate) {
		this._currentTemplate = _currentTemplate;
	}

	public boolean isOverlayClose() {
		if(_overlayClose != null )
			return _overlayClose;

		ValueExpression ve = getValueExpression("overlayClose");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setOverlayClose(boolean _overlayClose) {
		this._overlayClose = _overlayClose;
	}

	public boolean isGroup() {
		if(_group != null )
			return _group;

		ValueExpression ve = getValueExpression("group");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setGroup(boolean _group) {
		this._group = _group;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[19];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _style;
		values[3] = _styleClass;
		values[4] = _transition;
		values[5] = _speed;
		values[6] = _width;
		values[7] = _height;
		values[8] = _iframe;
		values[9] = _opacity;
		values[10] = _visible;
		values[11] = _slideshow;
		values[12] = _slideshowSpeed;
		values[13] = _slideshowStartText;
		values[14] = _slideshowStopText;
		values[15] = _slideshowAuto;
		values[16] = _currentTemplate;
		values[17] = _overlayClose;
		values[18] = _group;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_style = (java.lang.String) values[2];
		_styleClass = (java.lang.String) values[3];
		_transition = (java.lang.String) values[4];
		_speed = (java.lang.Integer) values[5];
		_width = (java.lang.String) values[6];
		_height = (java.lang.String) values[7];
		_iframe = (java.lang.Boolean) values[8];
		_opacity = (java.lang.Double) values[9];
		_visible = (java.lang.Boolean) values[10];
		_slideshow = (java.lang.Boolean) values[11];
		_slideshowSpeed = (java.lang.Integer) values[12];
		_slideshowStartText = (java.lang.String) values[13];
		_slideshowStopText = (java.lang.String) values[14];
		_slideshowAuto = (java.lang.Boolean) values[15];
		_currentTemplate = (java.lang.String) values[16];
		_overlayClose = (java.lang.Boolean) values[17];
		_group = (java.lang.Boolean) values[18];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}