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
package org.primefaces.component.picklist;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import org.primefaces.model.DualListModel;
import org.primefaces.util.MessageFactory;
import javax.faces.application.FacesMessage;


public class PickList extends UIInput {


	public static final String COMPONENT_TYPE = "org.primefaces.component.PickList";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.PickListRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _var;
	private java.lang.String _itemLabel;
	private java.lang.Object _itemValue;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	public PickList() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/picklist/picklist.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/picklist/picklist.js");
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

	public java.lang.String getVar() {
		if(_var != null )
			return _var;

		ValueExpression ve = getValueExpression("var");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setVar(java.lang.String _var) {
		this._var = _var;
	}

	public java.lang.String getItemLabel() {
		if(_itemLabel != null )
			return _itemLabel;

		ValueExpression ve = getValueExpression("itemLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setItemLabel(java.lang.String _itemLabel) {
		this._itemLabel = _itemLabel;
	}

	public java.lang.Object getItemValue() {
		if(_itemValue != null )
			return _itemValue;

		ValueExpression ve = getValueExpression("itemValue");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setItemValue(java.lang.Object _itemValue) {
		this._itemValue = _itemValue;
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


	protected void validateValue(FacesContext facesContext, Object newValue) {
		super.validateValue(facesContext, newValue);
		
		DualListModel model = (DualListModel) newValue;
		if(isRequired() && model.getTarget().isEmpty()) {
			String requiredMessage = getRequiredMessage();
			FacesMessage message = null;
			
			if(requiredMessage != null)
				message = new FacesMessage(FacesMessage.SEVERITY_ERROR, requiredMessage, requiredMessage);
	        else
	        	message = MessageFactory.getMessage(REQUIRED_MESSAGE_ID, FacesMessage.SEVERITY_ERROR, new Object[]{getClientId(facesContext)});

			facesContext.addMessage(getClientId(facesContext), message);
	        setValid(false);
		}
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[7];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _var;
		values[3] = _itemLabel;
		values[4] = _itemValue;
		values[5] = _style;
		values[6] = _styleClass;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_var = (java.lang.String) values[2];
		_itemLabel = (java.lang.String) values[3];
		_itemValue = (java.lang.Object) values[4];
		_style = (java.lang.String) values[5];
		_styleClass = (java.lang.String) values[6];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}