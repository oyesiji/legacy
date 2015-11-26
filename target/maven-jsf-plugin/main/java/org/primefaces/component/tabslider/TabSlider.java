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
package org.primefaces.component.tabslider;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class TabSlider extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.TabSlider";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.TabSliderRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Integer _activeIndex;
	private java.lang.String _effect;
	private java.lang.Integer _effectDuration;
	private java.lang.Boolean _navigator;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	public TabSlider() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/anythingslider/anythingslider.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/anythingslider/jquery.anythingslider.js");
			resourceHolder.addResource("/jquery/plugins/anythingslider/jquery.easing.1.2.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/tabslider/tabslider.js");
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

	public int getActiveIndex() {
		if(_activeIndex != null )
			return _activeIndex;

		ValueExpression ve = getValueExpression("activeIndex");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1;
	}
	public void setActiveIndex(int _activeIndex) {
		this._activeIndex = _activeIndex;
	}

	public java.lang.String getEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "easeInOutExpo";
	}
	public void setEffect(java.lang.String _effect) {
		this._effect = _effect;
	}

	public int getEffectDuration() {
		if(_effectDuration != null )
			return _effectDuration;

		ValueExpression ve = getValueExpression("effectDuration");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 600;
	}
	public void setEffectDuration(int _effectDuration) {
		this._effectDuration = _effectDuration;
	}

	public boolean isNavigator() {
		if(_navigator != null )
			return _navigator;

		ValueExpression ve = getValueExpression("navigator");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setNavigator(boolean _navigator) {
		this._navigator = _navigator;
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


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[8];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _activeIndex;
		values[3] = _effect;
		values[4] = _effectDuration;
		values[5] = _navigator;
		values[6] = _style;
		values[7] = _styleClass;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_activeIndex = (java.lang.Integer) values[2];
		_effect = (java.lang.String) values[3];
		_effectDuration = (java.lang.Integer) values[4];
		_navigator = (java.lang.Boolean) values[5];
		_style = (java.lang.String) values[6];
		_styleClass = (java.lang.String) values[7];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}