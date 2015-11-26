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
package org.primefaces.component.tabslider;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class TabSliderTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _activeIndex;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _effectDuration;
	private javax.el.ValueExpression _navigator;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._activeIndex = null;
		this._effect = null;
		this._effectDuration = null;
		this._navigator = null;
		this._style = null;
		this._styleClass = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.tabslider.TabSlider component = null;
		try {
			component = (org.primefaces.component.tabslider.TabSlider) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_activeIndex != null) {
			component.setValueExpression("activeIndex", _activeIndex);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_effectDuration != null) {
			component.setValueExpression("effectDuration", _effectDuration);
		}
		if(_navigator != null) {
			component.setValueExpression("navigator", _navigator);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
	}

	public String getComponentType() {
		return TabSlider.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.TabSliderRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setActiveIndex(javax.el.ValueExpression expression){
		this._activeIndex = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setEffectDuration(javax.el.ValueExpression expression){
		this._effectDuration = expression;
	}

	public void setNavigator(javax.el.ValueExpression expression){
		this._navigator = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

}