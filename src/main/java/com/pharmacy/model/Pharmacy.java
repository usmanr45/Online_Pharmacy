package com.pharmacy.model;



import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pharmacy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pharmacy_name;

    @Column(name = "active", nullable = true)
    private boolean active;

    @OneToMany(mappedBy = "pharmacy")
    Set<PharmacyProduct> pharmacies;

    @OneToMany(mappedBy = "pharmacy", cascade = CascadeType.ALL)
    private List<User> users;

    @OneToMany(mappedBy = "pharmacy", cascade = CascadeType.ALL)
    private List<UserOrder> userOrders;

    @ManyToOne
    @JoinColumn
    private District district;

    @ManyToOne
    @JoinColumn
    private Province province;

    @ManyToOne
    @JoinColumn
    private Country country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPharmacy_name() {
		return pharmacy_name;
	}

	public void setPharmacy_name(String pharmacy_name) {
		this.pharmacy_name = pharmacy_name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Set<PharmacyProduct> getPharmacies() {
		return pharmacies;
	}

	public void setPharmacies(Set<PharmacyProduct> pharmacies) {
		this.pharmacies = pharmacies;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<UserOrder> getUserOrders() {
		return userOrders;
	}

	public void setUserOrders(List<UserOrder> userOrders) {
		this.userOrders = userOrders;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
    
    

}

