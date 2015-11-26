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
package org.primefaces.component.themeswitcher;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class ThemeSwitcher extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.ThemeSwitcher";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.ThemeSwitcherRenderer";

	private java.lang.String _theme;
	private java.lang.Integer _width;
	private java.lang.Integer _height;
	private java.lang.Integer _buttonHeight;
	private java.lang.String _initialText;
	private java.lang.String _buttonPreText;
	public ThemeSwitcher() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/themeswitcher/themeswitcher.js");
			resourceHolder.addResource("/primefaces/core/core.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getTheme() {
		if(_theme != null )
			return _theme;

		ValueExpression ve = getValueExpression("theme");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setTheme(java.lang.String _theme) {
		this._theme = _theme;
	}

	public int getWidth() {
		if(_width != null )
			return _width;

		ValueExpression ve = getValueExpression("width");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 150;
	}
	public void setWidth(int _width) {
		this._width = _width;
	}

	public int getHeight() {
		if(_height != null )
			return _height;

		ValueExpression ve = getValueExpression("height");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 200;
	}
	public void setHeight(int _height) {
		this._height = _height;
	}

	public int getButtonHeight() {
		if(_buttonHeight != null )
			return _buttonHeight;

		ValueExpression ve = getValueExpression("buttonHeight");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 14;
	}
	public void setButtonHeight(int _buttonHeight) {
		this._buttonHeight = _buttonHeight;
	}

	public java.lang.String getInitialText() {
		if(_initialText != null )
			return _initialText;

		ValueExpression ve = getValueExpression("initialText");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setInitialText(java.lang.String _initialText) {
		this._initialText = _initialText;
	}

	public java.lang.String getButtonPreText() {
		if(_buttonPreText != null )
			return _buttonPreText;

		ValueExpression ve = getValueExpression("buttonPreText");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setButtonPreText(java.lang.String _buttonPreText) {
		this._buttonPreText = _buttonPreText;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[7];
		values[0] = super.saveState(context);
		values[1] = _theme;
		values[2] = _width;
		values[3] = _height;
		values[4] = _buttonHeight;
		values[5] = _initialText;
		values[6] = _buttonPreText;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_theme = (java.lang.String) values[1];
		_width = (java.lang.Integer) values[2];
		_height = (java.lang.Integer) values[3];
		_buttonHeight = (java.lang.Integer) values[4];
		_initialText = (java.lang.String) values[5];
		_buttonPreText = (java.lang.String) values[6];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}