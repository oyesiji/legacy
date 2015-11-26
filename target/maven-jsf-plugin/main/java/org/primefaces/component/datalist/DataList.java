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
package org.primefaces.component.datalist;

import javax.faces.component.UIData;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import javax.faces.FacesException;


public class DataList extends UIData implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.component.DataList";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.DataListRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _type;
	private java.lang.String _itemType;
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
	public DataList() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/paginator/paginator.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/primefaces/paginator/paginator.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/datalist/datalist.js");
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

	public java.lang.String getType() {
		if(_type != null )
			return _type;

		ValueExpression ve = getValueExpression("type");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "unordered";
	}
	public void setType(java.lang.String _type) {
		this._type = _type;
	}

	public java.lang.String getItemType() {
		if(_itemType != null )
			return _itemType;

		ValueExpression ve = getValueExpression("itemType");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setItemType(java.lang.String _itemType) {
		this._itemType = _itemType;
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


	public static final String CONTAINER_CLASS = "ui-datalist ui-widget";
	public static final String LIST_CLASS = "ui-datalist-data ui-widget-content ui-corner-all";
	public static final String LIST_ITEM_CLASS = "ui-datalist-item";
	
	public String getListTag() {
		String type = getType();
		
		if(type.equalsIgnoreCase("unordered"))
			return "ul";
		else if(type.equalsIgnoreCase("ordered"))
			return "ol";
		else if(type.equalsIgnoreCase("definition"))
			return "dl";
		else
			throw new FacesException("DataList '" + this.getClientId(FacesContext.getCurrentInstance()) + "' has invalid list type:'" + type + "'");
	}
	
	public boolean isDefinition() {
		return getType().equalsIgnoreCase("definition");
	}

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
		Object values[] = new Object[20];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _type;
		values[3] = _itemType;
		values[4] = _paginator;
		values[5] = _paginatorTemplate;
		values[6] = _rowsPerPageTemplate;
		values[7] = _currentPageReportTemplate;
		values[8] = _pageLinks;
		values[9] = _firstPageLinkLabel;
		values[10] = _previousPageLinkLabel;
		values[11] = _nextPageLinkLabel;
		values[12] = _lastPageLinkLabel;
		values[13] = _paginatorPosition;
		values[14] = _paginatorAlwaysVisible;
		values[15] = _page;
		values[16] = _effect;
		values[17] = _effectSpeed;
		values[18] = _style;
		values[19] = _styleClass;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_type = (java.lang.String) values[2];
		_itemType = (java.lang.String) values[3];
		_paginator = (java.lang.Boolean) values[4];
		_paginatorTemplate = (java.lang.String) values[5];
		_rowsPerPageTemplate = (java.lang.String) values[6];
		_currentPageReportTemplate = (java.lang.String) values[7];
		_pageLinks = (java.lang.Integer) values[8];
		_firstPageLinkLabel = (java.lang.String) values[9];
		_previousPageLinkLabel = (java.lang.String) values[10];
		_nextPageLinkLabel = (java.lang.String) values[11];
		_lastPageLinkLabel = (java.lang.String) values[12];
		_paginatorPosition = (java.lang.String) values[13];
		_paginatorAlwaysVisible = (java.lang.Boolean) values[14];
		_page = (java.lang.Integer) values[15];
		_effect = (java.lang.Boolean) values[16];
		_effectSpeed = (java.lang.String) values[17];
		_style = (java.lang.String) values[18];
		_styleClass = (java.lang.String) values[19];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}