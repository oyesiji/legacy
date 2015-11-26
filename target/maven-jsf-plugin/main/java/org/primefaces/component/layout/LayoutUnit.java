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
package org.primefaces.component.layout;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class LayoutUnit extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.LayoutUnit";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.LayoutUnitRenderer";

	private java.lang.String _position;
	private java.lang.Integer _width;
	private java.lang.Integer _height;
	private java.lang.Boolean _resizable;
	private java.lang.Boolean _closable;
	private java.lang.Boolean _collapsible;
	private java.lang.String _scrollable;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.String _header;
	private java.lang.String _footer;
	private java.lang.Integer _minWidth;
	private java.lang.Integer _maxWidth;
	private java.lang.Integer _minHeight;
	private java.lang.Integer _maxHeight;
	private java.lang.String _gutter;
	private java.lang.Integer _zindex;
	private java.lang.Boolean _visible;
	private java.lang.Boolean _collapsed;
	private java.lang.Boolean _proxyResize;
	private java.lang.Integer _collapseSize;
	public LayoutUnit() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getPosition() {
		if(_position != null )
			return _position;

		ValueExpression ve = getValueExpression("position");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setPosition(java.lang.String _position) {
		this._position = _position;
	}

	public int getWidth() {
		if(_width != null )
			return _width;

		ValueExpression ve = getValueExpression("width");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : -1;
	}
	public void setWidth(int _width) {
		this._width = _width;
	}

	public int getHeight() {
		if(_height != null )
			return _height;

		ValueExpression ve = getValueExpression("height");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : -1;
	}
	public void setHeight(int _height) {
		this._height = _height;
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

	public boolean isClosable() {
		if(_closable != null )
			return _closable;

		ValueExpression ve = getValueExpression("closable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setClosable(boolean _closable) {
		this._closable = _closable;
	}

	public boolean isCollapsible() {
		if(_collapsible != null )
			return _collapsible;

		ValueExpression ve = getValueExpression("collapsible");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setCollapsible(boolean _collapsible) {
		this._collapsible = _collapsible;
	}

	public java.lang.String getScrollable() {
		if(_scrollable != null )
			return _scrollable;

		ValueExpression ve = getValueExpression("scrollable");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setScrollable(java.lang.String _scrollable) {
		this._scrollable = _scrollable;
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

	public java.lang.String getHeader() {
		if(_header != null )
			return _header;

		ValueExpression ve = getValueExpression("header");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setHeader(java.lang.String _header) {
		this._header = _header;
	}

	public java.lang.String getFooter() {
		if(_footer != null )
			return _footer;

		ValueExpression ve = getValueExpression("footer");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setFooter(java.lang.String _footer) {
		this._footer = _footer;
	}

	public int getMinWidth() {
		if(_minWidth != null )
			return _minWidth;

		ValueExpression ve = getValueExpression("minWidth");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : -1;
	}
	public void setMinWidth(int _minWidth) {
		this._minWidth = _minWidth;
	}

	public int getMaxWidth() {
		if(_maxWidth != null )
			return _maxWidth;

		ValueExpression ve = getValueExpression("maxWidth");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : -1;
	}
	public void setMaxWidth(int _maxWidth) {
		this._maxWidth = _maxWidth;
	}

	public int getMinHeight() {
		if(_minHeight != null )
			return _minHeight;

		ValueExpression ve = getValueExpression("minHeight");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : -1;
	}
	public void setMinHeight(int _minHeight) {
		this._minHeight = _minHeight;
	}

	public int getMaxHeight() {
		if(_maxHeight != null )
			return _maxHeight;

		ValueExpression ve = getValueExpression("maxHeight");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : -1;
	}
	public void setMaxHeight(int _maxHeight) {
		this._maxHeight = _maxHeight;
	}

	public java.lang.String getGutter() {
		if(_gutter != null )
			return _gutter;

		ValueExpression ve = getValueExpression("gutter");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "4px";
	}
	public void setGutter(java.lang.String _gutter) {
		this._gutter = _gutter;
	}

	public int getZindex() {
		if(_zindex != null )
			return _zindex;

		ValueExpression ve = getValueExpression("zindex");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : -1;
	}
	public void setZindex(int _zindex) {
		this._zindex = _zindex;
	}

	public boolean isVisible() {
		if(_visible != null )
			return _visible;

		ValueExpression ve = getValueExpression("visible");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setVisible(boolean _visible) {
		this._visible = _visible;
	}

	public boolean isCollapsed() {
		if(_collapsed != null )
			return _collapsed;

		ValueExpression ve = getValueExpression("collapsed");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setCollapsed(boolean _collapsed) {
		this._collapsed = _collapsed;
	}

	public boolean isProxyResize() {
		if(_proxyResize != null )
			return _proxyResize;

		ValueExpression ve = getValueExpression("proxyResize");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setProxyResize(boolean _proxyResize) {
		this._proxyResize = _proxyResize;
	}

	public int getCollapseSize() {
		if(_collapseSize != null )
			return _collapseSize;

		ValueExpression ve = getValueExpression("collapseSize");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : -1;
	}
	public void setCollapseSize(int _collapseSize) {
		this._collapseSize = _collapseSize;
	}


	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		getParent().broadcast(event);
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[22];
		values[0] = super.saveState(context);
		values[1] = _position;
		values[2] = _width;
		values[3] = _height;
		values[4] = _resizable;
		values[5] = _closable;
		values[6] = _collapsible;
		values[7] = _scrollable;
		values[8] = _style;
		values[9] = _styleClass;
		values[10] = _header;
		values[11] = _footer;
		values[12] = _minWidth;
		values[13] = _maxWidth;
		values[14] = _minHeight;
		values[15] = _maxHeight;
		values[16] = _gutter;
		values[17] = _zindex;
		values[18] = _visible;
		values[19] = _collapsed;
		values[20] = _proxyResize;
		values[21] = _collapseSize;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_position = (java.lang.String) values[1];
		_width = (java.lang.Integer) values[2];
		_height = (java.lang.Integer) values[3];
		_resizable = (java.lang.Boolean) values[4];
		_closable = (java.lang.Boolean) values[5];
		_collapsible = (java.lang.Boolean) values[6];
		_scrollable = (java.lang.String) values[7];
		_style = (java.lang.String) values[8];
		_styleClass = (java.lang.String) values[9];
		_header = (java.lang.String) values[10];
		_footer = (java.lang.String) values[11];
		_minWidth = (java.lang.Integer) values[12];
		_maxWidth = (java.lang.Integer) values[13];
		_minHeight = (java.lang.Integer) values[14];
		_maxHeight = (java.lang.Integer) values[15];
		_gutter = (java.lang.String) values[16];
		_zindex = (java.lang.Integer) values[17];
		_visible = (java.lang.Boolean) values[18];
		_collapsed = (java.lang.Boolean) values[19];
		_proxyResize = (java.lang.Boolean) values[20];
		_collapseSize = (java.lang.Integer) values[21];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}