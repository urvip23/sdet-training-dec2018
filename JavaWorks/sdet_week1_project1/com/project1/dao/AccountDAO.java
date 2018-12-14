package com.project1.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project1.entity.Account;
import com.project1.standards.IAccountDAO;
import com.training.connection.GetDBConnection;

public class AccountDAO implements IAccountDAO {

	@Override
	public List<Account> getAllAccts() {
		//This is the sql that queries the DB
				String sql = "select acct_id, acct_no ,acct_balance, avg_balance, percent "
						+ "from account";
				
				GetDBConnection gc = new GetDBConnection();
				List<Account> acctList = new ArrayList<Account>();
				
				try {
					gc.ps = GetDBConnection.getMySqlConnection().prepareStatement(sql);
					gc.rs = gc.ps.executeQuery(sql);
					
					while(gc.rs.next()){
						Account a = new Account();
						a.setAcctId(gc.rs.getInt(1));
						a.setAcctNo(gc.rs.getString(2));
						a.setAcctBal(gc.rs.getDouble(3));
						a.setAvgBal(gc.rs.getDouble(4));
						a.setPercent(gc.rs.getDouble(5));
						
						acctList.add(a);
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						gc.ps.close();
						gc.rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
		return acctList;
	}
	
	@Override
	public Account getAccount(int acctId) {
		String sql = "select acct_id, acct_no ,acct_balance, avg_balance, percent "
				+ "from account where acct_id=?";
		//can also write String sql = "select *";
		
		GetDBConnection gc = new GetDBConnection();
		try {
			gc.ps1 = GetDBConnection.getMySqlConnection().prepareStatement(sql);
			
			gc.ps1.setInt(1, acctId);

			gc.rs = gc.ps1.executeQuery(); 

			if(gc.rs.next()){
				Account a = new Account();
				a.setAcctId(gc.rs.getInt(1));
				a.setAcctNo(gc.rs.getString(2));
				a.setAcctBal(gc.rs.getDouble(3));
				a.setAvgBal(gc.rs.getDouble(4));
				a.setPercent(gc.rs.getDouble(5));
				
				return a;
			}
			
			return null;
		} catch (SQLException e) {
 			e.printStackTrace();
		} finally {
			try {
				gc.ps1.close();
				gc.rs.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return null;
	}
		

	@Override
	public boolean updateAccount(int acctId, double percent) {
		String sql = "update account set percent=? where acct_id =?";
		GetDBConnection gc = new GetDBConnection();
		
		try {
			gc.ps = GetDBConnection.getMySqlConnection().prepareStatement(sql);
			
			gc.ps.setDouble(1, percent);
			gc.ps.setInt(2, acctId);
			
			return gc.ps.executeUpdate()>0;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}
}

