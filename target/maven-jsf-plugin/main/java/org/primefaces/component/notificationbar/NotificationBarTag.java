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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class NotificationBarTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _position;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _effectSpeed;
	private javax.el.ValueExpression _autoDisplay;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._style = null;
		this._styleClass = null;
		this._position = null;
		this._effect = null;
		this._effectSpeed = null;
		this._autoDisplay = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.notificationbar.NotificationBar component = null;
		try {
			component = (org.primefaces.component.notificationbar.NotificationBar) comp;
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
		if(_position != null) {
			component.setValueExpression("position", _position);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_effectSpeed != null) {
			component.setValueExpression("effectSpeed", _effectSpeed);
		}
		if(_autoDisplay != null) {
			component.setValueExpression("autoDisplay", _autoDisplay);
		}
	}

	public String getComponentType() {
		return NotificationBar.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.NotificationBarRenderer";
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

	public void setPosition(javax.el.ValueExpression expression){
		this._position = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setEffectSpeed(javax.el.ValueExpression expression){
		this._effectSpeed = expression;
	}

	public void setAutoDisplay(javax.el.ValueExpression expression){
		this._autoDisplay = expression;
	}

}