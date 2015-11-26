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
package org.primefaces.component.calendar;

import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import org.primefaces.component.calendar.Calendar;
import org.primefaces.event.DateSelectEvent;


public class Calendar extends UIInput {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Calendar";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.CalendarRenderer";

	private java.lang.String _widgetVar;
	private java.lang.Object _mindate;
	private java.lang.Object _maxdate;
	private java.lang.Integer _pages;
	private java.lang.Boolean _disabled;
	private java.lang.String _mode;
	private java.lang.String _pattern;
	private java.lang.Object _locale;
	private java.lang.String _popupIcon;
	private java.lang.Boolean _popupIconOnly;
	private java.lang.Boolean _navigator;
	private java.lang.Object _timeZone;
	private java.lang.Boolean _readOnlyInputText;
	private java.lang.String _onSelectUpdate;
	private javax.el.MethodExpression _selectListener;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private java.lang.String _inputStyle;
	private java.lang.String _inputStyleClass;
	private java.lang.Boolean _showButtonPanel;
	private java.lang.String _effect;
	private java.lang.String _effectDuration;
	private java.lang.String _showOn;
	private java.lang.Boolean _showWeek;
	private java.lang.Boolean _showOtherMonths;
	private java.lang.Boolean _selectOtherMonths;
	public Calendar() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.datepicker.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/calendar/calendar.js");
			resourceHolder.addResource("/primefaces/calendar/calendar_i18n.js");
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

