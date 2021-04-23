package com.herokuapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
//		
//		int k=i+j;
		//Servlet context
//		ServletContext ctx=getServletContext();
//		String str=ctx.getInitParameter("name");
		
		//Servlet config
		ServletConfig cg=getServletConfig();
		String str=cg.getInitParameter("name");
		PrintWriter out=res.getWriter();
//		out.println(k);
		out.println("name is :"+str);
		System.out.println("name is : "+str);
//		req.setAttribute("k", k);

//		Cookie cookie=new Cookie("k",k+"");
//		res.addCookie(cookie);
		
//		HttpSession session=req.getSession();   //Session
//		session.setAttribute("k",k);
//		res.sendRedirect("sq");
		
		
//		res.sendRedirect("sq?k="+k); //URL Rewritting
		
		//RequestDispatcher
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
	}
}
