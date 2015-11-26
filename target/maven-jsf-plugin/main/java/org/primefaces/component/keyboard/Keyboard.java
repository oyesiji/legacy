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
package org.primefaces.component.keyboard;

import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Keyboard extends HtmlInputText {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Keyboard";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.KeyboardRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Boolean _password;
	private java.lang.String _showMode;
	private java.lang.String _buttonImage;
	private java.lang.Boolean _buttonImageOnly;
	private java.lang.String _effect;
	private java.lang.String _effectDuration;
	private java.lang.String _layout;
	private java.lang.String _layoutTemplate;
	private java.lang.Boolean _keypadOnly;
	private java.lang.String _promptLabel;
	private java.lang.String _closeLabel;
	private java.lang.String _clearLabel;
	private java.lang.String _backspaceLabel;
	public Keyboard() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/effects/effects.js");
			resourceHolder.addResource("/jquery/plugins/keyboard/keypad.css");
			resourceHolder.addResource("/jquery/plugins/keyboard/keypad.min.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/keyboard/keyboard.js");
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

	public boolean isPassword() {
		if(_password != null )
			return _password;

		ValueExpression ve = getValueExpression("password");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setPassword(boolean _password) {
		this._password = _password;
	}

	public java.lang.String getShowMode() {
		if(_showMode != null )
			return _showMode;

		ValueExpression ve = getValueExpression("showMode");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "focus";
	}
	public void setShowMode(java.lang.String _showMode) {
		this._showMode = _showMode;
	}

	public java.lang.String getButtonImage() {
		if(_buttonImage != null )
			return _buttonImage;

		ValueExpression ve = getValueExpression("buttonImage");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setButtonImage(java.lang.String _buttonImage) {
		this._buttonImage = _buttonImage;
	}

	public boolean isButtonImageOnly() {
		if(_buttonImageOnly != null )
			return _buttonImageOnly;

		ValueExpression ve = getValueExpression("buttonImageOnly");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setButtonImageOnly(boolean _buttonImageOnly) {
		this._buttonImageOnly = _buttonImageOnly;
	}

	public java.lang.String getEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "fadeIn";
	}
	public void setEffect(java.lang.String _effect) {
		this._effect = _effect;
	}

	public java.lang.String getEffectDuration() {
		if(_effectDuration != null )
			return _effectDuration;

		ValueExpression ve = getValueExpression("effectDuration");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setEffectDuration(java.lang.String _effectDuration) {
		this._effectDuration = _effectDuration;
	}

	public java.lang.String getLayout() {
		if(_layout != null )
			return _layout;

		ValueExpression ve = getValueExpression("layout");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "qwerty";
	}
	public void setLayout(java.lang.String _layout) {
		this._layout = _layout;
	}

	public java.lang.String getLayoutTemplate() {
		if(_layoutTemplate != null )
			return _layoutTemplate;

		ValueExpression ve = getValueExpression("layoutTemplate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setLayoutTemplate(java.lang.String _layoutTemplate) {
		this._layoutTemplate = _layoutTemplate;
	}

	public boolean isKeypadOnly() {
		if(_keypadOnly != null )
			return _keypadOnly;

		ValueExpression ve = getValueExpression("keypadOnly");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setKeypadOnly(boolean _keypadOnly) {
		this._keypadOnly = _keypadOnly;
	}

	public java.lang.String getPromptLabel() {
		if(_promptLabel != null )
			return _promptLabel;

		ValueExpression ve = getValueExpression("promptLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setPromptLabel(java.lang.String _promptLabel) {
		this._promptLabel = _promptLabel;
	}

	public java.lang.String getCloseLabel() {
		if(_closeLabel != null )
			return _closeLabel;

		ValueExpression ve = getValueExpression("closeLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setCloseLabel(java.lang.String _closeLabel) {
		this._closeLabel = _closeLabel;
	}

	public java.lang.String getClearLabel() {
		if(_clearLabel != null )
			return _clearLabel;

		ValueExpression ve = getValueExpression("clearLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setClearLabel(java.lang.String _clearLabel) {
		this._clearLabel = _clearLabel;
	}

	public java.lang.String getBackspaceLabel() {
		if(_backspaceLabel != null )
			return _backspaceLabel;

		ValueExpression ve = getValueExpression("backspaceLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setBackspaceLabel(java.lang.String _backspaceLabel) {
		this._backspaceLabel = _backspaceLabel;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[15];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _password;
		values[3] = _showMode;
		values[4] = _buttonImage;
		values[5] = _buttonImageOnly;
		values[6] = _effect;
		values[7] = _effectDuration;
		values[8] = _layout;
		values[9] = _layoutTemplate;
		values[10] = _keypadOnly;
		values[11] = _promptLabel;
		values[12] = _closeLabel;
		values[13] = _clearLabel;
		values[14] = _backspaceLabel;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_password = (java.lang.Boolean) values[2];
		_showMode = (java.lang.String) values[3];
		_buttonImage = (java.lang.String) values[4];
		_buttonImageOnly = (java.lang.Boolean) values[5];
		_effect = (java.lang.String) values[6];
		_effectDuration = (java.lang.String) values[7];
		_layout = (java.lang.String) values[8];
		_layoutTemplate = (java.lang.String) values[9];
		_keypadOnly = (java.lang.Boolean) values[10];
		_promptLabel = (java.lang.String) values[11];
		_closeLabel = (java.lang.String) values[12];
		_clearLabel = (java.lang.String) values[13];
		_backspaceLabel = (java.lang.String) values[14];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}