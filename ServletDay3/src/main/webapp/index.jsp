<html>
<body>
<h2>Hello World!</h2>
</body>
</html>
package Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import Dao.PersonDao;
import Dto.Person;

public class ServletSignup extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int pid = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		long phone = Long.parseLong(req.getParameter("phone"));
		String email = req.getParameter("gmail");
		String password = req.getParameter("password");

//		PrintWriter printWriter=res.getWriter();
//		printWriter.print("personName :" + name + " "+ "personAddress:"+address+" "+"personPhone:"+ phone+" "+"personEmail"+email+" "+"personpassword"+password);

		Person person = new Person();
		person.setPersonName(name);
		person.setPersonAddress(address);
		person.setPersonPhno(phone);
		person.setPersonEmail(email);
		person.setPersonPassword(password);

		PersonDao.saveBoth(person);

	}

}
