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
package org.primefaces.component.graphictext;

import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class GraphicText extends HtmlGraphicImage {


	public static final String COMPONENT_TYPE = "org.primefaces.component.graphictext";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.graphictext.GraphicTextRenderer";

	private java.lang.String _fontName;
	private java.lang.String _fontStyle;
	private java.lang.Integer _fontSize;
	public GraphicText() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getFontName() {
		if(_fontName != null )
			return _fontName;

		ValueExpression ve = getValueExpression("fontName");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "Verdana";
	}
	public void setFontName(java.lang.String _fontName) {
		this._fontName = _fontName;
	}

	public java.lang.String getFontStyle() {
		if(_fontStyle != null )
			return _fontStyle;

		ValueExpression ve = getValueExpression("fontStyle");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "plain";
	}
	public void setFontStyle(java.lang.String _fontStyle) {
		this._fontStyle = _fontStyle;
	}

	public int getFontSize() {
		if(_fontSize != null )
			return _fontSize;

		ValueExpression ve = getValueExpression("fontSize");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 12;
	}
	public void setFontSize(int _fontSize) {
		this._fontSize = _fontSize;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[4];
		values[0] = super.saveState(context);
		values[1] = _fontName;
		values[2] = _fontStyle;
		values[3] = _fontSize;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_fontName = (java.lang.String) values[1];
		_fontStyle = (java.lang.String) values[2];
		_fontSize = (java.lang.Integer) values[3];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}