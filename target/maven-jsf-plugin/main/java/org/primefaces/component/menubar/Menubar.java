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
package org.primefaces.component.menubar;

import org.primefaces.component.menu.AbstractMenu;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Menubar extends AbstractMenu {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Menubar";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.MenubarRenderer";

	private java.lang.String _widgetVar;
	private org.primefaces.model.MenuModel _model;
	private java.lang.Boolean _autoSubmenuDisplay;
	private java.lang.String _effect;
	private java.lang.Double _effectDuration;
	private java.lang.Integer _zindex;
	public Menubar() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/menu/menu.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/container/container-min.js");
			resourceHolder.addResource("/primefaces/menu/menu.js");
			resourceHolder.addResource("/primefaces/core/core.js");
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

	public org.primefaces.model.MenuModel getModel() {
		if(_model != null )
			return _model;

		ValueExpression ve = getValueExpression("model");
		return ve != null ? (org.primefaces.model.MenuModel) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setModel(org.primefaces.model.MenuModel _model) {
		this._model = _model;
	}

	public boolean isAutoSubmenuDisplay() {
		if(_autoSubmenuDisplay != null )
			return _autoSubmenuDisplay;

		ValueExpression ve = getValueExpression("autoSubmenuDisplay");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setAutoSubmenuDisplay(boolean _autoSubmenuDisplay) {
		this._autoSubmenuDisplay = _autoSubmenuDisplay;
	}

	public java.lang.String getEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "FADE";
	}
	public void setEffect(java.lang.String _effect) {
		this._effect = _effect;
	}

	public double getEffectDuration() {
		if(_effectDuration != null )
			return _effectDuration;

		ValueExpression ve = getValueExpression("effectDuration");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : 0.25;
	}
	public void setEffectDuration(double _effectDuration) {
		this._effectDuration = _effectDuration;
	}

	public int getZindex() {
		if(_zindex != null )
			return _zindex;

		ValueExpression ve = getValueExpression("zindex");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : java.lang.Integer.MAX_VALUE;
	}
	public void setZindex(int _zindex) {
		this._zindex = _zindex;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[7];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _model;
		values[3] = _autoSubmenuDisplay;
		values[4] = _effect;
		values[5] = _effectDuration;
		values[6] = _zindex;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_model = (org.primefaces.model.MenuModel) values[2];
		_autoSubmenuDisplay = (java.lang.Boolean) values[3];
		_effect = (java.lang.String) values[4];
		_effectDuration = (java.lang.Double) values[5];
		_zindex = (java.lang.Integer) values[6];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}