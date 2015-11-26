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
package org.primefaces.component.carousel;

import javax.faces.component.UIData;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;


public class Carousel extends UIData {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Carousel";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.CarouselRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Integer _scrollIncrement;
	private java.lang.Boolean _circular;
	private java.lang.Boolean _vertical;
	private java.lang.Integer _autoPlayInterval;
	private java.lang.Integer _revealAmount;
	private java.lang.Boolean _animate;
	private java.lang.Double _speed;
	private java.lang.String _effect;
	private java.lang.String _pagerPrefix;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.String _itemStyle;
	private java.lang.String _itemStyleClass;
	public Carousel() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/carousel/carousel.css");
			resourceHolder.addResource("/yui/utilities/utilities.js");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/carousel/carousel.js");
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

	public int getScrollIncrement() {
		if(_scrollIncrement != null )
			return _scrollIncrement;

		ValueExpression ve = getValueExpression("scrollIncrement");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1;
	}
	public void setScrollIncrement(int _scrollIncrement) {
		this._scrollIncrement = _scrollIncrement;
	}

	public boolean isCircular() {
		if(_circular != null )
			return _circular;

		ValueExpression ve = getValueExpression("circular");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setCircular(boolean _circular) {
		this._circular = _circular;
	}

	public boolean isVertical() {
		if(_vertical != null )
			return _vertical;

		ValueExpression ve = getValueExpression("vertical");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setVertical(boolean _vertical) {
		this._vertical = _vertical;
	}

	public int getAutoPlayInterval() {
		if(_autoPlayInterval != null )
			return _autoPlayInterval;

		ValueExpression ve = getValueExpression("autoPlayInterval");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 0;
	}
	public void setAutoPlayInterval(int _autoPlayInterval) {
		this._autoPlayInterval = _autoPlayInterval;
	}

	public int getRevealAmount() {
		if(_revealAmount != null )
			return _revealAmount;

		ValueExpression ve = getValueExpression("revealAmount");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 0;
	}
	public void setRevealAmount(int _revealAmount) {
		this._revealAmount = _revealAmount;
	}

	public boolean isAnimate() {
		if(_animate != null )
			return _animate;

		ValueExpression ve = getValueExpression("animate");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setAnimate(boolean _animate) {
		this._animate = _animate;
	}

	public double getSpeed() {
		if(_speed != null )
			return _speed;

		ValueExpression ve = getValueExpression("speed");
		return ve != null ? (java.lang.Double) ve.getValue(getFacesContext().getELContext())  : 0.5;
	}
	public void setSpeed(double _speed) {
		this._speed = _speed;
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

	public java.lang.String getPagerPrefix() {
		if(_pagerPrefix != null )
			return _pagerPrefix;

		ValueExpression ve = getValueExpression("pagerPrefix");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setPagerPrefix(java.lang.String _pagerPrefix) {
		this._pagerPrefix = _pagerPrefix;
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

	public java.lang.String getItemStyle() {
		if(_itemStyle != null )
			return _itemStyle;

		ValueExpression ve = getValueExpression("itemStyle");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setItemStyle(java.lang.String _itemStyle) {
		this._itemStyle = _itemStyle;
	}

	public java.lang.String getItemStyleClass() {
		if(_itemStyleClass != null )
			return _itemStyleClass;

		ValueExpression ve = getValueExpression("itemStyleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setItemStyleClass(java.lang.String _itemStyleClass) {
		this._itemStyleClass = _itemStyleClass;
	}


	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[15];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _scrollIncrement;
		values[3] = _circular;
		values[4] = _vertical;
		values[5] = _autoPlayInterval;
		values[6] = _revealAmount;
		values[7] = _animate;
		values[8] = _speed;
		values[9] = _effect;
		values[10] = _pagerPrefix;
		values[11] = _style;
		values[12] = _styleClass;
		values[13] = _itemStyle;
		values[14] = _itemStyleClass;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_scrollIncrement = (java.lang.Integer) values[2];
		_circular = (java.lang.Boolean) values[3];
		_vertical = (java.lang.Boolean) values[4];
		_autoPlayInterval = (java.lang.Integer) values[5];
		_revealAmount = (java.lang.Integer) values[6];
		_animate = (java.lang.Boolean) values[7];
		_speed = (java.lang.Double) values[8];
		_effect = (java.lang.String) values[9];
		_pagerPrefix = (java.lang.String) values[10];
		_style = (java.lang.String) values[11];
		_styleClass = (java.lang.String) values[12];
		_itemStyle = (java.lang.String) values[13];
		_itemStyleClass = (java.lang.String) values[14];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}