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


public class Droppable extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Droppable";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.DroppableRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _for;
	private java.lang.Boolean _disabled;
	private java.lang.String _hoverStyleClass;
	private java.lang.String _activeStyleClass;
	private java.lang.String _onDropUpdate;
	private javax.el.MethodExpression _dropListener;
	private java.lang.String _onDrop;
	private java.lang.String _accept;
	private java.lang.String _scope;
	private java.lang.String _tolerance;
	public Droppable() {
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

	public java.lang.String getHoverStyleClass() {
		if(_hoverStyleClass != null )
			return _hoverStyleClass;

		ValueExpression ve = getValueExpression("hoverStyleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setHoverStyleClass(java.lang.String _hoverStyleClass) {
		this._hoverStyleClass = _hoverStyleClass;
	}

	public java.lang.String getActiveStyleClass() {
		if(_activeStyleClass != null )
			return _activeStyleClass;

		ValueExpression ve = getValueExpression("activeStyleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setActiveStyleClass(java.lang.String _activeStyleClass) {
		this._activeStyleClass = _activeStyleClass;
	}

	public java.lang.String getOnDropUpdate() {
		if(_onDropUpdate != null )
			return _onDropUpdate;

		ValueExpression ve = getValueExpression("onDropUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnDropUpdate(java.lang.String _onDropUpdate) {
		this._onDropUpdate = _onDropUpdate;
	}

	public javax.el.MethodExpression getDropListener() {
		return this._dropListener;
	}

	public void setDropListener(javax.el.MethodExpression _dropListener) {
		this._dropListener = _dropListener;
	}
	public java.lang.String getOnDrop() {
		if(_onDrop != null )
			return _onDrop;

		ValueExpression ve = getValueExpression("onDrop");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnDrop(java.lang.String _onDrop) {
		this._onDrop = _onDrop;
	}

	public java.lang.String getAccept() {
		if(_accept != null )
			return _accept;

		ValueExpression ve = getValueExpression("accept");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setAccept(java.lang.String _accept) {
		this._accept = _accept;
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

	public java.lang.String getTolerance() {
		if(_tolerance != null )
			return _tolerance;

		ValueExpression ve = getValueExpression("tolerance");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setTolerance(java.lang.String _tolerance) {
		this._tolerance = _tolerance;
	}

	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		MethodExpression me = getDropListener();
		
		if (me != null) {
			me.invoke(facesContext.getELContext(), new Object[] {event});
		}
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[12];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _for;
		values[3] = _disabled;
		values[4] = _hoverStyleClass;
		values[5] = _activeStyleClass;
		values[6] = _onDropUpdate;
		values[7] = _dropListener;
		values[8] = _onDrop;
		values[9] = _accept;
		values[10] = _scope;
		values[11] = _tolerance;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_for = (java.lang.String) values[2];
		_disabled = (java.lang.Boolean) values[3];
		_hoverStyleClass = (java.lang.String) values[4];
		_activeStyleClass = (java.lang.String) values[5];
		_onDropUpdate = (java.lang.String) values[6];
		_dropListener = (javax.el.MethodExpression) values[7];
		_onDrop = (java.lang.String) values[8];
		_accept = (java.lang.String) values[9];
		_scope = (java.lang.String) values[10];
		_tolerance = (java.lang.String) values[11];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}