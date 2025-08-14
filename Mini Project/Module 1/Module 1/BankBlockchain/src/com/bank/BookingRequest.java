package com.bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.DBconn;

@WebServlet("/BookingRequest")
public class BookingRequest extends HttpServlet 
{
	Connection con = null;
	PreparedStatement ps;
	ResultSet rs;
	
	
	public void init(ServletConfig config) throws ServletException 
	{
		try
		{
			con=DBconn.conn();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String booking_id = request.getParameter("booking_id");
		String booking_id1 = request.getParameter("booking_id1");
		GlobalFunction gf=new GlobalFunction();
		System.out.println("Data Update Done");
		int i=-1;
		
		try 
		{
			//SendMailSSL smls=new SendMailSSL();
			if (booking_id != null) 
			{
				String uname=gf.getUsername(booking_id);
				String email=gf.getEmail(uname);
				String to=email;
				String Msg="Your Reservation Request has been Activated please Login your Account and See in Details";
				String sub="Airline Reservation Response";
				//int rts=smls.EmailSending(to, sub, Msg);
				ps = con.prepareStatement("update `booking` SET status='Accept' where booking_id='"+ booking_id + "'");
				i = ps.executeUpdate();
			} 
			else if (booking_id1 != null) 
			{
				ps = con.prepareStatement("update `booking` SET status='Reject' where booking_id='" + booking_id1 + "'");
				i = ps.executeUpdate();
			}
			if (i > 0) 
			{	
				System.out.println("Data Update Done");
				response.sendRedirect("BookingRequest.jsp?update=done");
			} else {
				System.out.println("Data Update Fails");
			}

		} catch (Exception e) {
			System.out.println("EXp " + e);
		}
	}
}
