package sai.tap;

import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Sum  extends HttpServlet
{
	private static final long serialVersionUID =1L;
	
	
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		   int  X=Integer.parseInt(req.getParameter("num1"));
		   int  Y=Integer.parseInt(req.getParameter("num2"));
		   int sum = X+Y;
		   PrintWriter out = resp.getWriter();
		   out.println("SUM : "+sum);
		   RequestDispatcher rd = req.getRequestDispatcher("calc");
		   rd.include(req, resp);
	}
	}