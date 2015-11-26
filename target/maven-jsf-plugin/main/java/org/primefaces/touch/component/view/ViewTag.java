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
package org.primefaces.touch.component.view;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class ViewTag extends UIComponentELTag {

	private javax.el.ValueExpression _title;

	public void release(){
		super.release();
		this._title = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.touch.component.view.View component = null;
		try {
			component = (org.primefaces.touch.component.view.View) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_title != null) {
			component.setValueExpression("title", _title);
		}
	}

	public String getComponentType() {
		return View.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.touch.component.ViewRenderer";
	}

	public void setTitle(javax.el.ValueExpression expression){
		this._title = expression;
	}

}