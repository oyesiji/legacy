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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class LayoutUnitTag extends UIComponentELTag {

	private javax.el.ValueExpression _position;
	private javax.el.ValueExpression _width;
	private javax.el.ValueExpression _height;
	private javax.el.ValueExpression _resizable;
	private javax.el.ValueExpression _closable;
	private javax.el.ValueExpression _collapsible;
	private javax.el.ValueExpression _scrollable;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _header;
	private javax.el.ValueExpression _footer;
	private javax.el.ValueExpression _minWidth;
	private javax.el.ValueExpression _maxWidth;
	private javax.el.ValueExpression _minHeight;
	private javax.el.ValueExpression _maxHeight;
	private javax.el.ValueExpression _gutter;
	private javax.el.ValueExpression _zindex;
	private javax.el.ValueExpression _visible;
	private javax.el.ValueExpression _collapsed;
	private javax.el.ValueExpression _proxyResize;
	private javax.el.ValueExpression _collapseSize;

	public void release(){
		super.release();
		this._position = null;
		this._width = null;
		this._height = null;
		this._resizable = null;
		this._closable = null;
		this._collapsible = null;
		this._scrollable = null;
		this._style = null;
		this._styleClass = null;
		this._header = null;
		this._footer = null;
		this._minWidth = null;
		this._maxWidth = null;
		this._minHeight = null;
		this._maxHeight = null;
		this._gutter = null;
		this._zindex = null;
		this._visible = null;
		this._collapsed = null;
		this._proxyResize = null;
		this._collapseSize = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.layout.LayoutUnit component = null;
		try {
			component = (org.primefaces.component.layout.LayoutUnit) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_position != null) {
			component.setValueExpression("position", _position);
		}
		if(_width != null) {
			component.setValueExpression("width", _width);
		}
		if(_height != null) {
			component.setValueExpression("height", _height);
		}
		if(_resizable != null) {
			component.setValueExpression("resizable", _resizable);
		}
		if(_closable != null) {
			component.setValueExpression("closable", _closable);
		}
		if(_collapsible != null) {
			component.setValueExpression("collapsible", _collapsible);
		}
		if(_scrollable != null) {
			component.setValueExpression("scrollable", _scrollable);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_header != null) {
			component.setValueExpression("header", _header);
		}
		if(_footer != null) {
			component.setValueExpression("footer", _footer);
		}
		if(_minWidth != null) {
			component.setValueExpression("minWidth", _minWidth);
		}
		if(_maxWidth != null) {
			component.setValueExpression("maxWidth", _maxWidth);
		}
		if(_minHeight != null) {
			component.setValueExpression("minHeight", _minHeight);
		}
		if(_maxHeight != null) {
			component.setValueExpression("maxHeight", _maxHeight);
		}
		if(_gutter != null) {
			component.setValueExpression("gutter", _gutter);
		}
		if(_zindex != null) {
			component.setValueExpression("zindex", _zindex);
		}
		if(_visible != null) {
			component.setValueExpression("visible", _visible);
		}
		if(_collapsed != null) {
			component.setValueExpression("collapsed", _collapsed);
		}
		if(_proxyResize != null) {
			component.setValueExpression("proxyResize", _proxyResize);
		}
		if(_collapseSize != null) {
			component.setValueExpression("collapseSize", _collapseSize);
		}
	}

	public String getComponentType() {
		return LayoutUnit.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.LayoutUnitRenderer";
	}

	public void setPosition(javax.el.ValueExpression expression){
		this._position = expression;
	}

	public void setWidth(javax.el.ValueExpression expression){
		this._width = expression;
	}

	public void setHeight(javax.el.ValueExpression expression){
		this._height = expression;
	}

	public void setResizable(javax.el.ValueExpression expression){
		this._resizable = expression;
	}

	public void setClosable(javax.el.ValueExpression expression){
		this._closable = expression;
	}

	public void setCollapsible(javax.el.ValueExpression expression){
		this._collapsible = expression;
	}

	public void setScrollable(javax.el.ValueExpression expression){
		this._scrollable = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setHeader(javax.el.ValueExpression expression){
		this._header = expression;
	}

	public void setFooter(javax.el.ValueExpression expression){
		this._footer = expression;
	}

	public void setMinWidth(javax.el.ValueExpression expression){
		this._minWidth = expression;
	}

	public void setMaxWidth(javax.el.ValueExpression expression){
		this._maxWidth = expression;
	}

	public void setMinHeight(javax.el.ValueExpression expression){
		this._minHeight = expression;
	}

	public void setMaxHeight(javax.el.ValueExpression expression){
		this._maxHeight = expression;
	}

	public void setGutter(javax.el.ValueExpression expression){
		this._gutter = expression;
	}

	public void setZindex(javax.el.ValueExpression expression){
		this._zindex = expression;
	}

	public void setVisible(javax.el.ValueExpression expression){
		this._visible = expression;
	}

	public void setCollapsed(javax.el.ValueExpression expression){
		this._collapsed = expression;
	}

	public void setProxyResize(javax.el.ValueExpression expression){
		this._proxyResize = expression;
	}

	public void setCollapseSize(javax.el.ValueExpression expression){
		this._collapseSize = expression;
	}

}