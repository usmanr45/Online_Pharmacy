package com.pharmacy.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String product_name;

    private String product_code; // Ministry of Health Medicine Code

    @Column(name = "category")
    @NotEmpty(message = "*Can't be blank")
    private String category;

    @OneToMany(mappedBy = "product")
    Set<PharmacyProduct> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Set<PharmacyProduct> getProducts() {
		return products;
	}

	public void setProducts(Set<PharmacyProduct> products) {
		this.products = products;
	}
    
    
}

