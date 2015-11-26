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
package org.primefaces.component.accordionpanel;

import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class AccordionPanel extends UIPanel {


	public static final String COMPONENT_TYPE = "org.primefaces.component.AccordionPanel";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.AccordionPanelRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Integer _activeIndex;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.Boolean _disabled;
	private java.lang.String _effect;
	private java.lang.Boolean _autoHeight;
	private java.lang.Boolean _collapsible;
	private java.lang.Boolean _fillSpace;
	private java.lang.String _event;
	public AccordionPanel() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.accordion.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/accordion/accordion.js");
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
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 0;
	}
	public void setActiveIndex(int _activeIndex) {
		this._activeIndex = _activeIndex;
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

	public boolean isDisabled() {
		if(_disabled != null )
			return _disabled;

		ValueExpression ve = getValueExpression("disabled");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDisabled(boolean _disabled) {
		this._disabled = _disabled;
	}

	public java.lang.String getEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "slide";
	}
	public void setEffect(java.lang.String _effect) {
		this._effect = _effect;
	}

	public boolean isAutoHeight() {
		if(_autoHeight != null )
			return _autoHeight;

		ValueExpression ve = getValueExpression("autoHeight");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setAutoHeight(boolean _autoHeight) {
		this._autoHeight = _autoHeight;
	}

	public boolean isCollapsible() {
		if(_collapsible != null )
			return _collapsible;

		ValueExpression ve = getValueExpression("collapsible");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setCollapsible(boolean _collapsible) {
		this._collapsible = _collapsible;
	}

	public boolean isFillSpace() {
		if(_fillSpace != null )
			return _fillSpace;

		ValueExpression ve = getValueExpression("fillSpace");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setFillSpace(boolean _fillSpace) {
		this._fillSpace = _fillSpace;
	}

	public java.lang.String getEvent() {
		if(_event != null )
			return _event;

		ValueExpression ve = getValueExpression("event");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setEvent(java.lang.String _event) {
		this._event = _event;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[11];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _activeIndex;
		values[3] = _style;
		values[4] = _styleClass;
		values[5] = _disabled;
		values[6] = _effect;
		values[7] = _autoHeight;
		values[8] = _collapsible;
		values[9] = _fillSpace;
		values[10] = _event;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_activeIndex = (java.lang.Integer) values[2];
		_style = (java.lang.String) values[3];
		_styleClass = (java.lang.String) values[4];
		_disabled = (java.lang.Boolean) values[5];
		_effect = (java.lang.String) values[6];
		_autoHeight = (java.lang.Boolean) values[7];
		_collapsible = (java.lang.Boolean) values[8];
		_fillSpace = (java.lang.Boolean) values[9];
		_event = (java.lang.String) values[10];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}