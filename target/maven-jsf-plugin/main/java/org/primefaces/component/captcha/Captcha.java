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
package org.primefaces.component.captcha;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Captcha extends UIInput {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Captcha";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.CaptchaRenderer";

	private java.lang.String _publicKey;
	private java.lang.String _theme;
	private java.lang.String _language;
	private java.lang.Integer _tabindex;
	public Captcha() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getPublicKey() {
		if(_publicKey != null )
			return _publicKey;

		ValueExpression ve = getValueExpression("publicKey");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setPublicKey(java.lang.String _publicKey) {
		this._publicKey = _publicKey;
	}

	public java.lang.String getTheme() {
		if(_theme != null )
			return _theme;

		ValueExpression ve = getValueExpression("theme");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "red";
	}
	public void setTheme(java.lang.String _theme) {
		this._theme = _theme;
	}

	public java.lang.String getLanguage() {
		if(_language != null )
			return _language;

		ValueExpression ve = getValueExpression("language");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "en";
	}
	public void setLanguage(java.lang.String _language) {
		this._language = _language;
	}

	public int getTabindex() {
		if(_tabindex != null )
			return _tabindex;

		ValueExpression ve = getValueExpression("tabindex");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 0;
	}
	public void setTabindex(int _tabindex) {
		this._tabindex = _tabindex;
	}

	
	protected void validateValue(FacesContext facesContext, Object value) {
		if(!hasCaptchaValidator()) {
			addValidator(new org.primefaces.component.captcha.CaptchaValidator());
		}
		
		super.validateValue(facesContext, value);
	}
	
	private boolean hasCaptchaValidator() {
		for(javax.faces.validator.Validator validator : getValidators()) {
			if(validator instanceof org.primefaces.component.captcha.CaptchaValidator)
				return true;
		}
		
		return false;
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[5];
		values[0] = super.saveState(context);
		values[1] = _publicKey;
		values[2] = _theme;
		values[3] = _language;
		values[4] = _tabindex;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_publicKey = (java.lang.String) values[1];
		_theme = (java.lang.String) values[2];
		_language = (java.lang.String) values[3];
		_tabindex = (java.lang.Integer) values[4];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}