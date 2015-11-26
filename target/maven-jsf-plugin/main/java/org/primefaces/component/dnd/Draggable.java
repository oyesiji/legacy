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
package org.primefaces.component.dnd;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Draggable extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Draggable";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.DraggableRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Boolean _proxy;
	private java.lang.Boolean _dragOnly;
	private java.lang.String _for;
	private java.lang.Boolean _disabled;
	private java.lang.String _axis;
	private java.lang.String _containment;
	private java.lang.String _helper;
	private java.lang.Boolean _revert;
	private java.lang.Boolean _snap;
	private java.lang.String _snapMode;
	private java.lang.Integer _snapTolerance;
	private java.lang.Integer _zindex;
	private java.lang.String _handle;
	private java.lang.Double _opacity;
	private java.lang.String _stack;
	private java.lang.String _grid;
	private java.lang.String _scope;
	private java.lang.String _cursor;
	private java.lang.String _dashboard;
	public Draggable() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/dnd/dragdrop.js");
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

	public boolean isProxy() {
		if(_proxy != null )
			return _proxy;

		ValueExpression ve = getValueExpression("proxy");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setProxy(boolean _proxy) {
		this._proxy = _proxy;
	}

	public boolean isDragOnly() {
		if(_dragOnly != null )
			return _dragOnly;

		ValueExpression ve = getValueExpression("dragOnly");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDragOnly(boolean _dragOnly) {
		this._dragOnly = _dragOnly;
	}

	public java.lang.String getFor() {
		if(_for != null )
			return _for;

		ValueExpression ve = getValueExpression("for");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setFor(java.lang.String _for) {
		this._for = _for;
	}

	public boolean isDisabled() {
		if(_disabled != null )
			return _disabled;

		ValueExpression ve = getValueExpression("disabled");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDisabled(boolean _disabled) {
		this._disabled = _disabled;
	}

	public java.lang.String getAxis() {
		if(_axis != null )
			return _axis;

		ValueExpression ve = getValueExpression("axis");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setAxis(java.lang.String _axis) {
		this._axis = _axis;
	}

	public java.lang.String getContainment() {
		if(_containment != null )
			return _containment;

		ValueExpression ve = getValueExpression("containment");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setContainment(java.lang.String _containment) {
		this._containment = _containment;
	}

	public java.lang.String getHelper() {
		if(_helper != null )
			return _helper;

		ValueExpression ve = getValueExpression("helper");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setHelper(java.lang.String _helper) {
		this._helper = _helper;
	}

	public boolean isRevert() {
		if(_revert != null )
			return _revert;

		ValueExpression ve = getValueExpression("revert");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setRevert(boolean _revert) {
		this._revert = _revert;
	}

	public boolean isSnap() {
		if(_snap != null )
			return _snap;

		ValueExpression ve = getValueExpression("snap");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setSnap(boolean _snap) {
		this._snap = _snap;
	}

	public java.lang.String getSnapMode() {
		if(_snapMode != null )
			return _snapMode;

		ValueExpression ve = getValueExpression("snapMode");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSnapMode(java.lang.String _snapMode) {
		this._snapMode = _snapMode;
	}

	public int getSnapTolerance() {
		if(_snapTolerance != null )
			return _snapTolerance;

		ValueExpression ve = getValueExpression("snapTolerance");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 20;
	}
	public void setSnapTolerance(int _snapTolerance) {
		this._snapTolerance = _snapTolerance;
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

	public java.lang.String getHandle() {
		if(_handle != null )
			return _handle;

		ValueExpression ve = getValueExpression("handle");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setHandle(java.lang.String _handle) {
		this._handle = _handle;
	}

	public double getOpacity() {
		if(_opacity != null )
			return _opacity;

		ValueExpression ve = getValueExpression("opacity");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : 1.0;
	}
	public void setOpacity(double _opacity) {
		this._opacity = _opacity;
	}

	public java.lang.String getStack() {
		if(_stack != null )
			return _stack;

		ValueExpression ve = getValueExpression("stack");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStack(java.lang.String _stack) {
		this._stack = _stack;
	}

	public java.lang.String getGrid() {
		if(_grid != null )
			return _grid;

		ValueExpression ve = getValueExpression("grid");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setGrid(java.lang.String _grid) {
		this._grid = _grid;
	}

	public java.lang.String getScope() {
		if(_scope != null )
			return _scope;

		ValueExpression ve = getValueExpression("scope");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setScope(java.lang.String _scope) {
		this._scope = _scope;
	}

	public java.lang.String getCursor() {
		if(_cursor != null )
			return _cursor;

		ValueExpression ve = getValueExpression("cursor");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "crosshair";
	}
	public void setCursor(java.lang.String _cursor) {
		this._cursor = _cursor;
	}

	public java.lang.String getDashboard() {
		if(_dashboard != null )
			return _dashboard;

		ValueExpression ve = getValueExpression("dashboard");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setDashboard(java.lang.String _dashboard) {
		this._dashboard = _dashboard;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[21];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _proxy;
		values[3] = _dragOnly;
		values[4] = _for;
		values[5] = _disabled;
		values[6] = _axis;
		values[7] = _containment;
		values[8] = _helper;
		values[9] = _revert;
		values[10] = _snap;
		values[11] = _snapMode;
		values[12] = _snapTolerance;
		values[13] = _zindex;
		values[14] = _handle;
		values[15] = _opacity;
		values[16] = _stack;
		values[17] = _grid;
		values[18] = _scope;
		values[19] = _cursor;
		values[20] = _dashboard;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_proxy = (java.lang.Boolean) values[2];
		_dragOnly = (java.lang.Boolean) values[3];
		_for = (java.lang.String) values[4];
		_disabled = (java.lang.Boolean) values[5];
		_axis = (java.lang.String) values[6];
		_containment = (java.lang.String) values[7];
		_helper = (java.lang.String) values[8];
		_revert = (java.lang.Boolean) values[9];
		_snap = (java.lang.Boolean) values[10];
		_snapMode = (java.lang.String) values[11];
		_snapTolerance = (java.lang.Integer) values[12];
		_zindex = (java.lang.Integer) values[13];
		_handle = (java.lang.String) values[14];
		_opacity = (java.lang.Double) values[15];
		_stack = (java.lang.String) values[16];
		_grid = (java.lang.String) values[17];
		_scope = (java.lang.String) values[18];
		_cursor = (java.lang.String) values[19];
		_dashboard = (java.lang.String) values[20];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}