package com.ahamed.ecom.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "customer")
public class Customer {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  @JsonProperty("name")
	  private String name;
	  @JsonProperty("email")
	  private String email;
	  @JsonProperty("phone")
	  private Long phone;
	  @JsonProperty("address")
	  private String address;
	  @JsonProperty("createdOn")
	  private Date createdOn;
	  @JsonProperty("updatedOn")
	  private Date updatedOn;

	  @OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL)
	  private List<Order> orders;
	  
	  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	  private List<Payment> payments;

}