	public java.lang.Object getMindate() {
		if(_mindate != null )
			return _mindate;

		ValueExpression ve = getValueExpression("mindate");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setMindate(java.lang.Object _mindate) {
		this._mindate = _mindate;
	}

	public java.lang.Object getMaxdate() {
		if(_maxdate != null )
			return _maxdate;

		ValueExpression ve = getValueExpression("maxdate");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setMaxdate(java.lang.Object _maxdate) {
		this._maxdate = _maxdate;
	}

	public int getPages() {
		if(_pages != null )
			return _pages;

		ValueExpression ve = getValueExpression("pages");
		return ve != null ? (java.lang.Integer) ve.getValue(getFacesContext().getELContext())  : 1;
	}
	public void setPages(int _pages) {
		this._pages = _pages;
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

	public java.lang.String getMode() {
		if(_mode != null )
			return _mode;

		ValueExpression ve = getValueExpression("mode");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "popup";
	}
	public void setMode(java.lang.String _mode) {
		this._mode = _mode;
	}

	public java.lang.String getPattern() {
		if(_pattern != null )
			return _pattern;

		ValueExpression ve = getValueExpression("pattern");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "MM/dd/yyyy";
	}
	public void setPattern(java.lang.String _pattern) {
		this._pattern = _pattern;
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

	public java.lang.String getPopupIcon() {
		if(_popupIcon != null )
			return _popupIcon;

		ValueExpression ve = getValueExpression("popupIcon");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setPopupIcon(java.lang.String _popupIcon) {
		this._popupIcon = _popupIcon;
	}

	public boolean isPopupIconOnly() {
		if(_popupIconOnly != null )
			return _popupIconOnly;

		ValueExpression ve = getValueExpression("popupIconOnly");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setPopupIconOnly(boolean _popupIconOnly) {
		this._popupIconOnly = _popupIconOnly;
	}

	public boolean isNavigator() {
		if(_navigator != null )
			return _navigator;

		ValueExpression ve = getValueExpression("navigator");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setNavigator(boolean _navigator) {
		this._navigator = _navigator;
	}

	public java.lang.Object getTimeZone() {
		if(_timeZone != null )
			return _timeZone;

		ValueExpression ve = getValueExpression("timeZone");
		return ve != null ? (java.lang.Object) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setTimeZone(java.lang.Object _timeZone) {
		this._timeZone = _timeZone;
	}

	public boolean isReadOnlyInputText() {
		if(_readOnlyInputText != null )
			return _readOnlyInputText;

		ValueExpression ve = getValueExpression("readOnlyInputText");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setReadOnlyInputText(boolean _readOnlyInputText) {
		this._readOnlyInputText = _readOnlyInputText;
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

	public javax.el.MethodExpression getSelectListener() {
		return this._selectListener;
	}

	public void setSelectListener(javax.el.MethodExpression _selectListener) {
		this._selectListener = _selectListener;
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

	public java.lang.String getInputStyle() {
		if(_inputStyle != null )
			return _inputStyle;

		ValueExpression ve = getValueExpression("inputStyle");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setInputStyle(java.lang.String _inputStyle) {
		this._inputStyle = _inputStyle;
	}

	public java.lang.String getInputStyleClass() {
		if(_inputStyleClass != null )
			return _inputStyleClass;

		ValueExpression ve = getValueExpression("inputStyleClass");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setInputStyleClass(java.lang.String _inputStyleClass) {
		this._inputStyleClass = _inputStyleClass;
	}

	public boolean isShowButtonPanel() {
		if(_showButtonPanel != null )
			return _showButtonPanel;

		ValueExpression ve = getValueExpression("showButtonPanel");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setShowButtonPanel(boolean _showButtonPanel) {
		this._showButtonPanel = _showButtonPanel;
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

	public java.lang.String getShowOn() {
		if(_showOn != null )
			return _showOn;

		ValueExpression ve = getValueExpression("showOn");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setShowOn(java.lang.String _showOn) {
		this._showOn = _showOn;
	}

	public boolean isShowWeek() {
		if(_showWeek != null )
			return _showWeek;

		ValueExpression ve = getValueExpression("showWeek");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setShowWeek(boolean _showWeek) {
		this._showWeek = _showWeek;
	}

	public boolean isShowOtherMonths() {
		if(_showOtherMonths != null )
			return _showOtherMonths;

		ValueExpression ve = getValueExpression("showOtherMonths");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setShowOtherMonths(boolean _showOtherMonths) {
		this._showOtherMonths = _showOtherMonths;
	}

	public boolean isSelectOtherMonths() {
		if(_selectOtherMonths != null )
			return _selectOtherMonths;

		ValueExpression ve = getValueExpression("selectOtherMonths");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : false;
	}
	public void setSelectOtherMonths(boolean _selectOtherMonths) {
		this._selectOtherMonths = _selectOtherMonths;
	}


	public static String POPUP_ICON = "/primefaces/calendar/calendar_icon.png";

	private java.util.Locale appropriateLocale;
	private java.util.TimeZone appropriateTimeZone;
	
	public java.util.Locale calculateLocale(FacesContext facesContext) {
		if(appropriateLocale == null) {
			Object userLocale = getLocale();
			if(userLocale != null) {
				if(userLocale instanceof String) {
					String[] tokens = ((String) userLocale).split("_");
					if(tokens.length == 1)
						appropriateLocale = new java.util.Locale(tokens[0], "");
					else
						appropriateLocale = new java.util.Locale(tokens[0], tokens[1]);
				}
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
	
	public java.util.TimeZone calculateTimeZone() {
		if(appropriateTimeZone == null) {
			Object usertimeZone = getTimeZone();
			if(usertimeZone != null) {
				if(usertimeZone instanceof String)
					appropriateTimeZone =  java.util.TimeZone.getTimeZone((String) usertimeZone);
				else if(usertimeZone instanceof java.util.TimeZone)
					appropriateTimeZone = (java.util.TimeZone) usertimeZone;
				else
					throw new IllegalArgumentException("TimeZone could be either String or java.util.TimeZone");
			} else {
				appropriateTimeZone = java.util.TimeZone.getDefault();
			}
		}
		
		return appropriateTimeZone;
	}
	
	public boolean isPopup() {
		return getMode().equalsIgnoreCase("popup");
	}

	public void broadcast(javax.faces.event.FacesEvent event) throws javax.faces.event.AbortProcessingException {
		super.broadcast(event);
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		MethodExpression me = getSelectListener();
		
		if (me != null && event instanceof org.primefaces.event.DateSelectEvent) {
			me.invoke(facesContext.getELContext(), new Object[] {event});
		}
	}

	protected FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}
	public Object saveState(FacesContext context) {
		Object values[] = new Object[27];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _mindate;
		values[3] = _maxdate;
		values[4] = _pages;
		values[5] = _disabled;
		values[6] = _mode;
		values[7] = _pattern;
		values[8] = _locale;
		values[9] = _popupIcon;
		values[10] = _popupIconOnly;
		values[11] = _navigator;
		values[12] = _timeZone;
		values[13] = _readOnlyInputText;
		values[14] = _onSelectUpdate;
		values[15] = _selectListener;
		values[16] = _style;
		values[17] = _styleClass;
		values[18] = _inputStyle;
		values[19] = _inputStyleClass;
		values[20] = _showButtonPanel;
		values[21] = _effect;
		values[22] = _effectDuration;
		values[23] = _showOn;
		values[24] = _showWeek;
		values[25] = _showOtherMonths;
		values[26] = _selectOtherMonths;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_mindate = (java.lang.Object) values[2];
		_maxdate = (java.lang.Object) values[3];
		_pages = (java.lang.Integer) values[4];
		_disabled = (java.lang.Boolean) values[5];
		_mode = (java.lang.String) values[6];
		_pattern = (java.lang.String) values[7];
		_locale = (java.lang.Object) values[8];
		_popupIcon = (java.lang.String) values[9];
		_popupIconOnly = (java.lang.Boolean) values[10];
		_navigator = (java.lang.Boolean) values[11];
		_timeZone = (java.lang.Object) values[12];
		_readOnlyInputText = (java.lang.Boolean) values[13];
		_onSelectUpdate = (java.lang.String) values[14];
		_selectListener = (javax.el.MethodExpression) values[15];
		_style = (java.lang.String) values[16];
		_styleClass = (java.lang.String) values[17];
		_inputStyle = (java.lang.String) values[18];
		_inputStyleClass = (java.lang.String) values[19];
		_showButtonPanel = (java.lang.Boolean) values[20];
		_effect = (java.lang.String) values[21];
		_effectDuration = (java.lang.String) values[22];
		_showOn = (java.lang.String) values[23];
		_showWeek = (java.lang.Boolean) values[24];
		_showOtherMonths = (java.lang.Boolean) values[25];
		_selectOtherMonths = (java.lang.Boolean) values[26];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}