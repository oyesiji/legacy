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
package org.primefaces.component.resizable;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Resizable extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Resizable";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.ResizableRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Boolean _proxy;
	private java.lang.Boolean _status;
	private java.lang.String _handles;
	private java.lang.Boolean _ghost;
	private java.lang.Boolean _knobHandles;
	private java.lang.Boolean _animate;
	private java.lang.String _effect;
	private java.lang.Double _animateDuration;
	private java.lang.Integer _maxWidth;
	private java.lang.Integer _maxHeight;
	private java.lang.Integer _minWidth;
	private java.lang.Integer _minHeight;
	public Resizable() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/resize/assets/skins/sam/resize.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/resize/resize-min.js");
			resourceHolder.addResource("/jquery/jquery.js");
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

	public boolean isProxy() {
		if(_proxy != null )
			return _proxy;

		ValueExpression ve = getValueExpression("proxy");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setProxy(boolean _proxy) {
		this._proxy = _proxy;
	}

	public boolean isStatus() {
		if(_status != null )
			return _status;

		ValueExpression ve = getValueExpression("status");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setStatus(boolean _status) {
		this._status = _status;
	}

	public java.lang.String getHandles() {
		if(_handles != null )
			return _handles;

		ValueExpression ve = getValueExpression("handles");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setHandles(java.lang.String _handles) {
		this._handles = _handles;
	}

	public boolean isGhost() {
		if(_ghost != null )
			return _ghost;

		ValueExpression ve = getValueExpression("ghost");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setGhost(boolean _ghost) {
		this._ghost = _ghost;
	}

	public boolean isKnobHandles() {
		if(_knobHandles != null )
			return _knobHandles;

		ValueExpression ve = getValueExpression("knobHandles");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setKnobHandles(boolean _knobHandles) {
		this._knobHandles = _knobHandles;
	}

	public boolean isAnimate() {
		if(_animate != null )
			return _animate;

		ValueExpression ve = getValueExpression("animate");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setAnimate(boolean _animate) {
		this._animate = _animate;
	}

	public java.lang.String getEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setEffect(java.lang.String _effect) {
		this._effect = _effect;
	}

	public double getAnimateDuration() {
		if(_animateDuration != null )
			return _animateDuration;

		ValueExpression ve = getValueExpression("animateDuration");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : 0.75;
	}
	public void setAnimateDuration(double _animateDuration) {
		this._animateDuration = _animateDuration;
	}

	public int getMaxWidth() {
		if(_maxWidth != null )
			return _maxWidth;

		ValueExpression ve = getValueExpression("maxWidth");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : Integer.MIN_VALUE;
	}
	public void setMaxWidth(int _maxWidth) {
		this._maxWidth = _maxWidth;
	}

	public int getMaxHeight() {
		if(_maxHeight != null )
			return _maxHeight;

		ValueExpression ve = getValueExpression("maxHeight");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : Integer.MIN_VALUE;
	}
	public void setMaxHeight(int _maxHeight) {
		this._maxHeight = _maxHeight;
	}

	public int getMinWidth() {
		if(_minWidth != null )
			return _minWidth;

		ValueExpression ve = getValueExpression("minWidth");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : Integer.MIN_VALUE;
	}
	public void setMinWidth(int _minWidth) {
		this._minWidth = _minWidth;
	}

	public int getMinHeight() {
		if(_minHeight != null )
			return _minHeight;

		ValueExpression ve = getValueExpression("minHeight");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : Integer.MIN_VALUE;
	}
	public void setMinHeight(int _minHeight) {
		this._minHeight = _minHeight;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[14];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _proxy;
		values[3] = _status;
		values[4] = _handles;
		values[5] = _ghost;
		values[6] = _knobHandles;
		values[7] = _animate;
		values[8] = _effect;
		values[9] = _animateDuration;
		values[10] = _maxWidth;
		values[11] = _maxHeight;
		values[12] = _minWidth;
		values[13] = _minHeight;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_proxy = (java.lang.Boolean) values[2];
		_status = (java.lang.Boolean) values[3];
		_handles = (java.lang.String) values[4];
		_ghost = (java.lang.Boolean) values[5];
		_knobHandles = (java.lang.Boolean) values[6];
		_animate = (java.lang.Boolean) values[7];
		_effect = (java.lang.String) values[8];
		_animateDuration = (java.lang.Double) values[9];
		_maxWidth = (java.lang.Integer) values[10];
		_maxHeight = (java.lang.Integer) values[11];
		_minWidth = (java.lang.Integer) values[12];
		_minHeight = (java.lang.Integer) values[13];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}