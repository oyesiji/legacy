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
package org.primefaces.component.wizard;

import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.render.Renderer;
import java.io.IOException;
import org.primefaces.renderkit.PartialRenderer;
import org.primefaces.resource.ResourceHolder;
import org.primefaces.component.tabview.Tab;
import org.primefaces.event.FlowEvent;


public class Wizard extends UIComponentBase implements org.primefaces.component.api.AjaxComponent,javax.faces.component.NamingContainer {


	public static final String COMPONENT_TYPE = "org.primefaces.component.Wizard";
	public static final String COMPONENT_FAMILY = "org.primefaces.component";
	private static final String DEFAULT_RENDERER = "org.primefaces.component.WizardRenderer";

	private java.lang.String _widgetVar;
	private java.lang.String _step;
	private java.lang.String _style;
	private java.lang.String _styleClass;
	private javax.el.MethodExpression _flowListener;
	private java.lang.Boolean _showNavBar;
	private java.lang.String _onback;
	private java.lang.String _onnext;
	private java.lang.String _nextLabel;
	private java.lang.String _backLabel;
	private java.lang.Boolean _effect;
	private java.lang.String _effectSpeed;
	public Wizard() {
		setRendererType(DEFAULT_RENDERER);
		ResourceHolder resourceHolder = getResourceHolder();
		if(resourceHolder != null) {
			resourceHolder.addResource("/primefaces/wizard/wizard.css");
			resourceHolder.addResource("/jquery/plugins/ui/jquery.ui.button.css");
			resourceHolder.addResource("/jquery/jquery.js");
			resourceHolder.addResource("/jquery/plugins/ui/jquery-ui.custom.js");
			resourceHolder.addResource("/primefaces/core/core.js");
			resourceHolder.addResource("/primefaces/wizard/wizard.js");
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

	public java.lang.String getStep() {
		if(_step != null )
			return _step;

		ValueExpression ve = getValueExpression("step");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setStep(java.lang.String _step) {
		this._step = _step;
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

	public javax.el.MethodExpression getFlowListener() {
		return this._flowListener;
	}

	public void setFlowListener(javax.el.MethodExpression _flowListener) {
		this._flowListener = _flowListener;
	}
	public boolean isShowNavBar() {
		if(_showNavBar != null )
			return _showNavBar;

		ValueExpression ve = getValueExpression("showNavBar");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setShowNavBar(boolean _showNavBar) {
		this._showNavBar = _showNavBar;
	}

	public java.lang.String getOnback() {
		if(_onback != null )
			return _onback;

		ValueExpression ve = getValueExpression("onback");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnback(java.lang.String _onback) {
		this._onback = _onback;
	}

	public java.lang.String getOnnext() {
		if(_onnext != null )
			return _onnext;

		ValueExpression ve = getValueExpression("onnext");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : null;
	}
	public void setOnnext(java.lang.String _onnext) {
		this._onnext = _onnext;
	}

	public java.lang.String getNextLabel() {
		if(_nextLabel != null )
			return _nextLabel;

		ValueExpression ve = getValueExpression("nextLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "Next";
	}
	public void setNextLabel(java.lang.String _nextLabel) {
		this._nextLabel = _nextLabel;
	}

	public java.lang.String getBackLabel() {
		if(_backLabel != null )
			return _backLabel;

		ValueExpression ve = getValueExpression("backLabel");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "Back";
	}
	public void setBackLabel(java.lang.String _backLabel) {
		this._backLabel = _backLabel;
	}

	public boolean isEffect() {
		if(_effect != null )
			return _effect;

		ValueExpression ve = getValueExpression("effect");
		return ve != null ? (java.lang.Boolean) ve.getValue(getFacesContext().getELContext())  : true;
	}
	public void setEffect(boolean _effect) {
		this._effect = _effect;
	}

	public java.lang.String getEffectSpeed() {
		if(_effectSpeed != null )
			return _effectSpeed;

		ValueExpression ve = getValueExpression("effectSpeed");
		return ve != null ? (java.lang.String) ve.getValue(getFacesContext().getELContext())  : "normal";
	}
	public void setEffectSpeed(java.lang.String _effectSpeed) {
		this._effectSpeed = _effectSpeed;
	}


	private Tab tabToProcess;

	public void processDecodes(FacesContext facesContext) {
		if(isWizardRequest(facesContext)) {
			//If flow goes back, skip to rendering
			if(isBackRequest(facesContext)) {
				facesContext.renderResponse();
			} else {
				getStepToProcess(facesContext).processDecodes(facesContext);
			}
			
		} else {
			super.processDecodes(facesContext);
		}
    }
	
	public void processValidators(FacesContext facesContext) {
		if(isWizardRequest(facesContext)) {
			getStepToProcess(facesContext).processValidators(facesContext);
		} else {
			super.processValidators(facesContext);
		}
    }
	
	public void processUpdates(FacesContext facesContext) {
		if(isWizardRequest(facesContext)) {
			getStepToProcess(facesContext).processUpdates(facesContext);
		} else {
			super.processUpdates(facesContext);
		}
	}
	
	public Tab getStepToProcess(FacesContext facesContext) {
		if(tabToProcess == null) {
			String currentStepId = facesContext.getExternalContext().getRequestParameterMap().get(getClientId(facesContext) + "_currentStep");
			
			for(javax.faces.component.UIComponent child : getChildren()) {
				if(child.getId().equals(currentStepId)) {
					tabToProcess = (Tab) child;
					
					break;
				}
			}
		}
		
		return tabToProcess;
	}
	
	private boolean isWizardRequest(FacesContext facesContext) {
		return facesContext.getExternalContext().getRequestParameterMap().containsKey(getClientId(facesContext) + "_wizardRequest");
	}
	
	private boolean isBackRequest(FacesContext facesContext) {
		return facesContext.getExternalContext().getRequestParameterMap().containsKey(getClientId(facesContext) + "_backRequest");
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
		Object values[] = new Object[13];
		values[0] = super.saveState(context);
		values[1] = _widgetVar;
		values[2] = _step;
		values[3] = _style;
		values[4] = _styleClass;
		values[5] = _flowListener;
		values[6] = _showNavBar;
		values[7] = _onback;
		values[8] = _onnext;
		values[9] = _nextLabel;
		values[10] = _backLabel;
		values[11] = _effect;
		values[12] = _effectSpeed;
		return ((Object) values);
	}
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[]) state;
		super.restoreState(context, values[0]);
		_widgetVar = (java.lang.String) values[1];
		_step = (java.lang.String) values[2];
		_style = (java.lang.String) values[3];
		_styleClass = (java.lang.String) values[4];
		_flowListener = (javax.el.MethodExpression) values[5];
		_showNavBar = (java.lang.Boolean) values[6];
		_onback = (java.lang.String) values[7];
		_onnext = (java.lang.String) values[8];
		_nextLabel = (java.lang.String) values[9];
		_backLabel = (java.lang.String) values[10];
		_effect = (java.lang.Boolean) values[11];
		_effectSpeed = (java.lang.String) values[12];
	}

	protected ResourceHolder getResourceHolder() {
		FacesContext facesContext = getFacesContext();
		if(facesContext == null)
			return null;

		ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{primeFacesResourceHolder}", ResourceHolder.class);

		return (ResourceHolder) ve.getValue(facesContext.getELContext());
	}
}