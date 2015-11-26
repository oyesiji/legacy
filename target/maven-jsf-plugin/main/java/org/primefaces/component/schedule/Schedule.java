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

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import java.util.Iterator;
import javax.faces.component.UIComponent;
import org.primefaces.component.schedule.Schedule;
import org.primefaces.component.schedule.ScheduleEventDialog;
import org.primefaces.event.ScheduleEntrySelectEvent;
import org.primefaces.event.DateSelectEvent;
import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;


public class Schedule extends UIComponentBase implements org.primefaces.component.api.AjaxComponent {


	public static final String COMPONENT_TYPE = "org.primefaces.Schedule";
	public static final String COMPONENT_FAMILY = "org.primefaces";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.ScheduleRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Object _value;
	private java.lang.Object _locale;
	private java.lang.Float _aspectRatio;
	private java.lang.String _view;
	private java.lang.Object _initialDate;
	private java.lang.Boolean _showWeekends;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.Boolean _editable;
	private java.lang.Boolean _draggable;
	private java.lang.Boolean _resizable;
	private javax.el.MethodExpression _eventSelectListener;
	private javax.el.MethodExpression _dateSelectListener;
	private javax.el.MethodExpression _eventMoveListener;
	private javax.el.MethodExpression _eventResizeListener;
	private java.lang.String _onEventSelectUpdate;
	private java.lang.String _onDateSelectUpdate;
	private java.lang.String _onEventMoveUpdate;
	private java.lang.String _onEventResizeUpdate;
	private java.lang.Boolean _showHeader;
	private java.lang.String _leftHeaderTemplate;
	private java.lang.String _centerHeaderTemplate;
	private java.lang.String _rightHeaderTemplate;
	private java.lang.Boolean _allDaySlot;
	private java.lang.Integer _slotMinutes;
	private java.lang.Integer _firstHour;
	private java.lang.String _minTime;
	private java.lang.String _maxTime;
	private java.lang.Integer _startWeekday;
	public Schedule() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/fullcalendar/fullcalendar.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/fullcalendar/fullcalendar.min.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/schedule/schedule.js");
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

