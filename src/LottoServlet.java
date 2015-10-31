
import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Don't forget to add the servlet-api.jar to your classpath. It's in the lib folder in Tomcat.
@WebServlet("/LottoServlet")
public class LottoServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{

//Add functionality here to take in the numbers from the request, validate them, sort them, and display them back to the user via the response.
//Compile the class and put the YourServletClassName.class file in this folder i.e., ..WEB-INF/classes folder
	String title = "Lotto";
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	String num3 = request.getParameter("num3");
	String num4 = request.getParameter("num4");
	String num5 = request.getParameter("num5");
	String num6 = request.getParameter("num6");
	
	
	int number1 = Integer.parseInt(num1);
	int number2 = Integer.parseInt(num2);
	int number3 = Integer.parseInt(num3);
	int number4 = Integer.parseInt(num4);
	int number5 = Integer.parseInt(num5);
	int number6 = Integer.parseInt(num6);
	
	
	
	
	
	out.println("Number1 = " + num1);
	out.close();
	}
	

	
	
}