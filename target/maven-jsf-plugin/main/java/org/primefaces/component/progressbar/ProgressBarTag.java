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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class ProgressBarTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _disabled;
	private javax.el.ValueExpression _ajax;
	private javax.el.ValueExpression _interval;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _onCompleteUpdate;
	private javax.el.MethodExpression _completeListener;
	private javax.el.ValueExpression _onCancelUpdate;
	private javax.el.MethodExpression _cancelListener;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._value = null;
		this._disabled = null;
		this._ajax = null;
		this._interval = null;
		this._style = null;
		this._styleClass = null;
		this._onCompleteUpdate = null;
		this._completeListener = null;
		this._onCancelUpdate = null;
		this._cancelListener = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.progressbar.ProgressBar component = null;
		try {
			component = (org.primefaces.component.progressbar.ProgressBar) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_disabled != null) {
			component.setValueExpression("disabled", _disabled);
		}
		if(_ajax != null) {
			component.setValueExpression("ajax", _ajax);
		}
		if(_interval != null) {
			component.setValueExpression("interval", _interval);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_onCompleteUpdate != null) {
			component.setValueExpression("onCompleteUpdate", _onCompleteUpdate);
		}
		if(_completeListener != null) {
			component.setCompleteListener(_completeListener);
		}
		if(_onCancelUpdate != null) {
			component.setValueExpression("onCancelUpdate", _onCancelUpdate);
		}
		if(_cancelListener != null) {
			component.setCancelListener(_cancelListener);
		}
	}

	public String getComponentType() {
		return ProgressBar.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.ProgressBarRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setDisabled(javax.el.ValueExpression expression){
		this._disabled = expression;
	}

	public void setAjax(javax.el.ValueExpression expression){
		this._ajax = expression;
	}

	public void setInterval(javax.el.ValueExpression expression){
		this._interval = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setOnCompleteUpdate(javax.el.ValueExpression expression){
		this._onCompleteUpdate = expression;
	}

	public void setCompleteListener(javax.el.MethodExpression expression){
		this._completeListener = expression;
	}

	public void setOnCancelUpdate(javax.el.ValueExpression expression){
		this._onCancelUpdate = expression;
	}

	public void setCancelListener(javax.el.MethodExpression expression){
		this._cancelListener = expression;
	}

}