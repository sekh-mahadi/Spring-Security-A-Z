package io.mtech.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id", columnDefinition = "INT(11)" , length = 4)
	//@SequenceGenerator(name = "customer_id_Sequence", sequenceName = "ID_SEQ", allocationSize=1, initialValue=1000)
	private int id;
	private String name;
	private String email;
	@Column(name = "mobile_number")
	private String mobileNumber;
	private String pwd;
	private String role;
	private String createDt;
	@JsonIgnore
	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	private Set<Authority> authorities;
}
