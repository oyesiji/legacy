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
package org.primefaces.component.password;

import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Password extends HtmlInputText {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Password";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.PasswordRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Integer _minLength;
	private java.lang.Boolean _inline;
	private java.lang.String _promptLabel;
	private java.lang.Integer _level;
	private java.lang.String _weakLabel;
	private java.lang.String _goodLabel;
	private java.lang.String _strongLabel;
	private java.lang.String _onshow;
	private java.lang.String _onhide;
	private java.lang.Boolean _autocomplete;
	public Password() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/password/jpassword.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/password/jpassword.min.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/password/password.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getWidgetVar() {
		if(_widgetVar != null )
			return _widgetVar;

		ValueExpression ve = getValueExpression("widgetVar");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setWidgetVar(java.lang.String _widgetVar) {
		this._widgetVar = _widgetVar;
	}

	public int getMinLength() {
		if(_minLength != null )
			return _minLength;

		ValueExpression ve = getValueExpression("minLength");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 8;
	}
	public void setMinLength(int _minLength) {
		this._minLength = _minLength;
	}

	public boolean isInline() {
		if(_inline != null )
			return _inline;

		ValueExpression ve = getValueExpression("inline");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setInline(boolean _inline) {
		this._inline = _inline;
	}

	public java.lang.String getPromptLabel() {
		if(_promptLabel != null )
			return _promptLabel;

		ValueExpression ve = getValueExpression("promptLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "Please enter a password";
	}
	public void setPromptLabel(java.lang.String _promptLabel) {
		this._promptLabel = _promptLabel;
	}

	public int getLevel() {
		if(_level != null )
			return _level;

		ValueExpression ve = getValueExpression("level");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1;
	}
	public void setLevel(int _level) {
		this._level = _level;
	}

	public java.lang.String getWeakLabel() {
		if(_weakLabel != null )
			return _weakLabel;

		ValueExpression ve = getValueExpression("weakLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "Weak";
	}
	public void setWeakLabel(java.lang.String _weakLabel) {
		this._weakLabel = _weakLabel;
	}

	public java.lang.String getGoodLabel() {
		if(_goodLabel != null )
			return _goodLabel;

		ValueExpression ve = getValueExpression("goodLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "Good";
	}
	public void setGoodLabel(java.lang.String _goodLabel) {
		this._goodLabel = _goodLabel;
	}

	public java.lang.String getStrongLabel() {
		if(_strongLabel != null )
			return _strongLabel;

		ValueExpression ve = getValueExpression("strongLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "Strong";
	}
	public void setStrongLabel(java.lang.String _strongLabel) {
		this._strongLabel = _strongLabel;
	}

	public java.lang.String getOnshow() {
		if(_onshow != null )
			return _onshow;

		ValueExpression ve = getValueExpression("onshow");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnshow(java.lang.String _onshow) {
		this._onshow = _onshow;
	}

	public java.lang.String getOnhide() {
		if(_onhide != null )
			return _onhide;

		ValueExpression ve = getValueExpression("onhide");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnhide(java.lang.String _onhide) {
		this._onhide = _onhide;
	}

	public boolean isAutocomplete() {
		if(_autocomplete != null )
			return _autocomplete;

		ValueExpression ve = getValueExpression("autocomplete");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setAutocomplete(boolean _autocomplete) {
		this._autocomplete = _autocomplete;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[12];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _minLength;
		values[3] = _inline;
		values[4] = _promptLabel;
		values[5] = _level;
		values[6] = _weakLabel;
		values[7] = _goodLabel;
		values[8] = _strongLabel;
		values[9] = _onshow;
		values[10] = _onhide;
		values[11] = _autocomplete;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_minLength = (java.lang.Integer) values[2];
		_inline = (java.lang.Boolean) values[3];
		_promptLabel = (java.lang.String) values[4];
		_level = (java.lang.Integer) values[5];
		_weakLabel = (java.lang.String) values[6];
		_goodLabel = (java.lang.String) values[7];
		_strongLabel = (java.lang.String) values[8];
		_onshow = (java.lang.String) values[9];
		_onhide = (java.lang.String) values[10];
		_autocomplete = (java.lang.Boolean) values[11];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}