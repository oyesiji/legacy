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
package org.primefaces.component.submenu;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class SubmenuTag extends UIComponentELTag {

	private javax.el.ValueExpression _label;
	private javax.el.ValueExpression _labelStyle;
	private javax.el.ValueExpression _labelStyleClass;

	public void release(){
		super.release();
		this._label = null;
		this._labelStyle = null;
		this._labelStyleClass = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.submenu.Submenu component = null;
		try {
			component = (org.primefaces.component.submenu.Submenu) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_label != null) {
			component.setValueExpression("label", _label);
		}
		if(_labelStyle != null) {
			component.setValueExpression("labelStyle", _labelStyle);
		}
		if(_labelStyleClass != null) {
			component.setValueExpression("labelStyleClass", _labelStyleClass);
		}
	}

	public String getComponentType() {
		return Submenu.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return null;
	}

	public void setLabel(javax.el.ValueExpression expression){
		this._label = expression;
	}

	public void setLabelStyle(javax.el.ValueExpression expression){
		this._labelStyle = expression;
	}

	public void setLabelStyleClass(javax.el.ValueExpression expression){
		this._labelStyleClass = expression;
	}

}