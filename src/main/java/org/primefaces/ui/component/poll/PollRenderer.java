package org.primefaces.ui.component.poll;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.event.ActionEvent;

import org.primefaces.ui.renderkit.CoreRenderer;
import org.primefaces.ui.util.ComponentUtils;

public class PollRenderer extends CoreRenderer {

	public void decode(FacesContext facesContext, UIComponent component) {
		Poll poll = (Poll) component;
		
		String clientId = poll.getClientId(facesContext);
		
		if(facesContext.getExternalContext().getRequestParameterMap().containsKey(clientId)) {
			poll.queueEvent(new ActionEvent(poll));
		}
	}
	
	public void encodeEnd(FacesContext facesContex, UIComponent component) throws IOException {
		Poll poll = (Poll) component;
		
		encodePollScript(facesContex, poll);
	}

	protected void encodePollScript(FacesContext facesContext, Poll poll) throws IOException {
		ResponseWriter writer = facesContext.getResponseWriter();
		String clientId = poll.getClientId(facesContext);
		String parentFormClientId = ComponentUtils.findParentForm(facesContext, poll).getClientId(facesContext);
		String pollVar = createUniqueWidgetVar(facesContext, poll);
		
		String actionURL = getActionURL(facesContext);
		
		writer.startElement("script", null);
		writer.writeAttribute("type", "text/javascript", null);
		
		writer.write("YAHOO.util.Event.addListener(window, \"load\", function() {\n");
		
		writer.write(pollVar + "= new PrimeFaces.widget.Poll({");
		writer.write("clientId:\"" + clientId + "\"");
		writer.write(",formClientId:\"" + parentFormClientId + "\"");
		writer.write(",url:\"" + actionURL + "\"");
		writer.write(",update:\"" + poll.getUpdate() + "\"");
		writer.write(",frequency:" + poll.getInterval() + "");
		writer.write("});\n");

		writer.write("});\n");
		
		writer.endElement("script");
	}
}