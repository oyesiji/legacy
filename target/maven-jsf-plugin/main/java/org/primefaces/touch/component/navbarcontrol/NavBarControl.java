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
package org.primefaces.touch.component.navbarcontrol;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class NavBarControl extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.touch.NavBarControl";
	public static final String COMPONENT_FAMILY = "org.primefaces.touch";

	private java.lang.String _label;
	private java.lang.String _view;
	private java.lang.String _type;
	private java.lang.String _effect;
	public NavBarControl() {
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

	public java.lang.String getView() {
		if(_view != null )
			return _view;

		ValueExpression ve = getValueExpression("view");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setView(java.lang.String _view) {
		this._view = _view;
	}

	public java.lang.String getType() {
		if(_type != null )
			return _type;

		ValueExpression ve = getValueExpression("type");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "back";
	}
	public void setType(java.lang.String _type) {
		this._type = _type;
	}

	public java.lang.String getEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setEffect(java.lang.String _effect) {
		this._effect = _effect;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[5];
		values[0] = super.saveState(context);
		values[1] = _label;
		values[2] = _view;
		values[3] = _type;
		values[4] = _effect;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_label = (java.lang.String) values[1];
		_view = (java.lang.String) values[2];
		_type = (java.lang.String) values[3];
		_effect = (java.lang.String) values[4];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}