package io.mtech.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Accounts {
	@Id
	private long accountNumber;
	private int customerId;
	private String accountType;
	private String branchAddress;
	private Date createDt;

}
