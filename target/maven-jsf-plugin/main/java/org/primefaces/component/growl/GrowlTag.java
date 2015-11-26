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
package org.primefaces.component.growl;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class GrowlTag extends UIComponentELTag {

	private javax.el.ValueExpression _sticky;
	private javax.el.ValueExpression _showSummary;
	private javax.el.ValueExpression _showDetail;
	private javax.el.ValueExpression _globalOnly;
	private javax.el.ValueExpression _life;
	private javax.el.ValueExpression _warnIcon;
	private javax.el.ValueExpression _infoIcon;
	private javax.el.ValueExpression _errorIcon;
	private javax.el.ValueExpression _fatalIcon;

	public void release(){
		super.release();
		this._sticky = null;
		this._showSummary = null;
		this._showDetail = null;
		this._globalOnly = null;
		this._life = null;
		this._warnIcon = null;
		this._infoIcon = null;
		this._errorIcon = null;
		this._fatalIcon = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.growl.Growl component = null;
		try {
			component = (org.primefaces.component.growl.Growl) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_sticky != null) {
			component.setValueExpression("sticky", _sticky);
		}
		if(_showSummary != null) {
			component.setValueExpression("showSummary", _showSummary);
		}
		if(_showDetail != null) {
			component.setValueExpression("showDetail", _showDetail);
		}
		if(_globalOnly != null) {
			component.setValueExpression("globalOnly", _globalOnly);
		}
		if(_life != null) {
			component.setValueExpression("life", _life);
		}
		if(_warnIcon != null) {
			component.setValueExpression("warnIcon", _warnIcon);
		}
		if(_infoIcon != null) {
			component.setValueExpression("infoIcon", _infoIcon);
		}
		if(_errorIcon != null) {
			component.setValueExpression("errorIcon", _errorIcon);
		}
		if(_fatalIcon != null) {
			component.setValueExpression("fatalIcon", _fatalIcon);
		}
	}

	public String getComponentType() {
		return Growl.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.GrowlRenderer";
	}

	public void setSticky(javax.el.ValueExpression expression){
		this._sticky = expression;
	}

	public void setShowSummary(javax.el.ValueExpression expression){
		this._showSummary = expression;
	}

	public void setShowDetail(javax.el.ValueExpression expression){
		this._showDetail = expression;
	}

	public void setGlobalOnly(javax.el.ValueExpression expression){
		this._globalOnly = expression;
	}

	public void setLife(javax.el.ValueExpression expression){
		this._life = expression;
	}

	public void setWarnIcon(javax.el.ValueExpression expression){
		this._warnIcon = expression;
	}

	public void setInfoIcon(javax.el.ValueExpression expression){
		this._infoIcon = expression;
	}

	public void setErrorIcon(javax.el.ValueExpression expression){
		this._errorIcon = expression;
	}

	public void setFatalIcon(javax.el.ValueExpression expression){
		this._fatalIcon = expression;
	}

}