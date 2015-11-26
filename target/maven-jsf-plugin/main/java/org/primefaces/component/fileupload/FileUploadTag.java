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
package org.primefaces.component.fileupload;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class FileUploadTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _update;
	private javax.el.MethodExpression _fileUploadListener;
	private javax.el.ValueExpression _multiple;
	private javax.el.ValueExpression _auto;
	private javax.el.ValueExpression _label;
	private javax.el.ValueExpression _image;
	private javax.el.ValueExpression _cancelImage;
	private javax.el.ValueExpression _width;
	private javax.el.ValueExpression _height;
	private javax.el.ValueExpression _allowTypes;
	private javax.el.ValueExpression _description;
	private javax.el.ValueExpression _sizeLimit;
	private javax.el.ValueExpression _wmode;
	private javax.el.ValueExpression _customUI;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._update = null;
		this._fileUploadListener = null;
		this._multiple = null;
		this._auto = null;
		this._label = null;
		this._image = null;
		this._cancelImage = null;
		this._width = null;
		this._height = null;
		this._allowTypes = null;
		this._description = null;
		this._sizeLimit = null;
		this._wmode = null;
		this._customUI = null;
		this._style = null;
		this._styleClass = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.fileupload.FileUpload component = null;
		try {
			component = (org.primefaces.component.fileupload.FileUpload) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_update != null) {
			component.setValueExpression("update", _update);
		}
		if(_fileUploadListener != null) {
			component.setFileUploadListener(_fileUploadListener);
		}
		if(_multiple != null) {
			component.setValueExpression("multiple", _multiple);
		}
		if(_auto != null) {
			component.setValueExpression("auto", _auto);
		}
		if(_label != null) {
			component.setValueExpression("label", _label);
		}
		if(_image != null) {
			component.setValueExpression("image", _image);
		}
		if(_cancelImage != null) {
			component.setValueExpression("cancelImage", _cancelImage);
		}
		if(_width != null) {
			component.setValueExpression("width", _width);
		}
		if(_height != null) {
			component.setValueExpression("height", _height);
		}
		if(_allowTypes != null) {
			component.setValueExpression("allowTypes", _allowTypes);
		}
		if(_description != null) {
			component.setValueExpression("description", _description);
		}
		if(_sizeLimit != null) {
			component.setValueExpression("sizeLimit", _sizeLimit);
		}
		if(_wmode != null) {
			component.setValueExpression("wmode", _wmode);
		}
		if(_customUI != null) {
			component.setValueExpression("customUI", _customUI);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
	}

	public String getComponentType() {
		return FileUpload.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.FileUploadRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setUpdate(javax.el.ValueExpression expression){
		this._update = expression;
	}

	public void setFileUploadListener(javax.el.MethodExpression expression){
		this._fileUploadListener = expression;
	}

	public void setMultiple(javax.el.ValueExpression expression){
		this._multiple = expression;
	}

	public void setAuto(javax.el.ValueExpression expression){
		this._auto = expression;
	}

	public void setLabel(javax.el.ValueExpression expression){
		this._label = expression;
	}

	public void setImage(javax.el.ValueExpression expression){
		this._image = expression;
	}

	public void setCancelImage(javax.el.ValueExpression expression){
		this._cancelImage = expression;
	}

	public void setWidth(javax.el.ValueExpression expression){
		this._width = expression;
	}

	public void setHeight(javax.el.ValueExpression expression){
		this._height = expression;
	}

	public void setAllowTypes(javax.el.ValueExpression expression){
		this._allowTypes = expression;
	}

	public void setDescription(javax.el.ValueExpression expression){
		this._description = expression;
	}

	public void setSizeLimit(javax.el.ValueExpression expression){
		this._sizeLimit = expression;
	}

	public void setWmode(javax.el.ValueExpression expression){
		this._wmode = expression;
	}

	public void setCustomUI(javax.el.ValueExpression expression){
		this._customUI = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

}