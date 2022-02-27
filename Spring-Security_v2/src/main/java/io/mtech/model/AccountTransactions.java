package io.mtech.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class AccountTransactions {
	@Id
	private String transactionId;
	private long accountNumber;
	private int customerId;
	private Date transactionDt;
	private String transactionSummary;
	private String transactionType;
	private int transactionAmt;
	private int closingBalance;
	private String createDt;
}
