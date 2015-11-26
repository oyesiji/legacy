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
package org.primefaces.component.graphictext;

import javax.faces.webapp.UIComponentELTag;
import javax.faces.component.UIComponent;

public class GraphicTextTag extends UIComponentELTag {

	private javax.el.ValueExpression _value;
	private javax.el.ValueExpression _alt;
	private javax.el.ValueExpression _fontName;
	private javax.el.ValueExpression _fontStyle;
	private javax.el.ValueExpression _fontSize;
	private javax.el.ValueExpression _title;
	private javax.el.ValueExpression _style;
	private javax.el.ValueExpression _styleClass;
	private javax.el.ValueExpression _onclick;
	private javax.el.ValueExpression _ondblclick;
	private javax.el.ValueExpression _onkeydown;
	private javax.el.ValueExpression _onkeypress;
	private javax.el.ValueExpression _onkeyup;
	private javax.el.ValueExpression _onmousedown;
	private javax.el.ValueExpression _onmousemove;
	private javax.el.ValueExpression _onmouseout;
	private javax.el.ValueExpression _onmouseover;
	private javax.el.ValueExpression _onmouseup;

	public void release(){
		super.release();
		this._value = null;
		this._alt = null;
		this._fontName = null;
		this._fontStyle = null;
		this._fontSize = null;
		this._title = null;
		this._style = null;
		this._styleClass = null;
		this._onclick = null;
		this._ondblclick = null;
		this._onkeydown = null;
		this._onkeypress = null;
		this._onkeyup = null;
		this._onmousedown = null;
		this._onmousemove = null;
		this._onmouseout = null;
		this._onmouseover = null;
		this._onmouseup = null;
	}

	protected void setProperties(UIComponent comp){
		super.setProperties(comp);

		org.primefaces.component.graphictext.GraphicText component = null;
		try {
			component = (org.primefaces.component.graphictext.GraphicText) comp;
		} catch(ClassCastException cce) {
			throw new IllegalStateException("Component " + component.toString() + " not expected type.");
		}

		if(_value != null) {
			component.setValueExpression("value", _value);
		}
		if(_alt != null) {
			component.setValueExpression("alt", _alt);
		}
		if(_fontName != null) {
			component.setValueExpression("fontName", _fontName);
		}
		if(_fontStyle != null) {
			component.setValueExpression("fontStyle", _fontStyle);
		}
		if(_fontSize != null) {
			component.setValueExpression("fontSize", _fontSize);
		}
		if(_title != null) {
			component.setValueExpression("title", _title);
		}
		if(_style != null) {
			component.setValueExpression("style", _style);
		}
		if(_styleClass != null) {
			component.setValueExpression("styleClass", _styleClass);
		}
		if(_onclick != null) {
			component.setValueExpression("onclick", _onclick);
		}
		if(_ondblclick != null) {
			component.setValueExpression("ondblclick", _ondblclick);
		}
		if(_onkeydown != null) {
			component.setValueExpression("onkeydown", _onkeydown);
		}
		if(_onkeypress != null) {
			component.setValueExpression("onkeypress", _onkeypress);
		}
		if(_onkeyup != null) {
			component.setValueExpression("onkeyup", _onkeyup);
		}
		if(_onmousedown != null) {
			component.setValueExpression("onmousedown", _onmousedown);
		}
		if(_onmousemove != null) {
			component.setValueExpression("onmousemove", _onmousemove);
		}
		if(_onmouseout != null) {
			component.setValueExpression("onmouseout", _onmouseout);
		}
		if(_onmouseover != null) {
			component.setValueExpression("onmouseover", _onmouseover);
		}
		if(_onmouseup != null) {
			component.setValueExpression("onmouseup", _onmouseup);
		}
	}

	public String getComponentType() {
		return GraphicText.COMPONENT_TYPE;
	}

	public String getRendererType() {
		return "org.primefaces.component.graphictext.GraphicTextRenderer";
	}

	public void setValue(javax.el.ValueExpression expression){
		this._value = expression;
	}

	public void setAlt(javax.el.ValueExpression expression){
		this._alt = expression;
	}

	public void setFontName(javax.el.ValueExpression expression){
		this._fontName = expression;
	}

	public void setFontStyle(javax.el.ValueExpression expression){
		this._fontStyle = expression;
	}

	public void setFontSize(javax.el.ValueExpression expression){
		this._fontSize = expression;
	}

	public void setTitle(javax.el.ValueExpression expression){
		this._title = expression;
	}

	public void setStyle(javax.el.ValueExpression expression){
		this._style = expression;
	}

	public void setStyleClass(javax.el.ValueExpression expression){
		this._styleClass = expression;
	}

	public void setOnclick(javax.el.ValueExpression expression){
		this._onclick = expression;
	}

	public void setOndblclick(javax.el.ValueExpression expression){
		this._ondblclick = expression;
	}

	public void setOnkeydown(javax.el.ValueExpression expression){
		this._onkeydown = expression;
	}

	public void setOnkeypress(javax.el.ValueExpression expression){
		this._onkeypress = expression;
	}

	public void setOnkeyup(javax.el.ValueExpression expression){
		this._onkeyup = expression;
	}

	public void setOnmousedown(javax.el.ValueExpression expression){
		this._onmousedown = expression;
	}

	public void setOnmousemove(javax.el.ValueExpression expression){
		this._onmousemove = expression;
	}

	public void setOnmouseout(javax.el.ValueExpression expression){
		this._onmouseout = expression;
	}

	public void setOnmouseover(javax.el.ValueExpression expression){
		this._onmouseover = expression;
	}

	public void setOnmouseup(javax.el.ValueExpression expression){
		this._onmouseup = expression;
	}

}