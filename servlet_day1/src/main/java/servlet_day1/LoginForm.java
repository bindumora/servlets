package servlet_day1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginForm extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		long phone=Long.parseLong(req.getParameter("phone"));
				
				
				
				PrintWriter printWriter=res.getWriter();
			printWriter.print(name+ "\n" + age + "\n" + email + "\n" + phone);
//				printWriter.print(age);
//				printWriter.print(email);
//				printWriter.print(phone);
	}

}
