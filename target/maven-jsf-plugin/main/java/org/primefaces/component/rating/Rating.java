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
package org.primefaces.component.rating;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import javax.faces.event.ActionEvent;


public class Rating extends UIInput {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Rating";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.RatingRenderer";

	private java.lang.Integer _stars;
	private javax.el.MethodExpression _rateListener;
	private java.lang.String _update;
	private java.lang.Boolean _disabled;
	public Rating() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/rating/jquery.rating.css");
			resourceHolder.addResource("/jquery/plugins/rating/jquery.rating.pack.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/rating/rating.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public int getStars() {
		if(_stars != null )
			return _stars;

		ValueExpression ve = getValueExpression("stars");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 5;
	}
	public void setStars(int _stars) {
		this._stars = _stars;
	}

	public javax.el.MethodExpression getRateListener() {
		return this._rateListener;
	}

	public void setRateListener(javax.el.MethodExpression _rateListener) {
		this._rateListener = _rateListener;
	}
	public java.lang.String getUpdate() {
		if(_update != null )
			return _update;

		ValueExpression ve = getValueExpression("update");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setUpdate(java.lang.String _update) {
		this._update = _update;
	}

	public boolean isDisabled() {
		if(_disabled != null )
			return _disabled;

		ValueExpression ve = getValueExpression("disabled");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDisabled(boolean _disabled) {
		this._disabled = _disabled;
	}


	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		MethodExpression me = getRateListener();
		
		if (me != null) {
			me.invoke(facesContext.getELContext(), new Object[] {event});
		}
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[5];
		values[0] = super.saveState(context);
		values[1] = _stars;
		values[2] = _rateListener;
		values[3] = _update;
		values[4] = _disabled;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_stars = (java.lang.Integer) values[1];
		_rateListener = (javax.el.MethodExpression) values[2];
		_update = (java.lang.String) values[3];
		_disabled = (java.lang.Boolean) values[4];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}