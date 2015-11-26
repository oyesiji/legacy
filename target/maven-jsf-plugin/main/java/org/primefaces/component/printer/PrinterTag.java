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
package org.primefaces.component.printer;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class PrinterTag extends UIComponentELTag {

	private javax.el.ValueExpression _target;

	public void release(){
		super.release();
		this._target = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.printer.Printer component = null;
		try {
			component = (org.primefaces.component.printer.Printer) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_target != null) {
			component.setValueExpression("target", _target);
		}
	}

	public String getComponentType() {
		return Printer.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.PrinterRenderer";
	}

	public void setTarget(javax.el.ValueExpression expression){
		this._target = expression;
	}

}