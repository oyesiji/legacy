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
package org.primefaces.touch.component.application;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Application extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.touch.Application";
	public static final String COMPONENT_FAMILY = "org.primefaces.touch";
	private static final String DEFAULT_RENDERER = "org.primefaces.touch.component.ApplicationRenderer";

	private java.lang.String _theme;
	private java.lang.String _icon;
	public Application() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/jqtouch/jqtouch.min.js");
			resourceHolder.addResource("/jquery/plugins/jqtouch/jqtouch.transitions.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/touch/touchfaces.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getTheme() {
		if(_theme != null )
			return _theme;

		ValueExpression ve = getValueExpression("theme");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "default";
	}
	public void setTheme(java.lang.String _theme) {
		this._theme = _theme;
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


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[3];
		values[0] = super.saveState(context);
		values[1] = _theme;
		values[2] = _icon;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_theme = (java.lang.String) values[1];
		_icon = (java.lang.String) values[2];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}