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
package org.primefaces.component.breadcrumb;

import org.primefaces.component.menu.AbstractMenu;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class BreadCrumb extends AbstractMenu {


	public static final String COMPONENT_TYPE = "org.primefaces.component.BreadCrumb";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.BreadCrumbRenderer";

	private org.primefaces.model.MenuModel _model;
	private java.lang.Integer _expandedEndItems;
	private java.lang.Integer _expandedBeginningItems;
	private java.lang.Integer _expandEffectDuration;
	private java.lang.Integer _collapseEffectDuration;
	private java.lang.Integer _initialCollapseEffectDuration;
	private java.lang.Integer _previewWidth;
	private java.lang.Boolean _preview;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	public BreadCrumb() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/breadcrumb/breadcrumb.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/breadcrumb/breadcrumb.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public org.primefaces.model.MenuModel getModel() {
		if(_model != null )
			return _model;

		ValueExpression ve = getValueExpression("model");
		return ve != null ? (org.primefaces.model.MenuModel) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setModel(org.primefaces.model.MenuModel _model) {
		this._model = _model;
	}

	public int getExpandedEndItems() {
		if(_expandedEndItems != null )
			return _expandedEndItems;

		ValueExpression ve = getValueExpression("expandedEndItems");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1;
	}
	public void setExpandedEndItems(int _expandedEndItems) {
		this._expandedEndItems = _expandedEndItems;
	}

	public int getExpandedBeginningItems() {
		if(_expandedBeginningItems != null )
			return _expandedBeginningItems;

		ValueExpression ve = getValueExpression("expandedBeginningItems");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1;
	}
	public void setExpandedBeginningItems(int _expandedBeginningItems) {
		this._expandedBeginningItems = _expandedBeginningItems;
	}

	public int getExpandEffectDuration() {
		if(_expandEffectDuration != null )
			return _expandEffectDuration;

		ValueExpression ve = getValueExpression("expandEffectDuration");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 800;
	}
	public void setExpandEffectDuration(int _expandEffectDuration) {
		this._expandEffectDuration = _expandEffectDuration;
	}

	public int getCollapseEffectDuration() {
		if(_collapseEffectDuration != null )
			return _collapseEffectDuration;

		ValueExpression ve = getValueExpression("collapseEffectDuration");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 500;
	}
	public void setCollapseEffectDuration(int _collapseEffectDuration) {
		this._collapseEffectDuration = _collapseEffectDuration;
	}

	public int getInitialCollapseEffectDuration() {
		if(_initialCollapseEffectDuration != null )
			return _initialCollapseEffectDuration;

		ValueExpression ve = getValueExpression("initialCollapseEffectDuration");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 600;
	}
	public void setInitialCollapseEffectDuration(int _initialCollapseEffectDuration) {
		this._initialCollapseEffectDuration = _initialCollapseEffectDuration;
	}

	public int getPreviewWidth() {
		if(_previewWidth != null )
			return _previewWidth;

		ValueExpression ve = getValueExpression("previewWidth");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 5;
	}
	public void setPreviewWidth(int _previewWidth) {
		this._previewWidth = _previewWidth;
	}

	public boolean isPreview() {
		if(_preview != null )
			return _preview;

		ValueExpression ve = getValueExpression("preview");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setPreview(boolean _preview) {
		this._preview = _preview;
	}

	public java.lang.String getStyle() {
		if(_style != null )
			return _style;

		ValueExpression ve = getValueExpression("style");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStyle(java.lang.String _style) {
		this._style = _style;
	}

	public java.lang.String getStyleClass() {
		if(_styleClass != null )
			return _styleClass;

		ValueExpression ve = getValueExpression("styleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStyleClass(java.lang.String _styleClass) {
		this._styleClass = _styleClass;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[11];
		values[0] = super.saveState(context);
		values[1] = _model;
		values[2] = _expandedEndItems;
		values[3] = _expandedBeginningItems;
		values[4] = _expandEffectDuration;
		values[5] = _collapseEffectDuration;
		values[6] = _initialCollapseEffectDuration;
		values[7] = _previewWidth;
		values[8] = _preview;
		values[9] = _style;
		values[10] = _styleClass;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_model = (org.primefaces.model.MenuModel) values[1];
		_expandedEndItems = (java.lang.Integer) values[2];
		_expandedBeginningItems = (java.lang.Integer) values[3];
		_expandEffectDuration = (java.lang.Integer) values[4];
		_collapseEffectDuration = (java.lang.Integer) values[5];
		_initialCollapseEffectDuration = (java.lang.Integer) values[6];
		_previewWidth = (java.lang.Integer) values[7];
		_preview = (java.lang.Boolean) values[8];
		_style = (java.lang.String) values[9];
		_styleClass = (java.lang.String) values[10];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}