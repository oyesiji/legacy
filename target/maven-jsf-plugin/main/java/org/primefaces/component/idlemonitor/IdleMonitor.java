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

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import javax.faces.event.ActionEvent;


public class IdleMonitor extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.IdleMonitor";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.IdleMonitorRenderer";

	private java.lang.Integer _timeout;
	private java.lang.String _onidle;
	private java.lang.String _onactive;
	private javax.el.MethodExpression _idleListener;
	private java.lang.String _update;
	public IdleMonitor() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/idletimer/idletimer.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/idlemonitor/idlemonitor.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public int getTimeout() {
		if(_timeout != null )
			return _timeout;

		ValueExpression ve = getValueExpression("timeout");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 300000;
	}
	public void setTimeout(int _timeout) {
		this._timeout = _timeout;
	}

	public java.lang.String getOnidle() {
		if(_onidle != null )
			return _onidle;

		ValueExpression ve = getValueExpression("onidle");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnidle(java.lang.String _onidle) {
		this._onidle = _onidle;
	}

	public java.lang.String getOnactive() {
		if(_onactive != null )
			return _onactive;

		ValueExpression ve = getValueExpression("onactive");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnactive(java.lang.String _onactive) {
		this._onactive = _onactive;
	}

	public javax.el.MethodExpression getIdleListener() {
		return this._idleListener;
	}

	public void setIdleListener(javax.el.MethodExpression _idleListener) {
		this._idleListener = _idleListener;
	}
	public java.lang.String getUpdate() {
		if(_update != null )
			return _update;

		ValueExpression ve = getValueExpression("update");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setUpdate(java.lang.String _update) {
		this._update = _update;
	}


	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		MethodExpression me = getIdleListener();
		
		if (me != null) {
			me.invoke(facesContext.getELContext(), new Object[] {event});
		}
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[6];
		values[0] = super.saveState(context);
		values[1] = _timeout;
		values[2] = _onidle;
		values[3] = _onactive;
		values[4] = _idleListener;
		values[5] = _update;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_timeout = (java.lang.Integer) values[1];
		_onidle = (java.lang.String) values[2];
		_onactive = (java.lang.String) values[3];
		_idleListener = (javax.el.MethodExpression) values[4];
		_update = (java.lang.String) values[5];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}