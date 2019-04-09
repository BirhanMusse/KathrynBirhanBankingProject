package com.revature.dao;

import java.util.List;

import com.revature.beans.Ledger;

public interface BankDAO {
	public List<Ledger> getLedger();
	public Ledger getLedgerByID(int id);
	public void createLedger(Ledger ledger);
	public void updateLedger(Ledger ledger);
	public void deleteLedger(Ledger ledger);

}
