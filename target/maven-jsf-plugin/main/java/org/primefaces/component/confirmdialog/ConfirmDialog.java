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
package org.primefaces.component.confirmdialog;

import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class ConfirmDialog extends UIPanel {


	public static final String COMPONENT_TYPE = "org.primefaces.component.ConfirmDialog";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.ConfirmDialogRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _message;
	private java.lang.String _header;
	private java.lang.String _severity;
	private java.lang.Boolean _draggable;
	private java.lang.Boolean _modal;
	private java.lang.Integer _width;
	private java.lang.Integer _height;
	private java.lang.Integer _zindex;
	private java.lang.String _styleClass;
	private java.lang.String _showEffect;
	private java.lang.String _hideEffect;
	private java.lang.String _position;
	private java.lang.Boolean _closeOnEscape;
	private java.lang.Boolean _closable;
	public ConfirmDialog() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.dialog.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/confirmdialog/confirmdialog.js");
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

	public java.lang.String getMessage() {
		if(_message != null )
			return _message;

		ValueExpression ve = getValueExpression("message");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setMessage(java.lang.String _message) {
		this._message = _message;
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

	public java.lang.String getSeverity() {
		if(_severity != null )
			return _severity;

		ValueExpression ve = getValueExpression("severity");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "alert";
	}
	public void setSeverity(java.lang.String _severity) {
		this._severity = _severity;
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

	public boolean isModal() {
		if(_modal != null )
			return _modal;

		ValueExpression ve = getValueExpression("modal");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setModal(boolean _modal) {
		this._modal = _modal;
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

	public java.lang.String getStyleClass() {
		if(_styleClass != null )
			return _styleClass;

		ValueExpression ve = getValueExpression("styleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStyleClass(java.lang.String _styleClass) {
		this._styleClass = _styleClass;
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


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[16];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _message;
		values[3] = _header;
		values[4] = _severity;
		values[5] = _draggable;
		values[6] = _modal;
		values[7] = _width;
		values[8] = _height;
		values[9] = _zindex;
		values[10] = _styleClass;
		values[11] = _showEffect;
		values[12] = _hideEffect;
		values[13] = _position;
		values[14] = _closeOnEscape;
		values[15] = _closable;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_message = (java.lang.String) values[2];
		_header = (java.lang.String) values[3];
		_severity = (java.lang.String) values[4];
		_draggable = (java.lang.Boolean) values[5];
		_modal = (java.lang.Boolean) values[6];
		_width = (java.lang.Integer) values[7];
		_height = (java.lang.Integer) values[8];
		_zindex = (java.lang.Integer) values[9];
		_styleClass = (java.lang.String) values[10];
		_showEffect = (java.lang.String) values[11];
		_hideEffect = (java.lang.String) values[12];
		_position = (java.lang.String) values[13];
		_closeOnEscape = (java.lang.Boolean) values[14];
		_closable = (java.lang.Boolean) values[15];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}