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
package org.primefaces.component.progressbar;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class ProgressBar extends UIComponentBase {


	public static final String COMPONENT_TYPE = "org.primefaces.component.ProgressBar";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.ProgressBarRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Integer _value;
	private java.lang.Boolean _disabled;
	private java.lang.Boolean _ajax;
	private java.lang.Integer _interval;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.String _onCompleteUpdate;
	private javax.el.MethodExpression _completeListener;
	private java.lang.String _onCancelUpdate;
	private javax.el.MethodExpression _cancelListener;
	public ProgressBar() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.progressbar.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/progressbar/progressbar.js");
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

	public int getValue() {
		if(_value != null )
			return _value;

		ValueExpression ve = getValueExpression("value");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 0;
	}
	public void setValue(int _value) {
		this._value = _value;
	}

	public boolean isDisabled() {
		if(_disabled != null )
			return _disabled;

		ValueExpression ve = getValueExpression("disabled");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDisabled(boolean _disabled) {
		this._disabled = _disabled;
	}

	public boolean isAjax() {
		if(_ajax != null )
			return _ajax;

		ValueExpression ve = getValueExpression("ajax");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setAjax(boolean _ajax) {
		this._ajax = _ajax;
	}

	public int getInterval() {
		if(_interval != null )
			return _interval;

		ValueExpression ve = getValueExpression("interval");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 3000;
	}
	public void setInterval(int _interval) {
		this._interval = _interval;
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

	public java.lang.String getOnCompleteUpdate() {
		if(_onCompleteUpdate != null )
			return _onCompleteUpdate;

		ValueExpression ve = getValueExpression("onCompleteUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnCompleteUpdate(java.lang.String _onCompleteUpdate) {
		this._onCompleteUpdate = _onCompleteUpdate;
	}

	public javax.el.MethodExpression getCompleteListener() {
		return this._completeListener;
	}

	public void setCompleteListener(javax.el.MethodExpression _completeListener) {
		this._completeListener = _completeListener;
	}
	public java.lang.String getOnCancelUpdate() {
		if(_onCancelUpdate != null )
			return _onCancelUpdate;

		ValueExpression ve = getValueExpression("onCancelUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnCancelUpdate(java.lang.String _onCancelUpdate) {
		this._onCancelUpdate = _onCancelUpdate;
	}

	public javax.el.MethodExpression getCancelListener() {
		return this._cancelListener;
	}

	public void setCancelListener(javax.el.MethodExpression _cancelListener) {
		this._cancelListener = _cancelListener;
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[12];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _value;
		values[3] = _disabled;
		values[4] = _ajax;
		values[5] = _interval;
		values[6] = _style;
		values[7] = _styleClass;
		values[8] = _onCompleteUpdate;
		values[9] = _completeListener;
		values[10] = _onCancelUpdate;
		values[11] = _cancelListener;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_value = (java.lang.Integer) values[2];
		_disabled = (java.lang.Boolean) values[3];
		_ajax = (java.lang.Boolean) values[4];
		_interval = (java.lang.Integer) values[5];
		_style = (java.lang.String) values[6];
		_styleClass = (java.lang.String) values[7];
		_onCompleteUpdate = (java.lang.String) values[8];
		_completeListener = (javax.el.MethodExpression) values[9];
		_onCancelUpdate = (java.lang.String) values[10];
		_cancelListener = (javax.el.MethodExpression) values[11];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}