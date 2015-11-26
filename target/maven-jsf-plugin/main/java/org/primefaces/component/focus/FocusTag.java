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
package org.primefaces.component.focus;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class FocusTag extends UIComponentELTag {

	private javax.el.ValueExpression _for;
	private javax.el.ValueExpression _context;
	private javax.el.ValueExpression _minSeverity;

	public void release(){
		super.release();
		this._for = null;
		this._context = null;
		this._minSeverity = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.focus.Focus component = null;
		try {
			component = (org.primefaces.component.focus.Focus) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_for != null) {
			component.setValueExpression("for", _for);
		}
		if(_context != null) {
			component.setValueExpression("context", _context);
		}
		if(_minSeverity != null) {
			component.setValueExpression("minSeverity", _minSeverity);
		}
	}

	public String getComponentType() {
		return Focus.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.FocusRenderer";
	}

	public void setFor(javax.el.ValueExpression expression){
		this._for = expression;
	}

	public void setContext(javax.el.ValueExpression expression){
		this._context = expression;
	}

	public void setMinSeverity(javax.el.ValueExpression expression){
		this._minSeverity = expression;
	}

}