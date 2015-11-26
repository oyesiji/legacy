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
package org.primefaces.component.themeswitcher;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class ThemeSwitcherTag extends UIComponentELTag {

	private javax.el.ValueExpression _theme;
	private javax.el.ValueExpression _width;
	private javax.el.ValueExpression _height;
	private javax.el.ValueExpression _buttonHeight;
	private javax.el.ValueExpression _initialText;
	private javax.el.ValueExpression _buttonPreText;

	public void release(){
		super.release();
		this._theme = null;
		this._width = null;
		this._height = null;
		this._buttonHeight = null;
		this._initialText = null;
		this._buttonPreText = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.themeswitcher.ThemeSwitcher component = null;
		try {
			component = (org.primefaces.component.themeswitcher.ThemeSwitcher) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_theme != null) {
			component.setValueExpression("theme", _theme);
		}
		if(_width != null) {
			component.setValueExpression("width", _width);
		}
		if(_height != null) {
			component.setValueExpression("height", _height);
		}
		if(_buttonHeight != null) {
			component.setValueExpression("buttonHeight", _buttonHeight);
		}
		if(_initialText != null) {
			component.setValueExpression("initialText", _initialText);
		}
		if(_buttonPreText != null) {
			component.setValueExpression("buttonPreText", _buttonPreText);
		}
	}

	public String getComponentType() {
		return ThemeSwitcher.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.ThemeSwitcherRenderer";
	}

	public void setTheme(javax.el.ValueExpression expression){
		this._theme = expression;
	}

	public void setWidth(javax.el.ValueExpression expression){
		this._width = expression;
	}

	public void setHeight(javax.el.ValueExpression expression){
		this._height = expression;
	}

	public void setButtonHeight(javax.el.ValueExpression expression){
		this._buttonHeight = expression;
	}

	public void setInitialText(javax.el.ValueExpression expression){
		this._initialText = expression;
	}

	public void setButtonPreText(javax.el.ValueExpression expression){
		this._buttonPreText = expression;
	}

}