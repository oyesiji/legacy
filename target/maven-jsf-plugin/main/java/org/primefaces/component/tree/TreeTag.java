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

public class TreeTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _var;
	private javax.el.ValueExpression _dynamic;
	private javax.el.ValueExpression _cache;
	private javax.el.ValueExpression _expandAnim;
	private javax.el.ValueExpression _collapseAnim;
	private javax.el.MethodExpression _nodeSelectListener;
	private javax.el.MethodExpression _nodeExpandListener;
	private javax.el.MethodExpression _nodeCollapseListener;
	private javax.el.ValueExpression _onNodeClick;
	private javax.el.ValueExpression _expanded;
	private javax.el.ValueExpression _update;
	private javax.el.ValueExpression _onselectStart;
	private javax.el.ValueExpression _onselectComplete;
	private javax.el.ValueExpression _selection;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _propagateSelectionUp;
	private javax.el.ValueExpression _propagateSelectionDown;
	private javax.el.ValueExpression _selectionMode;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._value = null;
		this._var = null;
		this._dynamic = null;
		this._cache = null;
		this._expandAnim = null;
		this._collapseAnim = null;
		this._nodeSelectListener = null;
		this._nodeExpandListener = null;
		this._nodeCollapseListener = null;
		this._onNodeClick = null;
		this._expanded = null;
		this._update = null;
		this._onselectStart = null;
		this._onselectComplete = null;
		this._selection = null;
		this._style = null;
		this._styleClass = null;
		this._propagateSelectionUp = null;
		this._propagateSelectionDown = null;
		this._selectionMode = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.tree.Tree component = null;
		try {
			component = (org.primefaces.component.tree.Tree) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_var != null) {
			component.setValueExpression("var", _var);
		}
		if(_dynamic != null) {
			component.setValueExpression("dynamic", _dynamic);
		}
		if(_cache != null) {
			component.setValueExpression("cache", _cache);
		}
		if(_expandAnim != null) {
			component.setValueExpression("expandAnim", _expandAnim);
		}
		if(_collapseAnim != null) {
			component.setValueExpression("collapseAnim", _collapseAnim);
		}
		if(_nodeSelectListener != null) {
			component.setNodeSelectListener(_nodeSelectListener);
		}
		if(_nodeExpandListener != null) {
			component.setNodeExpandListener(_nodeExpandListener);
		}
		if(_nodeCollapseListener != null) {
			component.setNodeCollapseListener(_nodeCollapseListener);
		}
		if(_onNodeClick != null) {
			component.setValueExpression("onNodeClick", _onNodeClick);
		}
		if(_expanded != null) {
			component.setValueExpression("expanded", _expanded);
		}
		if(_update != null) {
			component.setValueExpression("update", _update);
		}
		if(_onselectStart != null) {
			component.setValueExpression("onselectStart", _onselectStart);
		}
		if(_onselectComplete != null) {
			component.setValueExpression("onselectComplete", _onselectComplete);
		}
		if(_selection != null) {
			component.setValueExpression("selection", _selection);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_propagateSelectionUp != null) {
			component.setValueExpression("propagateSelectionUp", _propagateSelectionUp);
		}
		if(_propagateSelectionDown != null) {
			component.setValueExpression("propagateSelectionDown", _propagateSelectionDown);
		}
		if(_selectionMode != null) {
			component.setValueExpression("selectionMode", _selectionMode);
		}
	}

	public String getComponentType() {
		return Tree.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.TreeRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setVar(javax.el.ValueExpression expression){
		this._var = expression;
	}

	public void setDynamic(javax.el.ValueExpression expression){
		this._dynamic = expression;
	}

	public void setCache(javax.el.ValueExpression expression){
		this._cache = expression;
	}

	public void setExpandAnim(javax.el.ValueExpression expression){
		this._expandAnim = expression;
	}

	public void setCollapseAnim(javax.el.ValueExpression expression){
		this._collapseAnim = expression;
	}

	public void setNodeSelectListener(javax.el.MethodExpression expression){
		this._nodeSelectListener = expression;
	}

	public void setNodeExpandListener(javax.el.MethodExpression expression){
		this._nodeExpandListener = expression;
	}

	public void setNodeCollapseListener(javax.el.MethodExpression expression){
		this._nodeCollapseListener = expression;
	}

	public void setOnNodeClick(javax.el.ValueExpression expression){
		this._onNodeClick = expression;
	}

	public void setExpanded(javax.el.ValueExpression expression){
		this._expanded = expression;
	}

	public void setUpdate(javax.el.ValueExpression expression){
		this._update = expression;
	}

	public void setOnselectStart(javax.el.ValueExpression expression){
		this._onselectStart = expression;
	}

	public void setOnselectComplete(javax.el.ValueExpression expression){
		this._onselectComplete = expression;
	}

	public void setSelection(javax.el.ValueExpression expression){
		this._selection = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setPropagateSelectionUp(javax.el.ValueExpression expression){
		this._propagateSelectionUp = expression;
	}

	public void setPropagateSelectionDown(javax.el.ValueExpression expression){
		this._propagateSelectionDown = expression;
	}

	public void setSelectionMode(javax.el.ValueExpression expression){
		this._selectionMode = expression;
	}

}