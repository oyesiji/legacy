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
package org.primefaces.component.tabview;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class TabViewTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _activeIndex;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _effectDuration;
	private javax.el.ValueExpression _dynamic;
	private javax.el.ValueExpression _cache;
	private javax.el.ValueExpression _collapsible;
	private javax.el.ValueExpression _event;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._activeIndex = null;
		this._effect = null;
		this._effectDuration = null;
		this._dynamic = null;
		this._cache = null;
		this._collapsible = null;
		this._event = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.tabview.TabView component = null;
		try {
			component = (org.primefaces.component.tabview.TabView) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_activeIndex != null) {
			component.setValueExpression("activeIndex", _activeIndex);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_effectDuration != null) {
			component.setValueExpression("effectDuration", _effectDuration);
		}
		if(_dynamic != null) {
			component.setValueExpression("dynamic", _dynamic);
		}
		if(_cache != null) {
			component.setValueExpression("cache", _cache);
		}
		if(_collapsible != null) {
			component.setValueExpression("collapsible", _collapsible);
		}
		if(_event != null) {
			component.setValueExpression("event", _event);
		}
	}

	public String getComponentType() {
		return TabView.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.TabViewRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setActiveIndex(javax.el.ValueExpression expression){
		this._activeIndex = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setEffectDuration(javax.el.ValueExpression expression){
		this._effectDuration = expression;
	}

	public void setDynamic(javax.el.ValueExpression expression){
		this._dynamic = expression;
	}

	public void setCache(javax.el.ValueExpression expression){
		this._cache = expression;
	}

	public void setCollapsible(javax.el.ValueExpression expression){
		this._collapsible = expression;
	}

	public void setEvent(javax.el.ValueExpression expression){
		this._event = expression;
	}

}