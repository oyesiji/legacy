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

import javax.faces.component.UIColumn;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Column extends UIColumn {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Column";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";

	private java.lang.Object _sortBy;
	private java.lang.Boolean _resizable;
	private java.lang.String _parser;
	private java.lang.Integer _width;
	private java.lang.String _styleClass;
	private javax.el.MethodExpression _sortFunction;
	private java.lang.Object _filterBy;
	private java.lang.String _filterStyle;
	private java.lang.String _filterStyleClass;
	private java.lang.String _filterEvent;
	public Column() {
		setRendererType(null);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.Object getSortBy() {
		if(_sortBy != null )
			return _sortBy;

		ValueExpression ve = getValueExpression("sortBy");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSortBy(java.lang.Object _sortBy) {
		this._sortBy = _sortBy;
	}

	public boolean isResizable() {
		if(_resizable != null )
			return _resizable;

		ValueExpression ve = getValueExpression("resizable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setResizable(boolean _resizable) {
		this._resizable = _resizable;
	}

	public java.lang.String getParser() {
		if(_parser != null )
			return _parser;

		ValueExpression ve = getValueExpression("parser");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setParser(java.lang.String _parser) {
		this._parser = _parser;
	}

	public int getWidth() {
		if(_width != null )
			return _width;

		ValueExpression ve = getValueExpression("width");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : java.lang.Integer.MIN_VALUE;
	}
	public void setWidth(int _width) {
		this._width = _width;
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

	public javax.el.MethodExpression getSortFunction() {
		return this._sortFunction;
	}

	public void setSortFunction(javax.el.MethodExpression _sortFunction) {
		this._sortFunction = _sortFunction;
	}
	public java.lang.Object getFilterBy() {
		if(_filterBy != null )
			return _filterBy;

		ValueExpression ve = getValueExpression("filterBy");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setFilterBy(java.lang.Object _filterBy) {
		this._filterBy = _filterBy;
	}

	public java.lang.String getFilterStyle() {
		if(_filterStyle != null )
			return _filterStyle;

		ValueExpression ve = getValueExpression("filterStyle");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setFilterStyle(java.lang.String _filterStyle) {
		this._filterStyle = _filterStyle;
	}

	public java.lang.String getFilterStyleClass() {
		if(_filterStyleClass != null )
			return _filterStyleClass;

		ValueExpression ve = getValueExpression("filterStyleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setFilterStyleClass(java.lang.String _filterStyleClass) {
		this._filterStyleClass = _filterStyleClass;
	}

	public java.lang.String getFilterEvent() {
		if(_filterEvent != null )
			return _filterEvent;

		ValueExpression ve = getValueExpression("filterEvent");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "keyup";
	}
	public void setFilterEvent(java.lang.String _filterEvent) {
		this._filterEvent = _filterEvent;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[11];
		values[0] = super.saveState(context);
		values[1] = _sortBy;
		values[2] = _resizable;
		values[3] = _parser;
		values[4] = _width;
		values[5] = _styleClass;
		values[6] = _sortFunction;
		values[7] = _filterBy;
		values[8] = _filterStyle;
		values[9] = _filterStyleClass;
		values[10] = _filterEvent;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_sortBy = (java.lang.Object) values[1];
		_resizable = (java.lang.Boolean) values[2];
		_parser = (java.lang.String) values[3];
		_width = (java.lang.Integer) values[4];
		_styleClass = (java.lang.String) values[5];
		_sortFunction = (javax.el.MethodExpression) values[6];
		_filterBy = (java.lang.Object) values[7];
		_filterStyle = (java.lang.String) values[8];
		_filterStyleClass = (java.lang.String) values[9];
		_filterEvent = (java.lang.String) values[10];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}