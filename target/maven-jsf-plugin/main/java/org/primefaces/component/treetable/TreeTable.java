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
package org.primefaces.component.treetable;

import javax.faces.component.UIData;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import org.primefaces.model.TreeTableModel;
import org.primefaces.model.TreeNode;
import javax.faces.model.DataModel;


public class TreeTable extends UIData {


	public static final String COMPONENT_TYPE = "org.primefaces.component.TreeTable";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.TreeTableRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.Boolean _readOnly;
	private java.lang.Boolean _expanded;
	public TreeTable() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/treetable/style/treetable.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/treetable/treetable.js");
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

	public boolean isReadOnly() {
		if(_readOnly != null )
			return _readOnly;

		ValueExpression ve = getValueExpression("readOnly");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setReadOnly(boolean _readOnly) {
		this._readOnly = _readOnly;
	}

	public boolean isExpanded() {
		if(_expanded != null )
			return _expanded;

		ValueExpression ve = getValueExpression("expanded");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setExpanded(boolean _expanded) {
		this._expanded = _expanded;
	}


	public final static String CONTAINER_CLASS = "ui-treetable ui-widget ui-widget-content";
	public final static String HEADER_CLASS = "ui-treetable-header";
	public final static String HEADER_LABEL_CLASS = "ui-treetable-header-label";
	public final static String DATA_CLASS = "ui-treetable-data";

	public String getEscapedClientId(FacesContext facesContext) {
		return this.getClientId(facesContext).replaceAll(":", "_");
	}
	
	private TreeTableModel model;
	
	@Override
	protected DataModel getDataModel() {
		if(model == null) {
			model = new TreeTableModel((TreeNode) getValue());
		}
		
		return model;
	}
	
	@Override
	protected void setDataModel(DataModel model) {
		this.model = (TreeTableModel) model;
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[6];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _style;
		values[3] = _styleClass;
		values[4] = _readOnly;
		values[5] = _expanded;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_style = (java.lang.String) values[2];
		_styleClass = (java.lang.String) values[3];
		_readOnly = (java.lang.Boolean) values[4];
		_expanded = (java.lang.Boolean) values[5];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}