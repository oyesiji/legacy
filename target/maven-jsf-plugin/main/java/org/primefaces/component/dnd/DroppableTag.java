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

public class DroppableTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _for;
	private javax.el.ValueExpression _disabled;
	private javax.el.ValueExpression _hoverStyleClass;
	private javax.el.ValueExpression _activeStyleClass;
	private javax.el.ValueExpression _onDropUpdate;
	private javax.el.MethodExpression _dropListener;
	private javax.el.ValueExpression _onDrop;
	private javax.el.ValueExpression _accept;
	private javax.el.ValueExpression _scope;
	private javax.el.ValueExpression _tolerance;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._for = null;
		this._disabled = null;
		this._hoverStyleClass = null;
		this._activeStyleClass = null;
		this._onDropUpdate = null;
		this._dropListener = null;
		this._onDrop = null;
		this._accept = null;
		this._scope = null;
		this._tolerance = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.dnd.Droppable component = null;
		try {
			component = (org.primefaces.component.dnd.Droppable) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_for != null) {
			component.setValueExpression("for", _for);
		}
		if(_disabled != null) {
			component.setValueExpression("disabled", _disabled);
		}
		if(_hoverStyleClass != null) {
			component.setValueExpression("hoverStyleClass", _hoverStyleClass);
		}
		if(_activeStyleClass != null) {
			component.setValueExpression("activeStyleClass", _activeStyleClass);
		}
		if(_onDropUpdate != null) {
			component.setValueExpression("onDropUpdate", _onDropUpdate);
		}
		if(_dropListener != null) {
			component.setDropListener(_dropListener);
		}
		if(_onDrop != null) {
			component.setValueExpression("onDrop", _onDrop);
		}
		if(_accept != null) {
			component.setValueExpression("accept", _accept);
		}
		if(_scope != null) {
			component.setValueExpression("scope", _scope);
		}
		if(_tolerance != null) {
			component.setValueExpression("tolerance", _tolerance);
		}
	}

	public String getComponentType() {
		return Droppable.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.DroppableRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setFor(javax.el.ValueExpression expression){
		this._for = expression;
	}

	public void setDisabled(javax.el.ValueExpression expression){
		this._disabled = expression;
	}

	public void setHoverStyleClass(javax.el.ValueExpression expression){
		this._hoverStyleClass = expression;
	}

	public void setActiveStyleClass(javax.el.ValueExpression expression){
		this._activeStyleClass = expression;
	}

	public void setOnDropUpdate(javax.el.ValueExpression expression){
		this._onDropUpdate = expression;
	}

	public void setDropListener(javax.el.MethodExpression expression){
		this._dropListener = expression;
	}

	public void setOnDrop(javax.el.ValueExpression expression){
		this._onDrop = expression;
	}

	public void setAccept(javax.el.ValueExpression expression){
		this._accept = expression;
	}

	public void setScope(javax.el.ValueExpression expression){
		this._scope = expression;
	}

	public void setTolerance(javax.el.ValueExpression expression){
		this._tolerance = expression;
	}

}