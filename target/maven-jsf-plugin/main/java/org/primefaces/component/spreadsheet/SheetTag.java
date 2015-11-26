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
package org.primefaces.component.spreadsheet;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class SheetTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private java.lang.String _var;
	private javax.el.ValueExpression _rows;
	private javax.el.ValueExpression _first;
	private javax.el.ValueExpression _title;

	public void release(){
		super.release();
		this._value = null;
		this._var = null;
		this._rows = null;
		this._first = null;
		this._title = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.spreadsheet.Sheet component = null;
		try {
			component = (org.primefaces.component.spreadsheet.Sheet) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_var != null) {
			component.setVar(_var);
		}
		if(_rows != null) {
			component.setValueExpression("rows", _rows);
		}
		if(_first != null) {
			component.setValueExpression("first", _first);
		}
		if(_title != null) {
			component.setValueExpression("title", _title);
		}
	}

	public String getComponentType() {
		return Sheet.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return null;
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setVar(java.lang.String value){
		this._var = value;
	}

	public void setRows(javax.el.ValueExpression expression){
		this._rows = expression;
	}

	public void setFirst(javax.el.ValueExpression expression){
		this._first = expression;
	}

	public void setTitle(javax.el.ValueExpression expression){
		this._title = expression;
	}

}