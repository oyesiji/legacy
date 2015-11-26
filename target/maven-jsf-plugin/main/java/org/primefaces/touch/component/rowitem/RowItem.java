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
package org.primefaces.touch.component.rowitem;

import javax.faces.component.UICommand;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class RowItem extends UICommand implements org.primefaces.component.api.AjaxSource {


	public static final String COMPONENT_TYPE = "org.primefaces.touch.RowItem";
	public static final String COMPONENT_FAMILY = "org.primefaces.touch";
	private static final String DEFAULT_RENDERER = "org.primefaces.touch.component.RowItemRenderer";

	private java.lang.String _view;
	private java.lang.String _url;
	private java.lang.String _update;
	private java.lang.String _onstart;
	private java.lang.String _oncomplete;
	private java.lang.String _process;
	private java.lang.String _onerror;
	private java.lang.String _onsuccess;
	private java.lang.Boolean _global;
	private java.lang.Boolean _async;
	public RowItem() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getView() {
		if(_view != null )
			return _view;

		ValueExpression ve = getValueExpression("view");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setView(java.lang.String _view) {
		this._view = _view;
	}

	public java.lang.String getUrl() {
		if(_url != null )
			return _url;

		ValueExpression ve = getValueExpression("url");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setUrl(java.lang.String _url) {
		this._url = _url;
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

	public java.lang.String getOnstart() {
		if(_onstart != null )
			return _onstart;

		ValueExpression ve = getValueExpression("onstart");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnstart(java.lang.String _onstart) {
		this._onstart = _onstart;
	}

	public java.lang.String getOncomplete() {
		if(_oncomplete != null )
			return _oncomplete;

		ValueExpression ve = getValueExpression("oncomplete");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOncomplete(java.lang.String _oncomplete) {
		this._oncomplete = _oncomplete;
	}

	public java.lang.String getProcess() {
		if(_process != null )
			return _process;

		ValueExpression ve = getValueExpression("process");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setProcess(java.lang.String _process) {
		this._process = _process;
	}

	public java.lang.String getOnerror() {
		if(_onerror != null )
			return _onerror;

		ValueExpression ve = getValueExpression("onerror");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnerror(java.lang.String _onerror) {
		this._onerror = _onerror;
	}

	public java.lang.String getOnsuccess() {
		if(_onsuccess != null )
			return _onsuccess;

		ValueExpression ve = getValueExpression("onsuccess");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnsuccess(java.lang.String _onsuccess) {
		this._onsuccess = _onsuccess;
	}

	public boolean isGlobal() {
		if(_global != null )
			return _global;

		ValueExpression ve = getValueExpression("global");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setGlobal(boolean _global) {
		this._global = _global;
	}

	public boolean isAsync() {
		if(_async != null )
			return _async;

		ValueExpression ve = getValueExpression("async");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setAsync(boolean _async) {
		this._async = _async;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[11];
		values[0] = super.saveState(context);
		values[1] = _view;
		values[2] = _url;
		values[3] = _update;
		values[4] = _onstart;
		values[5] = _oncomplete;
		values[6] = _process;
		values[7] = _onerror;
		values[8] = _onsuccess;
		values[9] = _global;
		values[10] = _async;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_view = (java.lang.String) values[1];
		_url = (java.lang.String) values[2];
		_update = (java.lang.String) values[3];
		_onstart = (java.lang.String) values[4];
		_oncomplete = (java.lang.String) values[5];
		_process = (java.lang.String) values[6];
		_onerror = (java.lang.String) values[7];
		_onsuccess = (java.lang.String) values[8];
		_global = (java.lang.Boolean) values[9];
		_async = (java.lang.Boolean) values[10];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}