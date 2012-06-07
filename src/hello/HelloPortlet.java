package hello;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class HelloPortlet extends GenericPortlet {

	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		PortletRequestDispatcher dispatcher = getPortletContext()
				.getRequestDispatcher("/jsp/view.jsp");
		dispatcher.include(request, response);
	}

	@Override
	protected void doEdit(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		PortletRequestDispatcher dispatcher = getPortletContext()
				.getRequestDispatcher("/jsp/edit.jsp");
		dispatcher.include(request, response);
	}

	@Override
	protected void doHelp(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		PortletRequestDispatcher dispatcher = getPortletContext()
				.getRequestDispatcher("/jsp/help.jsp");
		dispatcher.include(request, response);
	}

}
