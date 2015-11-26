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
package org.primefaces.component.dock;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class DockTag extends UIComponentELTag {

	private javax.el.ValueExpression _model;
	private javax.el.ValueExpression _position;
	private javax.el.ValueExpression _itemWidth;
	private javax.el.ValueExpression _maxWidth;
	private javax.el.ValueExpression _proximity;
	private javax.el.ValueExpression _halign;

	public void release(){
		super.release();
		this._model = null;
		this._position = null;
		this._itemWidth = null;
		this._maxWidth = null;
		this._proximity = null;
		this._halign = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.dock.Dock component = null;
		try {
			component = (org.primefaces.component.dock.Dock) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_model != null) {
			component.setValueExpression("model", _model);
		}
		if(_position != null) {
			component.setValueExpression("position", _position);
		}
		if(_itemWidth != null) {
			component.setValueExpression("itemWidth", _itemWidth);
		}
		if(_maxWidth != null) {
			component.setValueExpression("maxWidth", _maxWidth);
		}
		if(_proximity != null) {
			component.setValueExpression("proximity", _proximity);
		}
		if(_halign != null) {
			component.setValueExpression("halign", _halign);
		}
	}

	public String getComponentType() {
		return Dock.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.DockRenderer";
	}

	public void setModel(javax.el.ValueExpression expression){
		this._model = expression;
	}

	public void setPosition(javax.el.ValueExpression expression){
		this._position = expression;
	}

	public void setItemWidth(javax.el.ValueExpression expression){
		this._itemWidth = expression;
	}

	public void setMaxWidth(javax.el.ValueExpression expression){
		this._maxWidth = expression;
	}

	public void setProximity(javax.el.ValueExpression expression){
		this._proximity = expression;
	}

	public void setHalign(javax.el.ValueExpression expression){
		this._halign = expression;
	}

}