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

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import java.util.Map;
import org.primefaces.util.Constants;


public class TabView extends UIComponentBase implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.component.TabView";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.TabViewRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Integer _activeIndex;
	private java.lang.String _effect;
	private java.lang.String _effectDuration;
	private java.lang.Boolean _dynamic;
	private java.lang.Boolean _cache;
	private java.lang.Boolean _collapsible;
	private java.lang.String _event;
	public TabView() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.tabs.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/tabview/tabview.js");
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

	public int getActiveIndex() {
		if(_activeIndex != null )
			return _activeIndex;

		ValueExpression ve = getValueExpression("activeIndex");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 0;
	}
	public void setActiveIndex(int _activeIndex) {
		this._activeIndex = _activeIndex;
	}

	public java.lang.String getEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setEffect(java.lang.String _effect) {
		this._effect = _effect;
	}

	public java.lang.String getEffectDuration() {
		if(_effectDuration != null )
			return _effectDuration;

		ValueExpression ve = getValueExpression("effectDuration");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "normal";
	}
	public void setEffectDuration(java.lang.String _effectDuration) {
		this._effectDuration = _effectDuration;
	}

	public boolean isDynamic() {
		if(_dynamic != null )
			return _dynamic;

		ValueExpression ve = getValueExpression("dynamic");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setDynamic(boolean _dynamic) {
		this._dynamic = _dynamic;
	}

	public boolean isCache() {
		if(_cache != null )
			return _cache;

		ValueExpression ve = getValueExpression("cache");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setCache(boolean _cache) {
		this._cache = _cache;
	}

	public boolean isCollapsible() {
		if(_collapsible != null )
			return _collapsible;

		ValueExpression ve = getValueExpression("collapsible");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setCollapsible(boolean _collapsible) {
		this._collapsible = _collapsible;
	}

	public java.lang.String getEvent() {
		if(_event != null )
			return _event;

		ValueExpression ve = getValueExpression("event");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setEvent(java.lang.String _event) {
		this._event = _event;
	}


	/**
	 * Process only tabview if it's a tabswitch request
	 */
	public void processDecodes(FacesContext facesContext) {
		Map<String,String> params = facesContext.getExternalContext().getRequestParameterMap();
		String ajaxSourceValue = params.get(Constants.PARTIAL_SOURCE_PARAM);
		
		//TabSwitch Request
		if(ajaxSourceValue != null && ajaxSourceValue.equals(getClientId(facesContext))) {
			 decode(facesContext);
			 facesContext.renderResponse();
		} else {
			super.processDecodes(facesContext);
		}
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}

	public void encodePartially(FacesContext facesContext) throws IOException {
		Renderer renderer = getRenderer(facesContext);

		if(renderer instanceof PartialRenderer) {
			((PartialRenderer)renderer).encodePartially(facesContext, this);
		}
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[9];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _activeIndex;
		values[3] = _effect;
		values[4] = _effectDuration;
		values[5] = _dynamic;
		values[6] = _cache;
		values[7] = _collapsible;
		values[8] = _event;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_activeIndex = (java.lang.Integer) values[2];
		_effect = (java.lang.String) values[3];
		_effectDuration = (java.lang.String) values[4];
		_dynamic = (java.lang.Boolean) values[5];
		_cache = (java.lang.Boolean) values[6];
		_collapsible = (java.lang.Boolean) values[7];
		_event = (java.lang.String) values[8];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}