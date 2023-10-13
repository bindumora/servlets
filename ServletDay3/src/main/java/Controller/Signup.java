package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.PersonDao;
import Dto.Person;

public class Signup extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int pid = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		long phone = Long.parseLong(req.getParameter("phone"));
		String email = req.getParameter("gmail");
		String password = req.getParameter("password");

		Person person = new Person();
		person.setPersonName(name);
		person.setPersonAddress(address);
		person.setPersonPhno(phone);
		person.setPersonEmail(email);
		person.setPersonPassword(password);
		
		PersonDao personDao=new PersonDao();
		personDao.saveBoth(person);
		resp.sendRedirect("Login.html");
		//resp.sendRedirect("https://www.flipkart.com/");
		
//		PrintWriter printWriter = res.getWriter();
//		printWriter.print("personName :" + name + "\n" + "personAddress:" + address + "\n" + "personPhone:" + phone + "\n"
//	+ "personEmail:" + email + "\n" + "personpassword:" + password);
		
		
	
	}

}