	public java.lang.Object getLocale() {
		if(_locale != null )
			return _locale;

		ValueExpression ve = getValueExpression("locale");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setLocale(java.lang.Object _locale) {
		this._locale = _locale;
	}

	public java.lang.Float getAspectRatio() {
		if(_aspectRatio != null )
			return _aspectRatio;

		ValueExpression ve = getValueExpression("aspectRatio");
		return ve != null ? (java.lang.Float) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setAspectRatio(java.lang.Float _aspectRatio) {
		this._aspectRatio = _aspectRatio;
	}

	public java.lang.String getView() {
		if(_view != null )
			return _view;

		ValueExpression ve = getValueExpression("view");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "month";
	}
	public void setView(java.lang.String _view) {
		this._view = _view;
	}

	public java.lang.Object getInitialDate() {
		if(_initialDate != null )
			return _initialDate;

		ValueExpression ve = getValueExpression("initialDate");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setInitialDate(java.lang.Object _initialDate) {
		this._initialDate = _initialDate;
	}

	public boolean isShowWeekends() {
		if(_showWeekends != null )
			return _showWeekends;

		ValueExpression ve = getValueExpression("showWeekends");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setShowWeekends(boolean _showWeekends) {
		this._showWeekends = _showWeekends;
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

	public boolean isEditable() {
		if(_editable != null )
			return _editable;

		ValueExpression ve = getValueExpression("editable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setEditable(boolean _editable) {
		this._editable = _editable;
	}

	public boolean isDraggable() {
		if(_draggable != null )
			return _draggable;

		ValueExpression ve = getValueExpression("draggable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setDraggable(boolean _draggable) {
		this._draggable = _draggable;
	}

	public boolean isResizable() {
		if(_resizable != null )
			return _resizable;

		ValueExpression ve = getValueExpression("resizable");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setResizable(boolean _resizable) {
		this._resizable = _resizable;
	}

	public javax.el.MethodExpression getEventSelectListener() {
		return this._eventSelectListener;
	}

	public void setEventSelectListener(javax.el.MethodExpression _eventSelectListener) {
		this._eventSelectListener = _eventSelectListener;
	}
	public javax.el.MethodExpression getDateSelectListener() {
		return this._dateSelectListener;
	}

	public void setDateSelectListener(javax.el.MethodExpression _dateSelectListener) {
		this._dateSelectListener = _dateSelectListener;
	}
	public javax.el.MethodExpression getEventMoveListener() {
		return this._eventMoveListener;
	}

	public void setEventMoveListener(javax.el.MethodExpression _eventMoveListener) {
		this._eventMoveListener = _eventMoveListener;
	}
	public javax.el.MethodExpression getEventResizeListener() {
		return this._eventResizeListener;
	}

	public void setEventResizeListener(javax.el.MethodExpression _eventResizeListener) {
		this._eventResizeListener = _eventResizeListener;
	}
	public java.lang.String getOnEventSelectUpdate() {
		if(_onEventSelectUpdate != null )
			return _onEventSelectUpdate;

		ValueExpression ve = getValueExpression("onEventSelectUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnEventSelectUpdate(java.lang.String _onEventSelectUpdate) {
		this._onEventSelectUpdate = _onEventSelectUpdate;
	}

	public java.lang.String getOnDateSelectUpdate() {
		if(_onDateSelectUpdate != null )
			return _onDateSelectUpdate;

		ValueExpression ve = getValueExpression("onDateSelectUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnDateSelectUpdate(java.lang.String _onDateSelectUpdate) {
		this._onDateSelectUpdate = _onDateSelectUpdate;
	}

	public java.lang.String getOnEventMoveUpdate() {
		if(_onEventMoveUpdate != null )
			return _onEventMoveUpdate;

		ValueExpression ve = getValueExpression("onEventMoveUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnEventMoveUpdate(java.lang.String _onEventMoveUpdate) {
		this._onEventMoveUpdate = _onEventMoveUpdate;
	}

	public java.lang.String getOnEventResizeUpdate() {
		if(_onEventResizeUpdate != null )
			return _onEventResizeUpdate;

		ValueExpression ve = getValueExpression("onEventResizeUpdate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnEventResizeUpdate(java.lang.String _onEventResizeUpdate) {
		this._onEventResizeUpdate = _onEventResizeUpdate;
	}

	public boolean isShowHeader() {
		if(_showHeader != null )
			return _showHeader;

		ValueExpression ve = getValueExpression("showHeader");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setShowHeader(boolean _showHeader) {
		this._showHeader = _showHeader;
	}

	public java.lang.String getLeftHeaderTemplate() {
		if(_leftHeaderTemplate != null )
			return _leftHeaderTemplate;

		ValueExpression ve = getValueExpression("leftHeaderTemplate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "prev,next today";
	}
	public void setLeftHeaderTemplate(java.lang.String _leftHeaderTemplate) {
		this._leftHeaderTemplate = _leftHeaderTemplate;
	}

	public java.lang.String getCenterHeaderTemplate() {
		if(_centerHeaderTemplate != null )
			return _centerHeaderTemplate;

		ValueExpression ve = getValueExpression("centerHeaderTemplate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "title";
	}
	public void setCenterHeaderTemplate(java.lang.String _centerHeaderTemplate) {
		this._centerHeaderTemplate = _centerHeaderTemplate;
	}

	public java.lang.String getRightHeaderTemplate() {
		if(_rightHeaderTemplate != null )
			return _rightHeaderTemplate;

		ValueExpression ve = getValueExpression("rightHeaderTemplate");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "month,agendaWeek,agendaDay";
	}
	public void setRightHeaderTemplate(java.lang.String _rightHeaderTemplate) {
		this._rightHeaderTemplate = _rightHeaderTemplate;
	}

	public boolean isAllDaySlot() {
		if(_allDaySlot != null )
			return _allDaySlot;

		ValueExpression ve = getValueExpression("allDaySlot");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setAllDaySlot(boolean _allDaySlot) {
		this._allDaySlot = _allDaySlot;
	}

	public int getSlotMinutes() {
		if(_slotMinutes != null )
			return _slotMinutes;

		ValueExpression ve = getValueExpression("slotMinutes");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 30;
	}
	public void setSlotMinutes(int _slotMinutes) {
		this._slotMinutes = _slotMinutes;
	}

	public int getFirstHour() {
		if(_firstHour != null )
			return _firstHour;

		ValueExpression ve = getValueExpression("firstHour");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 6;
	}
	public void setFirstHour(int _firstHour) {
		this._firstHour = _firstHour;
	}

	public java.lang.String getMinTime() {
		if(_minTime != null )
			return _minTime;

		ValueExpression ve = getValueExpression("minTime");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setMinTime(java.lang.String _minTime) {
		this._minTime = _minTime;
	}

	public java.lang.String getMaxTime() {
		if(_maxTime != null )
			return _maxTime;

		ValueExpression ve = getValueExpression("maxTime");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setMaxTime(java.lang.String _maxTime) {
		this._maxTime = _maxTime;
	}

	public int getStartWeekday() {
		if(_startWeekday != null )
			return _startWeekday;

		ValueExpression ve = getValueExpression("startWeekday");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 0;
	}
	public void setStartWeekday(int _startWeekday) {
		this._startWeekday = _startWeekday;
	}


	private java.util.Locale appropriateLocale;
	private ScheduleEventDialog eventDialog;
	
	java.util.Locale calculateLocale(FacesContext facesContext) {
		if(appropriateLocale == null) {
			Object userLocale = getLocale();
			if(userLocale != null) {
				if(userLocale instanceof String)
					appropriateLocale = new java.util.Locale((String) userLocale, "");
				else if(userLocale instanceof java.util.Locale)
					appropriateLocale = (java.util.Locale) userLocale;
				else
					throw new IllegalArgumentException("Type:" + userLocale.getClass() + " is not a valid locale type for calendar:" + this.getClientId(facesContext));
			} else {
				appropriateLocale = facesContext.getViewRoot().getLocale();
			}
		}
		
		return appropriateLocale;
	}

	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		MethodExpression me = null;
		
		if(event instanceof ScheduleEntrySelectEvent) me = getEventSelectListener();
		else if(event instanceof DateSelectEvent) me = getDateSelectListener();
		else if(event instanceof ScheduleEntryMoveEvent) me = getEventMoveListener();
		else if(event instanceof ScheduleEntryResizeEvent) me = getEventResizeListener();
		
		if (me != null) {
			me.invoke(facesContext.getELContext(), new Object[] {event});
		}
	}
	
	public ScheduleEventDialog getEventDialog() {
		if(eventDialog == null) {
			for(Iterator<UIComponent> iterator = getChildren().iterator(); iterator.hasNext();) {
				UIComponent kid = iterator.next();
				if(kid instanceof ScheduleEventDialog) {
					eventDialog = (ScheduleEventDialog) kid;
				}
			}
		}
		
		return eventDialog;	
	}
	
	public void processDecodes(FacesContext facesContext) {
		if(isScheduleRequest(facesContext)) {
			decode(facesContext);
			facesContext.renderResponse();
		} else {
			super.processDecodes(facesContext);
		}
    }
	
	private boolean isScheduleRequest(FacesContext facesContext) {
		return facesContext.getExternalContext().getRequestParameterMap().containsKey(getClientId(facesContext));
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
		Object values[] = new Object[31];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _value;
		values[3] = _locale;
		values[4] = _aspectRatio;
		values[5] = _view;
		values[6] = _initialDate;
		values[7] = _showWeekends;
		values[8] = _style;
		values[9] = _styleClass;
		values[10] = _editable;
		values[11] = _draggable;
		values[12] = _resizable;
		values[13] = _eventSelectListener;
		values[14] = _dateSelectListener;
		values[15] = _eventMoveListener;
		values[16] = _eventResizeListener;
		values[17] = _onEventSelectUpdate;
		values[18] = _onDateSelectUpdate;
		values[19] = _onEventMoveUpdate;
		values[20] = _onEventResizeUpdate;
		values[21] = _showHeader;
		values[22] = _leftHeaderTemplate;
		values[23] = _centerHeaderTemplate;
		values[24] = _rightHeaderTemplate;
		values[25] = _allDaySlot;
		values[26] = _slotMinutes;
		values[27] = _firstHour;
		values[28] = _minTime;
		values[29] = _maxTime;
		values[30] = _startWeekday;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_value = (java.lang.Object) values[2];
		_locale = (java.lang.Object) values[3];
		_aspectRatio = (java.lang.Float) values[4];
		_view = (java.lang.String) values[5];
		_initialDate = (java.lang.Object) values[6];
		_showWeekends = (java.lang.Boolean) values[7];
		_style = (java.lang.String) values[8];
		_styleClass = (java.lang.String) values[9];
		_editable = (java.lang.Boolean) values[10];
		_draggable = (java.lang.Boolean) values[11];
		_resizable = (java.lang.Boolean) values[12];
		_eventSelectListener = (javax.el.MethodExpression) values[13];
		_dateSelectListener = (javax.el.MethodExpression) values[14];
		_eventMoveListener = (javax.el.MethodExpression) values[15];
		_eventResizeListener = (javax.el.MethodExpression) values[16];
		_onEventSelectUpdate = (java.lang.String) values[17];
		_onDateSelectUpdate = (java.lang.String) values[18];
		_onEventMoveUpdate = (java.lang.String) values[19];
		_onEventResizeUpdate = (java.lang.String) values[20];
		_showHeader = (java.lang.Boolean) values[21];
		_leftHeaderTemplate = (java.lang.String) values[22];
		_centerHeaderTemplate = (java.lang.String) values[23];
		_rightHeaderTemplate = (java.lang.String) values[24];
		_allDaySlot = (java.lang.Boolean) values[25];
		_slotMinutes = (java.lang.Integer) values[26];
		_firstHour = (java.lang.Integer) values[27];
		_minTime = (java.lang.String) values[28];
		_maxTime = (java.lang.String) values[29];
		_startWeekday = (java.lang.Integer) values[30];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}