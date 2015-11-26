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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class BreadCrumbTag extends UIComponentELTag {

	private javax.el.ValueExpression _model;
	private javax.el.ValueExpression _expandedEndItems;
	private javax.el.ValueExpression _expandedBeginningItems;
	private javax.el.ValueExpression _expandEffectDuration;
	private javax.el.ValueExpression _collapseEffectDuration;
	private javax.el.ValueExpression _initialCollapseEffectDuration;
	private javax.el.ValueExpression _previewWidth;
	private javax.el.ValueExpression _preview;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;

	public void release(){
		super.release();
		this._model = null;
		this._expandedEndItems = null;
		this._expandedBeginningItems = null;
		this._expandEffectDuration = null;
		this._collapseEffectDuration = null;
		this._initialCollapseEffectDuration = null;
		this._previewWidth = null;
		this._preview = null;
		this._style = null;
		this._styleClass = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.breadcrumb.BreadCrumb component = null;
		try {
			component = (org.primefaces.component.breadcrumb.BreadCrumb) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_model != null) {
			component.setValueExpression("model", _model);
		}
		if(_expandedEndItems != null) {
			component.setValueExpression("expandedEndItems", _expandedEndItems);
		}
		if(_expandedBeginningItems != null) {
			component.setValueExpression("expandedBeginningItems", _expandedBeginningItems);
		}
		if(_expandEffectDuration != null) {
			component.setValueExpression("expandEffectDuration", _expandEffectDuration);
		}
		if(_collapseEffectDuration != null) {
			component.setValueExpression("collapseEffectDuration", _collapseEffectDuration);
		}
		if(_initialCollapseEffectDuration != null) {
			component.setValueExpression("initialCollapseEffectDuration", _initialCollapseEffectDuration);
		}
		if(_previewWidth != null) {
			component.setValueExpression("previewWidth", _previewWidth);
		}
		if(_preview != null) {
			component.setValueExpression("preview", _preview);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
	}

	public String getComponentType() {
		return BreadCrumb.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.BreadCrumbRenderer";
	}

	public void setModel(javax.el.ValueExpression expression){
		this._model = expression;
	}

	public void setExpandedEndItems(javax.el.ValueExpression expression){
		this._expandedEndItems = expression;
	}

	public void setExpandedBeginningItems(javax.el.ValueExpression expression){
		this._expandedBeginningItems = expression;
	}

	public void setExpandEffectDuration(javax.el.ValueExpression expression){
		this._expandEffectDuration = expression;
	}

	public void setCollapseEffectDuration(javax.el.ValueExpression expression){
		this._collapseEffectDuration = expression;
	}

	public void setInitialCollapseEffectDuration(javax.el.ValueExpression expression){
		this._initialCollapseEffectDuration = expression;
	}

	public void setPreviewWidth(javax.el.ValueExpression expression){
		this._previewWidth = expression;
	}

	public void setPreview(javax.el.ValueExpression expression){
		this._preview = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

}