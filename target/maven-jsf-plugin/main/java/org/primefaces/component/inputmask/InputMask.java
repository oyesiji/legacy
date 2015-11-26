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
package org.primefaces.component.inputmask;

import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class InputMask extends HtmlInputText {


	public static final String COMPONENT_TYPE = "org.primefaces.component.InputMask";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.InputMaskRenderer";

	private java.lang.String _mask;
	private java.lang.String _placeHolder;
	public InputMask() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/inputmask/maskedinput.js");
			resourceHolder.addResource("/primefaces/core/core.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getMask() {
		if(_mask != null )
			return _mask;

		ValueExpression ve = getValueExpression("mask");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setMask(java.lang.String _mask) {
		this._mask = _mask;
	}

	public java.lang.String getPlaceHolder() {
		if(_placeHolder != null )
			return _placeHolder;

		ValueExpression ve = getValueExpression("placeHolder");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setPlaceHolder(java.lang.String _placeHolder) {
		this._placeHolder = _placeHolder;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[3];
		values[0] = super.saveState(context);
		values[1] = _mask;
		values[2] = _placeHolder;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_mask = (java.lang.String) values[1];
		_placeHolder = (java.lang.String) values[2];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}