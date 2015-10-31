
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
@WebServlet("/JamesLotto")
public class JamesLotto extends HttpServlet
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
	
	
	ArrayList<Integer> list = new ArrayList();
	
	list.add(number1);
	list.add(number2);
	list.add(number3);
	list.add(number4);
	list.add(number5);
	list.add(number6);
	
	
	
	
	
	out.println("<html>");
	out.println("<body>");
	out.println("<div>");
	int wrongNum=0;
	for(int i=0; i< list.size(); i++){
		int value =  list.get(i);
		
	if(value>47){
			
			wrongNum++;
			
		}//end if
	
		
	}//end for

	if((number1==number2)||(number1==number3)||(number1==number4)||(number1==number5)||(number1==number6))
	{wrongNum++;}
	if((number2==number1)||(number2==number3)||(number2==number4)||(number2==number5)||(number2==number6))
	{wrongNum++;}
	if((number3==number1)||(number3==number2)||(number3==number4)||(number3==number5)||(number3==number6))
	{wrongNum++;}
	if((number4==number1)||(number4==number2)||(number4==number3)||(number4==number5)||(number4==number6))
	{wrongNum++;}
	if((number5==number1)||(number5==number2)||(number5==number3)||(number5==number4)||(number5==number6))
	{wrongNum++;}
	if((number6==number1)||(number6==number2)||(number6==number3)||(number6==number4)||(number6==number5))
	{wrongNum++;}
	
	Collections.sort(list);
	
	if(wrongNum ==0){
		
		out.println("Your numbers are ok!!\n\n");
		out.println("<br>");
		out.println("Your numbers in sorted order are: ");
		out.println(list);
		
		
	}//end if
	else{
		out.println("<script type=\"text/javascript\">");
		out.println("alert('ERROR You cannot enter dublicates of numbers greater than 47!!!!');");
		out.println("</script>");
		out.println("You have entered "+wrongNum+" wrong number(s) this time!");
		//response.sendRedirect("/JamesLotto");
		
	}//end else
	
	out.println("</div>");
	out.println("</body>");
	out.println("</html>");
	
	out.close();
	}
	

	
	
}