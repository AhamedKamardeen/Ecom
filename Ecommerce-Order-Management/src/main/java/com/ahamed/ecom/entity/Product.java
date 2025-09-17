package com.ahamed.ecom.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product")
public class Product {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  private String name;
	  private String description;
	  private Double price;
	  private Long stockQuantity;
	  private Date createdOn;
	  private Date updatedOn;
	  
	  @ManyToOne
	  @JoinColumn(name = "category_id")
	  private Category category;
	  
	  @ManyToMany(mappedBy = "products")
	  private List<Order> orders;

}
