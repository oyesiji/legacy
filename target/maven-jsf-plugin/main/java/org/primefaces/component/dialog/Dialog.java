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
package org.primefaces.component.dialog;

import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Dialog extends UIPanel {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Dialog";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.DialogRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _header;
	private java.lang.Boolean _draggable;
	private java.lang.Boolean _resizable;
	private java.lang.Boolean _modal;
	private java.lang.Boolean _visible;
	private java.lang.Integer _width;
	private java.lang.Integer _height;
	private java.lang.Integer _zindex;
	private java.lang.Integer _minWidth;
	private java.lang.Integer _minHeight;
	private java.lang.String _styleClass;
	private javax.el.MethodExpression _closeListener;
	private java.lang.String _onCloseUpdate;
	private java.lang.String _showEffect;
	private java.lang.String _hideEffect;
	private java.lang.String _position;
	private java.lang.Boolean _closeOnEscape;
	private java.lang.Boolean _closable;
	public Dialog() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.dialog.css");
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.resizable.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/dialog/dialog.js");
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

	public java.lang.String getHeader() {
		if(_header != null )
			return _header;

		ValueExpression ve = getValueExpression("header");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setHeader(java.lang.String _header) {
		this._header = _header;
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

	public boolean isResizable() {
		if(_resizable != null )
			return _resizable;

		ValueExpression ve = getValueExpression("resizable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setResizable(boolean _resizable) {
		this._resizable = _resizable;
	}

	public boolean isModal() {
		if(_modal != null )
			return _modal;

		ValueExpression ve = getValueExpression("modal");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setModal(boolean _modal) {
		this._modal = _modal;
	}

	public boolean isVisible() {
		if(_visible != null )
			return _visible;

		ValueExpression ve = getValueExpression("visible");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setVisible(boolean _visible) {
		this._visible = _visible;
	}

	public int getWidth() {
		if(_width != null )
			return _width;

		ValueExpression ve = getValueExpression("width");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 300;
	}
	public void setWidth(int _width) {
		this._width = _width;
	}

	public int getHeight() {
		if(_height != null )
			return _height;

		ValueExpression ve = getValueExpression("height");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : java.lang.Integer.MIN_VALUE;
	}
	public void setHeight(int _height) {
		this._height = _height;
	}

	public int getZindex() {
		if(_zindex != null )
			return _zindex;

		ValueExpression ve = getValueExpression("zindex");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1000;
	}
	public void setZindex(int _zindex) {
		this._zindex = _zindex;
	}

	public int getMinWidth() {
		if(_minWidth != null )
			return _minWidth;

		ValueExpression ve = getValueExpression("minWidth");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 150;
	}
	public void setMinWidth(int _minWidth) {
		this._minWidth = _minWidth;
	}

	public int getMinHeight() {
		if(_minHeight != null )
			return _minHeight;

		ValueExpression ve = getValueExpression("minHeight");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 0;
	}
	public void setMinHeight(int _minHeight) {
		this._minHeight = _minHeight;
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

	public javax.el.MethodExpression getCloseListener() {
		return this._closeListener;
	}

	public void setCloseListener(javax.el.MethodExpression _closeListener) {
		this._closeListener = _closeListener;
	}
	public java.lang.String getOnCloseUpdate() {
		if(_onCloseUpdate != null )
			return _onCloseUpdate;

		ValueExpression ve = getValueExpression("onCloseUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnCloseUpdate(java.lang.String _onCloseUpdate) {
		this._onCloseUpdate = _onCloseUpdate;
	}

	public java.lang.String getShowEffect() {
		if(_showEffect != null )
			return _showEffect;

		ValueExpression ve = getValueExpression("showEffect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setShowEffect(java.lang.String _showEffect) {
		this._showEffect = _showEffect;
	}

	public java.lang.String getHideEffect() {
		if(_hideEffect != null )
			return _hideEffect;

		ValueExpression ve = getValueExpression("hideEffect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setHideEffect(java.lang.String _hideEffect) {
		this._hideEffect = _hideEffect;
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

	public boolean isCloseOnEscape() {
		if(_closeOnEscape != null )
			return _closeOnEscape;

		ValueExpression ve = getValueExpression("closeOnEscape");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setCloseOnEscape(boolean _closeOnEscape) {
		this._closeOnEscape = _closeOnEscape;
	}

	public boolean isClosable() {
		if(_closable != null )
			return _closable;

		ValueExpression ve = getValueExpression("closable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setClosable(boolean _closable) {
		this._closable = _closable;
	}

	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		MethodExpression me = getCloseListener();
		
		if (me != null) {
			me.invoke(facesContext.getELContext(), new Object[] {event});
		}
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[20];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _header;
		values[3] = _draggable;
		values[4] = _resizable;
		values[5] = _modal;
		values[6] = _visible;
		values[7] = _width;
		values[8] = _height;
		values[9] = _zindex;
		values[10] = _minWidth;
		values[11] = _minHeight;
		values[12] = _styleClass;
		values[13] = _closeListener;
		values[14] = _onCloseUpdate;
		values[15] = _showEffect;
		values[16] = _hideEffect;
		values[17] = _position;
		values[18] = _closeOnEscape;
		values[19] = _closable;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_header = (java.lang.String) values[2];
		_draggable = (java.lang.Boolean) values[3];
		_resizable = (java.lang.Boolean) values[4];
		_modal = (java.lang.Boolean) values[5];
		_visible = (java.lang.Boolean) values[6];
		_width = (java.lang.Integer) values[7];
		_height = (java.lang.Integer) values[8];
		_zindex = (java.lang.Integer) values[9];
		_minWidth = (java.lang.Integer) values[10];
		_minHeight = (java.lang.Integer) values[11];
		_styleClass = (java.lang.String) values[12];
		_closeListener = (javax.el.MethodExpression) values[13];
		_onCloseUpdate = (java.lang.String) values[14];
		_showEffect = (java.lang.String) values[15];
		_hideEffect = (java.lang.String) values[16];
		_position = (java.lang.String) values[17];
		_closeOnEscape = (java.lang.Boolean) values[18];
		_closable = (java.lang.Boolean) values[19];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}