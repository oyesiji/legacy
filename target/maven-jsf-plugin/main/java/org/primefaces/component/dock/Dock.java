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
package org.primefaces.component.dock;

import org.primefaces.component.menu.AbstractMenu;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Dock extends AbstractMenu {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Dock";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.DockRenderer";

	private org.primefaces.model.MenuModel _model;
	private java.lang.String _position;
	private java.lang.Integer _itemWidth;
	private java.lang.Integer _maxWidth;
	private java.lang.Integer _proximity;
	private java.lang.String _halign;
	public Dock() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/dock/assets/dock.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/dock/interface.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/dock/dock.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public org.primefaces.model.MenuModel getModel() {
		if(_model != null )
			return _model;

		ValueExpression ve = getValueExpression("model");
		return ve != null ? (org.primefaces.model.MenuModel) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setModel(org.primefaces.model.MenuModel _model) {
		this._model = _model;
	}

	public java.lang.String getPosition() {
		if(_position != null )
			return _position;

		ValueExpression ve = getValueExpression("position");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "bottom";
	}
	public void setPosition(java.lang.String _position) {
		this._position = _position;
	}

	public int getItemWidth() {
		if(_itemWidth != null )
			return _itemWidth;

		ValueExpression ve = getValueExpression("itemWidth");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 40;
	}
	public void setItemWidth(int _itemWidth) {
		this._itemWidth = _itemWidth;
	}

	public int getMaxWidth() {
		if(_maxWidth != null )
			return _maxWidth;

		ValueExpression ve = getValueExpression("maxWidth");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 50;
	}
	public void setMaxWidth(int _maxWidth) {
		this._maxWidth = _maxWidth;
	}

	public int getProximity() {
		if(_proximity != null )
			return _proximity;

		ValueExpression ve = getValueExpression("proximity");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 90;
	}
	public void setProximity(int _proximity) {
		this._proximity = _proximity;
	}

	public java.lang.String getHalign() {
		if(_halign != null )
			return _halign;

		ValueExpression ve = getValueExpression("halign");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "center";
	}
	public void setHalign(java.lang.String _halign) {
		this._halign = _halign;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[7];
		values[0] = super.saveState(context);
		values[1] = _model;
		values[2] = _position;
		values[3] = _itemWidth;
		values[4] = _maxWidth;
		values[5] = _proximity;
		values[6] = _halign;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_model = (org.primefaces.model.MenuModel) values[1];
		_position = (java.lang.String) values[2];
		_itemWidth = (java.lang.Integer) values[3];
		_maxWidth = (java.lang.Integer) values[4];
		_proximity = (java.lang.Integer) values[5];
		_halign = (java.lang.String) values[6];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}