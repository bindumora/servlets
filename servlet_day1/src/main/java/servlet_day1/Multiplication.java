package servlet_day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Multiplication extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int name=Integer.parseInt(req.getParameter("number1"));
		int name1=Integer.parseInt(req.getParameter("number2"));
		
		
		PrintWriter printWriter=res.getWriter();
		printWriter.print(name*name1);
		
	
	}

}
