package com.ahamed.ecom.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "orders")
public class Order {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   private Date orderDate;
	   private Double totalAmount;
	   private String status;
	   
	   
	   @ManyToOne
	   @JoinColumn(name = "customer_id")
	   private Customer customer;
	   
	   @ManyToMany
	   @JoinTable(name = "order_products" ,
	   joinColumns = @JoinColumn(name = "order_id"),
	   inverseJoinColumns = @JoinColumn(name="product_id"))
	   private List<Product> products;
	   
	   @OneToOne(mappedBy = "order" , cascade = CascadeType.ALL)
	   private Payment payment;
}
