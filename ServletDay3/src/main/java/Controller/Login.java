package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.PersonDao;
import Dto.Person;

@WebServlet("/Login_page")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		long dbphone=Long.parseLong(req.getParameter("phone"));
		String dbemail = req.getParameter("email");
		String dbpassword = req.getParameter("password");
		
		
		PersonDao personDao=new PersonDao();
		Person person=personDao.fetchByName(dbemail);
//		Person person=personDao.fetchByPhone(dbphone);
		
		if(dbemail==(person.getPersonEmail()) && dbpassword.equals(person.getPersonPassword()));
	
		{
			resp.sendRedirect("https://www.flipkart.com/");
		}
		else
		{
			
			PrintWriter printWriter=resp.getWriter();
			printWriter.print("invalid credntials");
			
		}
		
	}
}
