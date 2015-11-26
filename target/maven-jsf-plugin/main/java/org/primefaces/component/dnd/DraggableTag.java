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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class DraggableTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _proxy;
	private javax.el.ValueExpression _dragOnly;
	private javax.el.ValueExpression _for;
	private javax.el.ValueExpression _disabled;
	private javax.el.ValueExpression _axis;
	private javax.el.ValueExpression _containment;
	private javax.el.ValueExpression _helper;
	private javax.el.ValueExpression _revert;
	private javax.el.ValueExpression _snap;
	private javax.el.ValueExpression _snapMode;
	private javax.el.ValueExpression _snapTolerance;
	private javax.el.ValueExpression _zindex;
	private javax.el.ValueExpression _handle;
	private javax.el.ValueExpression _opacity;
	private javax.el.ValueExpression _stack;
	private javax.el.ValueExpression _grid;
	private javax.el.ValueExpression _scope;
	private javax.el.ValueExpression _cursor;
	private javax.el.ValueExpression _dashboard;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._proxy = null;
		this._dragOnly = null;
		this._for = null;
		this._disabled = null;
		this._axis = null;
		this._containment = null;
		this._helper = null;
		this._revert = null;
		this._snap = null;
		this._snapMode = null;
		this._snapTolerance = null;
		this._zindex = null;
		this._handle = null;
		this._opacity = null;
		this._stack = null;
		this._grid = null;
		this._scope = null;
		this._cursor = null;
		this._dashboard = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.dnd.Draggable component = null;
		try {
			component = (org.primefaces.component.dnd.Draggable) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_proxy != null) {
			component.setValueExpression("proxy", _proxy);
		}
		if(_dragOnly != null) {
			component.setValueExpression("dragOnly", _dragOnly);
		}
		if(_for != null) {
			component.setValueExpression("for", _for);
		}
		if(_disabled != null) {
			component.setValueExpression("disabled", _disabled);
		}
		if(_axis != null) {
			component.setValueExpression("axis", _axis);
		}
		if(_containment != null) {
			component.setValueExpression("containment", _containment);
		}
		if(_helper != null) {
			component.setValueExpression("helper", _helper);
		}
		if(_revert != null) {
			component.setValueExpression("revert", _revert);
		}
		if(_snap != null) {
			component.setValueExpression("snap", _snap);
		}
		if(_snapMode != null) {
			component.setValueExpression("snapMode", _snapMode);
		}
		if(_snapTolerance != null) {
			component.setValueExpression("snapTolerance", _snapTolerance);
		}
		if(_zindex != null) {
			component.setValueExpression("zindex", _zindex);
		}
		if(_handle != null) {
			component.setValueExpression("handle", _handle);
		}
		if(_opacity != null) {
			component.setValueExpression("opacity", _opacity);
		}
		if(_stack != null) {
			component.setValueExpression("stack", _stack);
		}
		if(_grid != null) {
			component.setValueExpression("grid", _grid);
		}
		if(_scope != null) {
			component.setValueExpression("scope", _scope);
		}
		if(_cursor != null) {
			component.setValueExpression("cursor", _cursor);
		}
		if(_dashboard != null) {
			component.setValueExpression("dashboard", _dashboard);
		}
	}

	public String getComponentType() {
		return Draggable.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.DraggableRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setProxy(javax.el.ValueExpression expression){
		this._proxy = expression;
	}

	public void setDragOnly(javax.el.ValueExpression expression){
		this._dragOnly = expression;
	}

	public void setFor(javax.el.ValueExpression expression){
		this._for = expression;
	}

	public void setDisabled(javax.el.ValueExpression expression){
		this._disabled = expression;
	}

	public void setAxis(javax.el.ValueExpression expression){
		this._axis = expression;
	}

	public void setContainment(javax.el.ValueExpression expression){
		this._containment = expression;
	}

	public void setHelper(javax.el.ValueExpression expression){
		this._helper = expression;
	}

	public void setRevert(javax.el.ValueExpression expression){
		this._revert = expression;
	}

	public void setSnap(javax.el.ValueExpression expression){
		this._snap = expression;
	}

	public void setSnapMode(javax.el.ValueExpression expression){
		this._snapMode = expression;
	}

	public void setSnapTolerance(javax.el.ValueExpression expression){
		this._snapTolerance = expression;
	}

	public void setZindex(javax.el.ValueExpression expression){
		this._zindex = expression;
	}

	public void setHandle(javax.el.ValueExpression expression){
		this._handle = expression;
	}

	public void setOpacity(javax.el.ValueExpression expression){
		this._opacity = expression;
	}

	public void setStack(javax.el.ValueExpression expression){
		this._stack = expression;
	}

	public void setGrid(javax.el.ValueExpression expression){
		this._grid = expression;
	}

	public void setScope(javax.el.ValueExpression expression){
		this._scope = expression;
	}

	public void setCursor(javax.el.ValueExpression expression){
		this._cursor = expression;
	}

	public void setDashboard(javax.el.ValueExpression expression){
		this._dashboard = expression;
	}

}