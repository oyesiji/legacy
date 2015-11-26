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
package org.primefaces.component.tooltip;

import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Tooltip extends UIOutput {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Tooltip";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.TooltipRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Boolean _global;
	private java.lang.String _targetPosition;
	private java.lang.String _position;
	private java.lang.String _showEvent;
	private java.lang.Integer _showDelay;
	private java.lang.String _showEffect;
	private java.lang.Integer _showEffectLength;
	private java.lang.String _hideEvent;
	private java.lang.Integer _hideDelay;
	private java.lang.String _hideEffect;
	private java.lang.Integer _hideEffectLength;
	private java.lang.String _style;
	private java.lang.String _for;
	private java.lang.String _forElement;
	public Tooltip() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/tooltip/jquery.qtip-1.0.min.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/tooltip/tooltip.js");
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

	public boolean isGlobal() {
		if(_global != null )
			return _global;

		ValueExpression ve = getValueExpression("global");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setGlobal(boolean _global) {
		this._global = _global;
	}

	public java.lang.String getTargetPosition() {
		if(_targetPosition != null )
			return _targetPosition;

		ValueExpression ve = getValueExpression("targetPosition");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "bottomRight";
	}
	public void setTargetPosition(java.lang.String _targetPosition) {
		this._targetPosition = _targetPosition;
	}

	public java.lang.String getPosition() {
		if(_position != null )
			return _position;

		ValueExpression ve = getValueExpression("position");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "topLeft";
	}
	public void setPosition(java.lang.String _position) {
		this._position = _position;
	}

	public java.lang.String getShowEvent() {
		if(_showEvent != null )
			return _showEvent;

		ValueExpression ve = getValueExpression("showEvent");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "mouseover";
	}
	public void setShowEvent(java.lang.String _showEvent) {
		this._showEvent = _showEvent;
	}

	public int getShowDelay() {
		if(_showDelay != null )
			return _showDelay;

		ValueExpression ve = getValueExpression("showDelay");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 140;
	}
	public void setShowDelay(int _showDelay) {
		this._showDelay = _showDelay;
	}

	public java.lang.String getShowEffect() {
		if(_showEffect != null )
			return _showEffect;

		ValueExpression ve = getValueExpression("showEffect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "fade";
	}
	public void setShowEffect(java.lang.String _showEffect) {
		this._showEffect = _showEffect;
	}

	public int getShowEffectLength() {
		if(_showEffectLength != null )
			return _showEffectLength;

		ValueExpression ve = getValueExpression("showEffectLength");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 100;
	}
	public void setShowEffectLength(int _showEffectLength) {
		this._showEffectLength = _showEffectLength;
	}

	public java.lang.String getHideEvent() {
		if(_hideEvent != null )
			return _hideEvent;

		ValueExpression ve = getValueExpression("hideEvent");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "mouseout";
	}
	public void setHideEvent(java.lang.String _hideEvent) {
		this._hideEvent = _hideEvent;
	}

	public int getHideDelay() {
		if(_hideDelay != null )
			return _hideDelay;

		ValueExpression ve = getValueExpression("hideDelay");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 0;
	}
	public void setHideDelay(int _hideDelay) {
		this._hideDelay = _hideDelay;
	}

	public java.lang.String getHideEffect() {
		if(_hideEffect != null )
			return _hideEffect;

		ValueExpression ve = getValueExpression("hideEffect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "fade";
	}
	public void setHideEffect(java.lang.String _hideEffect) {
		this._hideEffect = _hideEffect;
	}

	public int getHideEffectLength() {
		if(_hideEffectLength != null )
			return _hideEffectLength;

		ValueExpression ve = getValueExpression("hideEffectLength");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 100;
	}
	public void setHideEffectLength(int _hideEffectLength) {
		this._hideEffectLength = _hideEffectLength;
	}

	public java.lang.String getStyle() {
		if(_style != null )
			return _style;

		ValueExpression ve = getValueExpression("style");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "blue";
	}
	public void setStyle(java.lang.String _style) {
		this._style = _style;
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

	public java.lang.String getForElement() {
		if(_forElement != null )
			return _forElement;

		ValueExpression ve = getValueExpression("forElement");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setForElement(java.lang.String _forElement) {
		this._forElement = _forElement;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[16];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _global;
		values[3] = _targetPosition;
		values[4] = _position;
		values[5] = _showEvent;
		values[6] = _showDelay;
		values[7] = _showEffect;
		values[8] = _showEffectLength;
		values[9] = _hideEvent;
		values[10] = _hideDelay;
		values[11] = _hideEffect;
		values[12] = _hideEffectLength;
		values[13] = _style;
		values[14] = _for;
		values[15] = _forElement;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_global = (java.lang.Boolean) values[2];
		_targetPosition = (java.lang.String) values[3];
		_position = (java.lang.String) values[4];
		_showEvent = (java.lang.String) values[5];
		_showDelay = (java.lang.Integer) values[6];
		_showEffect = (java.lang.String) values[7];
		_showEffectLength = (java.lang.Integer) values[8];
		_hideEvent = (java.lang.String) values[9];
		_hideDelay = (java.lang.Integer) values[10];
		_hideEffect = (java.lang.String) values[11];
		_hideEffectLength = (java.lang.Integer) values[12];
		_style = (java.lang.String) values[13];
		_for = (java.lang.String) values[14];
		_forElement = (java.lang.String) values[15];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}