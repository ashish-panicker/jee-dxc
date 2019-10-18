package com.params.listners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ParamListner implements ServletContextListener {
	
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		String url = sce.getServletContext().getInitParameter("db-Url");
		
		System.out.println("Application created....");
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Application destroyed....");
	}

}
