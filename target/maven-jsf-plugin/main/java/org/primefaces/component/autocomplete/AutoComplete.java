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
package org.primefaces.component.autocomplete;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class AutoComplete extends UIInput implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.component.AutoComplete";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.AutoCompleteRenderer";

	private java.lang.String _widgetVar;
	private javax.el.MethodExpression _completeMethod;
	private java.lang.String _var;
	private java.lang.String _itemLabel;
	private java.lang.Object _itemValue;
	private java.lang.Integer _maxResults;
	private java.lang.Integer _minQueryLength;
	private java.lang.Integer _queryDelay;
	private java.lang.Boolean _forceSelection;
	private javax.el.MethodExpression _selectListener;
	private java.lang.String _onSelectUpdate;
	private java.lang.String _onstart;
	private java.lang.String _oncomplete;
	private java.lang.Boolean _disabled;
	public AutoComplete() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.autocomplete.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/autocomplete/autocomplete.js");
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

	public javax.el.MethodExpression getCompleteMethod() {
		return this._completeMethod;
	}

	public void setCompleteMethod(javax.el.MethodExpression _completeMethod) {
		this._completeMethod = _completeMethod;
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

	public int getMaxResults() {
		if(_maxResults != null )
			return _maxResults;

		ValueExpression ve = getValueExpression("maxResults");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 10;
	}
	public void setMaxResults(int _maxResults) {
		this._maxResults = _maxResults;
	}

	public int getMinQueryLength() {
		if(_minQueryLength != null )
			return _minQueryLength;

		ValueExpression ve = getValueExpression("minQueryLength");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1;
	}
	public void setMinQueryLength(int _minQueryLength) {
		this._minQueryLength = _minQueryLength;
	}

	public int getQueryDelay() {
		if(_queryDelay != null )
			return _queryDelay;

		ValueExpression ve = getValueExpression("queryDelay");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 300;
	}
	public void setQueryDelay(int _queryDelay) {
		this._queryDelay = _queryDelay;
	}

	public boolean isForceSelection() {
		if(_forceSelection != null )
			return _forceSelection;

		ValueExpression ve = getValueExpression("forceSelection");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setForceSelection(boolean _forceSelection) {
		this._forceSelection = _forceSelection;
	}

	public javax.el.MethodExpression getSelectListener() {
		return this._selectListener;
	}

	public void setSelectListener(javax.el.MethodExpression _selectListener) {
		this._selectListener = _selectListener;
	}
	public java.lang.String getOnSelectUpdate() {
		if(_onSelectUpdate != null )
			return _onSelectUpdate;

		ValueExpression ve = getValueExpression("onSelectUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnSelectUpdate(java.lang.String _onSelectUpdate) {
		this._onSelectUpdate = _onSelectUpdate;
	}

	public java.lang.String getOnstart() {
		if(_onstart != null )
			return _onstart;

		ValueExpression ve = getValueExpression("onstart");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnstart(java.lang.String _onstart) {
		this._onstart = _onstart;
	}

	public java.lang.String getOncomplete() {
		if(_oncomplete != null )
			return _oncomplete;

		ValueExpression ve = getValueExpression("oncomplete");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOncomplete(java.lang.String _oncomplete) {
		this._oncomplete = _oncomplete;
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

	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		MethodExpression me = getSelectListener();
		
		if (me != null && event instanceof org.primefaces.event.SelectEvent) {
			me.invoke(facesContext.getELContext(), new Object[] {event});
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
		Object values[] = new Object[15];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _completeMethod;
		values[3] = _var;
		values[4] = _itemLabel;
		values[5] = _itemValue;
		values[6] = _maxResults;
		values[7] = _minQueryLength;
		values[8] = _queryDelay;
		values[9] = _forceSelection;
		values[10] = _selectListener;
		values[11] = _onSelectUpdate;
		values[12] = _onstart;
		values[13] = _oncomplete;
		values[14] = _disabled;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_completeMethod = (javax.el.MethodExpression) values[2];
		_var = (java.lang.String) values[3];
		_itemLabel = (java.lang.String) values[4];
		_itemValue = (java.lang.Object) values[5];
		_maxResults = (java.lang.Integer) values[6];
		_minQueryLength = (java.lang.Integer) values[7];
		_queryDelay = (java.lang.Integer) values[8];
		_forceSelection = (java.lang.Boolean) values[9];
		_selectListener = (javax.el.MethodExpression) values[10];
		_onSelectUpdate = (java.lang.String) values[11];
		_onstart = (java.lang.String) values[12];
		_oncomplete = (java.lang.String) values[13];
		_disabled = (java.lang.Boolean) values[14];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}