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
package org.primefaces.component.chart.series;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class ChartSeriesTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _converter;
	private javax.el.ValueExpression _label;
	private javax.el.ValueExpression _style;

	public void release(){
		super.release();
		this._value = null;
		this._converter = null;
		this._label = null;
		this._style = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.chart.series.ChartSeries component = null;
		try {
			component = (org.primefaces.component.chart.series.ChartSeries) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_converter != null) {
			component.setValueExpression("converter", _converter);
		}
		if(_label != null) {
			component.setValueExpression("label", _label);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
	}

	public String getComponentType() {
		return ChartSeries.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return null;
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setConverter(javax.el.ValueExpression expression){
		this._converter = expression;
	}

	public void setLabel(javax.el.ValueExpression expression){
		this._label = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

}