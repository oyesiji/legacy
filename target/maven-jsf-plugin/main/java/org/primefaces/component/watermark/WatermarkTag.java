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
package org.primefaces.component.watermark;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class WatermarkTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _for;
	private javax.el.ValueExpression _forElement;

	public void release(){
		super.release();
		this._value = null;
		this._for = null;
		this._forElement = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.watermark.Watermark component = null;
		try {
			component = (org.primefaces.component.watermark.Watermark) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_for != null) {
			component.setValueExpression("for", _for);
		}
		if(_forElement != null) {
			component.setValueExpression("forElement", _forElement);
		}
	}

	public String getComponentType() {
		return Watermark.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.WatermarkRenderer";
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setFor(javax.el.ValueExpression expression){
		this._for = expression;
	}

	public void setForElement(javax.el.ValueExpression expression){
		this._forElement = expression;
	}

}