package com.herokuapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		//Cookies
		int k=0;
		Cookie cookie[]=req.getCookies();
		for(Cookie c:cookie) {
			if(c.getName().equals(("k"))) {
				k=Integer.parseInt(c.getValue());
			}
		}
		
		
//		HttpSession session=req.getSession();   //Sessions
//		int k=(int)session.getAttribute("k");
//		session.removeAttribute("k");
		
//		int k=Integer.parseInt(req.getParameter("k"));
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println(k);
		
		//Request Dispatcher
//		int k=(int) req.getAttribute("k");
//		k=k*k;
//		PrintWriter out=res.getWriter();
//		out.println(k);
	}
}
