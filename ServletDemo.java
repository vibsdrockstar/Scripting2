import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
public class DemoServlet extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");//setting the content type  
PrintWriter pw=res.getWriter();//get the stream to write the data  
  
//writing html in the stream  
pw.println("<html><body>");  
pw.println("Welcome to servlet"); 
pw.println("<form method=post action=Final.xls>");
pw.println("<center><h2 style=color:green>File Downloading in JSP</h2></center>");
pw.println("<table border=1 align=center>");
pw.println("<tr>");
pw.println("<td><input type=submit value=Proceed/></td>");
pw.println("</tr>");
pw.println("</table>");
pw.println("</form>");
pw.println("</body></html>");  
  
pw.close();//closing the stream  
}}  
