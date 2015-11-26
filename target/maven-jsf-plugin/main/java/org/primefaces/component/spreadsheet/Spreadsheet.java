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
package org.primefaces.component.spreadsheet;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Spreadsheet extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Spreadsheet";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.SpreadsheetRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _title;
	private java.lang.Boolean _editable;
	private java.lang.Integer _columnWidth;
	public Spreadsheet() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/sheet/jquery.sheet.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/sheet/jquery.sheet.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/sheet/sheet.js");
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

	public java.lang.String getTitle() {
		if(_title != null )
			return _title;

		ValueExpression ve = getValueExpression("title");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setTitle(java.lang.String _title) {
		this._title = _title;
	}

	public boolean isEditable() {
		if(_editable != null )
			return _editable;

		ValueExpression ve = getValueExpression("editable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setEditable(boolean _editable) {
		this._editable = _editable;
	}

	public int getColumnWidth() {
		if(_columnWidth != null )
			return _columnWidth;

		ValueExpression ve = getValueExpression("columnWidth");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : java.lang.Integer.MIN_VALUE;
	}
	public void setColumnWidth(int _columnWidth) {
		this._columnWidth = _columnWidth;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[5];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _title;
		values[3] = _editable;
		values[4] = _columnWidth;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_title = (java.lang.String) values[2];
		_editable = (java.lang.Boolean) values[3];
		_columnWidth = (java.lang.Integer) values[4];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}