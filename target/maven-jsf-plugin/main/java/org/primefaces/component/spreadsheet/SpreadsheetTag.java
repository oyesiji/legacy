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

public class SpreadsheetTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _title;
	private javax.el.ValueExpression _editable;
	private javax.el.ValueExpression _columnWidth;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._title = null;
		this._editable = null;
		this._columnWidth = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.spreadsheet.Spreadsheet component = null;
		try {
			component = (org.primefaces.component.spreadsheet.Spreadsheet) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_title != null) {
			component.setValueExpression("title", _title);
		}
		if(_editable != null) {
			component.setValueExpression("editable", _editable);
		}
		if(_columnWidth != null) {
			component.setValueExpression("columnWidth", _columnWidth);
		}
	}

	public String getComponentType() {
		return Spreadsheet.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.SpreadsheetRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setTitle(javax.el.ValueExpression expression){
		this._title = expression;
	}

	public void setEditable(javax.el.ValueExpression expression){
		this._editable = expression;
	}

	public void setColumnWidth(javax.el.ValueExpression expression){
		this._columnWidth = expression;
	}

}