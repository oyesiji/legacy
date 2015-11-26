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

import javax.faces.component.UIData;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class DataGrid extends UIData implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.component.DataGrid";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.DataGridRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Integer _columns;
	private java.lang.Boolean _paginator;
	private java.lang.String _paginatorTemplate;
	private java.lang.String _rowsPerPageTemplate;
	private java.lang.String _currentPageReportTemplate;
	private java.lang.Integer _pageLinks;
	private java.lang.String _firstPageLinkLabel;
	private java.lang.String _previousPageLinkLabel;
	private java.lang.String _nextPageLinkLabel;
	private java.lang.String _lastPageLinkLabel;
	private java.lang.String _paginatorPosition;
	private java.lang.Boolean _paginatorAlwaysVisible;
	private java.lang.Integer _page;
	private java.lang.Boolean _effect;
	private java.lang.String _effectSpeed;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	public DataGrid() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/paginator/paginator.css");
			resourceHolder.addResource("/primefaces/datagrid/datagrid.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/paginator/paginator.js");
			resourceHolder.addResource("/primefaces/datagrid/datagrid.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getWidgetVar() {
		if(_widgetVar != null )
			return _widgetVar;

		ValueExpression ve = getValueExpression("widgetVar");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setWidgetVar(java.lang.String _widgetVar) {
		this._widgetVar = _widgetVar;
	}

	public int getColumns() {
		if(_columns != null )
			return _columns;

		ValueExpression ve = getValueExpression("columns");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 3;
	}
	public void setColumns(int _columns) {
		this._columns = _columns;
	}

	public boolean isPaginator() {
		if(_paginator != null )
			return _paginator;

		ValueExpression ve = getValueExpression("paginator");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setPaginator(boolean _paginator) {
		this._paginator = _paginator;
	}

	public java.lang.String getPaginatorTemplate() {
		if(_paginatorTemplate != null )
			return _paginatorTemplate;

		ValueExpression ve = getValueExpression("paginatorTemplate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setPaginatorTemplate(java.lang.String _paginatorTemplate) {
		this._paginatorTemplate = _paginatorTemplate;
	}

	public java.lang.String getRowsPerPageTemplate() {
		if(_rowsPerPageTemplate != null )
			return _rowsPerPageTemplate;

		ValueExpression ve = getValueExpression("rowsPerPageTemplate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setRowsPerPageTemplate(java.lang.String _rowsPerPageTemplate) {
		this._rowsPerPageTemplate = _rowsPerPageTemplate;
	}

	public java.lang.String getCurrentPageReportTemplate() {
		if(_currentPageReportTemplate != null )
			return _currentPageReportTemplate;

		ValueExpression ve = getValueExpression("currentPageReportTemplate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setCurrentPageReportTemplate(java.lang.String _currentPageReportTemplate) {
		this._currentPageReportTemplate = _currentPageReportTemplate;
	}

	public int getPageLinks() {
		if(_pageLinks != null )
			return _pageLinks;

		ValueExpression ve = getValueExpression("pageLinks");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 10;
	}
	public void setPageLinks(int _pageLinks) {
		this._pageLinks = _pageLinks;
	}

	public java.lang.String getFirstPageLinkLabel() {
		if(_firstPageLinkLabel != null )
			return _firstPageLinkLabel;

		ValueExpression ve = getValueExpression("firstPageLinkLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setFirstPageLinkLabel(java.lang.String _firstPageLinkLabel) {
		this._firstPageLinkLabel = _firstPageLinkLabel;
	}

	public java.lang.String getPreviousPageLinkLabel() {
		if(_previousPageLinkLabel != null )
			return _previousPageLinkLabel;

		ValueExpression ve = getValueExpression("previousPageLinkLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setPreviousPageLinkLabel(java.lang.String _previousPageLinkLabel) {
		this._previousPageLinkLabel = _previousPageLinkLabel;
	}

	public java.lang.String getNextPageLinkLabel() {
		if(_nextPageLinkLabel != null )
			return _nextPageLinkLabel;

		ValueExpression ve = getValueExpression("nextPageLinkLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setNextPageLinkLabel(java.lang.String _nextPageLinkLabel) {
		this._nextPageLinkLabel = _nextPageLinkLabel;
	}

	public java.lang.String getLastPageLinkLabel() {
		if(_lastPageLinkLabel != null )
			return _lastPageLinkLabel;

		ValueExpression ve = getValueExpression("lastPageLinkLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setLastPageLinkLabel(java.lang.String _lastPageLinkLabel) {
		this._lastPageLinkLabel = _lastPageLinkLabel;
	}

	public java.lang.String getPaginatorPosition() {
		if(_paginatorPosition != null )
			return _paginatorPosition;

		ValueExpression ve = getValueExpression("paginatorPosition");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "both";
	}
	public void setPaginatorPosition(java.lang.String _paginatorPosition) {
		this._paginatorPosition = _paginatorPosition;
	}

	public boolean isPaginatorAlwaysVisible() {
		if(_paginatorAlwaysVisible != null )
			return _paginatorAlwaysVisible;

		ValueExpression ve = getValueExpression("paginatorAlwaysVisible");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setPaginatorAlwaysVisible(boolean _paginatorAlwaysVisible) {
		this._paginatorAlwaysVisible = _paginatorAlwaysVisible;
	}

	public int getPage() {
		if(_page != null )
			return _page;

		ValueExpression ve = getValueExpression("page");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1;
	}
	public void setPage(int _page) {
		this._page = _page;
	}

	public boolean isEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setEffect(boolean _effect) {
		this._effect = _effect;
	}

	public java.lang.String getEffectSpeed() {
		if(_effectSpeed != null )
			return _effectSpeed;

		ValueExpression ve = getValueExpression("effectSpeed");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "normal";
	}
	public void setEffectSpeed(java.lang.String _effectSpeed) {
		this._effectSpeed = _effectSpeed;
	}

	public java.lang.String getStyle() {
		if(_style != null )
			return _style;

		ValueExpression ve = getValueExpression("style");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStyle(java.lang.String _style) {
		this._style = _style;
	}

	public java.lang.String getStyleClass() {
		if(_styleClass != null )
			return _styleClass;

		ValueExpression ve = getValueExpression("styleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStyleClass(java.lang.String _styleClass) {
		this._styleClass = _styleClass;
	}

	public static final String CONTAINER_CLASS = "ui-datagrid ui-widget";
	public static final String TABLE_CLASS = "ui-datagrid-data";
	public static final String TABLE_ROW_CLASS = "ui-datagrid-row";
	public static final String TABLE_COLUMN_CLASS = "ui-datagrid-column";

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}

	public void encodePartially(FacesContext facesContext) throws IOException {
		Renderer renderer = getRenderer(facesContext);

		if(renderer instanceof PartialRenderer) {
			((PartialRenderer)renderer).encodePartially(facesContext, this);
		}
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[19];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _columns;
		values[3] = _paginator;
		values[4] = _paginatorTemplate;
		values[5] = _rowsPerPageTemplate;
		values[6] = _currentPageReportTemplate;
		values[7] = _pageLinks;
		values[8] = _firstPageLinkLabel;
		values[9] = _previousPageLinkLabel;
		values[10] = _nextPageLinkLabel;
		values[11] = _lastPageLinkLabel;
		values[12] = _paginatorPosition;
		values[13] = _paginatorAlwaysVisible;
		values[14] = _page;
		values[15] = _effect;
		values[16] = _effectSpeed;
		values[17] = _style;
		values[18] = _styleClass;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_columns = (java.lang.Integer) values[2];
		_paginator = (java.lang.Boolean) values[3];
		_paginatorTemplate = (java.lang.String) values[4];
		_rowsPerPageTemplate = (java.lang.String) values[5];
		_currentPageReportTemplate = (java.lang.String) values[6];
		_pageLinks = (java.lang.Integer) values[7];
		_firstPageLinkLabel = (java.lang.String) values[8];
		_previousPageLinkLabel = (java.lang.String) values[9];
		_nextPageLinkLabel = (java.lang.String) values[10];
		_lastPageLinkLabel = (java.lang.String) values[11];
		_paginatorPosition = (java.lang.String) values[12];
		_paginatorAlwaysVisible = (java.lang.Boolean) values[13];
		_page = (java.lang.Integer) values[14];
		_effect = (java.lang.Boolean) values[15];
		_effectSpeed = (java.lang.String) values[16];
		_style = (java.lang.String) values[17];
		_styleClass = (java.lang.String) values[18];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}