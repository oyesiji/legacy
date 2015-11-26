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
package org.primefaces.touch.component.rowgroup;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class RowGroup extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.touch.RowGroup";
	public static final String COMPONENT_FAMILY = "org.primefaces.touch";
	private static final String DEFAULT_RENDERER = "org.primefaces.touch.component.RowGroupRenderer";

	private java.lang.String _title;
	private java.lang.String _display;
	public RowGroup() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getTitle() {
		if(_title != null )
			return _title;

		ValueExpression ve = getValueExpression("title");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setTitle(java.lang.String _title) {
		this._title = _title;
	}

	public java.lang.String getDisplay() {
		if(_display != null )
			return _display;

		ValueExpression ve = getValueExpression("display");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "rounded";
	}
	public void setDisplay(java.lang.String _display) {
		this._display = _display;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[3];
		values[0] = super.saveState(context);
		values[1] = _title;
		values[2] = _display;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_title = (java.lang.String) values[1];
		_display = (java.lang.String) values[2];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}