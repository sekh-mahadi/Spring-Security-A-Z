package io.mtech.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "contact_masseges")
public class Contact {
	@Id
	@Column(name = "contact_id")
	private String contactId;
	private String contactName;
	private String contactEmail;
	private String subject;
	private String message;
	private Date createDt;
}
