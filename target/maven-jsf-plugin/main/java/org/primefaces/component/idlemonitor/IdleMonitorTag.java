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
package org.primefaces.component.idlemonitor;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class IdleMonitorTag extends UIComponentELTag {

	private javax.el.ValueExpression _timeout;
	private javax.el.ValueExpression _onidle;
	private javax.el.ValueExpression _onactive;
	private javax.el.MethodExpression _idleListener;
	private javax.el.ValueExpression _update;

	public void release(){
		super.release();
		this._timeout = null;
		this._onidle = null;
		this._onactive = null;
		this._idleListener = null;
		this._update = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.idlemonitor.IdleMonitor component = null;
		try {
			component = (org.primefaces.component.idlemonitor.IdleMonitor) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_timeout != null) {
			component.setValueExpression("timeout", _timeout);
		}
		if(_onidle != null) {
			component.setValueExpression("onidle", _onidle);
		}
		if(_onactive != null) {
			component.setValueExpression("onactive", _onactive);
		}
		if(_idleListener != null) {
			component.setIdleListener(_idleListener);
		}
		if(_update != null) {
			component.setValueExpression("update", _update);
		}
	}

	public String getComponentType() {
		return IdleMonitor.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.IdleMonitorRenderer";
	}

	public void setTimeout(javax.el.ValueExpression expression){
		this._timeout = expression;
	}

	public void setOnidle(javax.el.ValueExpression expression){
		this._onidle = expression;
	}

	public void setOnactive(javax.el.ValueExpression expression){
		this._onactive = expression;
	}

	public void setIdleListener(javax.el.MethodExpression expression){
		this._idleListener = expression;
	}

	public void setUpdate(javax.el.ValueExpression expression){
		this._update = expression;
	}

}