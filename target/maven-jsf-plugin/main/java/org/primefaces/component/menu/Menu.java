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
package org.primefaces.component.menu;

import org.primefaces.component.menu.AbstractMenu;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Menu extends AbstractMenu {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Menu";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.MenuRenderer";

	private java.lang.String _widgetVar;
	private org.primefaces.model.MenuModel _model;
	private java.lang.Boolean _visible;
	private java.lang.Integer _x;
	private java.lang.Integer _y;
	private java.lang.Boolean _fixedCenter;
	private java.lang.Boolean _constraintToViewport;
	private java.lang.String _position;
	private java.lang.Boolean _clickToHide;
	private java.lang.Boolean _keepOpen;
	private java.lang.Boolean _tiered;
	private java.lang.String _effect;
	private java.lang.Double _effectDuration;
	private java.lang.Boolean _autoSubmenuDisplay;
	private java.lang.Integer _showDelay;
	private java.lang.Integer _hideDelay;
	private java.lang.Integer _submenuHideDelay;
	private java.lang.String _context;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.Integer _zindex;
	public Menu() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/menu/menu.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/yui/container/container-min.js");
			resourceHolder.addResource("/primefaces/menu/menu.js");
			resourceHolder.addResource("/primefaces/core/core.js");
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

	public org.primefaces.model.MenuModel getModel() {
		if(_model != null )
			return _model;

		ValueExpression ve = getValueExpression("model");
		return ve != null ? (org.primefaces.model.MenuModel) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setModel(org.primefaces.model.MenuModel _model) {
		this._model = _model;
	}

	public boolean isVisible() {
		if(_visible != null )
			return _visible;

		ValueExpression ve = getValueExpression("visible");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setVisible(boolean _visible) {
		this._visible = _visible;
	}

	public int getX() {
		if(_x != null )
			return _x;

		ValueExpression ve = getValueExpression("x");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : -1;
	}
	public void setX(int _x) {
		this._x = _x;
	}

	public int getY() {
		if(_y != null )
			return _y;

		ValueExpression ve = getValueExpression("y");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : -1;
	}
	public void setY(int _y) {
		this._y = _y;
	}

	public boolean isFixedCenter() {
		if(_fixedCenter != null )
			return _fixedCenter;

		ValueExpression ve = getValueExpression("fixedCenter");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setFixedCenter(boolean _fixedCenter) {
		this._fixedCenter = _fixedCenter;
	}

	public boolean isConstraintToViewport() {
		if(_constraintToViewport != null )
			return _constraintToViewport;

		ValueExpression ve = getValueExpression("constraintToViewport");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setConstraintToViewport(boolean _constraintToViewport) {
		this._constraintToViewport = _constraintToViewport;
	}

	public java.lang.String getPosition() {
		if(_position != null )
			return _position;

		ValueExpression ve = getValueExpression("position");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "static";
	}
	public void setPosition(java.lang.String _position) {
		this._position = _position;
	}

	public boolean isClickToHide() {
		if(_clickToHide != null )
			return _clickToHide;

		ValueExpression ve = getValueExpression("clickToHide");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setClickToHide(boolean _clickToHide) {
		this._clickToHide = _clickToHide;
	}

	public boolean isKeepOpen() {
		if(_keepOpen != null )
			return _keepOpen;

		ValueExpression ve = getValueExpression("keepOpen");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setKeepOpen(boolean _keepOpen) {
		this._keepOpen = _keepOpen;
	}

	public boolean isTiered() {
		if(_tiered != null )
			return _tiered;

		ValueExpression ve = getValueExpression("tiered");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setTiered(boolean _tiered) {
		this._tiered = _tiered;
	}

	public java.lang.String getEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "FADE";
	}
	public void setEffect(java.lang.String _effect) {
		this._effect = _effect;
	}

	public double getEffectDuration() {
		if(_effectDuration != null )
			return _effectDuration;

		ValueExpression ve = getValueExpression("effectDuration");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : 0.25;
	}
	public void setEffectDuration(double _effectDuration) {
		this._effectDuration = _effectDuration;
	}

	public boolean isAutoSubmenuDisplay() {
		if(_autoSubmenuDisplay != null )
			return _autoSubmenuDisplay;

		ValueExpression ve = getValueExpression("autoSubmenuDisplay");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setAutoSubmenuDisplay(boolean _autoSubmenuDisplay) {
		this._autoSubmenuDisplay = _autoSubmenuDisplay;
	}

	public int getShowDelay() {
		if(_showDelay != null )
			return _showDelay;

		ValueExpression ve = getValueExpression("showDelay");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 250;
	}
	public void setShowDelay(int _showDelay) {
		this._showDelay = _showDelay;
	}

	public int getHideDelay() {
		if(_hideDelay != null )
			return _hideDelay;

		ValueExpression ve = getValueExpression("hideDelay");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 0;
	}
	public void setHideDelay(int _hideDelay) {
		this._hideDelay = _hideDelay;
	}

	public int getSubmenuHideDelay() {
		if(_submenuHideDelay != null )
			return _submenuHideDelay;

		ValueExpression ve = getValueExpression("submenuHideDelay");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 250;
	}
	public void setSubmenuHideDelay(int _submenuHideDelay) {
		this._submenuHideDelay = _submenuHideDelay;
	}

	public java.lang.String getContext() {
		if(_context != null )
			return _context;

		ValueExpression ve = getValueExpression("context");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setContext(java.lang.String _context) {
		this._context = _context;
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

	public int getZindex() {
		if(_zindex != null )
			return _zindex;

		ValueExpression ve = getValueExpression("zindex");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : java.lang.Integer.MAX_VALUE;
	}
	public void setZindex(int _zindex) {
		this._zindex = _zindex;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[22];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _model;
		values[3] = _visible;
		values[4] = _x;
		values[5] = _y;
		values[6] = _fixedCenter;
		values[7] = _constraintToViewport;
		values[8] = _position;
		values[9] = _clickToHide;
		values[10] = _keepOpen;
		values[11] = _tiered;
		values[12] = _effect;
		values[13] = _effectDuration;
		values[14] = _autoSubmenuDisplay;
		values[15] = _showDelay;
		values[16] = _hideDelay;
		values[17] = _submenuHideDelay;
		values[18] = _context;
		values[19] = _style;
		values[20] = _styleClass;
		values[21] = _zindex;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_model = (org.primefaces.model.MenuModel) values[2];
		_visible = (java.lang.Boolean) values[3];
		_x = (java.lang.Integer) values[4];
		_y = (java.lang.Integer) values[5];
		_fixedCenter = (java.lang.Boolean) values[6];
		_constraintToViewport = (java.lang.Boolean) values[7];
		_position = (java.lang.String) values[8];
		_clickToHide = (java.lang.Boolean) values[9];
		_keepOpen = (java.lang.Boolean) values[10];
		_tiered = (java.lang.Boolean) values[11];
		_effect = (java.lang.String) values[12];
		_effectDuration = (java.lang.Double) values[13];
		_autoSubmenuDisplay = (java.lang.Boolean) values[14];
		_showDelay = (java.lang.Integer) values[15];
		_hideDelay = (java.lang.Integer) values[16];
		_submenuHideDelay = (java.lang.Integer) values[17];
		_context = (java.lang.String) values[18];
		_style = (java.lang.String) values[19];
		_styleClass = (java.lang.String) values[20];
		_zindex = (java.lang.Integer) values[21];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}