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

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import org.primefaces.event.FileUploadEvent;


public class FileUpload extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.FileUpload";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.FileUploadRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _update;
	private javax.el.MethodExpression _fileUploadListener;
	private java.lang.Boolean _multiple;
	private java.lang.Boolean _auto;
	private java.lang.String _label;
	private java.lang.String _image;
	private java.lang.String _cancelImage;
	private java.lang.String _width;
	private java.lang.String _height;
	private java.lang.String _allowTypes;
	private java.lang.String _description;
	private java.lang.Long _sizeLimit;
	private java.lang.String _wmode;
	private java.lang.Boolean _customUI;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	public FileUpload() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/uploadify/uploadify.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/cookie/cookie-min.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/uploadify/swfobject.js");
			resourceHolder.addResource("/jquery/plugins/uploadify/jquery.uploadify.v2.1.0.min.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/uploader/uploader.js");
		}
	}

	public String getFamily() {
		return COMPONENT_FAMILY;
	}

	public java.lang.String getWidgetVar() {
		if(_widgetVar != null )
			return _widgetVar;

		ValueExpression ve = getValueExpression("widgetVar");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setWidgetVar(java.lang.String _widgetVar) {
		this._widgetVar = _widgetVar;
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

	public javax.el.MethodExpression getFileUploadListener() {
		return this._fileUploadListener;
	}

	public void setFileUploadListener(javax.el.MethodExpression _fileUploadListener) {
		this._fileUploadListener = _fileUploadListener;
	}
	public boolean isMultiple() {
		if(_multiple != null )
			return _multiple;

		ValueExpression ve = getValueExpression("multiple");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setMultiple(boolean _multiple) {
		this._multiple = _multiple;
	}

	public boolean isAuto() {
		if(_auto != null )
			return _auto;

		ValueExpression ve = getValueExpression("auto");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setAuto(boolean _auto) {
		this._auto = _auto;
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

	public java.lang.String getImage() {
		if(_image != null )
			return _image;

		ValueExpression ve = getValueExpression("image");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setImage(java.lang.String _image) {
		this._image = _image;
	}

	public java.lang.String getCancelImage() {
		if(_cancelImage != null )
			return _cancelImage;

		ValueExpression ve = getValueExpression("cancelImage");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setCancelImage(java.lang.String _cancelImage) {
		this._cancelImage = _cancelImage;
	}

	public java.lang.String getWidth() {
		if(_width != null )
			return _width;

		ValueExpression ve = getValueExpression("width");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setWidth(java.lang.String _width) {
		this._width = _width;
	}

	public java.lang.String getHeight() {
		if(_height != null )
			return _height;

		ValueExpression ve = getValueExpression("height");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setHeight(java.lang.String _height) {
		this._height = _height;
	}

	public java.lang.String getAllowTypes() {
		if(_allowTypes != null )
			return _allowTypes;

		ValueExpression ve = getValueExpression("allowTypes");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setAllowTypes(java.lang.String _allowTypes) {
		this._allowTypes = _allowTypes;
	}

	public java.lang.String getDescription() {
		if(_description != null )
			return _description;

		ValueExpression ve = getValueExpression("description");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setDescription(java.lang.String _description) {
		this._description = _description;
	}

	public java.lang.Long getSizeLimit() {
		if(_sizeLimit != null )
			return _sizeLimit;

		ValueExpression ve = getValueExpression("sizeLimit");
		return ve != null ? (java.lang.Long) ve.getValue(getFacesContext().getELContext())  : java.lang.Long.MAX_VALUE;
	}
	public void setSizeLimit(java.lang.Long _sizeLimit) {
		this._sizeLimit = _sizeLimit;
	}

	public java.lang.String getWmode() {
		if(_wmode != null )
			return _wmode;

		ValueExpression ve = getValueExpression("wmode");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setWmode(java.lang.String _wmode) {
		this._wmode = _wmode;
	}

	public boolean isCustomUI() {
		if(_customUI != null )
			return _customUI;

		ValueExpression ve = getValueExpression("customUI");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setCustomUI(boolean _customUI) {
		this._customUI = _customUI;
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


	private String inputFileId;

	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		MethodExpression me = getFileUploadListener();
		
		if (me != null) {
			me.invoke(facesContext.getELContext(), new Object[] {event});
		}
	}
	
	String getInputFileId(FacesContext facesContext) {
		if(inputFileId == null) {
			inputFileId = this.getClientId(facesContext).replaceAll(":", "_") + "_file";
		}
		
		return inputFileId;
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[18];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _update;
		values[3] = _fileUploadListener;
		values[4] = _multiple;
		values[5] = _auto;
		values[6] = _label;
		values[7] = _image;
		values[8] = _cancelImage;
		values[9] = _width;
		values[10] = _height;
		values[11] = _allowTypes;
		values[12] = _description;
		values[13] = _sizeLimit;
		values[14] = _wmode;
		values[15] = _customUI;
		values[16] = _style;
		values[17] = _styleClass;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_update = (java.lang.String) values[2];
		_fileUploadListener = (javax.el.MethodExpression) values[3];
		_multiple = (java.lang.Boolean) values[4];
		_auto = (java.lang.Boolean) values[5];
		_label = (java.lang.String) values[6];
		_image = (java.lang.String) values[7];
		_cancelImage = (java.lang.String) values[8];
		_width = (java.lang.String) values[9];
		_height = (java.lang.String) values[10];
		_allowTypes = (java.lang.String) values[11];
		_description = (java.lang.String) values[12];
		_sizeLimit = (java.lang.Long) values[13];
		_wmode = (java.lang.String) values[14];
		_customUI = (java.lang.Boolean) values[15];
		_style = (java.lang.String) values[16];
		_styleClass = (java.lang.String) values[17];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}