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
package org.primefaces.component.ajaxstatus;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class AjaxStatus extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.AjaxStatus";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.AjaxStatusRenderer";

	private java.lang.String _onstart;
	private java.lang.String _oncomplete;
	private java.lang.String _onprestart;
	private java.lang.String _onsuccess;
	private java.lang.String _onerror;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	public AjaxStatus() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/ajaxstatus/ajaxstatus.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
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

	public java.lang.String getOnprestart() {
		if(_onprestart != null )
			return _onprestart;

		ValueExpression ve = getValueExpression("onprestart");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnprestart(java.lang.String _onprestart) {
		this._onprestart = _onprestart;
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

	public java.lang.String getOnerror() {
		if(_onerror != null )
			return _onerror;

		ValueExpression ve = getValueExpression("onerror");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnerror(java.lang.String _onerror) {
		this._onerror = _onerror;
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


	final static String[] FACETS = {"prestart","start","success","complete","error"};

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[8];
		values[0] = super.saveState(context);
		values[1] = _onstart;
		values[2] = _oncomplete;
		values[3] = _onprestart;
		values[4] = _onsuccess;
		values[5] = _onerror;
		values[6] = _style;
		values[7] = _styleClass;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_onstart = (java.lang.String) values[1];
		_oncomplete = (java.lang.String) values[2];
		_onprestart = (java.lang.String) values[3];
		_onsuccess = (java.lang.String) values[4];
		_onerror = (java.lang.String) values[5];
		_style = (java.lang.String) values[6];
		_styleClass = (java.lang.String) values[7];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}