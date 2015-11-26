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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class ResizableTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _proxy;
	private javax.el.ValueExpression _status;
	private javax.el.ValueExpression _handles;
	private javax.el.ValueExpression _ghost;
	private javax.el.ValueExpression _knobHandles;
	private javax.el.ValueExpression _animate;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _animateDuration;
	private javax.el.ValueExpression _maxWidth;
	private javax.el.ValueExpression _maxHeight;
	private javax.el.ValueExpression _minWidth;
	private javax.el.ValueExpression _minHeight;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._proxy = null;
		this._status = null;
		this._handles = null;
		this._ghost = null;
		this._knobHandles = null;
		this._animate = null;
		this._effect = null;
		this._animateDuration = null;
		this._maxWidth = null;
		this._maxHeight = null;
		this._minWidth = null;
		this._minHeight = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.resizable.Resizable component = null;
		try {
			component = (org.primefaces.component.resizable.Resizable) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_proxy != null) {
			component.setValueExpression("proxy", _proxy);
		}
		if(_status != null) {
			component.setValueExpression("status", _status);
		}
		if(_handles != null) {
			component.setValueExpression("handles", _handles);
		}
		if(_ghost != null) {
			component.setValueExpression("ghost", _ghost);
		}
		if(_knobHandles != null) {
			component.setValueExpression("knobHandles", _knobHandles);
		}
		if(_animate != null) {
			component.setValueExpression("animate", _animate);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_animateDuration != null) {
			component.setValueExpression("animateDuration", _animateDuration);
		}
		if(_maxWidth != null) {
			component.setValueExpression("maxWidth", _maxWidth);
		}
		if(_maxHeight != null) {
			component.setValueExpression("maxHeight", _maxHeight);
		}
		if(_minWidth != null) {
			component.setValueExpression("minWidth", _minWidth);
		}
		if(_minHeight != null) {
			component.setValueExpression("minHeight", _minHeight);
		}
	}

	public String getComponentType() {
		return Resizable.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.ResizableRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setProxy(javax.el.ValueExpression expression){
		this._proxy = expression;
	}

	public void setStatus(javax.el.ValueExpression expression){
		this._status = expression;
	}

	public void setHandles(javax.el.ValueExpression expression){
		this._handles = expression;
	}

	public void setGhost(javax.el.ValueExpression expression){
		this._ghost = expression;
	}

	public void setKnobHandles(javax.el.ValueExpression expression){
		this._knobHandles = expression;
	}

	public void setAnimate(javax.el.ValueExpression expression){
		this._animate = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setAnimateDuration(javax.el.ValueExpression expression){
		this._animateDuration = expression;
	}

	public void setMaxWidth(javax.el.ValueExpression expression){
		this._maxWidth = expression;
	}

	public void setMaxHeight(javax.el.ValueExpression expression){
		this._maxHeight = expression;
	}

	public void setMinWidth(javax.el.ValueExpression expression){
		this._minWidth = expression;
	}

	public void setMinHeight(javax.el.ValueExpression expression){
		this._minHeight = expression;
	}

}