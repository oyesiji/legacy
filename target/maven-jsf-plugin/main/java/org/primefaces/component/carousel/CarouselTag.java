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

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class CarouselTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private java.lang.String _var;
	private javax.el.ValueExpression _rows;
	private javax.el.ValueExpression _first;
	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _scrollIncrement;
	private javax.el.ValueExpression _circular;
	private javax.el.ValueExpression _vertical;
	private javax.el.ValueExpression _autoPlayInterval;
	private javax.el.ValueExpression _revealAmount;
	private javax.el.ValueExpression _animate;
	private javax.el.ValueExpression _speed;
	private javax.el.ValueExpression _effect;
	private javax.el.ValueExpression _pagerPrefix;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _itemStyle;
	private javax.el.ValueExpression _itemStyleClass;

	public void release(){
		super.release();
		this._value = null;
		this._var = null;
		this._rows = null;
		this._first = null;
		this._widgetVar = null;
		this._scrollIncrement = null;
		this._circular = null;
		this._vertical = null;
		this._autoPlayInterval = null;
		this._revealAmount = null;
		this._animate = null;
		this._speed = null;
		this._effect = null;
		this._pagerPrefix = null;
		this._style = null;
		this._styleClass = null;
		this._itemStyle = null;
		this._itemStyleClass = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.carousel.Carousel component = null;
		try {
			component = (org.primefaces.component.carousel.Carousel) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_var != null) {
			component.setVar(_var);
		}
		if(_rows != null) {
			component.setValueExpression("rows", _rows);
		}
		if(_first != null) {
			component.setValueExpression("first", _first);
		}
		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_scrollIncrement != null) {
			component.setValueExpression("scrollIncrement", _scrollIncrement);
		}
		if(_circular != null) {
			component.setValueExpression("circular", _circular);
		}
		if(_vertical != null) {
			component.setValueExpression("vertical", _vertical);
		}
		if(_autoPlayInterval != null) {
			component.setValueExpression("autoPlayInterval", _autoPlayInterval);
		}
		if(_revealAmount != null) {
			component.setValueExpression("revealAmount", _revealAmount);
		}
		if(_animate != null) {
			component.setValueExpression("animate", _animate);
		}
		if(_speed != null) {
			component.setValueExpression("speed", _speed);
		}
		if(_effect != null) {
			component.setValueExpression("effect", _effect);
		}
		if(_pagerPrefix != null) {
			component.setValueExpression("pagerPrefix", _pagerPrefix);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_itemStyle != null) {
			component.setValueExpression("itemStyle", _itemStyle);
		}
		if(_itemStyleClass != null) {
			component.setValueExpression("itemStyleClass", _itemStyleClass);
		}
	}

	public String getComponentType() {
		return Carousel.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.CarouselRenderer";
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setVar(java.lang.String value){
		this._var = value;
	}

	public void setRows(javax.el.ValueExpression expression){
		this._rows = expression;
	}

	public void setFirst(javax.el.ValueExpression expression){
		this._first = expression;
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setScrollIncrement(javax.el.ValueExpression expression){
		this._scrollIncrement = expression;
	}

	public void setCircular(javax.el.ValueExpression expression){
		this._circular = expression;
	}

	public void setVertical(javax.el.ValueExpression expression){
		this._vertical = expression;
	}

	public void setAutoPlayInterval(javax.el.ValueExpression expression){
		this._autoPlayInterval = expression;
	}

	public void setRevealAmount(javax.el.ValueExpression expression){
		this._revealAmount = expression;
	}

	public void setAnimate(javax.el.ValueExpression expression){
		this._animate = expression;
	}

	public void setSpeed(javax.el.ValueExpression expression){
		this._speed = expression;
	}

	public void setEffect(javax.el.ValueExpression expression){
		this._effect = expression;
	}

	public void setPagerPrefix(javax.el.ValueExpression expression){
		this._pagerPrefix = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setItemStyle(javax.el.ValueExpression expression){
		this._itemStyle = expression;
	}

	public void setItemStyleClass(javax.el.ValueExpression expression){
		this._itemStyleClass = expression;
	}

}