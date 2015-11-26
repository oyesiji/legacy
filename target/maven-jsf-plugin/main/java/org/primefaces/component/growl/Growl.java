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
package org.primefaces.component.growl;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Growl extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Growl";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.GrowlRenderer";

	private java.lang.Boolean _sticky;
	private java.lang.Boolean _showSummary;
	private java.lang.Boolean _showDetail;
	private java.lang.Boolean _globalOnly;
	private java.lang.Integer _life;
	private java.lang.String _warnIcon;
	private java.lang.String _infoIcon;
	private java.lang.String _errorIcon;
	private java.lang.String _fatalIcon;
	public Growl() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/growl/assets/growl.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/growl/growl.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public boolean isSticky() {
		if(_sticky != null )
			return _sticky;

		ValueExpression ve = getValueExpression("sticky");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setSticky(boolean _sticky) {
		this._sticky = _sticky;
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

	public int getLife() {
		if(_life != null )
			return _life;

		ValueExpression ve = getValueExpression("life");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 6000;
	}
	public void setLife(int _life) {
		this._life = _life;
	}

	public java.lang.String getWarnIcon() {
		if(_warnIcon != null )
			return _warnIcon;

		ValueExpression ve = getValueExpression("warnIcon");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setWarnIcon(java.lang.String _warnIcon) {
		this._warnIcon = _warnIcon;
	}

	public java.lang.String getInfoIcon() {
		if(_infoIcon != null )
			return _infoIcon;

		ValueExpression ve = getValueExpression("infoIcon");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setInfoIcon(java.lang.String _infoIcon) {
		this._infoIcon = _infoIcon;
	}

	public java.lang.String getErrorIcon() {
		if(_errorIcon != null )
			return _errorIcon;

		ValueExpression ve = getValueExpression("errorIcon");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setErrorIcon(java.lang.String _errorIcon) {
		this._errorIcon = _errorIcon;
	}

	public java.lang.String getFatalIcon() {
		if(_fatalIcon != null )
			return _fatalIcon;

		ValueExpression ve = getValueExpression("fatalIcon");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setFatalIcon(java.lang.String _fatalIcon) {
		this._fatalIcon = _fatalIcon;
	}

	static final String WARN_ICON = "/primefaces/growl/assets/warn.png";
	static final String ERROR_ICON = "/primefaces/growl/assets/error.png";
	static final String INFO_ICON = "/primefaces/growl/assets/info.png";
	static final String FATAL_ICON = "/primefaces/growl/assets/fatal.png";

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[10];
		values[0] = super.saveState(context);
		values[1] = _sticky;
		values[2] = _showSummary;
		values[3] = _showDetail;
		values[4] = _globalOnly;
		values[5] = _life;
		values[6] = _warnIcon;
		values[7] = _infoIcon;
		values[8] = _errorIcon;
		values[9] = _fatalIcon;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_sticky = (java.lang.Boolean) values[1];
		_showSummary = (java.lang.Boolean) values[2];
		_showDetail = (java.lang.Boolean) values[3];
		_globalOnly = (java.lang.Boolean) values[4];
		_life = (java.lang.Integer) values[5];
		_warnIcon = (java.lang.String) values[6];
		_infoIcon = (java.lang.String) values[7];
		_errorIcon = (java.lang.String) values[8];
		_fatalIcon = (java.lang.String) values[9];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}