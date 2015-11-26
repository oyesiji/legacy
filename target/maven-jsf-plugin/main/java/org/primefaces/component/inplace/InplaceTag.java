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
package org.primefaces.component.inplace;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class InplaceTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _label;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _effectSpeed;
	private javax.el.ValueExpression _disabled;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._label = null;
		this._effect = null;
		this._effectSpeed = null;
		this._disabled = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.inplace.Inplace component = null;
		try {
			component = (org.primefaces.component.inplace.Inplace) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_label != null) {
			component.setValueExpression("label", _label);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_effectSpeed != null) {
			component.setValueExpression("effectSpeed", _effectSpeed);
		}
		if(_disabled != null) {
			component.setValueExpression("disabled", _disabled);
		}
	}

	public String getComponentType() {
		return Inplace.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.InplaceRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setLabel(javax.el.ValueExpression expression){
		this._label = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setEffectSpeed(javax.el.ValueExpression expression){
		this._effectSpeed = expression;
	}

	public void setDisabled(javax.el.ValueExpression expression){
		this._disabled = expression;
	}

}