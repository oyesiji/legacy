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
package org.primefaces.component.menubar;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class MenubarTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _model;
	private javax.el.ValueExpression _autoSubmenuDisplay;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _effectDuration;
	private javax.el.ValueExpression _zindex;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._model = null;
		this._autoSubmenuDisplay = null;
		this._effect = null;
		this._effectDuration = null;
		this._zindex = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.menubar.Menubar component = null;
		try {
			component = (org.primefaces.component.menubar.Menubar) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_model != null) {
			component.setValueExpression("model", _model);
		}
		if(_autoSubmenuDisplay != null) {
			component.setValueExpression("autoSubmenuDisplay", _autoSubmenuDisplay);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_effectDuration != null) {
			component.setValueExpression("effectDuration", _effectDuration);
		}
		if(_zindex != null) {
			component.setValueExpression("zindex", _zindex);
		}
	}

	public String getComponentType() {
		return Menubar.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.MenubarRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setModel(javax.el.ValueExpression expression){
		this._model = expression;
	}

	public void setAutoSubmenuDisplay(javax.el.ValueExpression expression){
		this._autoSubmenuDisplay = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setEffectDuration(javax.el.ValueExpression expression){
		this._effectDuration = expression;
	}

	public void setZindex(javax.el.ValueExpression expression){
		this._zindex = expression;
	}

}