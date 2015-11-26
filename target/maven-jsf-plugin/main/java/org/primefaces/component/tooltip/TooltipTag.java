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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class TooltipTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _converter;
	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _global;
	private javax.el.ValueExpression _targetPosition;
	private javax.el.ValueExpression _position;
	private javax.el.ValueExpression _showEvent;
	private javax.el.ValueExpression _showDelay;
	private javax.el.ValueExpression _showEffect;
	private javax.el.ValueExpression _showEffectLength;
	private javax.el.ValueExpression _hideEvent;
	private javax.el.ValueExpression _hideDelay;
	private javax.el.ValueExpression _hideEffect;
	private javax.el.ValueExpression _hideEffectLength;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _for;
	private javax.el.ValueExpression _forElement;

	public void release(){
		super.release();
		this._value = null;
		this._converter = null;
		this._widgetVar = null;
		this._global = null;
		this._targetPosition = null;
		this._position = null;
		this._showEvent = null;
		this._showDelay = null;
		this._showEffect = null;
		this._showEffectLength = null;
		this._hideEvent = null;
		this._hideDelay = null;
		this._hideEffect = null;
		this._hideEffectLength = null;
		this._style = null;
		this._for = null;
		this._forElement = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.tooltip.Tooltip component = null;
		try {
			component = (org.primefaces.component.tooltip.Tooltip) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_converter != null) {
			component.setValueExpression("converter", _converter);
		}
		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_global != null) {
			component.setValueExpression("global", _global);
		}
		if(_targetPosition != null) {
			component.setValueExpression("targetPosition", _targetPosition);
		}
		if(_position != null) {
			component.setValueExpression("position", _position);
		}
		if(_showEvent != null) {
			component.setValueExpression("showEvent", _showEvent);
		}
		if(_showDelay != null) {
			component.setValueExpression("showDelay", _showDelay);
		}
		if(_showEffect != null) {
			component.setValueExpression("showEffect", _showEffect);
		}
		if(_showEffectLength != null) {
			component.setValueExpression("showEffectLength", _showEffectLength);
		}
		if(_hideEvent != null) {
			component.setValueExpression("hideEvent", _hideEvent);
		}
		if(_hideDelay != null) {
			component.setValueExpression("hideDelay", _hideDelay);
		}
		if(_hideEffect != null) {
			component.setValueExpression("hideEffect", _hideEffect);
		}
		if(_hideEffectLength != null) {
			component.setValueExpression("hideEffectLength", _hideEffectLength);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_for != null) {
			component.setValueExpression("for", _for);
		}
		if(_forElement != null) {
			component.setValueExpression("forElement", _forElement);
		}
	}

	public String getComponentType() {
		return Tooltip.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.TooltipRenderer";
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setConverter(javax.el.ValueExpression expression){
		this._converter = expression;
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setGlobal(javax.el.ValueExpression expression){
		this._global = expression;
	}

	public void setTargetPosition(javax.el.ValueExpression expression){
		this._targetPosition = expression;
	}

	public void setPosition(javax.el.ValueExpression expression){
		this._position = expression;
	}

	public void setShowEvent(javax.el.ValueExpression expression){
		this._showEvent = expression;
	}

	public void setShowDelay(javax.el.ValueExpression expression){
		this._showDelay = expression;
	}

	public void setShowEffect(javax.el.ValueExpression expression){
		this._showEffect = expression;
	}

	public void setShowEffectLength(javax.el.ValueExpression expression){
		this._showEffectLength = expression;
	}

	public void setHideEvent(javax.el.ValueExpression expression){
		this._hideEvent = expression;
	}

	public void setHideDelay(javax.el.ValueExpression expression){
		this._hideDelay = expression;
	}

	public void setHideEffect(javax.el.ValueExpression expression){
		this._hideEffect = expression;
	}

	public void setHideEffectLength(javax.el.ValueExpression expression){
		this._hideEffectLength = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setFor(javax.el.ValueExpression expression){
		this._for = expression;
	}

	public void setForElement(javax.el.ValueExpression expression){
		this._forElement = expression;
	}

}