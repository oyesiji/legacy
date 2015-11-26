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
package org.primefaces.component.colorpicker;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class ColorPicker extends UIInput {


	public static final String COMPONENT_TYPE = "org.primefaces.component.ColorPicker";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "corg.primefaces.component.ColorPickerRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _header;
	private java.lang.Boolean _showControls;
	private java.lang.Boolean _showHexControls;
	private java.lang.Boolean _showHexSummary;
	private java.lang.Boolean _showHsvControls;
	private java.lang.Boolean _showRGBControls;
	private java.lang.Boolean _showWebSafe;
	public ColorPicker() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.dialog.css");
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.button.css");
			resourceHolder.addResource("/yui/slider/assets/skins/sam/slider.css");
			resourceHolder.addResource("/yui/colorpicker/assets/skins/sam/colorpicker.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/slider/slider-min.js");
			resourceHolder.addResource("/yui/colorpicker/colorpicker-min.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/button/button.js");
			resourceHolder.addResource("/primefaces/colorpicker/colorpicker.js");
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

	public java.lang.String getHeader() {
		if(_header != null )
			return _header;

		ValueExpression ve = getValueExpression("header");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "Choose a color";
	}
	public void setHeader(java.lang.String _header) {
		this._header = _header;
	}

	public boolean isShowControls() {
		if(_showControls != null )
			return _showControls;

		ValueExpression ve = getValueExpression("showControls");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setShowControls(boolean _showControls) {
		this._showControls = _showControls;
	}

	public boolean isShowHexControls() {
		if(_showHexControls != null )
			return _showHexControls;

		ValueExpression ve = getValueExpression("showHexControls");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setShowHexControls(boolean _showHexControls) {
		this._showHexControls = _showHexControls;
	}

	public boolean isShowHexSummary() {
		if(_showHexSummary != null )
			return _showHexSummary;

		ValueExpression ve = getValueExpression("showHexSummary");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setShowHexSummary(boolean _showHexSummary) {
		this._showHexSummary = _showHexSummary;
	}

	public boolean isShowHsvControls() {
		if(_showHsvControls != null )
			return _showHsvControls;

		ValueExpression ve = getValueExpression("showHsvControls");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setShowHsvControls(boolean _showHsvControls) {
		this._showHsvControls = _showHsvControls;
	}

	public boolean isShowRGBControls() {
		if(_showRGBControls != null )
			return _showRGBControls;

		ValueExpression ve = getValueExpression("showRGBControls");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setShowRGBControls(boolean _showRGBControls) {
		this._showRGBControls = _showRGBControls;
	}

	public boolean isShowWebSafe() {
		if(_showWebSafe != null )
			return _showWebSafe;

		ValueExpression ve = getValueExpression("showWebSafe");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setShowWebSafe(boolean _showWebSafe) {
		this._showWebSafe = _showWebSafe;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[9];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _header;
		values[3] = _showControls;
		values[4] = _showHexControls;
		values[5] = _showHexSummary;
		values[6] = _showHsvControls;
		values[7] = _showRGBControls;
		values[8] = _showWebSafe;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_header = (java.lang.String) values[2];
		_showControls = (java.lang.Boolean) values[3];
		_showHexControls = (java.lang.Boolean) values[4];
		_showHexSummary = (java.lang.Boolean) values[5];
		_showHsvControls = (java.lang.Boolean) values[6];
		_showRGBControls = (java.lang.Boolean) values[7];
		_showWebSafe = (java.lang.Boolean) values[8];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}