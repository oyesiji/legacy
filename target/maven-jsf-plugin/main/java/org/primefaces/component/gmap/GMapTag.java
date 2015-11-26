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
package org.primefaces.component.gmap;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class GMapTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _model;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _type;
	private javax.el.ValueExpression _center;
	private javax.el.ValueExpression _zoom;
	private javax.el.ValueExpression _onOverlaySelectUpdate;
	private javax.el.ValueExpression _onOverlaySelectStart;
	private javax.el.ValueExpression _onOverlaySelectComplete;
	private javax.el.MethodExpression _overlaySelectListener;
	private javax.el.MethodExpression _stateChangeListener;
	private javax.el.ValueExpression _onStateChangeUpdate;
	private javax.el.MethodExpression _pointSelectListener;
	private javax.el.ValueExpression _onPointSelectUpdate;
	private javax.el.MethodExpression _markerDragListener;
	private javax.el.ValueExpression _onMarkerDragUpdate;
	private javax.el.ValueExpression _streetView;
	private javax.el.ValueExpression _disableDefaultUI;
	private javax.el.ValueExpression _navigationControl;
	private javax.el.ValueExpression _mapTypeControl;
	private javax.el.ValueExpression _draggable;
	private javax.el.ValueExpression _disableDoubleClickZoom;
	private javax.el.ValueExpression _onPointClick;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._model = null;
		this._style = null;
		this._styleClass = null;
		this._type = null;
		this._center = null;
		this._zoom = null;
		this._onOverlaySelectUpdate = null;
		this._onOverlaySelectStart = null;
		this._onOverlaySelectComplete = null;
		this._overlaySelectListener = null;
		this._stateChangeListener = null;
		this._onStateChangeUpdate = null;
		this._pointSelectListener = null;
		this._onPointSelectUpdate = null;
		this._markerDragListener = null;
		this._onMarkerDragUpdate = null;
		this._streetView = null;
		this._disableDefaultUI = null;
		this._navigationControl = null;
		this._mapTypeControl = null;
		this._draggable = null;
		this._disableDoubleClickZoom = null;
		this._onPointClick = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.gmap.GMap component = null;
		try {
			component = (org.primefaces.component.gmap.GMap) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_model != null) {
			component.setValueExpression("model", _model);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_type != null) {
			component.setValueExpression("type", _type);
		}
		if(_center != null) {
			component.setValueExpression("center", _center);
		}
		if(_zoom != null) {
			component.setValueExpression("zoom", _zoom);
		}
		if(_onOverlaySelectUpdate != null) {
			component.setValueExpression("onOverlaySelectUpdate", _onOverlaySelectUpdate);
		}
		if(_onOverlaySelectStart != null) {
			component.setValueExpression("onOverlaySelectStart", _onOverlaySelectStart);
		}
		if(_onOverlaySelectComplete != null) {
			component.setValueExpression("onOverlaySelectComplete", _onOverlaySelectComplete);
		}
		if(_overlaySelectListener != null) {
			component.setOverlaySelectListener(_overlaySelectListener);
		}
		if(_stateChangeListener != null) {
			component.setStateChangeListener(_stateChangeListener);
		}
		if(_onStateChangeUpdate != null) {
			component.setValueExpression("onStateChangeUpdate", _onStateChangeUpdate);
		}
		if(_pointSelectListener != null) {
			component.setPointSelectListener(_pointSelectListener);
		}
		if(_onPointSelectUpdate != null) {
			component.setValueExpression("onPointSelectUpdate", _onPointSelectUpdate);
		}
		if(_markerDragListener != null) {
			component.setMarkerDragListener(_markerDragListener);
		}
		if(_onMarkerDragUpdate != null) {
			component.setValueExpression("onMarkerDragUpdate", _onMarkerDragUpdate);
		}
		if(_streetView != null) {
			component.setValueExpression("streetView", _streetView);
		}
		if(_disableDefaultUI != null) {
			component.setValueExpression("disableDefaultUI", _disableDefaultUI);
		}
		if(_navigationControl != null) {
			component.setValueExpression("navigationControl", _navigationControl);
		}
		if(_mapTypeControl != null) {
			component.setValueExpression("mapTypeControl", _mapTypeControl);
		}
		if(_draggable != null) {
			component.setValueExpression("draggable", _draggable);
		}
		if(_disableDoubleClickZoom != null) {
			component.setValueExpression("disableDoubleClickZoom", _disableDoubleClickZoom);
		}
		if(_onPointClick != null) {
			component.setValueExpression("onPointClick", _onPointClick);
		}
	}

	public String getComponentType() {
		return GMap.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.GMapRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setModel(javax.el.ValueExpression expression){
		this._model = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setType(javax.el.ValueExpression expression){
		this._type = expression;
	}

	public void setCenter(javax.el.ValueExpression expression){
		this._center = expression;
	}

	public void setZoom(javax.el.ValueExpression expression){
		this._zoom = expression;
	}

	public void setOnOverlaySelectUpdate(javax.el.ValueExpression expression){
		this._onOverlaySelectUpdate = expression;
	}

	public void setOnOverlaySelectStart(javax.el.ValueExpression expression){
		this._onOverlaySelectStart = expression;
	}

	public void setOnOverlaySelectComplete(javax.el.ValueExpression expression){
		this._onOverlaySelectComplete = expression;
	}

	public void setOverlaySelectListener(javax.el.MethodExpression expression){
		this._overlaySelectListener = expression;
	}

	public void setStateChangeListener(javax.el.MethodExpression expression){
		this._stateChangeListener = expression;
	}

	public void setOnStateChangeUpdate(javax.el.ValueExpression expression){
		this._onStateChangeUpdate = expression;
	}

	public void setPointSelectListener(javax.el.MethodExpression expression){
		this._pointSelectListener = expression;
	}

	public void setOnPointSelectUpdate(javax.el.ValueExpression expression){
		this._onPointSelectUpdate = expression;
	}

	public void setMarkerDragListener(javax.el.MethodExpression expression){
		this._markerDragListener = expression;
	}

	public void setOnMarkerDragUpdate(javax.el.ValueExpression expression){
		this._onMarkerDragUpdate = expression;
	}

	public void setStreetView(javax.el.ValueExpression expression){
		this._streetView = expression;
	}

	public void setDisableDefaultUI(javax.el.ValueExpression expression){
		this._disableDefaultUI = expression;
	}

	public void setNavigationControl(javax.el.ValueExpression expression){
		this._navigationControl = expression;
	}

	public void setMapTypeControl(javax.el.ValueExpression expression){
		this._mapTypeControl = expression;
	}

	public void setDraggable(javax.el.ValueExpression expression){
		this._draggable = expression;
	}

	public void setDisableDoubleClickZoom(javax.el.ValueExpression expression){
		this._disableDoubleClickZoom = expression;
	}

	public void setOnPointClick(javax.el.ValueExpression expression){
		this._onPointClick = expression;
	}

}