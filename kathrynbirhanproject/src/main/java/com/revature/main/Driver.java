package com.revature.main;

import java.util.List;

import com.revature.beans.Ledger;
import com.revature.dao.BankDAO;
import com.revature.dao.BankDaoImplementation;

public class Driver {
public static void main(String[] args) {
	BankDAO bd =  new BankDaoImplementation();
	List<Ledger> ClientList = bd.getLedger();
	
	for(Ledger l : ClientList) {
		System.out.println(l);
	}
}





}
