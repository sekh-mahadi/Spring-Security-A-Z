package io.mtech.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "loans")
@Data
public class Loans {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanNumber;
	private int customerId;
	private Date startDt;
	private String loanType;
	private int totalLoan;
	private int amountPaid;
	private int outstandingAmount;
	private String createDt;

}
