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
package org.primefaces.component.tree;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class UITreeNodeTag extends UIComponentELTag {

	private javax.el.ValueExpression _type;
	private javax.el.ValueExpression _styleClass;

	public void release(){
		super.release();
		this._type = null;
		this._styleClass = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.tree.UITreeNode component = null;
		try {
			component = (org.primefaces.component.tree.UITreeNode) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_type != null) {
			component.setValueExpression("type", _type);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
	}

	public String getComponentType() {
		return UITreeNode.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return null;
	}

	public void setType(javax.el.ValueExpression expression){
		this._type = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

}