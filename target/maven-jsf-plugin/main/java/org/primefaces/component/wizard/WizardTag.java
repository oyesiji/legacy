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
package org.primefaces.component.wizard;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class WizardTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _step;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.MethodExpression _flowListener;
	private javax.el.ValueExpression _showNavBar;
	private javax.el.ValueExpression _onback;
	private javax.el.ValueExpression _onnext;
	private javax.el.ValueExpression _nextLabel;
	private javax.el.ValueExpression _backLabel;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _effectSpeed;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._step = null;
		this._style = null;
		this._styleClass = null;
		this._flowListener = null;
		this._showNavBar = null;
		this._onback = null;
		this._onnext = null;
		this._nextLabel = null;
		this._backLabel = null;
		this._effect = null;
		this._effectSpeed = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.wizard.Wizard component = null;
		try {
			component = (org.primefaces.component.wizard.Wizard) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_step != null) {
			component.setValueExpression("step", _step);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_flowListener != null) {
			component.setFlowListener(_flowListener);
		}
		if(_showNavBar != null) {
			component.setValueExpression("showNavBar", _showNavBar);
		}
		if(_onback != null) {
			component.setValueExpression("onback", _onback);
		}
		if(_onnext != null) {
			component.setValueExpression("onnext", _onnext);
		}
		if(_nextLabel != null) {
			component.setValueExpression("nextLabel", _nextLabel);
		}
		if(_backLabel != null) {
			component.setValueExpression("backLabel", _backLabel);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_effectSpeed != null) {
			component.setValueExpression("effectSpeed", _effectSpeed);
		}
	}

	public String getComponentType() {
		return Wizard.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.WizardRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setStep(javax.el.ValueExpression expression){
		this._step = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setFlowListener(javax.el.MethodExpression expression){
		this._flowListener = expression;
	}

	public void setShowNavBar(javax.el.ValueExpression expression){
		this._showNavBar = expression;
	}

	public void setOnback(javax.el.ValueExpression expression){
		this._onback = expression;
	}

	public void setOnnext(javax.el.ValueExpression expression){
		this._onnext = expression;
	}

	public void setNextLabel(javax.el.ValueExpression expression){
		this._nextLabel = expression;
	}

	public void setBackLabel(javax.el.ValueExpression expression){
		this._backLabel = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setEffectSpeed(javax.el.ValueExpression expression){
		this._effectSpeed = expression;
	}

}