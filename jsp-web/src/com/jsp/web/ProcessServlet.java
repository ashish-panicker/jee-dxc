package com.jsp.web;

import java.io.IOException;
import java.net.CookieStore;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProcessData
 */
@WebServlet("/process.do")
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<Person> people ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		
		Cookie cookies[] =  request.getCookies();
		for (Cookie ck : cookies) {
			System.out.println(ck.getName());
		}
		
		HttpSession session =  request.getSession();
		
		
		Cookie c = new Cookie("random", username);
		response.addCookie(c);
		
		Cookie c2 = new Cookie("random2", username);
		response.addCookie(c2);
		
		
		if(session.getAttribute("data") == null) {
			people = new LinkedList<Person>();
		}
		
		Person p = new Person(username, email);
		
		people.add(p);
		
		session.setAttribute("data", people);
		
		response.sendRedirect("index.jsp");
		
	}

	
}
