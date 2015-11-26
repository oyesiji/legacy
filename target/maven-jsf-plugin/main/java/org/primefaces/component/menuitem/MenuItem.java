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
package org.primefaces.component.menuitem;

import javax.faces.component.UICommand;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import javax.faces.component.UIComponent;
import javax.faces.component.UIParameter;
import java.util.Map;
import javax.faces.event.ActionEvent;


public class MenuItem extends UICommand implements org.primefaces.component.api.AjaxSource,java.io.Serializable {


	public static final String COMPONENT_TYPE = "org.primefaces.component.MenuItem";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";

	private java.lang.String _url;
	private java.lang.String _target;
	private java.lang.String _helpText;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.String _onclick;
	private java.lang.String _update;
	private java.lang.String _process;
	private java.lang.String _onstart;
	private java.lang.String _oncomplete;
	private java.lang.String _onerror;
	private java.lang.String _onsuccess;
	private java.lang.Boolean _global;
	private java.lang.Boolean _async;
	private java.lang.Boolean _ajax;
	private java.lang.String _icon;
	public MenuItem() {
		setRendererType(null);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
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

	public java.lang.String getTarget() {
		if(_target != null )
			return _target;

		ValueExpression ve = getValueExpression("target");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setTarget(java.lang.String _target) {
		this._target = _target;
	}

	public java.lang.String getHelpText() {
		if(_helpText != null )
			return _helpText;

		ValueExpression ve = getValueExpression("helpText");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setHelpText(java.lang.String _helpText) {
		this._helpText = _helpText;
	}

	public java.lang.String getStyle() {
		if(_style != null )
			return _style;

		ValueExpression ve = getValueExpression("style");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStyle(java.lang.String _style) {
		this._style = _style;
	}

	public java.lang.String getStyleClass() {
		if(_styleClass != null )
			return _styleClass;

		ValueExpression ve = getValueExpression("styleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStyleClass(java.lang.String _styleClass) {
		this._styleClass = _styleClass;
	}

	public java.lang.String getOnclick() {
		if(_onclick != null )
			return _onclick;

		ValueExpression ve = getValueExpression("onclick");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnclick(java.lang.String _onclick) {
		this._onclick = _onclick;
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

	public java.lang.String getProcess() {
		if(_process != null )
			return _process;

		ValueExpression ve = getValueExpression("process");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setProcess(java.lang.String _process) {
		this._process = _process;
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

	public boolean isAjax() {
		if(_ajax != null )
			return _ajax;

		ValueExpression ve = getValueExpression("ajax");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setAjax(boolean _ajax) {
		this._ajax = _ajax;
	}

	public java.lang.String getIcon() {
		if(_icon != null )
			return _icon;

		ValueExpression ve = getValueExpression("icon");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setIcon(java.lang.String _icon) {
		this._icon = _icon;
	}


	public void decode(FacesContext facesContext) {
		Map<String,String> params = facesContext.getExternalContext().getRequestParameterMap();
		String clientId = getClientId(facesContext);
		
		if(params.containsKey(clientId)) {
			this.queueEvent(new ActionEvent(this));
		}
	}
	
	public boolean shouldRenderChildren() {
		if(getChildCount() == 0)
			return false;
		else {
			for(UIComponent child : getChildren()) {
				if(! (child instanceof UIParameter) ) {
					return true;
				}
			}
		}
		
		return false;
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[17];
		values[0] = super.saveState(context);
		values[1] = _url;
		values[2] = _target;
		values[3] = _helpText;
		values[4] = _style;
		values[5] = _styleClass;
		values[6] = _onclick;
		values[7] = _update;
		values[8] = _process;
		values[9] = _onstart;
		values[10] = _oncomplete;
		values[11] = _onerror;
		values[12] = _onsuccess;
		values[13] = _global;
		values[14] = _async;
		values[15] = _ajax;
		values[16] = _icon;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_url = (java.lang.String) values[1];
		_target = (java.lang.String) values[2];
		_helpText = (java.lang.String) values[3];
		_style = (java.lang.String) values[4];
		_styleClass = (java.lang.String) values[5];
		_onclick = (java.lang.String) values[6];
		_update = (java.lang.String) values[7];
		_process = (java.lang.String) values[8];
		_onstart = (java.lang.String) values[9];
		_oncomplete = (java.lang.String) values[10];
		_onerror = (java.lang.String) values[11];
		_onsuccess = (java.lang.String) values[12];
		_global = (java.lang.Boolean) values[13];
		_async = (java.lang.Boolean) values[14];
		_ajax = (java.lang.Boolean) values[15];
		_icon = (java.lang.String) values[16];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}