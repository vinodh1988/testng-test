package com.info;

public class EMIRecord {
    private String amount;
    private String interest;
    private String term;
    private String emiamount;
    private String totalinterest;
    private String totalamount;
    
    public EMIRecord() {}
    
	public EMIRecord(String amount, String interest, String term, String emiamount, String totalinterest,
			String totalamount) {
		super();
		this.amount = amount;
		this.interest = interest;
		this.term = term;
		this.emiamount = emiamount;
		this.totalinterest = totalinterest;
		this.totalamount = totalamount;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getEmiamount() {
		return emiamount;
	}

	public void setEmiamount(String emiamount) {
		this.emiamount = emiamount;
	}

	public String getTotalinterest() {
		return totalinterest;
	}

	public void setTotalinterest(String totalinterest) {
		this.totalinterest = totalinterest;
	}

	public String getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(String totalamount) {
		this.totalamount = totalamount;
	}
	
	
    
    
}
