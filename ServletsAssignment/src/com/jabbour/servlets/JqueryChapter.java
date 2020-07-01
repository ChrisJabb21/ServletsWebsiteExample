package com.jabbour.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JqueryChapter
 */
@WebServlet("/JqueryChapter")
public class JqueryChapter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JqueryChapter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter output = response.getWriter();
		
		
		output.println("<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"utf-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"    <title>Zen of Python</title>\r\n" + 
				"    <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n" + 
				"    <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n" + 
				"    <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n" + 
				"    <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n" + 
				"    <script>\r\n" + 
				"        $(function () {\r\n" + 
				"            $(\"#accordion\").accordion();\r\n" + 
				"        });\r\n" + 
				"    </script>\r\n" + 
				"\r\n" + 
				"    <style>\r\n" + 
				"        body{\r\n" + 
				"            background-color: antiquewhite;\r\n" + 
				"            color: green;\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"        h3 { \r\n" + 
				"            border: thick solid black;        \r\n" + 
				"            }\r\n" + 
				"    </style>\r\n" + 
				"</head>");
		
		output.println("<h1>Zen of Python</h1>\r\n" + 
				"    <div id=\"accordion\">\r\n" + 
				"            <h3>Part 1</h3>\r\n" + 
				"        <div>\r\n" + 
				"            <p>\r\n" + 
				"                Beautiful is better than ugly.\r\n" + 
				"Explicit is better than implicit.\r\n" + 
				"Simple is better than complex.\r\n" + 
				"Complex is better than complicated.\r\n" + 
				"Flat is better than nested.\r\n" + 
				"Sparse is better than dense.\r\n" + 
				"Readability counts.\r\n" + 
				"            </p>\r\n" + 
				"        </div>\r\n" + 
				"            <h3>Part 2</h3>\r\n" + 
				"        <div>\r\n" + 
				"            <p>Special cases aren't special enough to break the rules. Although practicality beats purity. Errors should never pass silently. Unless explicitly silenced.\r\n" + 
				"            </p>\r\n" + 
				"        </div>\r\n" + 
				"            <h3>Part 3</h3>\r\n" + 
				"        <div>\r\n" + 
				"            <p>\r\n" + 
				"                In the face of ambiguity, refuse the temptation to guess.\r\n" + 
				"                There should be one-- and preferably only one --obvious way to do it.\r\n" + 
				"                Although that way may not be obvious at first unless you're Dutch.\r\n" + 
				"            </p>\r\n" + 
				"        </div>\r\n" + 
				"            <h3>Part 4</h3>\r\n" + 
				"        <div>\r\n" + 
				"            <p>Now is better than never.\r\n" + 
				"Although never is often better than *right* now.\r\n" + 
				"If the implementation is hard to explain, it's a bad idea.\r\n" + 
				"If the implementation is easy to explain, it may be a good idea.\r\n" + 
				"Namespaces are one honking great idea -- let's do more of those!\r\n" + 
				"            </p>\r\n" + 
				"        </div>\r\n" + 
				"    </div>");
		
		
		
		output.println("<a href=\"Home\">Back to showcase</a>");

		
		
		output.println("</body>\r\n" + 
				"</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
