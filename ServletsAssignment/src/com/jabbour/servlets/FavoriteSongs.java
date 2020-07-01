package com.jabbour.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class FavoriteSongs
 */
@WebServlet("/FavoriteSongs")
public class FavoriteSongs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FavoriteSongs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter output = response.getWriter();
		
		output.println("<html><head><title>Favorite songs of all time</title></head><body bgcolor=silver>");
		
		output.println("<h1> (some) of my Favorite songs of all time</h1>");
		
		//create a song list utility object
		UtilityClass songlist = new UtilityClass();
		
		HashMap<String, String> map  = songlist.loadMap();
		
		Iterator<HashMap.Entry<String,String>> itr = map.entrySet().iterator();
		output.println("<div><ul>");
		while(itr.hasNext()){
			HashMap.Entry<String,String> entry = itr.next();

			output.println("<li>"+ entry.getKey() + " by " + entry.getValue() +"</li>");
		}
		
		output.println("</div></ul>");
		
		output.println("<a href=\"Home\">Back to showcase</a>");
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
