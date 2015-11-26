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
package org.primefaces.touch.component.application;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class ApplicationTag extends UIComponentELTag {

	private javax.el.ValueExpression _theme;
	private javax.el.ValueExpression _icon;

	public void release(){
		super.release();
		this._theme = null;
		this._icon = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.touch.component.application.Application component = null;
		try {
			component = (org.primefaces.touch.component.application.Application) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_theme != null) {
			component.setValueExpression("theme", _theme);
		}
		if(_icon != null) {
			component.setValueExpression("icon", _icon);
		}
	}

	public String getComponentType() {
		return Application.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.touch.component.ApplicationRenderer";
	}

	public void setTheme(javax.el.ValueExpression expression){
		this._theme = expression;
	}

	public void setIcon(javax.el.ValueExpression expression){
		this._icon = expression;
	}

}