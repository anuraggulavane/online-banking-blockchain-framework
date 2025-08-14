package com.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.user.DBconn;

public class GlobalFunction 
{
	public String getVehicleName(String pln_id)
	{
		String vname = "";
		try 
		{
			Connection con=DBconn.conn();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `addride` where ride_id='"+ pln_id + "'");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) 
			{
				vname = rs.getString("vehiclename");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception " + e);
		}
		return vname;
	}
	
	public String getTravellDate(String pln_id)
	{
		String vname = "";
		try 
		{
			Connection con=DBconn.conn();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `addride` where ride_id='"+ pln_id + "'");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) 
			{
				vname = rs.getString("trv_date");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception " + e);
		}
		return vname;
	}
	
	public String getUsername(String book_by1)
	{
		String book_by = "";
		try 
		{
			Connection con=DBconn.conn();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `booking` where booking_id='"+ book_by1+ "'");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) 
			{
				book_by = rs.getString("book_by");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception " + e);
		}
		return book_by;
	}
	
	public String getEmail(String book_by1)
	{
		String book_by = "";
		try 
		{
			Connection con=DBconn.conn();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `registertbl` where Uusername='"+ book_by1+ "'");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) 
			{
				book_by = rs.getString("Uemail");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception " + e);
		}
		return book_by;
	}
	
	
	public String getSource(String pln_id)
	{
		String vname = "";
		try 
		{
			Connection con=DBconn.conn();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `addride` where ride_id='"+ pln_id + "'");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) 
			{
				vname = rs.getString("source");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception " + e);
		}
		return vname;
	}
	
	public String getDestination(String pln_id)
	{
		String vname = "";
		try 
		{
			Connection con=DBconn.conn();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `addride` where ride_id='"+ pln_id + "'");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) 
			{
				vname = rs.getString("destination");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception " + e);
		}
		return vname;
	}
	
	public String getStatus(String pln_id)
	{
		String vname = "";
		try 
		{
			Connection con=DBconn.conn();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `addride` where ride_id='"+ pln_id + "'");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) 
			{
				vname = rs.getString("status");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception " + e);
		}
		return vname;
	}
	

	public String getdeparts(String pln_id)
	{
		String vname = "";
		try 
		{
			Connection con=DBconn.conn();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `addride` where ride_id='"+ pln_id + "'");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) 
			{
				vname = rs.getString("departs");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception " + e);
		}
		return vname;
	}
	
	public String getarrievs(String pln_id)
	{
		String vname = "";
		try 
		{
			Connection con=DBconn.conn();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `addride` where ride_id='"+ pln_id + "'");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) 
			{
				vname = rs.getString("arrievs");
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception " + e);
		}
		return vname;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
