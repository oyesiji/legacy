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
package org.primefaces.component.message;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class MessageTag extends UIComponentELTag {

	private javax.el.ValueExpression _showSummary;
	private javax.el.ValueExpression _showDetail;
	private javax.el.ValueExpression _for;

	public void release(){
		super.release();
		this._showSummary = null;
		this._showDetail = null;
		this._for = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.message.Message component = null;
		try {
			component = (org.primefaces.component.message.Message) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_showSummary != null) {
			component.setValueExpression("showSummary", _showSummary);
		}
		if(_showDetail != null) {
			component.setValueExpression("showDetail", _showDetail);
		}
		if(_for != null) {
			component.setValueExpression("for", _for);
		}
	}

	public String getComponentType() {
		return Message.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.MessageRenderer";
	}

	public void setShowSummary(javax.el.ValueExpression expression){
		this._showSummary = expression;
	}

	public void setShowDetail(javax.el.ValueExpression expression){
		this._showDetail = expression;
	}

	public void setFor(javax.el.ValueExpression expression){
		this._for = expression;
	}

}