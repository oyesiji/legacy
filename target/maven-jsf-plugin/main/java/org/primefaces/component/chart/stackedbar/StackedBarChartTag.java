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
package org.primefaces.component.chart.stackedbar;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class StackedBarChartTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _value;
	private java.lang.String _var;
	private javax.el.ValueExpression _yfield;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _wmode;
	private javax.el.ValueExpression _live;
	private javax.el.ValueExpression _oncomplete;
	private javax.el.ValueExpression _refreshInterval;
	private javax.el.ValueExpression _update;
	private javax.el.MethodExpression _itemSelectListener;
	private javax.el.ValueExpression _width;
	private javax.el.ValueExpression _height;
	private javax.el.ValueExpression _minX;
	private javax.el.ValueExpression _maxX;
	private javax.el.ValueExpression _dataTipFunction;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._value = null;
		this._var = null;
		this._yfield = null;
		this._styleClass = null;
		this._style = null;
		this._wmode = null;
		this._live = null;
		this._oncomplete = null;
		this._refreshInterval = null;
		this._update = null;
		this._itemSelectListener = null;
		this._width = null;
		this._height = null;
		this._minX = null;
		this._maxX = null;
		this._dataTipFunction = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.chart.stackedbar.StackedBarChart component = null;
		try {
			component = (org.primefaces.component.chart.stackedbar.StackedBarChart) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_var != null) {
			component.setVar(_var);
		}
		if(_yfield != null) {
			component.setValueExpression("yfield", _yfield);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_wmode != null) {
			component.setValueExpression("wmode", _wmode);
		}
		if(_live != null) {
			component.setValueExpression("live", _live);
		}
		if(_oncomplete != null) {
			component.setValueExpression("oncomplete", _oncomplete);
		}
		if(_refreshInterval != null) {
			component.setValueExpression("refreshInterval", _refreshInterval);
		}
		if(_update != null) {
			component.setValueExpression("update", _update);
		}
		if(_itemSelectListener != null) {
			component.setItemSelectListener(_itemSelectListener);
		}
		if(_width != null) {
			component.setValueExpression("width", _width);
		}
		if(_height != null) {
			component.setValueExpression("height", _height);
		}
		if(_minX != null) {
			component.setValueExpression("minX", _minX);
		}
		if(_maxX != null) {
			component.setValueExpression("maxX", _maxX);
		}
		if(_dataTipFunction != null) {
			component.setValueExpression("dataTipFunction", _dataTipFunction);
		}
	}

	public String getComponentType() {
		return StackedBarChart.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.chart.StackedBarChartRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setVar(java.lang.String value){
		this._var = value;
	}

	public void setYfield(javax.el.ValueExpression expression){
		this._yfield = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setWmode(javax.el.ValueExpression expression){
		this._wmode = expression;
	}

	public void setLive(javax.el.ValueExpression expression){
		this._live = expression;
	}

	public void setOncomplete(javax.el.ValueExpression expression){
		this._oncomplete = expression;
	}

	public void setRefreshInterval(javax.el.ValueExpression expression){
		this._refreshInterval = expression;
	}

	public void setUpdate(javax.el.ValueExpression expression){
		this._update = expression;
	}

	public void setItemSelectListener(javax.el.MethodExpression expression){
		this._itemSelectListener = expression;
	}

	public void setWidth(javax.el.ValueExpression expression){
		this._width = expression;
	}

	public void setHeight(javax.el.ValueExpression expression){
		this._height = expression;
	}

	public void setMinX(javax.el.ValueExpression expression){
		this._minX = expression;
	}

	public void setMaxX(javax.el.ValueExpression expression){
		this._maxX = expression;
	}

	public void setDataTipFunction(javax.el.ValueExpression expression){
		this._dataTipFunction = expression;
	}

}