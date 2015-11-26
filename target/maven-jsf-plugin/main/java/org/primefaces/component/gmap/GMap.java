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

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.event.map.StateChangeEvent;
import org.primefaces.event.map.PointSelectEvent;
import org.primefaces.event.map.MarkerDragEvent;
import javax.faces.component.UIComponent;


public class GMap extends UIComponentBase implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.component.GMap";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.GMapRenderer";

	private java.lang.String _widgetVar;
	private org.primefaces.model.map.MapModel _model;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.String _type;
	private java.lang.String _center;
	private java.lang.Integer _zoom;
	private java.lang.String _onOverlaySelectUpdate;
	private java.lang.String _onOverlaySelectStart;
	private java.lang.String _onOverlaySelectComplete;
	private javax.el.MethodExpression _overlaySelectListener;
	private javax.el.MethodExpression _stateChangeListener;
	private java.lang.String _onStateChangeUpdate;
	private javax.el.MethodExpression _pointSelectListener;
	private java.lang.String _onPointSelectUpdate;
	private javax.el.MethodExpression _markerDragListener;
	private java.lang.String _onMarkerDragUpdate;
	private java.lang.Boolean _streetView;
	private java.lang.Boolean _disableDefaultUI;
	private java.lang.Boolean _navigationControl;
	private java.lang.Boolean _mapTypeControl;
	private java.lang.Boolean _draggable;
	private java.lang.Boolean _disableDoubleClickZoom;
	private java.lang.String _onPointClick;
	public GMap() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/gmap/gmap.js");
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

	public org.primefaces.model.map.MapModel getModel() {
		if(_model != null )
			return _model;

		ValueExpression ve = getValueExpression("model");
		return ve != null ? (org.primefaces.model.map.MapModel) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setModel(org.primefaces.model.map.MapModel _model) {
		this._model = _model;
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

	public java.lang.String getType() {
		if(_type != null )
			return _type;

		ValueExpression ve = getValueExpression("type");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setType(java.lang.String _type) {
		this._type = _type;
	}

	public java.lang.String getCenter() {
		if(_center != null )
			return _center;

		ValueExpression ve = getValueExpression("center");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setCenter(java.lang.String _center) {
		this._center = _center;
	}

	public int getZoom() {
		if(_zoom != null )
			return _zoom;

		ValueExpression ve = getValueExpression("zoom");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 8;
	}
	public void setZoom(int _zoom) {
		this._zoom = _zoom;
	}

	public java.lang.String getOnOverlaySelectUpdate() {
		if(_onOverlaySelectUpdate != null )
			return _onOverlaySelectUpdate;

		ValueExpression ve = getValueExpression("onOverlaySelectUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnOverlaySelectUpdate(java.lang.String _onOverlaySelectUpdate) {
		this._onOverlaySelectUpdate = _onOverlaySelectUpdate;
	}

	public java.lang.String getOnOverlaySelectStart() {
		if(_onOverlaySelectStart != null )
			return _onOverlaySelectStart;

		ValueExpression ve = getValueExpression("onOverlaySelectStart");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnOverlaySelectStart(java.lang.String _onOverlaySelectStart) {
		this._onOverlaySelectStart = _onOverlaySelectStart;
	}

	public java.lang.String getOnOverlaySelectComplete() {
		if(_onOverlaySelectComplete != null )
			return _onOverlaySelectComplete;

		ValueExpression ve = getValueExpression("onOverlaySelectComplete");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnOverlaySelectComplete(java.lang.String _onOverlaySelectComplete) {
		this._onOverlaySelectComplete = _onOverlaySelectComplete;
	}

	public javax.el.MethodExpression getOverlaySelectListener() {
		return this._overlaySelectListener;
	}

	public void setOverlaySelectListener(javax.el.MethodExpression _overlaySelectListener) {
		this._overlaySelectListener = _overlaySelectListener;
	}
	public javax.el.MethodExpression getStateChangeListener() {
		return this._stateChangeListener;
	}

	public void setStateChangeListener(javax.el.MethodExpression _stateChangeListener) {
		this._stateChangeListener = _stateChangeListener;
	}
	public java.lang.String getOnStateChangeUpdate() {
		if(_onStateChangeUpdate != null )
			return _onStateChangeUpdate;

		ValueExpression ve = getValueExpression("onStateChangeUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnStateChangeUpdate(java.lang.String _onStateChangeUpdate) {
		this._onStateChangeUpdate = _onStateChangeUpdate;
	}

	public javax.el.MethodExpression getPointSelectListener() {
		return this._pointSelectListener;
	}

	public void setPointSelectListener(javax.el.MethodExpression _pointSelectListener) {
		this._pointSelectListener = _pointSelectListener;
	}
	public java.lang.String getOnPointSelectUpdate() {
		if(_onPointSelectUpdate != null )
			return _onPointSelectUpdate;

		ValueExpression ve = getValueExpression("onPointSelectUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnPointSelectUpdate(java.lang.String _onPointSelectUpdate) {
		this._onPointSelectUpdate = _onPointSelectUpdate;
	}

	public javax.el.MethodExpression getMarkerDragListener() {
		return this._markerDragListener;
	}

	public void setMarkerDragListener(javax.el.MethodExpression _markerDragListener) {
		this._markerDragListener = _markerDragListener;
	}
	public java.lang.String getOnMarkerDragUpdate() {
		if(_onMarkerDragUpdate != null )
			return _onMarkerDragUpdate;

		ValueExpression ve = getValueExpression("onMarkerDragUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnMarkerDragUpdate(java.lang.String _onMarkerDragUpdate) {
		this._onMarkerDragUpdate = _onMarkerDragUpdate;
	}

	public boolean isStreetView() {
		if(_streetView != null )
			return _streetView;

		ValueExpression ve = getValueExpression("streetView");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setStreetView(boolean _streetView) {
		this._streetView = _streetView;
	}

	public boolean isDisableDefaultUI() {
		if(_disableDefaultUI != null )
			return _disableDefaultUI;

		ValueExpression ve = getValueExpression("disableDefaultUI");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDisableDefaultUI(boolean _disableDefaultUI) {
		this._disableDefaultUI = _disableDefaultUI;
	}

	public boolean isNavigationControl() {
		if(_navigationControl != null )
			return _navigationControl;

		ValueExpression ve = getValueExpression("navigationControl");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setNavigationControl(boolean _navigationControl) {
		this._navigationControl = _navigationControl;
	}

	public boolean isMapTypeControl() {
		if(_mapTypeControl != null )
			return _mapTypeControl;

		ValueExpression ve = getValueExpression("mapTypeControl");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setMapTypeControl(boolean _mapTypeControl) {
		this._mapTypeControl = _mapTypeControl;
	}

	public boolean isDraggable() {
		if(_draggable != null )
			return _draggable;

		ValueExpression ve = getValueExpression("draggable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setDraggable(boolean _draggable) {
		this._draggable = _draggable;
	}

	public boolean isDisableDoubleClickZoom() {
		if(_disableDoubleClickZoom != null )
			return _disableDoubleClickZoom;

		ValueExpression ve = getValueExpression("disableDoubleClickZoom");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDisableDoubleClickZoom(boolean _disableDoubleClickZoom) {
		this._disableDoubleClickZoom = _disableDoubleClickZoom;
	}

	public java.lang.String getOnPointClick() {
		if(_onPointClick != null )
			return _onPointClick;

		ValueExpression ve = getValueExpression("onPointClick");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnPointClick(java.lang.String _onPointClick) {
		this._onPointClick = _onPointClick;
	}


	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		MethodExpression me = null;
		
		if(event instanceof OverlaySelectEvent) {
			me = getOverlaySelectListener();
		} else if(event instanceof StateChangeEvent) {
			me = getStateChangeListener();
		} else if(event instanceof PointSelectEvent) {
			me = getPointSelectListener();
		} else if(event instanceof MarkerDragEvent) {
			me = getMarkerDragListener();
		}
		
		if(me != null) {
			me.invoke(facesContext.getELContext(), new Object[] {event});
		}
	}
	
	public GMapInfoWindow getInfoWindow() {
		for(UIComponent kid : getChildren()) {
			if(kid instanceof GMapInfoWindow)
				return (GMapInfoWindow) kid;
		}
		
		return null;
	}
	
	public boolean hasEventListener() {
		return getOverlaySelectListener() != null || getStateChangeListener() != null || getPointSelectListener() != null || getMarkerDragListener() != null;
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
		Object values[] = new Object[25];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _model;
		values[3] = _style;
		values[4] = _styleClass;
		values[5] = _type;
		values[6] = _center;
		values[7] = _zoom;
		values[8] = _onOverlaySelectUpdate;
		values[9] = _onOverlaySelectStart;
		values[10] = _onOverlaySelectComplete;
		values[11] = _overlaySelectListener;
		values[12] = _stateChangeListener;
		values[13] = _onStateChangeUpdate;
		values[14] = _pointSelectListener;
		values[15] = _onPointSelectUpdate;
		values[16] = _markerDragListener;
		values[17] = _onMarkerDragUpdate;
		values[18] = _streetView;
		values[19] = _disableDefaultUI;
		values[20] = _navigationControl;
		values[21] = _mapTypeControl;
		values[22] = _draggable;
		values[23] = _disableDoubleClickZoom;
		values[24] = _onPointClick;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_model = (org.primefaces.model.map.MapModel) values[2];
		_style = (java.lang.String) values[3];
		_styleClass = (java.lang.String) values[4];
		_type = (java.lang.String) values[5];
		_center = (java.lang.String) values[6];
		_zoom = (java.lang.Integer) values[7];
		_onOverlaySelectUpdate = (java.lang.String) values[8];
		_onOverlaySelectStart = (java.lang.String) values[9];
		_onOverlaySelectComplete = (java.lang.String) values[10];
		_overlaySelectListener = (javax.el.MethodExpression) values[11];
		_stateChangeListener = (javax.el.MethodExpression) values[12];
		_onStateChangeUpdate = (java.lang.String) values[13];
		_pointSelectListener = (javax.el.MethodExpression) values[14];
		_onPointSelectUpdate = (java.lang.String) values[15];
		_markerDragListener = (javax.el.MethodExpression) values[16];
		_onMarkerDragUpdate = (java.lang.String) values[17];
		_streetView = (java.lang.Boolean) values[18];
		_disableDefaultUI = (java.lang.Boolean) values[19];
		_navigationControl = (java.lang.Boolean) values[20];
		_mapTypeControl = (java.lang.Boolean) values[21];
		_draggable = (java.lang.Boolean) values[22];
		_disableDoubleClickZoom = (java.lang.Boolean) values[23];
		_onPointClick = (java.lang.String) values[24];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}