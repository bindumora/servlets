package controller;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.Student;

public class Login extends HttpServlet{
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		
		ServletContext context=getServletContext();
		String school=context.getInitParameter("school");
		
		
		  StudentDao studentDao=new StudentDao();
		 Student student=studentDao.fetch(id);
		 
		 if(id==student.getStudentId()&&school.equals(student.getStudentSchool())&&email.equals(student.getStudentEmail())&&password.equals(student.getStudentPassword()))
		 {
			 resp.sendRedirect("https://www.youtube.com/");
		 }
		 else {
			 RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
			 dispatcher.forward(req, resp);
		 }
		
	}

}
