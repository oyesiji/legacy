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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class ImageSwitchTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _speed;
	private javax.el.ValueExpression _slideshowSpeed;
	private javax.el.ValueExpression _slideshowAuto;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._style = null;
		this._styleClass = null;
		this._effect = null;
		this._speed = null;
		this._slideshowSpeed = null;
		this._slideshowAuto = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.imageswitch.ImageSwitch component = null;
		try {
			component = (org.primefaces.component.imageswitch.ImageSwitch) comp;
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
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_speed != null) {
			component.setValueExpression("speed", _speed);
		}
		if(_slideshowSpeed != null) {
			component.setValueExpression("slideshowSpeed", _slideshowSpeed);
		}
		if(_slideshowAuto != null) {
			component.setValueExpression("slideshowAuto", _slideshowAuto);
		}
	}

	public String getComponentType() {
		return ImageSwitch.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.ImageSwitchRenderer";
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

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setSpeed(javax.el.ValueExpression expression){
		this._speed = expression;
	}

	public void setSlideshowSpeed(javax.el.ValueExpression expression){
		this._slideshowSpeed = expression;
	}

	public void setSlideshowAuto(javax.el.ValueExpression expression){
		this._slideshowAuto = expression;
	}

}