import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.model.data;

@WebServlet("/addsub")
public class addsub extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	String branch=req.getParameter("branch");
	String sem=req.getParameter("sem");
	String sub=req.getParameter("subject");
	new data().subject(branch,sem,sub);
	resp.sendRedirect("home.jsp");
}
}

