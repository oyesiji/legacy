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
package org.primefaces.component.menu;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class MenuTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _model;
	private javax.el.ValueExpression _visible;
	private javax.el.ValueExpression _x;
	private javax.el.ValueExpression _y;
	private javax.el.ValueExpression _fixedCenter;
	private javax.el.ValueExpression _constraintToViewport;
	private javax.el.ValueExpression _position;
	private javax.el.ValueExpression _clickToHide;
	private javax.el.ValueExpression _keepOpen;
	private javax.el.ValueExpression _tiered;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _effectDuration;
	private javax.el.ValueExpression _autoSubmenuDisplay;
	private javax.el.ValueExpression _showDelay;
	private javax.el.ValueExpression _hideDelay;
	private javax.el.ValueExpression _submenuHideDelay;
	private javax.el.ValueExpression _context;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _zindex;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._model = null;
		this._visible = null;
		this._x = null;
		this._y = null;
		this._fixedCenter = null;
		this._constraintToViewport = null;
		this._position = null;
		this._clickToHide = null;
		this._keepOpen = null;
		this._tiered = null;
		this._effect = null;
		this._effectDuration = null;
		this._autoSubmenuDisplay = null;
		this._showDelay = null;
		this._hideDelay = null;
		this._submenuHideDelay = null;
		this._context = null;
		this._style = null;
		this._styleClass = null;
		this._zindex = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.menu.Menu component = null;
		try {
			component = (org.primefaces.component.menu.Menu) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_model != null) {
			component.setValueExpression("model", _model);
		}
		if(_visible != null) {
			component.setValueExpression("visible", _visible);
		}
		if(_x != null) {
			component.setValueExpression("x", _x);
		}
		if(_y != null) {
			component.setValueExpression("y", _y);
		}
		if(_fixedCenter != null) {
			component.setValueExpression("fixedCenter", _fixedCenter);
		}
		if(_constraintToViewport != null) {
			component.setValueExpression("constraintToViewport", _constraintToViewport);
		}
		if(_position != null) {
			component.setValueExpression("position", _position);
		}
		if(_clickToHide != null) {
			component.setValueExpression("clickToHide", _clickToHide);
		}
		if(_keepOpen != null) {
			component.setValueExpression("keepOpen", _keepOpen);
		}
		if(_tiered != null) {
			component.setValueExpression("tiered", _tiered);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_effectDuration != null) {
			component.setValueExpression("effectDuration", _effectDuration);
		}
		if(_autoSubmenuDisplay != null) {
			component.setValueExpression("autoSubmenuDisplay", _autoSubmenuDisplay);
		}
		if(_showDelay != null) {
			component.setValueExpression("showDelay", _showDelay);
		}
		if(_hideDelay != null) {
			component.setValueExpression("hideDelay", _hideDelay);
		}
		if(_submenuHideDelay != null) {
			component.setValueExpression("submenuHideDelay", _submenuHideDelay);
		}
		if(_context != null) {
			component.setValueExpression("context", _context);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_zindex != null) {
			component.setValueExpression("zindex", _zindex);
		}
	}

	public String getComponentType() {
		return Menu.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.MenuRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setModel(javax.el.ValueExpression expression){
		this._model = expression;
	}

	public void setVisible(javax.el.ValueExpression expression){
		this._visible = expression;
	}

	public void setX(javax.el.ValueExpression expression){
		this._x = expression;
	}

	public void setY(javax.el.ValueExpression expression){
		this._y = expression;
	}

	public void setFixedCenter(javax.el.ValueExpression expression){
		this._fixedCenter = expression;
	}

	public void setConstraintToViewport(javax.el.ValueExpression expression){
		this._constraintToViewport = expression;
	}

	public void setPosition(javax.el.ValueExpression expression){
		this._position = expression;
	}

	public void setClickToHide(javax.el.ValueExpression expression){
		this._clickToHide = expression;
	}

	public void setKeepOpen(javax.el.ValueExpression expression){
		this._keepOpen = expression;
	}

	public void setTiered(javax.el.ValueExpression expression){
		this._tiered = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setEffectDuration(javax.el.ValueExpression expression){
		this._effectDuration = expression;
	}

	public void setAutoSubmenuDisplay(javax.el.ValueExpression expression){
		this._autoSubmenuDisplay = expression;
	}

	public void setShowDelay(javax.el.ValueExpression expression){
		this._showDelay = expression;
	}

	public void setHideDelay(javax.el.ValueExpression expression){
		this._hideDelay = expression;
	}

	public void setSubmenuHideDelay(javax.el.ValueExpression expression){
		this._submenuHideDelay = expression;
	}

	public void setContext(javax.el.ValueExpression expression){
		this._context = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setZindex(javax.el.ValueExpression expression){
		this._zindex = expression;
	}

}