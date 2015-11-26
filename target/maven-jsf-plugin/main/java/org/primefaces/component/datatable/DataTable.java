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

import javax.faces.component.UIData;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import java.util.Iterator;
import org.primefaces.model.LazyDataModel;
import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.component.UIColumn;
import javax.faces.model.DataModel;
import javax.el.ValueExpression;
import org.primefaces.component.column.Column;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuffer;


public class DataTable extends UIData implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.component.DataTable";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.DataTableRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Boolean _paginator;
	private java.lang.String _paginatorTemplate;
	private java.lang.String _rowsPerPageTemplate;
	private java.lang.String _currentPageReportTemplate;
	private java.lang.Boolean _paginatorAlwaysVisible;
	private java.lang.Boolean _scrollable;
	private java.lang.String _width;
	private java.lang.String _height;
	private java.lang.String _firstPageLinkLabel;
	private java.lang.String _previousPageLinkLabel;
	private java.lang.String _nextPageLinkLabel;
	private java.lang.String _lastPageLinkLabel;
	private java.lang.String _selectionMode;
	private java.lang.Object _selection;
	private java.lang.Boolean _dynamic;
	private java.lang.Boolean _lazy;
	private java.lang.String _rowIndexVar;
	private java.lang.String _paginatorPosition;
	private java.lang.String _emptyMessage;
	private java.lang.String _errorMessage;
	private java.lang.String _loadingMessage;
	private java.lang.String _sortAscMessage;
	private java.lang.String _sortDescMessage;
	private java.lang.String _update;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.String _onselectStart;
	private java.lang.String _onselectComplete;
	private java.lang.Boolean _dblClickSelect;
	private java.lang.Integer _page;
	private java.lang.Integer _pageLinks;
	public DataTable() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/paginator/paginator.css");
			resourceHolder.addResource("/primefaces/datatable/datatable.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/datasource/datasource-min.js");
			resourceHolder.addResource("/primefaces/paginator/paginator.js");
			resourceHolder.addResource("/yui/datatable/datatable-min.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/datatable/datatable.js");
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

	public boolean isPaginatorAlwaysVisible() {
		if(_paginatorAlwaysVisible != null )
			return _paginatorAlwaysVisible;

		ValueExpression ve = getValueExpression("paginatorAlwaysVisible");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setPaginatorAlwaysVisible(boolean _paginatorAlwaysVisible) {
		this._paginatorAlwaysVisible = _paginatorAlwaysVisible;
	}

	public boolean isScrollable() {
		if(_scrollable != null )
			return _scrollable;

		ValueExpression ve = getValueExpression("scrollable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setScrollable(boolean _scrollable) {
		this._scrollable = _scrollable;
	}

	public java.lang.String getWidth() {
		if(_width != null )
			return _width;

		ValueExpression ve = getValueExpression("width");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setWidth(java.lang.String _width) {
		this._width = _width;
	}

	public java.lang.String getHeight() {
		if(_height != null )
			return _height;

		ValueExpression ve = getValueExpression("height");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setHeight(java.lang.String _height) {
		this._height = _height;
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

	public java.lang.String getSelectionMode() {
		if(_selectionMode != null )
			return _selectionMode;

		ValueExpression ve = getValueExpression("selectionMode");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSelectionMode(java.lang.String _selectionMode) {
		this._selectionMode = _selectionMode;
	}

	public java.lang.Object getSelection() {
		if(_selection != null )
			return _selection;

		ValueExpression ve = getValueExpression("selection");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSelection(java.lang.Object _selection) {
		this._selection = _selection;
	}

	public boolean isDynamic() {
		if(_dynamic != null )
			return _dynamic;

		ValueExpression ve = getValueExpression("dynamic");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDynamic(boolean _dynamic) {
		this._dynamic = _dynamic;
	}

	public boolean isLazy() {
		if(_lazy != null )
			return _lazy;

		ValueExpression ve = getValueExpression("lazy");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setLazy(boolean _lazy) {
		this._lazy = _lazy;
	}

	public java.lang.String getRowIndexVar() {
		if(_rowIndexVar != null )
			return _rowIndexVar;

		ValueExpression ve = getValueExpression("rowIndexVar");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setRowIndexVar(java.lang.String _rowIndexVar) {
		this._rowIndexVar = _rowIndexVar;
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

	public java.lang.String getEmptyMessage() {
		if(_emptyMessage != null )
			return _emptyMessage;

		ValueExpression ve = getValueExpression("emptyMessage");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setEmptyMessage(java.lang.String _emptyMessage) {
		this._emptyMessage = _emptyMessage;
	}

	public java.lang.String getErrorMessage() {
		if(_errorMessage != null )
			return _errorMessage;

		ValueExpression ve = getValueExpression("errorMessage");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setErrorMessage(java.lang.String _errorMessage) {
		this._errorMessage = _errorMessage;
	}

	public java.lang.String getLoadingMessage() {
		if(_loadingMessage != null )
			return _loadingMessage;

		ValueExpression ve = getValueExpression("loadingMessage");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setLoadingMessage(java.lang.String _loadingMessage) {
		this._loadingMessage = _loadingMessage;
	}

	public java.lang.String getSortAscMessage() {
		if(_sortAscMessage != null )
			return _sortAscMessage;

		ValueExpression ve = getValueExpression("sortAscMessage");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSortAscMessage(java.lang.String _sortAscMessage) {
		this._sortAscMessage = _sortAscMessage;
	}

	public java.lang.String getSortDescMessage() {
		if(_sortDescMessage != null )
			return _sortDescMessage;

		ValueExpression ve = getValueExpression("sortDescMessage");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSortDescMessage(java.lang.String _sortDescMessage) {
		this._sortDescMessage = _sortDescMessage;
	}

	public java.lang.String getUpdate() {
		if(_update != null )
			return _update;

		ValueExpression ve = getValueExpression("update");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setUpdate(java.lang.String _update) {
		this._update = _update;
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

	public java.lang.String getOnselectStart() {
		if(_onselectStart != null )
			return _onselectStart;

		ValueExpression ve = getValueExpression("onselectStart");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnselectStart(java.lang.String _onselectStart) {
		this._onselectStart = _onselectStart;
	}

	public java.lang.String getOnselectComplete() {
		if(_onselectComplete != null )
			return _onselectComplete;

		ValueExpression ve = getValueExpression("onselectComplete");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnselectComplete(java.lang.String _onselectComplete) {
		this._onselectComplete = _onselectComplete;
	}

	public boolean isDblClickSelect() {
		if(_dblClickSelect != null )
			return _dblClickSelect;

		ValueExpression ve = getValueExpression("dblClickSelect");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDblClickSelect(boolean _dblClickSelect) {
		this._dblClickSelect = _dblClickSelect;
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

	public int getPageLinks() {
		if(_pageLinks != null )
			return _pageLinks;

		ValueExpression ve = getValueExpression("pageLinks");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 10;
	}
	public void setPageLinks(int _pageLinks) {
		this._pageLinks = _pageLinks;
	}


	public void processDecodes(FacesContext facesContext) {
		if(isDynamic()) {
			super.processDecodes(facesContext);
		} else {
			int originalRows = getRows();
			setRows(getRowCount());
			super.processDecodes(facesContext);
			setRows(originalRows);
			
			//Update current page state for client side datatable
			Map<String,String> params = facesContext.getExternalContext().getRequestParameterMap();
			String clientId = getClientId(facesContext);
			String pageParam = clientId + "_page";
			
			if(isPaginator() && params.containsKey(pageParam)) {
				int page = Integer.parseInt(params.get(pageParam));
				setPage(page);
			}
		}
    }
	
	public void processUpdates(FacesContext isAjaxDataRequest) {
		super.processUpdates(isAjaxDataRequest);
		
		if(!isAjaxDataRequest(isAjaxDataRequest)) {
			ValueExpression selectionVE = this.getValueExpression("selection");
			if(selectionVE != null) {
				selectionVE.setValue(isAjaxDataRequest.getELContext(), this._selection);
				this._selection = null;
			}
		}
	}

	void loadLazyData() {
		DataModel model = getDataModel();
		if(model instanceof LazyDataModel) {
			LazyDataModel lazyModel = (LazyDataModel) model;
			lazyModel.setPageSize(getRows());
			lazyModel.setWrappedData(lazyModel.fetchLazyData(getFirst(), getRows()));
		}
	}
	
	private Map<String,ValueExpression> filterMap;
	
	public Map<String,ValueExpression> getFilterMap() {
		if(filterMap == null) {
			filterMap = new HashMap<String,ValueExpression>();
			
			for(Iterator<UIComponent> children = getChildren().iterator(); children.hasNext();) {
				UIComponent kid = children.next();
					
				if(kid.isRendered() && kid instanceof Column) {
					Column column = (Column) kid;
					
					if(column.getValueExpression("filterBy") != null) {
						filterMap.put(column.getClientId(FacesContext.getCurrentInstance()), column.getValueExpression("filterBy"));
					}
				}
			}
		}

		return filterMap;
	}
	
	public boolean hasFilter() {
		return getFilterMap().size() > 0;
	}
	
	public boolean isAjaxDataRequest(FacesContext facesContext) {
		return facesContext.getExternalContext().getRequestParameterMap().containsKey(this.getClientId(facesContext) + "_ajaxData");
	}
	
	private List<String> selected= new ArrayList<String>();
	
	public List<String> getSelected() {
		return selected;
	}
	
	public void setSelected(List<String> selected) {
		this.selected = selected;
	}
	
	public boolean isSelectionEnabled() {
		return this.getSelectionMode() != null;
	}
	
	public boolean isSingleSelectionMode() {
		String selectionMode = this.getSelectionMode();
		
		if(selectionMode != null)
			return selectionMode.equals("single") || selectionMode.equals("singlecell");
		else
			return false;
	}
	
	public boolean isCellSelection() {
		String selectionMode = this.getSelectionMode();
		
		if(selectionMode != null)
			return selectionMode.indexOf("cell") != -1;
		else
			return false;
	}
	
	public String getSelectedAsString() {
		StringBuffer buffer = new StringBuffer();
		for(Iterator<String> iter = selected.iterator();iter.hasNext();) {
			buffer.append(iter.next());
			
			if(iter.hasNext())
				buffer.append(",");
		}
		
		return buffer.toString();
	}
	
	 public UIColumn getColumnByClientId(String clientId) {
	    	FacesContext facesContext = FacesContext.getCurrentInstance();
	    	
	    	for(UIComponent kid : getChildren()) {
	    		if(kid.getClientId(facesContext).equals(clientId))
	    			return (UIColumn) kid;
	    	}
	    	
	    	return null;
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
		Object values[] = new Object[33];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _paginator;
		values[3] = _paginatorTemplate;
		values[4] = _rowsPerPageTemplate;
		values[5] = _currentPageReportTemplate;
		values[6] = _paginatorAlwaysVisible;
		values[7] = _scrollable;
		values[8] = _width;
		values[9] = _height;
		values[10] = _firstPageLinkLabel;
		values[11] = _previousPageLinkLabel;
		values[12] = _nextPageLinkLabel;
		values[13] = _lastPageLinkLabel;
		values[14] = _selectionMode;
		values[15] = _selection;
		values[16] = _dynamic;
		values[17] = _lazy;
		values[18] = _rowIndexVar;
		values[19] = _paginatorPosition;
		values[20] = _emptyMessage;
		values[21] = _errorMessage;
		values[22] = _loadingMessage;
		values[23] = _sortAscMessage;
		values[24] = _sortDescMessage;
		values[25] = _update;
		values[26] = _style;
		values[27] = _styleClass;
		values[28] = _onselectStart;
		values[29] = _onselectComplete;
		values[30] = _dblClickSelect;
		values[31] = _page;
		values[32] = _pageLinks;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_paginator = (java.lang.Boolean) values[2];
		_paginatorTemplate = (java.lang.String) values[3];
		_rowsPerPageTemplate = (java.lang.String) values[4];
		_currentPageReportTemplate = (java.lang.String) values[5];
		_paginatorAlwaysVisible = (java.lang.Boolean) values[6];
		_scrollable = (java.lang.Boolean) values[7];
		_width = (java.lang.String) values[8];
		_height = (java.lang.String) values[9];
		_firstPageLinkLabel = (java.lang.String) values[10];
		_previousPageLinkLabel = (java.lang.String) values[11];
		_nextPageLinkLabel = (java.lang.String) values[12];
		_lastPageLinkLabel = (java.lang.String) values[13];
		_selectionMode = (java.lang.String) values[14];
		_selection = (java.lang.Object) values[15];
		_dynamic = (java.lang.Boolean) values[16];
		_lazy = (java.lang.Boolean) values[17];
		_rowIndexVar = (java.lang.String) values[18];
		_paginatorPosition = (java.lang.String) values[19];
		_emptyMessage = (java.lang.String) values[20];
		_errorMessage = (java.lang.String) values[21];
		_loadingMessage = (java.lang.String) values[22];
		_sortAscMessage = (java.lang.String) values[23];
		_sortDescMessage = (java.lang.String) values[24];
		_update = (java.lang.String) values[25];
		_style = (java.lang.String) values[26];
		_styleClass = (java.lang.String) values[27];
		_onselectStart = (java.lang.String) values[28];
		_onselectComplete = (java.lang.String) values[29];
		_dblClickSelect = (java.lang.Boolean) values[30];
		_page = (java.lang.Integer) values[31];
		_pageLinks = (java.lang.Integer) values[32];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}