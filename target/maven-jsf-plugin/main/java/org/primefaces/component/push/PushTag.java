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
package org.primefaces.component.push;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class PushTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _channel;
	private javax.el.ValueExpression _onpublish;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._channel = null;
		this._onpublish = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.push.Push component = null;
		try {
			component = (org.primefaces.component.push.Push) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_channel != null) {
			component.setValueExpression("channel", _channel);
		}
		if(_onpublish != null) {
			component.setValueExpression("onpublish", _onpublish);
		}
	}

	public String getComponentType() {
		return Push.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.PushRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setChannel(javax.el.ValueExpression expression){
		this._channel = expression;
	}

	public void setOnpublish(javax.el.ValueExpression expression){
		this._onpublish = expression;
	}

}