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
package org.primefaces.component.messages;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Messages extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Messages";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.MessagesRenderer";

	private java.lang.Boolean _showSummary;
	private java.lang.Boolean _showDetail;
	private java.lang.Boolean _globalOnly;
	public Messages() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/messages/messages.css");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public boolean isShowSummary() {
		if(_showSummary != null )
			return _showSummary;

		ValueExpression ve = getValueExpression("showSummary");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setShowSummary(boolean _showSummary) {
		this._showSummary = _showSummary;
	}

	public boolean isShowDetail() {
		if(_showDetail != null )
			return _showDetail;

		ValueExpression ve = getValueExpression("showDetail");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setShowDetail(boolean _showDetail) {
		this._showDetail = _showDetail;
	}

	public boolean isGlobalOnly() {
		if(_globalOnly != null )
			return _globalOnly;

		ValueExpression ve = getValueExpression("globalOnly");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setGlobalOnly(boolean _globalOnly) {
		this._globalOnly = _globalOnly;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[4];
		values[0] = super.saveState(context);
		values[1] = _showSummary;
		values[2] = _showDetail;
		values[3] = _globalOnly;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_showSummary = (java.lang.Boolean) values[1];
		_showDetail = (java.lang.Boolean) values[2];
		_globalOnly = (java.lang.Boolean) values[3];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}