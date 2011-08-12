package com.bradchen.demo.facelets;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 * A backing bean that stores some random value.
 *
 * @author Brad Chen
 */
@ManagedBean(name="bean")
@SessionScoped
public class Bean {

	private String value;

	public Bean() {
		value = "some value";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Render the Facelets template specified by the path.
	 *
	 * @param path path to the template
	 * @return rendered content of the Facelets template
	 */
	public String renderFaceletsPage(String path) {
		FacesContext context = FacesContext.getCurrentInstance();
		FaceletRenderer renderer = new FaceletRenderer(context);
		return renderer.renderView(path);
	}

}
