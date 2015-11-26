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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class LightBoxTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _transition;
	private javax.el.ValueExpression _speed;
	private javax.el.ValueExpression _width;
	private javax.el.ValueExpression _height;
	private javax.el.ValueExpression _iframe;
	private javax.el.ValueExpression _opacity;
	private javax.el.ValueExpression _visible;
	private javax.el.ValueExpression _slideshow;
	private javax.el.ValueExpression _slideshowSpeed;
	private javax.el.ValueExpression _slideshowStartText;
	private javax.el.ValueExpression _slideshowStopText;
	private javax.el.ValueExpression _slideshowAuto;
	private javax.el.ValueExpression _currentTemplate;
	private javax.el.ValueExpression _overlayClose;
	private javax.el.ValueExpression _group;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._style = null;
		this._styleClass = null;
		this._transition = null;
		this._speed = null;
		this._width = null;
		this._height = null;
		this._iframe = null;
		this._opacity = null;
		this._visible = null;
		this._slideshow = null;
		this._slideshowSpeed = null;
		this._slideshowStartText = null;
		this._slideshowStopText = null;
		this._slideshowAuto = null;
		this._currentTemplate = null;
		this._overlayClose = null;
		this._group = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.lightbox.LightBox component = null;
		try {
			component = (org.primefaces.component.lightbox.LightBox) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_transition != null) {
			component.setValueExpression("transition", _transition);
		}
		if(_speed != null) {
			component.setValueExpression("speed", _speed);
		}
		if(_width != null) {
			component.setValueExpression("width", _width);
		}
		if(_height != null) {
			component.setValueExpression("height", _height);
		}
		if(_iframe != null) {
			component.setValueExpression("iframe", _iframe);
		}
		if(_opacity != null) {
			component.setValueExpression("opacity", _opacity);
		}
		if(_visible != null) {
			component.setValueExpression("visible", _visible);
		}
		if(_slideshow != null) {
			component.setValueExpression("slideshow", _slideshow);
		}
		if(_slideshowSpeed != null) {
			component.setValueExpression("slideshowSpeed", _slideshowSpeed);
		}
		if(_slideshowStartText != null) {
			component.setValueExpression("slideshowStartText", _slideshowStartText);
		}
		if(_slideshowStopText != null) {
			component.setValueExpression("slideshowStopText", _slideshowStopText);
		}
		if(_slideshowAuto != null) {
			component.setValueExpression("slideshowAuto", _slideshowAuto);
		}
		if(_currentTemplate != null) {
			component.setValueExpression("currentTemplate", _currentTemplate);
		}
		if(_overlayClose != null) {
			component.setValueExpression("overlayClose", _overlayClose);
		}
		if(_group != null) {
			component.setValueExpression("group", _group);
		}
	}

	public String getComponentType() {
		return LightBox.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.LightBoxRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setTransition(javax.el.ValueExpression expression){
		this._transition = expression;
	}

	public void setSpeed(javax.el.ValueExpression expression){
		this._speed = expression;
	}

	public void setWidth(javax.el.ValueExpression expression){
		this._width = expression;
	}

	public void setHeight(javax.el.ValueExpression expression){
		this._height = expression;
	}

	public void setIframe(javax.el.ValueExpression expression){
		this._iframe = expression;
	}

	public void setOpacity(javax.el.ValueExpression expression){
		this._opacity = expression;
	}

	public void setVisible(javax.el.ValueExpression expression){
		this._visible = expression;
	}

	public void setSlideshow(javax.el.ValueExpression expression){
		this._slideshow = expression;
	}

	public void setSlideshowSpeed(javax.el.ValueExpression expression){
		this._slideshowSpeed = expression;
	}

	public void setSlideshowStartText(javax.el.ValueExpression expression){
		this._slideshowStartText = expression;
	}

	public void setSlideshowStopText(javax.el.ValueExpression expression){
		this._slideshowStopText = expression;
	}

	public void setSlideshowAuto(javax.el.ValueExpression expression){
		this._slideshowAuto = expression;
	}

	public void setCurrentTemplate(javax.el.ValueExpression expression){
		this._currentTemplate = expression;
	}

	public void setOverlayClose(javax.el.ValueExpression expression){
		this._overlayClose = expression;
	}

	public void setGroup(javax.el.ValueExpression expression){
		this._group = expression;
	}

}