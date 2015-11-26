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

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeExpandEvent;
import org.primefaces.event.NodeCollapseEvent;
import javax.faces.component.UIComponent;
import java.util.Map;
import java.util.HashMap;
import org.primefaces.model.TreeNode;


public class Tree extends UIComponentBase implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Tree";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.TreeRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Object _value;
	private java.lang.String _var;
	private java.lang.Boolean _dynamic;
	private java.lang.Boolean _cache;
	private java.lang.String _expandAnim;
	private java.lang.String _collapseAnim;
	private javax.el.MethodExpression _nodeSelectListener;
	private javax.el.MethodExpression _nodeExpandListener;
	private javax.el.MethodExpression _nodeCollapseListener;
	private java.lang.String _onNodeClick;
	private java.lang.Boolean _expanded;
	private java.lang.String _update;
	private java.lang.String _onselectStart;
	private java.lang.String _onselectComplete;
	private java.lang.Object _selection;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.Boolean _propagateSelectionUp;
	private java.lang.Boolean _propagateSelectionDown;
	private java.lang.String _selectionMode;
	public Tree() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/yui/treeview/assets/skins/sam/treeview.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/treeview/treeview-min.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/treeview/treeview.js");
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

	public java.lang.Object getValue() {
		if(_value != null )
			return _value;

		ValueExpression ve = getValueExpression("value");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setValue(java.lang.Object _value) {
		this._value = _value;
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

	public java.lang.String getExpandAnim() {
		if(_expandAnim != null )
			return _expandAnim;

		ValueExpression ve = getValueExpression("expandAnim");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setExpandAnim(java.lang.String _expandAnim) {
		this._expandAnim = _expandAnim;
	}

	public java.lang.String getCollapseAnim() {
		if(_collapseAnim != null )
			return _collapseAnim;

		ValueExpression ve = getValueExpression("collapseAnim");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setCollapseAnim(java.lang.String _collapseAnim) {
		this._collapseAnim = _collapseAnim;
	}

	public javax.el.MethodExpression getNodeSelectListener() {
		return this._nodeSelectListener;
	}

	public void setNodeSelectListener(javax.el.MethodExpression _nodeSelectListener) {
		this._nodeSelectListener = _nodeSelectListener;
	}
	public javax.el.MethodExpression getNodeExpandListener() {
		return this._nodeExpandListener;
	}

	public void setNodeExpandListener(javax.el.MethodExpression _nodeExpandListener) {
		this._nodeExpandListener = _nodeExpandListener;
	}
	public javax.el.MethodExpression getNodeCollapseListener() {
		return this._nodeCollapseListener;
	}

	public void setNodeCollapseListener(javax.el.MethodExpression _nodeCollapseListener) {
		this._nodeCollapseListener = _nodeCollapseListener;
	}
	public java.lang.String getOnNodeClick() {
		if(_onNodeClick != null )
			return _onNodeClick;

		ValueExpression ve = getValueExpression("onNodeClick");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnNodeClick(java.lang.String _onNodeClick) {
		this._onNodeClick = _onNodeClick;
	}

	public boolean isExpanded() {
		if(_expanded != null )
			return _expanded;

		ValueExpression ve = getValueExpression("expanded");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setExpanded(boolean _expanded) {
		this._expanded = _expanded;
	}

	public java.lang.String getUpdate() {
		if(_update != null )
			return _update;

		ValueExpression ve = getValueExpression("update");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setUpdate(java.lang.String _update) {
		this._update = _update;
	}

	public java.lang.String getOnselectStart() {
		if(_onselectStart != null )
			return _onselectStart;

		ValueExpression ve = getValueExpression("onselectStart");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnselectStart(java.lang.String _onselectStart) {
		this._onselectStart = _onselectStart;
	}

	public java.lang.String getOnselectComplete() {
		if(_onselectComplete != null )
			return _onselectComplete;

		ValueExpression ve = getValueExpression("onselectComplete");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnselectComplete(java.lang.String _onselectComplete) {
		this._onselectComplete = _onselectComplete;
	}

	public java.lang.Object getSelection() {
		if(_selection != null )
			return _selection;

		ValueExpression ve = getValueExpression("selection");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSelection(java.lang.Object _selection) {
		this._selection = _selection;
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

	public boolean isPropagateSelectionUp() {
		if(_propagateSelectionUp != null )
			return _propagateSelectionUp;

		ValueExpression ve = getValueExpression("propagateSelectionUp");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setPropagateSelectionUp(boolean _propagateSelectionUp) {
		this._propagateSelectionUp = _propagateSelectionUp;
	}

	public boolean isPropagateSelectionDown() {
		if(_propagateSelectionDown != null )
			return _propagateSelectionDown;

		ValueExpression ve = getValueExpression("propagateSelectionDown");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setPropagateSelectionDown(boolean _propagateSelectionDown) {
		this._propagateSelectionDown = _propagateSelectionDown;
	}

	public java.lang.String getSelectionMode() {
		if(_selectionMode != null )
			return _selectionMode;

		ValueExpression ve = getValueExpression("selectionMode");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setSelectionMode(java.lang.String _selectionMode) {
		this._selectionMode = _selectionMode;
	}


	private Map<String,UITreeNode> nodes;

	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		MethodExpression me = null;

		if(event instanceof NodeSelectEvent) {
			me = getNodeSelectListener();
		} else if(event instanceof NodeExpandEvent) {
			me = getNodeExpandListener();
		} else if(event instanceof NodeCollapseEvent) {
			me = getNodeCollapseListener();
		}
		
		if (me != null) {
			me.invoke(facesContext.getELContext(), new Object[] {event});
		}
	}
	
	public UITreeNode getUITreeNodeByType(String type) {
		if(nodes == null) {
			nodes = new HashMap<String,UITreeNode>();
			for(UIComponent child : getChildren()) {
				UITreeNode uiTreeNode = (UITreeNode) child;
				
				nodes.put(uiTreeNode.getType(), uiTreeNode);
			}
		}
		
		UITreeNode node = nodes.get(type);
		
		if(node == null)
			throw new javax.faces.FacesException("Unsupported tree node type:" + type);
		else
			return node;
	}
	
	public void processUpdates(FacesContext context) {
		super.processUpdates(context);
		Object selection = this.getSelection();
		
		if(selection != null) {
			this.getValueExpression("selection").setValue(context.getELContext(), selection);
			setSelection(null);
		}
	}
	
	public boolean hasAjaxListener() {
		return getNodeSelectListener() != null || getNodeExpandListener() != null || getNodeCollapseListener() != null;
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
		Object values[] = new Object[22];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _value;
		values[3] = _var;
		values[4] = _dynamic;
		values[5] = _cache;
		values[6] = _expandAnim;
		values[7] = _collapseAnim;
		values[8] = _nodeSelectListener;
		values[9] = _nodeExpandListener;
		values[10] = _nodeCollapseListener;
		values[11] = _onNodeClick;
		values[12] = _expanded;
		values[13] = _update;
		values[14] = _onselectStart;
		values[15] = _onselectComplete;
		values[16] = _selection;
		values[17] = _style;
		values[18] = _styleClass;
		values[19] = _propagateSelectionUp;
		values[20] = _propagateSelectionDown;
		values[21] = _selectionMode;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_value = (java.lang.Object) values[2];
		_var = (java.lang.String) values[3];
		_dynamic = (java.lang.Boolean) values[4];
		_cache = (java.lang.Boolean) values[5];
		_expandAnim = (java.lang.String) values[6];
		_collapseAnim = (java.lang.String) values[7];
		_nodeSelectListener = (javax.el.MethodExpression) values[8];
		_nodeExpandListener = (javax.el.MethodExpression) values[9];
		_nodeCollapseListener = (javax.el.MethodExpression) values[10];
		_onNodeClick = (java.lang.String) values[11];
		_expanded = (java.lang.Boolean) values[12];
		_update = (java.lang.String) values[13];
		_onselectStart = (java.lang.String) values[14];
		_onselectComplete = (java.lang.String) values[15];
		_selection = (java.lang.Object) values[16];
		_style = (java.lang.String) values[17];
		_styleClass = (java.lang.String) values[18];
		_propagateSelectionUp = (java.lang.Boolean) values[19];
		_propagateSelectionDown = (java.lang.Boolean) values[20];
		_selectionMode = (java.lang.String) values[21];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}