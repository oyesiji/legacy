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
package org.primefaces.component.gmap;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class GMapInfoWindow extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.GMapInfoWindow";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";

	private java.lang.Integer _maxWidth;
	public GMapInfoWindow() {
		setRendererType(null);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public int getMaxWidth() {
		if(_maxWidth != null )
			return _maxWidth;

		ValueExpression ve = getValueExpression("maxWidth");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : java.lang.Integer.MIN_VALUE;
	}
	public void setMaxWidth(int _maxWidth) {
		this._maxWidth = _maxWidth;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[2];
		values[0] = super.saveState(context);
		values[1] = _maxWidth;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_maxWidth = (java.lang.Integer) values[1];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}