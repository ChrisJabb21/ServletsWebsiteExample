package com.jabbour.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Experience
 */
@WebServlet("/Experience")
public class Experience extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Experience() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"  <title>Jabbour Medical Center - Home</title>\r\n" + 
				"  <meta charset=\"utf-8\">\r\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n" + 
				"  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n" + 
				"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n" + 
				"<style>\r\n" + 
				".navbar-inverse {\r\n" + 
				"    background-color: lightblue !important;\r\n" + 
				"    border-color: lightblue !important;\r\n" + 
				"    color:rgb(104, 102, 102) !important;\r\n" + 
				"}\r\n" + 
				"body{\r\n" + 
				"    background-color: lightcyan !important;\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"</style>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</head>\r\n" + 
				"<body>");
		
		out.println("<nav class=\"navbar navbar-inverse navbar-expand-sm\">\r\n" + 
				"  <div class=\"container-fluid\">\r\n" + 
				"    <div class=\"navbar-header\">\r\n" + 
				"      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n" + 
				"        <span class=\"icon-bar\"></span>\r\n" + 
				"        <span class=\"icon-bar\"></span>\r\n" + 
				"        <span class=\"icon-bar\"></span>                        \r\n" + 
				"      </button>\r\n" + 
				"      <a class=\"navbar-brand\" href= \"./Home\">Jabbour Medical Center</a>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n" + 
				"      <ul class=\"nav navbar-nav\">\r\n" + 
				"        <li><a href=\"./Home\">Home</a></li>\r\n" + 
				"        <li><a href=\"./About\">About Us</a></li>\r\n" + 
				"        <li><a href=\"./Contact\">Contact Us</a></li>\r\n" + 
				"        <li><a href=\"./Experience\">Experience</a></li>\r\n" + 
				"        <li><a href=\"./Locations\">Locations</a></li>\r\n" + 
				"\r\n" + 
				"      </ul>\r\n" + 
				"    </div>\r\n" + 
				"  </div>\r\n" + 
				"</nav>");
		//End of header and navigation
		
		
		out.println("<div class= \"container\">\r\n" + 
				"    <div class=\"jumbotron\">\r\n" + 
				"    <h1>Experience</h1>\r\n" + 
				"    <p>All of our doctors have over 30 years of experience working in various hospitals local to the Greater Pittsburgh Area.\r\n" + 
				"    </p>\r\n" + 
				"    </div>\r\n" + 
				"    <p>Always accepting new patients and open to any questions and consultation.</p>\r\n" + 
				"</div>");
		
		out.println("<div class=\"card-deck\">\r\n" + 
				"  <div class=\"card\">\r\n" + 
				"    <img src=\"...\" class=\"card-img-top\" alt=\"...\">\r\n" + 
				"    <div class=\"card-body\">\r\n" + 
				"      <h5 class=\"card-title\">Dr. Victor Jabbour, MD</h5>\r\n" + 
				"      <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"card-footer\">\r\n" + 
				"      <small class=\"text-muted\">Last updated 3 mins ago</small>\r\n" + 
				"    </div>\r\n" + 
				"  </div>\r\n" + 
				"  <div class=\"card\">\r\n" + 
				"    <img src=\"...\" class=\"card-img-top\" alt=\"...\">\r\n" + 
				"    <div class=\"card-body\">\r\n" + 
				"      <h5 class=\"card-title\">Dr. Nabil Jabbour</h5>\r\n" + 
				"      <p class=\"card-text\">This card has supporting text below as a natural lead-in to additional content.</p>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"card-footer\">\r\n" + 
				"      <small class=\"text-muted\">Last updated 3 mins ago</small>\r\n" + 
				"    </div>\r\n" + 
				"  </div>\r\n" + 
				"  <div class=\"card\">\r\n" + 
				"    <img src=\"...\" class=\"card-img-top\" alt=\"...\">\r\n" + 
				"    <div class=\"card-body\">\r\n" + 
				"      <h5 class=\"card-title\">Dr. Muna Jabbour, MD</h5>\r\n" + 
				"      <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>\r\n" + 
				"    </div>\r\n" + 
				"    <div class=\"card-footer\">\r\n" + 
				"      <small class=\"text-muted\">Last updated 3 mins ago</small>\r\n" + 
				"    </div>\r\n" + 
				"  </div>\r\n" + 
				"</div>");

out.println("</body></html>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
