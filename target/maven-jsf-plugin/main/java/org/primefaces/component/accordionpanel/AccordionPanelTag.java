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
package org.primefaces.component.accordionpanel;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class AccordionPanelTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _activeIndex;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _disabled;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _autoHeight;
	private javax.el.ValueExpression _collapsible;
	private javax.el.ValueExpression _fillSpace;
	private javax.el.ValueExpression _event;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._activeIndex = null;
		this._style = null;
		this._styleClass = null;
		this._disabled = null;
		this._effect = null;
		this._autoHeight = null;
		this._collapsible = null;
		this._fillSpace = null;
		this._event = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.accordionpanel.AccordionPanel component = null;
		try {
			component = (org.primefaces.component.accordionpanel.AccordionPanel) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_activeIndex != null) {
			component.setValueExpression("activeIndex", _activeIndex);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_disabled != null) {
			component.setValueExpression("disabled", _disabled);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_autoHeight != null) {
			component.setValueExpression("autoHeight", _autoHeight);
		}
		if(_collapsible != null) {
			component.setValueExpression("collapsible", _collapsible);
		}
		if(_fillSpace != null) {
			component.setValueExpression("fillSpace", _fillSpace);
		}
		if(_event != null) {
			component.setValueExpression("event", _event);
		}
	}

	public String getComponentType() {
		return AccordionPanel.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.AccordionPanelRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setActiveIndex(javax.el.ValueExpression expression){
		this._activeIndex = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setDisabled(javax.el.ValueExpression expression){
		this._disabled = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setAutoHeight(javax.el.ValueExpression expression){
		this._autoHeight = expression;
	}

	public void setCollapsible(javax.el.ValueExpression expression){
		this._collapsible = expression;
	}

	public void setFillSpace(javax.el.ValueExpression expression){
		this._fillSpace = expression;
	}

	public void setEvent(javax.el.ValueExpression expression){
		this._event = expression;
	}

}