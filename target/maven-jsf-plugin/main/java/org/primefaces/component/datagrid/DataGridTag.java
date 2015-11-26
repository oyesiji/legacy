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
package org.primefaces.component.datagrid;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class DataGridTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private java.lang.String _var;
	private javax.el.ValueExpression _rows;
	private javax.el.ValueExpression _first;
	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _columns;
	private javax.el.ValueExpression _paginator;
	private javax.el.ValueExpression _paginatorTemplate;
	private javax.el.ValueExpression _rowsPerPageTemplate;
	private javax.el.ValueExpression _currentPageReportTemplate;
	private javax.el.ValueExpression _pageLinks;
	private javax.el.ValueExpression _firstPageLinkLabel;
	private javax.el.ValueExpression _previousPageLinkLabel;
	private javax.el.ValueExpression _nextPageLinkLabel;
	private javax.el.ValueExpression _lastPageLinkLabel;
	private javax.el.ValueExpression _paginatorPosition;
	private javax.el.ValueExpression _paginatorAlwaysVisible;
	private javax.el.ValueExpression _page;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _effectSpeed;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;

	public void release(){
		super.release();
		this._value = null;
		this._var = null;
		this._rows = null;
		this._first = null;
		this._widgetVar = null;
		this._columns = null;
		this._paginator = null;
		this._paginatorTemplate = null;
		this._rowsPerPageTemplate = null;
		this._currentPageReportTemplate = null;
		this._pageLinks = null;
		this._firstPageLinkLabel = null;
		this._previousPageLinkLabel = null;
		this._nextPageLinkLabel = null;
		this._lastPageLinkLabel = null;
		this._paginatorPosition = null;
		this._paginatorAlwaysVisible = null;
		this._page = null;
		this._effect = null;
		this._effectSpeed = null;
		this._style = null;
		this._styleClass = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.datagrid.DataGrid component = null;
		try {
			component = (org.primefaces.component.datagrid.DataGrid) comp;
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
		if(_columns != null) {
			component.setValueExpression("columns", _columns);
		}
		if(_paginator != null) {
			component.setValueExpression("paginator", _paginator);
		}
		if(_paginatorTemplate != null) {
			component.setValueExpression("paginatorTemplate", _paginatorTemplate);
		}
		if(_rowsPerPageTemplate != null) {
			component.setValueExpression("rowsPerPageTemplate", _rowsPerPageTemplate);
		}
		if(_currentPageReportTemplate != null) {
			component.setValueExpression("currentPageReportTemplate", _currentPageReportTemplate);
		}
		if(_pageLinks != null) {
			component.setValueExpression("pageLinks", _pageLinks);
		}
		if(_firstPageLinkLabel != null) {
			component.setValueExpression("firstPageLinkLabel", _firstPageLinkLabel);
		}
		if(_previousPageLinkLabel != null) {
			component.setValueExpression("previousPageLinkLabel", _previousPageLinkLabel);
		}
		if(_nextPageLinkLabel != null) {
			component.setValueExpression("nextPageLinkLabel", _nextPageLinkLabel);
		}
		if(_lastPageLinkLabel != null) {
			component.setValueExpression("lastPageLinkLabel", _lastPageLinkLabel);
		}
		if(_paginatorPosition != null) {
			component.setValueExpression("paginatorPosition", _paginatorPosition);
		}
		if(_paginatorAlwaysVisible != null) {
			component.setValueExpression("paginatorAlwaysVisible", _paginatorAlwaysVisible);
		}
		if(_page != null) {
			component.setValueExpression("page", _page);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_effectSpeed != null) {
			component.setValueExpression("effectSpeed", _effectSpeed);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
	}

	public String getComponentType() {
		return DataGrid.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.DataGridRenderer";
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

	public void setColumns(javax.el.ValueExpression expression){
		this._columns = expression;
	}

	public void setPaginator(javax.el.ValueExpression expression){
		this._paginator = expression;
	}

	public void setPaginatorTemplate(javax.el.ValueExpression expression){
		this._paginatorTemplate = expression;
	}

	public void setRowsPerPageTemplate(javax.el.ValueExpression expression){
		this._rowsPerPageTemplate = expression;
	}

	public void setCurrentPageReportTemplate(javax.el.ValueExpression expression){
		this._currentPageReportTemplate = expression;
	}

	public void setPageLinks(javax.el.ValueExpression expression){
		this._pageLinks = expression;
	}

	public void setFirstPageLinkLabel(javax.el.ValueExpression expression){
		this._firstPageLinkLabel = expression;
	}

	public void setPreviousPageLinkLabel(javax.el.ValueExpression expression){
		this._previousPageLinkLabel = expression;
	}

	public void setNextPageLinkLabel(javax.el.ValueExpression expression){
		this._nextPageLinkLabel = expression;
	}

	public void setLastPageLinkLabel(javax.el.ValueExpression expression){
		this._lastPageLinkLabel = expression;
	}

	public void setPaginatorPosition(javax.el.ValueExpression expression){
		this._paginatorPosition = expression;
	}

	public void setPaginatorAlwaysVisible(javax.el.ValueExpression expression){
		this._paginatorAlwaysVisible = expression;
	}

	public void setPage(javax.el.ValueExpression expression){
		this._page = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setEffectSpeed(javax.el.ValueExpression expression){
		this._effectSpeed = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

}