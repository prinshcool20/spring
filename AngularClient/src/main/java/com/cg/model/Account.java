package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "accounts")
	public class Account {

		
		@Column(name = "accountId")
		private long accountId;
		@Id
		@Column(name = "monileno")
		private long mobileno;

		@Column(name = "holdername")
		private String holdername;

		@Column(name = "accountbalance")
		private double balance;

		
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}

		

		public Account(long accountId, long mobileno, String holdername, double balance) {
			super();
			this.accountId = accountId;
			this.mobileno = mobileno;
			this.holdername = holdername;
			this.balance = balance;
		}



		

		public long getAccountId() {
			return accountId;
		}



		public void setAccountId(long accountId) {
			this.accountId = accountId;
		}



		public long getMobileno() {
			return mobileno;
		}



		public void setMobileno(long mobileno) {
			this.mobileno = mobileno;
		}



		public String getHoldername() {
			return holdername;
		}



		public void setHoldername(String holdername) {
			this.holdername = holdername;
		}



		public double getBalance() {
			return balance;
		}



		public void setBalance(double balance) {
			this.balance = balance;
		}



		@Override
		public String toString() {
			return "Account [accountId=" + accountId + ", mobileno=" + mobileno + ", holdername=" + holdername
					+ ", balance=" + balance + "]";
		}



	
	}


