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
package org.primefaces.component.schedule;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class ScheduleTag extends UIComponentELTag {

	private javax.el.ValueExpression _widgetVar;
	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _locale;
	private javax.el.ValueExpression _aspectRatio;
	private javax.el.ValueExpression _view;
	private javax.el.ValueExpression _initialDate;
	private javax.el.ValueExpression _showWeekends;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _editable;
	private javax.el.ValueExpression _draggable;
	private javax.el.ValueExpression _resizable;
	private javax.el.MethodExpression _eventSelectListener;
	private javax.el.MethodExpression _dateSelectListener;
	private javax.el.MethodExpression _eventMoveListener;
	private javax.el.MethodExpression _eventResizeListener;
	private javax.el.ValueExpression _onEventSelectUpdate;
	private javax.el.ValueExpression _onDateSelectUpdate;
	private javax.el.ValueExpression _onEventMoveUpdate;
	private javax.el.ValueExpression _onEventResizeUpdate;
	private javax.el.ValueExpression _showHeader;
	private javax.el.ValueExpression _leftHeaderTemplate;
	private javax.el.ValueExpression _centerHeaderTemplate;
	private javax.el.ValueExpression _rightHeaderTemplate;
	private javax.el.ValueExpression _allDaySlot;
	private javax.el.ValueExpression _slotMinutes;
	private javax.el.ValueExpression _firstHour;
	private javax.el.ValueExpression _minTime;
	private javax.el.ValueExpression _maxTime;
	private javax.el.ValueExpression _startWeekday;

	public void release(){
		super.release();
		this._widgetVar = null;
		this._value = null;
		this._locale = null;
		this._aspectRatio = null;
		this._view = null;
		this._initialDate = null;
		this._showWeekends = null;
		this._style = null;
		this._styleClass = null;
		this._editable = null;
		this._draggable = null;
		this._resizable = null;
		this._eventSelectListener = null;
		this._dateSelectListener = null;
		this._eventMoveListener = null;
		this._eventResizeListener = null;
		this._onEventSelectUpdate = null;
		this._onDateSelectUpdate = null;
		this._onEventMoveUpdate = null;
		this._onEventResizeUpdate = null;
		this._showHeader = null;
		this._leftHeaderTemplate = null;
		this._centerHeaderTemplate = null;
		this._rightHeaderTemplate = null;
		this._allDaySlot = null;
		this._slotMinutes = null;
		this._firstHour = null;
		this._minTime = null;
		this._maxTime = null;
		this._startWeekday = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.schedule.Schedule component = null;
		try {
			component = (org.primefaces.component.schedule.Schedule) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_widgetVar != null) {
			component.setValueExpression("widgetVar", _widgetVar);
		}
		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_locale != null) {
			component.setValueExpression("locale", _locale);
		}
		if(_aspectRatio != null) {
			component.setValueExpression("aspectRatio", _aspectRatio);
		}
		if(_view != null) {
			component.setValueExpression("view", _view);
		}
		if(_initialDate != null) {
			component.setValueExpression("initialDate", _initialDate);
		}
		if(_showWeekends != null) {
			component.setValueExpression("showWeekends", _showWeekends);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_editable != null) {
			component.setValueExpression("editable", _editable);
		}
		if(_draggable != null) {
			component.setValueExpression("draggable", _draggable);
		}
		if(_resizable != null) {
			component.setValueExpression("resizable", _resizable);
		}
		if(_eventSelectListener != null) {
			component.setEventSelectListener(_eventSelectListener);
		}
		if(_dateSelectListener != null) {
			component.setDateSelectListener(_dateSelectListener);
		}
		if(_eventMoveListener != null) {
			component.setEventMoveListener(_eventMoveListener);
		}
		if(_eventResizeListener != null) {
			component.setEventResizeListener(_eventResizeListener);
		}
		if(_onEventSelectUpdate != null) {
			component.setValueExpression("onEventSelectUpdate", _onEventSelectUpdate);
		}
		if(_onDateSelectUpdate != null) {
			component.setValueExpression("onDateSelectUpdate", _onDateSelectUpdate);
		}
		if(_onEventMoveUpdate != null) {
			component.setValueExpression("onEventMoveUpdate", _onEventMoveUpdate);
		}
		if(_onEventResizeUpdate != null) {
			component.setValueExpression("onEventResizeUpdate", _onEventResizeUpdate);
		}
		if(_showHeader != null) {
			component.setValueExpression("showHeader", _showHeader);
		}
		if(_leftHeaderTemplate != null) {
			component.setValueExpression("leftHeaderTemplate", _leftHeaderTemplate);
		}
		if(_centerHeaderTemplate != null) {
			component.setValueExpression("centerHeaderTemplate", _centerHeaderTemplate);
		}
		if(_rightHeaderTemplate != null) {
			component.setValueExpression("rightHeaderTemplate", _rightHeaderTemplate);
		}
		if(_allDaySlot != null) {
			component.setValueExpression("allDaySlot", _allDaySlot);
		}
		if(_slotMinutes != null) {
			component.setValueExpression("slotMinutes", _slotMinutes);
		}
		if(_firstHour != null) {
			component.setValueExpression("firstHour", _firstHour);
		}
		if(_minTime != null) {
			component.setValueExpression("minTime", _minTime);
		}
		if(_maxTime != null) {
			component.setValueExpression("maxTime", _maxTime);
		}
		if(_startWeekday != null) {
			component.setValueExpression("startWeekday", _startWeekday);
		}
	}

	public String getComponentType() {
		return Schedule.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.ScheduleRenderer";
	}

	public void setWidgetVar(javax.el.ValueExpression expression){
		this._widgetVar = expression;
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setLocale(javax.el.ValueExpression expression){
		this._locale = expression;
	}

	public void setAspectRatio(javax.el.ValueExpression expression){
		this._aspectRatio = expression;
	}

	public void setView(javax.el.ValueExpression expression){
		this._view = expression;
	}

	public void setInitialDate(javax.el.ValueExpression expression){
		this._initialDate = expression;
	}

	public void setShowWeekends(javax.el.ValueExpression expression){
		this._showWeekends = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setEditable(javax.el.ValueExpression expression){
		this._editable = expression;
	}

	public void setDraggable(javax.el.ValueExpression expression){
		this._draggable = expression;
	}

	public void setResizable(javax.el.ValueExpression expression){
		this._resizable = expression;
	}

	public void setEventSelectListener(javax.el.MethodExpression expression){
		this._eventSelectListener = expression;
	}

	public void setDateSelectListener(javax.el.MethodExpression expression){
		this._dateSelectListener = expression;
	}

	public void setEventMoveListener(javax.el.MethodExpression expression){
		this._eventMoveListener = expression;
	}

	public void setEventResizeListener(javax.el.MethodExpression expression){
		this._eventResizeListener = expression;
	}

	public void setOnEventSelectUpdate(javax.el.ValueExpression expression){
		this._onEventSelectUpdate = expression;
	}

	public void setOnDateSelectUpdate(javax.el.ValueExpression expression){
		this._onDateSelectUpdate = expression;
	}

	public void setOnEventMoveUpdate(javax.el.ValueExpression expression){
		this._onEventMoveUpdate = expression;
	}

	public void setOnEventResizeUpdate(javax.el.ValueExpression expression){
		this._onEventResizeUpdate = expression;
	}

	public void setShowHeader(javax.el.ValueExpression expression){
		this._showHeader = expression;
	}

	public void setLeftHeaderTemplate(javax.el.ValueExpression expression){
		this._leftHeaderTemplate = expression;
	}

	public void setCenterHeaderTemplate(javax.el.ValueExpression expression){
		this._centerHeaderTemplate = expression;
	}

	public void setRightHeaderTemplate(javax.el.ValueExpression expression){
		this._rightHeaderTemplate = expression;
	}

	public void setAllDaySlot(javax.el.ValueExpression expression){
		this._allDaySlot = expression;
	}

	public void setSlotMinutes(javax.el.ValueExpression expression){
		this._slotMinutes = expression;
	}

	public void setFirstHour(javax.el.ValueExpression expression){
		this._firstHour = expression;
	}

	public void setMinTime(javax.el.ValueExpression expression){
		this._minTime = expression;
	}

	public void setMaxTime(javax.el.ValueExpression expression){
		this._maxTime = expression;
	}

	public void setStartWeekday(javax.el.ValueExpression expression){
		this._startWeekday = expression;
	}

}