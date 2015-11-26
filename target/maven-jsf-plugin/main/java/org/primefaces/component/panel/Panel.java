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
package org.primefaces.component.panel;

import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import org.primefaces.component.menu.Menu;
import javax.faces.component.UIComponent;


public class Panel extends UIPanel {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Panel";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.PanelRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _header;
	private java.lang.String _footer;
	private java.lang.Boolean _toggleable;
	private java.lang.Integer _toggleSpeed;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.Boolean _collapsed;
	private java.lang.Boolean _closable;
	private javax.el.MethodExpression _closeListener;
	private java.lang.String _onCloseUpdate;
	private java.lang.String _onCloseStart;
	private java.lang.String _onCloseComplete;
	private java.lang.Integer _closeSpeed;
	private java.lang.Boolean _visible;
	private java.lang.String _onToggleUpdate;
	private javax.el.MethodExpression _toggleListener;
	public Panel() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/menu/menu.css");
			resourceHolder.addResource("/primefaces/panel/panel.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/container/container-min.js");
			resourceHolder.addResource("/primefaces/menu/menu.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/panel/panel.js");
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

	public java.lang.String getFooter() {
		if(_footer != null )
			return _footer;

		ValueExpression ve = getValueExpression("footer");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setFooter(java.lang.String _footer) {
		this._footer = _footer;
	}

	public boolean isToggleable() {
		if(_toggleable != null )
			return _toggleable;

		ValueExpression ve = getValueExpression("toggleable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setToggleable(boolean _toggleable) {
		this._toggleable = _toggleable;
	}

	public int getToggleSpeed() {
		if(_toggleSpeed != null )
			return _toggleSpeed;

		ValueExpression ve = getValueExpression("toggleSpeed");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1000;
	}
	public void setToggleSpeed(int _toggleSpeed) {
		this._toggleSpeed = _toggleSpeed;
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

	public boolean isCollapsed() {
		if(_collapsed != null )
			return _collapsed;

		ValueExpression ve = getValueExpression("collapsed");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setCollapsed(boolean _collapsed) {
		this._collapsed = _collapsed;
	}

	public boolean isClosable() {
		if(_closable != null )
			return _closable;

		ValueExpression ve = getValueExpression("closable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setClosable(boolean _closable) {
		this._closable = _closable;
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

	public java.lang.String getOnCloseStart() {
		if(_onCloseStart != null )
			return _onCloseStart;

		ValueExpression ve = getValueExpression("onCloseStart");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnCloseStart(java.lang.String _onCloseStart) {
		this._onCloseStart = _onCloseStart;
	}

	public java.lang.String getOnCloseComplete() {
		if(_onCloseComplete != null )
			return _onCloseComplete;

		ValueExpression ve = getValueExpression("onCloseComplete");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnCloseComplete(java.lang.String _onCloseComplete) {
		this._onCloseComplete = _onCloseComplete;
	}

	public int getCloseSpeed() {
		if(_closeSpeed != null )
			return _closeSpeed;

		ValueExpression ve = getValueExpression("closeSpeed");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1000;
	}
	public void setCloseSpeed(int _closeSpeed) {
		this._closeSpeed = _closeSpeed;
	}

	public boolean isVisible() {
		if(_visible != null )
			return _visible;

		ValueExpression ve = getValueExpression("visible");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setVisible(boolean _visible) {
		this._visible = _visible;
	}

	public java.lang.String getOnToggleUpdate() {
		if(_onToggleUpdate != null )
			return _onToggleUpdate;

		ValueExpression ve = getValueExpression("onToggleUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnToggleUpdate(java.lang.String _onToggleUpdate) {
		this._onToggleUpdate = _onToggleUpdate;
	}

	public javax.el.MethodExpression getToggleListener() {
		return this._toggleListener;
	}

	public void setToggleListener(javax.el.MethodExpression _toggleListener) {
		this._toggleListener = _toggleListener;
	}

	public static final String PANEL_CLASS = "ui-panel ui-widget ui-widget-content ui-corner-all";
	public static final String PANEL_TITLEBAR_CLASS = "ui-panel-titlebar ui-widget-header ui-corner-all ui-helper-clearfix";
	public static final String PANEL_TITLE_CLASS = "ui-panel-title";
	public static final String PANEL_TITLE_ICON_CLASS = "ui-panel-titlebar-icon ui-corner-all ui-state-default";
	public static final String PANEL_CONTENT_CLASS = "ui-panel-content ui-widget-content";
	public static final String PANEL_FOOTER_CLASS = "ui-panel-footer ui-widget-content";
	
	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		
		if(event instanceof org.primefaces.event.CloseEvent) {
			MethodExpression closeMe = getCloseListener();
			
			if(closeMe != null) {
				closeMe.invoke(facesContext.getELContext(), new Object[] {event});
			}
		} else if(event instanceof org.primefaces.event.ToggleEvent) {
			MethodExpression toggleMe = getToggleListener();
			
			if(toggleMe != null) {
				toggleMe.invoke(facesContext.getELContext(), new Object[] {event});
			}
		}
	}
	
	private Menu optionsMenu;
	
	public Menu  getOptionsMenu() {
		if(optionsMenu == null) {
			UIComponent optionsFacet = getFacet("options");
			if(optionsFacet != null)
				optionsMenu = (Menu) optionsFacet;
		}
		
		return optionsMenu;
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[18];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _header;
		values[3] = _footer;
		values[4] = _toggleable;
		values[5] = _toggleSpeed;
		values[6] = _style;
		values[7] = _styleClass;
		values[8] = _collapsed;
		values[9] = _closable;
		values[10] = _closeListener;
		values[11] = _onCloseUpdate;
		values[12] = _onCloseStart;
		values[13] = _onCloseComplete;
		values[14] = _closeSpeed;
		values[15] = _visible;
		values[16] = _onToggleUpdate;
		values[17] = _toggleListener;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_header = (java.lang.String) values[2];
		_footer = (java.lang.String) values[3];
		_toggleable = (java.lang.Boolean) values[4];
		_toggleSpeed = (java.lang.Integer) values[5];
		_style = (java.lang.String) values[6];
		_styleClass = (java.lang.String) values[7];
		_collapsed = (java.lang.Boolean) values[8];
		_closable = (java.lang.Boolean) values[9];
		_closeListener = (javax.el.MethodExpression) values[10];
		_onCloseUpdate = (java.lang.String) values[11];
		_onCloseStart = (java.lang.String) values[12];
		_onCloseComplete = (java.lang.String) values[13];
		_closeSpeed = (java.lang.Integer) values[14];
		_visible = (java.lang.Boolean) values[15];
		_onToggleUpdate = (java.lang.String) values[16];
		_toggleListener = (javax.el.MethodExpression) values[17];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}