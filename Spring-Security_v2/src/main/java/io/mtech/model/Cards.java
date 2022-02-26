package io.mtech.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Cards")
public class Cards {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cards_id")
	private int cardId;
	@Column(name = "customer_id")
	private int customerId;
	@Column(name = "card_number")
	private String cardNumber;
	@Column(name = "card_type")
	private String cardType;
	@Column(name = "total_limit")
	private int totalLimit;
	@Column(name = "amount_used")
	private int amountUsed;
	@Column(name = "available_amount")
	private int availableAmount;
	@Column(name = "create_dt")
	private Date createDt;
}
