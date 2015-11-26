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
package org.primefaces.component.submenu;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Submenu extends UIComponentBase implements java.io.Serializable {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Submenu";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";

	private java.lang.String _label;
	private java.lang.String _labelStyle;
	private java.lang.String _labelStyleClass;
	public Submenu() {
		setRendererType(null);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getLabel() {
		if(_label != null )
			return _label;

		ValueExpression ve = getValueExpression("label");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setLabel(java.lang.String _label) {
		this._label = _label;
	}

	public java.lang.String getLabelStyle() {
		if(_labelStyle != null )
			return _labelStyle;

		ValueExpression ve = getValueExpression("labelStyle");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setLabelStyle(java.lang.String _labelStyle) {
		this._labelStyle = _labelStyle;
	}

	public java.lang.String getLabelStyleClass() {
		if(_labelStyleClass != null )
			return _labelStyleClass;

		ValueExpression ve = getValueExpression("labelStyleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setLabelStyleClass(java.lang.String _labelStyleClass) {
		this._labelStyleClass = _labelStyleClass;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[4];
		values[0] = super.saveState(context);
		values[1] = _label;
		values[2] = _labelStyle;
		values[3] = _labelStyleClass;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_label = (java.lang.String) values[1];
		_labelStyle = (java.lang.String) values[2];
		_labelStyleClass = (java.lang.String) values[3];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}