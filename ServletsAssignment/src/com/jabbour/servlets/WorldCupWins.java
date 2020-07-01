package com.jabbour.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WorldCupWins
 */
@WebServlet("/WorldCupWins")
public class WorldCupWins extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WorldCupWins() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	private double[] worldCupWins = {5,4,4,2,2,2};
	private String[] CityName = {"Brazil", "Germany", "Italy", "Argentina", "Mexico", "Spain"};
	private int total = worldCupWins.length; // number of teams for progress bars
	private double max = 5; // maximum amount of wins
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html><head><link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n" + 
				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>"
				+ ""
				+ ""
				+ "</head><body>");
		
		out.println("<div class=\"container\"><div class=\"jumbotron\"<h1>Countries with the most FIFA championship wins</h1></div></div>");
		for (int i = 0;  i < total; i++) {
			out.println("<h4>"+ CityName[i] + " </h4>"
					+ ""
					+ ""
					+ "<div class=\"progress\">\r\n" + 
					"    <div class=\"progress-bar progress-bar-striped progress-bar-animated bg-danger\" role=\"progressbar\" aria-valuenow= \"" + ((worldCupWins[i]/max)*100) +"\" aria-valuemin=\"0\" aria-valuemax=\"100\" style= width:"+((worldCupWins[i]/max)*100)+"%>" + 
					   (int)worldCupWins[i] + 
					"    </div>\r\n" + 
					"  </div>");
		}
		
		out.println("<a href=\"Home\">Back to showcase</a>");
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
