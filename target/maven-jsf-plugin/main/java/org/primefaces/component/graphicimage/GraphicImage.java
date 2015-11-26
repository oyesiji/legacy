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
package org.primefaces.component.graphicimage;

import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class GraphicImage extends HtmlGraphicImage {


	public static final String COMPONENT_TYPE = "org.primefaces.component.GraphicImage";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.GraphicImageRenderer";

	private java.lang.Boolean _cache;
	public GraphicImage() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public boolean isCache() {
		if(_cache != null )
			return _cache;

		ValueExpression ve = getValueExpression("cache");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setCache(boolean _cache) {
		this._cache = _cache;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[2];
		values[0] = super.saveState(context);
		values[1] = _cache;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_cache = (java.lang.Boolean) values[1];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}