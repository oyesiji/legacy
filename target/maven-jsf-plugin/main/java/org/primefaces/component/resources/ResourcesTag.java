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
package org.primefaces.component.resources;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class ResourcesTag extends UIComponentELTag {

	private javax.el.ValueExpression _exclude;

	public void release(){
		super.release();
		this._exclude = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.resources.Resources component = null;
		try {
			component = (org.primefaces.component.resources.Resources) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_exclude != null) {
			component.setValueExpression("exclude", _exclude);
		}
	}

	public String getComponentType() {
		return Resources.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.ResourcesRenderer";
	}

	public void setExclude(javax.el.ValueExpression expression){
		this._exclude = expression;
	}

}