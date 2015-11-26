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
package org.primefaces.component.media;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class MediaTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _player;
	private javax.el.ValueExpression _width;
	private javax.el.ValueExpression _height;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;

	public void release(){
		super.release();
		this._value = null;
		this._player = null;
		this._width = null;
		this._height = null;
		this._style = null;
		this._styleClass = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.media.Media component = null;
		try {
			component = (org.primefaces.component.media.Media) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_player != null) {
			component.setValueExpression("player", _player);
		}
		if(_width != null) {
			component.setValueExpression("width", _width);
		}
		if(_height != null) {
			component.setValueExpression("height", _height);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
	}

	public String getComponentType() {
		return Media.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.MediaRenderer";
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setPlayer(javax.el.ValueExpression expression){
		this._player = expression;
	}

	public void setWidth(javax.el.ValueExpression expression){
		this._width = expression;
	}

	public void setHeight(javax.el.ValueExpression expression){
		this._height = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

}