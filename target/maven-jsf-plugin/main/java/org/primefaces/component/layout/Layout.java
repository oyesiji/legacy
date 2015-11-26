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
package org.primefaces.component.layout;

import javax.faces.component.UIPanel;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import javax.faces.component.UIComponent;
import org.primefaces.component.layout.LayoutUnit;


public class Layout extends UIPanel {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Layout";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.LayoutRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Boolean _fullPage;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.String _closeTitle;
	private java.lang.String _collapseTitle;
	private java.lang.String _expandTitle;
	private javax.el.MethodExpression _closeListener;
	private java.lang.String _onCloseUpdate;
	private javax.el.MethodExpression _toggleListener;
	private java.lang.String _onToggleUpdate;
	private javax.el.MethodExpression _resizeListener;
	private java.lang.String _onResizeUpdate;
	private java.lang.String _onResizeComplete;
	private java.lang.String _onCloseComplete;
	private java.lang.String _onToggleComplete;
	public Layout() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/resize/assets/skins/sam/resize.css");
			resourceHolder.addResource("/primefaces/layout/layout.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/resize/resize-min.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/layout/layout.js");
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

	public boolean isFullPage() {
		if(_fullPage != null )
			return _fullPage;

		ValueExpression ve = getValueExpression("fullPage");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setFullPage(boolean _fullPage) {
		this._fullPage = _fullPage;
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

	public java.lang.String getCloseTitle() {
		if(_closeTitle != null )
			return _closeTitle;

		ValueExpression ve = getValueExpression("closeTitle");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setCloseTitle(java.lang.String _closeTitle) {
		this._closeTitle = _closeTitle;
	}

	public java.lang.String getCollapseTitle() {
		if(_collapseTitle != null )
			return _collapseTitle;

		ValueExpression ve = getValueExpression("collapseTitle");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setCollapseTitle(java.lang.String _collapseTitle) {
		this._collapseTitle = _collapseTitle;
	}

	public java.lang.String getExpandTitle() {
		if(_expandTitle != null )
			return _expandTitle;

		ValueExpression ve = getValueExpression("expandTitle");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setExpandTitle(java.lang.String _expandTitle) {
		this._expandTitle = _expandTitle;
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

	public javax.el.MethodExpression getToggleListener() {
		return this._toggleListener;
	}

	public void setToggleListener(javax.el.MethodExpression _toggleListener) {
		this._toggleListener = _toggleListener;
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

	public javax.el.MethodExpression getResizeListener() {
		return this._resizeListener;
	}

	public void setResizeListener(javax.el.MethodExpression _resizeListener) {
		this._resizeListener = _resizeListener;
	}
	public java.lang.String getOnResizeUpdate() {
		if(_onResizeUpdate != null )
			return _onResizeUpdate;

		ValueExpression ve = getValueExpression("onResizeUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnResizeUpdate(java.lang.String _onResizeUpdate) {
		this._onResizeUpdate = _onResizeUpdate;
	}

	public java.lang.String getOnResizeComplete() {
		if(_onResizeComplete != null )
			return _onResizeComplete;

		ValueExpression ve = getValueExpression("onResizeComplete");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnResizeComplete(java.lang.String _onResizeComplete) {
		this._onResizeComplete = _onResizeComplete;
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

	public java.lang.String getOnToggleComplete() {
		if(_onToggleComplete != null )
			return _onToggleComplete;

		ValueExpression ve = getValueExpression("onToggleComplete");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnToggleComplete(java.lang.String _onToggleComplete) {
		this._onToggleComplete = _onToggleComplete;
	}


	protected LayoutUnit getLayoutUnitByPosition(String name) {
		for(UIComponent child : getChildren()) {
			if(child instanceof LayoutUnit) {
				LayoutUnit layoutUnit = (LayoutUnit) child;
				
				if(layoutUnit.getPosition().equalsIgnoreCase(name))
					return layoutUnit;
			}
		}
		
		return null;
	}
	
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
		} else if(event instanceof org.primefaces.event.ResizeEvent) {
			MethodExpression resizeMe = getResizeListener();
			
			if(resizeMe != null) {
				resizeMe.invoke(facesContext.getELContext(), new Object[] {event});
			}
		}
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[17];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _fullPage;
		values[3] = _style;
		values[4] = _styleClass;
		values[5] = _closeTitle;
		values[6] = _collapseTitle;
		values[7] = _expandTitle;
		values[8] = _closeListener;
		values[9] = _onCloseUpdate;
		values[10] = _toggleListener;
		values[11] = _onToggleUpdate;
		values[12] = _resizeListener;
		values[13] = _onResizeUpdate;
		values[14] = _onResizeComplete;
		values[15] = _onCloseComplete;
		values[16] = _onToggleComplete;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_fullPage = (java.lang.Boolean) values[2];
		_style = (java.lang.String) values[3];
		_styleClass = (java.lang.String) values[4];
		_closeTitle = (java.lang.String) values[5];
		_collapseTitle = (java.lang.String) values[6];
		_expandTitle = (java.lang.String) values[7];
		_closeListener = (javax.el.MethodExpression) values[8];
		_onCloseUpdate = (java.lang.String) values[9];
		_toggleListener = (javax.el.MethodExpression) values[10];
		_onToggleUpdate = (java.lang.String) values[11];
		_resizeListener = (javax.el.MethodExpression) values[12];
		_onResizeUpdate = (java.lang.String) values[13];
		_onResizeComplete = (java.lang.String) values[14];
		_onCloseComplete = (java.lang.String) values[15];
		_onToggleComplete = (java.lang.String) values[16];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}