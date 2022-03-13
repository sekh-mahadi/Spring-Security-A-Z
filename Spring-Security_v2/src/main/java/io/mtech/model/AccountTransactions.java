package io.mtech.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class AccountTransactions {
	@Id
	private String transactionId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_number")
	private Accounts accountNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customerId;
	private Date transactionDt;
	private String transactionSummary;
	private String transactionType;
	private int transactionAmt;
	private int closingBalance;
	private String createDt;
}
