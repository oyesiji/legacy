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
package org.primefaces.component.column;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class ColumnTag extends UIComponentELTag {

	private javax.el.ValueExpression _sortBy;
	private javax.el.ValueExpression _resizable;
	private javax.el.ValueExpression _parser;
	private javax.el.ValueExpression _width;
	private javax.el.ValueExpression _styleClass;
	private javax.el.MethodExpression _sortFunction;
	private javax.el.ValueExpression _filterBy;
	private javax.el.ValueExpression _filterStyle;
	private javax.el.ValueExpression _filterStyleClass;
	private javax.el.ValueExpression _filterEvent;

	public void release(){
		super.release();
		this._sortBy = null;
		this._resizable = null;
		this._parser = null;
		this._width = null;
		this._styleClass = null;
		this._sortFunction = null;
		this._filterBy = null;
		this._filterStyle = null;
		this._filterStyleClass = null;
		this._filterEvent = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.column.Column component = null;
		try {
			component = (org.primefaces.component.column.Column) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_sortBy != null) {
			component.setValueExpression("sortBy", _sortBy);
		}
		if(_resizable != null) {
			component.setValueExpression("resizable", _resizable);
		}
		if(_parser != null) {
			component.setValueExpression("parser", _parser);
		}
		if(_width != null) {
			component.setValueExpression("width", _width);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_sortFunction != null) {
			component.setSortFunction(_sortFunction);
		}
		if(_filterBy != null) {
			component.setValueExpression("filterBy", _filterBy);
		}
		if(_filterStyle != null) {
			component.setValueExpression("filterStyle", _filterStyle);
		}
		if(_filterStyleClass != null) {
			component.setValueExpression("filterStyleClass", _filterStyleClass);
		}
		if(_filterEvent != null) {
			component.setValueExpression("filterEvent", _filterEvent);
		}
	}

	public String getComponentType() {
		return Column.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return null;
	}

	public void setSortBy(javax.el.ValueExpression expression){
		this._sortBy = expression;
	}

	public void setResizable(javax.el.ValueExpression expression){
		this._resizable = expression;
	}

	public void setParser(javax.el.ValueExpression expression){
		this._parser = expression;
	}

	public void setWidth(javax.el.ValueExpression expression){
		this._width = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setSortFunction(javax.el.MethodExpression expression){
		this._sortFunction = expression;
	}

	public void setFilterBy(javax.el.ValueExpression expression){
		this._filterBy = expression;
	}

	public void setFilterStyle(javax.el.ValueExpression expression){
		this._filterStyle = expression;
	}

	public void setFilterStyleClass(javax.el.ValueExpression expression){
		this._filterStyleClass = expression;
	}

	public void setFilterEvent(javax.el.ValueExpression expression){
		this._filterEvent = expression;
	}

}