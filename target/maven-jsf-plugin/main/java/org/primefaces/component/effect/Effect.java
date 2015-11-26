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
package org.primefaces.component.effect;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Effect extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Effect";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.EffectRenderer";

	private java.lang.String _event;
	private java.lang.String _type;
	private java.lang.String _for;
	private java.lang.Integer _speed;
	public Effect() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/effects/effects.js");
			resourceHolder.addResource("/primefaces/core/core.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getEvent() {
		if(_event != null )
			return _event;

		ValueExpression ve = getValueExpression("event");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setEvent(java.lang.String _event) {
		this._event = _event;
	}

	public java.lang.String getType() {
		if(_type != null )
			return _type;

		ValueExpression ve = getValueExpression("type");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setType(java.lang.String _type) {
		this._type = _type;
	}

	public java.lang.String getFor() {
		if(_for != null )
			return _for;

		ValueExpression ve = getValueExpression("for");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setFor(java.lang.String _for) {
		this._for = _for;
	}

	public int getSpeed() {
		if(_speed != null )
			return _speed;

		ValueExpression ve = getValueExpression("speed");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1000;
	}
	public void setSpeed(int _speed) {
		this._speed = _speed;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[5];
		values[0] = super.saveState(context);
		values[1] = _event;
		values[2] = _type;
		values[3] = _for;
		values[4] = _speed;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_event = (java.lang.String) values[1];
		_type = (java.lang.String) values[2];
		_for = (java.lang.String) values[3];
		_speed = (java.lang.Integer) values[4];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}