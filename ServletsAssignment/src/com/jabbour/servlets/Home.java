package com.jabbour.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter output = response.getWriter();
		output.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"  <title>Servlets Assignments</title>\r\n" + 
				"  <meta charset=\"utf-8\">\r\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\r\n" + 
				"  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n" + 
				"  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\r\n" +
				 "<style> img {\r\n" + 
				"        width:500px;\r\n" + 
				"        height:500px;\r\n" + 
				"    }\r\n" + 
				"</style>"+
				"</head>\r\n");
		
		
		output.println("<body style=\"background-color:azure \">\r\n" + 
				" <h1>Servlets Assignment Showcase</h1>" +
	       "<h3>by Chris Jabbour</h3>");
		
		output.println("<div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\r\n" + 
				"    <ol class=\"carousel-indicators\">\r\n" + 
				"      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n" + 
				"      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n" + 
				"      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n" + 
				"    </ol>\r\n" + 
				"    <div class=\"carousel-inner\">\r\n" + 
				"      <div class=\"carousel-item active\">\r\n" + 
				"        <img class=\"d-block w-100\" src=\"https://i.pinimg.com/originals/3a/9e/26/3a9e267c61f49525eb9569d64b29deb9.jpg\" alt=\"First slide\">\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"carousel-item\">\r\n" + 
				"        <img class=\"d-block w-100\" src=\"https://res.cloudinary.com/teepublic/image/private/s--RWg7LQ8y--/t_Preview/b_rgb:191919,c_limit,f_jpg,h_630,q_90,w_630/v1562410686/production/designs/5249338_0.jpg\" alt=\"Second slide\">\r\n" + 
				"      </div>\r\n" + 
				"      <div class=\"carousel-item\">\r\n" + 
				"        <img class=\"d-block w-100\" src=\"https://s3-ap-southeast-1.amazonaws.com/bengkel/wp-content/uploads/2018/01/05180456/9.Spider-Man.png\" alt=\"Third slide\">\r\n" + 
				"      </div>\r\n" + 
				"    </div>\r\n" + 
				"    <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\r\n" + 
				"      <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n" + 
				"      <span class=\"sr-only\">Previous</span>\r\n" + 
				"    </a>\r\n" + 
				"    <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\r\n" + 
				"      <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n" + 
				"      <span class=\"sr-only\">Next</span>\r\n" + 
				"    </a>\r\n" + 
				"  </div>");

		output.println(" <ul>\r\n" + 
				" <li><a href = ./WorldCupWins>Display bar graph of Countries with the most FIFA championship wins</a>"
				+ "\r\n"+
				"<li><a href =./FavoriteSongs>Hash map display of some favorite songs</a>"
				+ "\r\n"+
				"<li><a href =./JqueryChapter>Accordion display of the Zen of Python</a>"
				+ "\r\n");

		output.println("</ul>");

		

		
		output.println("</body></html>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
