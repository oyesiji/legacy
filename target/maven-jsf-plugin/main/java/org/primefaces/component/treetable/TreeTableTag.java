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
package org.primefaces.component.treetable;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class TreeTableTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private java.lang.String _var;
	private javax.el.ValueExpression _rows;
	private javax.el.ValueExpression _first;
	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _readOnly;
	private javax.el.ValueExpression _expanded;

	public void release(){
		super.release();
		this._value = null;
		this._var = null;
		this._rows = null;
		this._first = null;
		this._widgetVar = null;
		this._style = null;
		this._styleClass = null;
		this._readOnly = null;
		this._expanded = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.treetable.TreeTable component = null;
		try {
			component = (org.primefaces.component.treetable.TreeTable) comp;
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
		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_readOnly != null) {
			component.setValueExpression("readOnly", _readOnly);
		}
		if(_expanded != null) {
			component.setValueExpression("expanded", _expanded);
		}
	}

	public String getComponentType() {
		return TreeTable.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.TreeTableRenderer";
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

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setReadOnly(javax.el.ValueExpression expression){
		this._readOnly = expression;
	}

	public void setExpanded(javax.el.ValueExpression expression){
		this._expanded = expression;
	}

}