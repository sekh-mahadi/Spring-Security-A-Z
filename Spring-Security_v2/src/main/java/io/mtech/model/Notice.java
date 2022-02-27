package io.mtech.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "notice_details")
@Data
public class Notice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int noticeId;
	private String noticeSummary;
	private String noticeDetails;
	private Date noticeBegDt;
	private Date noticeEndDt;
	private Date createDt;
	private Date updateDt;

}
