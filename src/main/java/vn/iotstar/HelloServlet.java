package vn.iotstar;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

@WebServlet(urlPatterns = { "/hello", "/CheckBoxAction" })

public class HelloServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6648252811750408718L;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Khoi tao");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
		System.out.println(req.getMethod());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Set response content type
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		String title = "Doc du lieu tu CheckBox trong Servlet";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor = \"#f0f0f0\">\n" + "<h1 align = \"center\">" + title + "</h1>\n" + "<ul>\n"
				+ " <li><b>Toan : </b>: " + req.getParameter("toan") + "\n" + " <li><b>Vat Ly: </b>: "
				+ req.getParameter("ly") + "\n" + " <li><b>Hoa Hoc: </b>: " + req.getParameter("hoa") + "\n"
				+ "</ul>\n" + "</body>" + "</html>");
		out.close();
	}

}
