package com.ahamed.ecom.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "category")
public class Category {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   private String name;
	   private String description;
	   private Date createdOn;
}
