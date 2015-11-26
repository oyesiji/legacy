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
package org.primefaces.component.effect;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class EffectTag extends UIComponentELTag {

	private javax.el.ValueExpression _event;
	private javax.el.ValueExpression _type;
	private javax.el.ValueExpression _for;
	private javax.el.ValueExpression _speed;

	public void release(){
		super.release();
		this._event = null;
		this._type = null;
		this._for = null;
		this._speed = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.effect.Effect component = null;
		try {
			component = (org.primefaces.component.effect.Effect) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_event != null) {
			component.setValueExpression("event", _event);
		}
		if(_type != null) {
			component.setValueExpression("type", _type);
		}
		if(_for != null) {
			component.setValueExpression("for", _for);
		}
		if(_speed != null) {
			component.setValueExpression("speed", _speed);
		}
	}

	public String getComponentType() {
		return Effect.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.EffectRenderer";
	}

	public void setEvent(javax.el.ValueExpression expression){
		this._event = expression;
	}

	public void setType(javax.el.ValueExpression expression){
		this._type = expression;
	}

	public void setFor(javax.el.ValueExpression expression){
		this._for = expression;
	}

	public void setSpeed(javax.el.ValueExpression expression){
		this._speed = expression;
	}

}