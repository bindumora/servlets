package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.Student;

public class Signup  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String fname=req.getParameter("name2");
		String mname=req.getParameter("name3");
		String email=req.getParameter("email");
		String pwd=req.getParameter("password");
//		double fee=Double.parseDouble(req.getParameter("fee"));
//		String school=req.getParameter("name");
		
		ServletContext context=getServletContext();
		String school=context.getInitParameter("school");
		    
		
	  ServletConfig config=getServletConfig();
	 double fees=Double.parseDouble(config.getInitParameter("fee"));
		
		Student student=new Student();
		student.setStudentName(name);
		student.setStudentFatherName(fname);
		student.setStudentMotherName(mname);
		student.setStudentEmail(email);
		student.setStudentPassword(pwd);
		student.setStudentSchool(school);
		student.setStudentFee(fees);
		
	  StudentDao studentDao=new StudentDao();
      studentDao.saveBoth(student);
	  
	  
	  RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
	  dispatcher.forward(req, resp);
	}
   
	
	
}
