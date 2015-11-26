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
package org.primefaces.component.outputpanel;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class OutputPanelTag extends UIComponentELTag {

	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _layout;

	public void release(){
		super.release();
		this._style = null;
		this._styleClass = null;
		this._layout = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.outputpanel.OutputPanel component = null;
		try {
			component = (org.primefaces.component.outputpanel.OutputPanel) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_layout != null) {
			component.setValueExpression("layout", _layout);
		}
	}

	public String getComponentType() {
		return OutputPanel.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.OutputPanelRenderer";
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setLayout(javax.el.ValueExpression expression){
		this._layout = expression;
	}

}