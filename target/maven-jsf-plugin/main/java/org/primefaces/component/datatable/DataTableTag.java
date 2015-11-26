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
package org.primefaces.component.datatable;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class DataTableTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private java.lang.String _var;
	private javax.el.ValueExpression _rows;
	private javax.el.ValueExpression _first;
	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _paginator;
	private javax.el.ValueExpression _paginatorTemplate;
	private javax.el.ValueExpression _rowsPerPageTemplate;
	private javax.el.ValueExpression _currentPageReportTemplate;
	private javax.el.ValueExpression _paginatorAlwaysVisible;
	private javax.el.ValueExpression _scrollable;
	private javax.el.ValueExpression _width;
	private javax.el.ValueExpression _height;
	private javax.el.ValueExpression _firstPageLinkLabel;
	private javax.el.ValueExpression _previousPageLinkLabel;
	private javax.el.ValueExpression _nextPageLinkLabel;
	private javax.el.ValueExpression _lastPageLinkLabel;
	private javax.el.ValueExpression _selectionMode;
	private javax.el.ValueExpression _selection;
	private javax.el.ValueExpression _dynamic;
	private javax.el.ValueExpression _lazy;
	private javax.el.ValueExpression _rowIndexVar;
	private javax.el.ValueExpression _paginatorPosition;
	private javax.el.ValueExpression _emptyMessage;
	private javax.el.ValueExpression _errorMessage;
	private javax.el.ValueExpression _loadingMessage;
	private javax.el.ValueExpression _sortAscMessage;
	private javax.el.ValueExpression _sortDescMessage;
	private javax.el.ValueExpression _update;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _onselectStart;
	private javax.el.ValueExpression _onselectComplete;
	private javax.el.ValueExpression _dblClickSelect;
	private javax.el.ValueExpression _page;
	private javax.el.ValueExpression _pageLinks;

	public void release(){
		super.release();
		this._value = null;
		this._var = null;
		this._rows = null;
		this._first = null;
		this._widgetVar = null;
		this._paginator = null;
		this._paginatorTemplate = null;
		this._rowsPerPageTemplate = null;
		this._currentPageReportTemplate = null;
		this._paginatorAlwaysVisible = null;
		this._scrollable = null;
		this._width = null;
		this._height = null;
		this._firstPageLinkLabel = null;
		this._previousPageLinkLabel = null;
		this._nextPageLinkLabel = null;
		this._lastPageLinkLabel = null;
		this._selectionMode = null;
		this._selection = null;
		this._dynamic = null;
		this._lazy = null;
		this._rowIndexVar = null;
		this._paginatorPosition = null;
		this._emptyMessage = null;
		this._errorMessage = null;
		this._loadingMessage = null;
		this._sortAscMessage = null;
		this._sortDescMessage = null;
		this._update = null;
		this._style = null;
		this._styleClass = null;
		this._onselectStart = null;
		this._onselectComplete = null;
		this._dblClickSelect = null;
		this._page = null;
		this._pageLinks = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.datatable.DataTable component = null;
		try {
			component = (org.primefaces.component.datatable.DataTable) comp;
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
		if(_paginatorAlwaysVisible != null) {
			component.setValueExpression("paginatorAlwaysVisible", _paginatorAlwaysVisible);
		}
		if(_scrollable != null) {
			component.setValueExpression("scrollable", _scrollable);
		}
		if(_width != null) {
			component.setValueExpression("width", _width);
		}
		if(_height != null) {
			component.setValueExpression("height", _height);
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
		if(_selectionMode != null) {
			component.setValueExpression("selectionMode", _selectionMode);
		}
		if(_selection != null) {
			component.setValueExpression("selection", _selection);
		}
		if(_dynamic != null) {
			component.setValueExpression("dynamic", _dynamic);
		}
		if(_lazy != null) {
			component.setValueExpression("lazy", _lazy);
		}
		if(_rowIndexVar != null) {
			component.setValueExpression("rowIndexVar", _rowIndexVar);
		}
		if(_paginatorPosition != null) {
			component.setValueExpression("paginatorPosition", _paginatorPosition);
		}
		if(_emptyMessage != null) {
			component.setValueExpression("emptyMessage", _emptyMessage);
		}
		if(_errorMessage != null) {
			component.setValueExpression("errorMessage", _errorMessage);
		}
		if(_loadingMessage != null) {
			component.setValueExpression("loadingMessage", _loadingMessage);
		}
		if(_sortAscMessage != null) {
			component.setValueExpression("sortAscMessage", _sortAscMessage);
		}
		if(_sortDescMessage != null) {
			component.setValueExpression("sortDescMessage", _sortDescMessage);
		}
		if(_update != null) {
			component.setValueExpression("update", _update);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_onselectStart != null) {
			component.setValueExpression("onselectStart", _onselectStart);
		}
		if(_onselectComplete != null) {
			component.setValueExpression("onselectComplete", _onselectComplete);
		}
		if(_dblClickSelect != null) {
			component.setValueExpression("dblClickSelect", _dblClickSelect);
		}
		if(_page != null) {
			component.setValueExpression("page", _page);
		}
		if(_pageLinks != null) {
			component.setValueExpression("pageLinks", _pageLinks);
		}
	}

	public String getComponentType() {
		return DataTable.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.DataTableRenderer";
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

	public void setPaginatorAlwaysVisible(javax.el.ValueExpression expression){
		this._paginatorAlwaysVisible = expression;
	}

	public void setScrollable(javax.el.ValueExpression expression){
		this._scrollable = expression;
	}

	public void setWidth(javax.el.ValueExpression expression){
		this._width = expression;
	}

	public void setHeight(javax.el.ValueExpression expression){
		this._height = expression;
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

	public void setSelectionMode(javax.el.ValueExpression expression){
		this._selectionMode = expression;
	}

	public void setSelection(javax.el.ValueExpression expression){
		this._selection = expression;
	}

	public void setDynamic(javax.el.ValueExpression expression){
		this._dynamic = expression;
	}

	public void setLazy(javax.el.ValueExpression expression){
		this._lazy = expression;
	}

	public void setRowIndexVar(javax.el.ValueExpression expression){
		this._rowIndexVar = expression;
	}

	public void setPaginatorPosition(javax.el.ValueExpression expression){
		this._paginatorPosition = expression;
	}

	public void setEmptyMessage(javax.el.ValueExpression expression){
		this._emptyMessage = expression;
	}

	public void setErrorMessage(javax.el.ValueExpression expression){
		this._errorMessage = expression;
	}

	public void setLoadingMessage(javax.el.ValueExpression expression){
		this._loadingMessage = expression;
	}

	public void setSortAscMessage(javax.el.ValueExpression expression){
		this._sortAscMessage = expression;
	}

	public void setSortDescMessage(javax.el.ValueExpression expression){
		this._sortDescMessage = expression;
	}

	public void setUpdate(javax.el.ValueExpression expression){
		this._update = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setOnselectStart(javax.el.ValueExpression expression){
		this._onselectStart = expression;
	}

	public void setOnselectComplete(javax.el.ValueExpression expression){
		this._onselectComplete = expression;
	}

	public void setDblClickSelect(javax.el.ValueExpression expression){
		this._dblClickSelect = expression;
	}

	public void setPage(javax.el.ValueExpression expression){
		this._page = expression;
	}

	public void setPageLinks(javax.el.ValueExpression expression){
		this._pageLinks = expression;
	}

}