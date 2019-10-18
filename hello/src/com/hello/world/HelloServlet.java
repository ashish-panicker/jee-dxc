package com.hello.world;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().println("<h1>Hello world servlet....</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		String name = "";
		name = request.getParameter("username");
		
		String output = "Welcome " + name;
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Welcome</title></head>");
		out.println("<body>");
		out.println("<h1>"+ output + "</h1>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
