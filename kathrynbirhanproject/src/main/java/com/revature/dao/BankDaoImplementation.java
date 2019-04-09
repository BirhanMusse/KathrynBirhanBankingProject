package com.revature.dao;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Ledger;
import com.revature.util.ConnectionUtil;
import com.revature.beans.Account;
import com.revature.beans.Transactions;

public class BankDaoImplementation implements BankDAO{

	@Override
	public List<Ledger> getLedger() {
		List<Ledger> l1 = new ArrayList<>();
		try(Connection con = ConnectionUtil.getConnectionFromFile("//users//birhan//Documents//eclipse-workspace//kathrynbirhanproject//src//test//java//resources//Connection")){
			String sql = "SELECT USER_ID, PASS, FIRSTNAME, LASTNAME FROM LEDGER ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int userId = rs.getInt("USER_ID");
				String password = rs.getString("PASS");
				String fname = rs.getString("FIRSTNAME");
				String lname = rs.getString("LASTNAME");
				
				l1.add(new Ledger(userId, password,fname,lname));
			}
		}catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		return l1;
	}

	@Override
	public Ledger getLedgerByID(int id)  {
		Ledger l = null;
		try(Connection con = ConnectionUtil.getConnectionFromFile("//users//birhan//Documents//eclipse-workspace//kathrynbirhanproject//src//test//java//resources//Connection")){
			String sql = "SELECT USER_ID, PASS, FIRSTNAME, LASTNAME FROM LEDGER ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				int userid = rs.getInt("USER_ID");
				String password = rs.getString("PASS");
				String fname = rs.getString("FIRSTNAME");
				String lname = rs.getString("LASTNAME");
				
				l= new Ledger(userid, password,fname,lname);
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		
		
		return l;
	}

	@Override
	public void createLedger(Ledger ledger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLedger(Ledger ledger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLedger(Ledger ledger) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
}
