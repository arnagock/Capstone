package artGalleryApp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;
import lombok.EqualsAndHashCode;
/**
*
* @author Adrian Gross
*/
@Data
@Entity
@Table(name = "address")
@EqualsAndHashCode(exclude = "id")
public class Address  implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@Id
	@JsonView(JsonViews.Public.class)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="street", nullable = false, length = 50)
	@JsonView(JsonViews.Public.class)
	private String street;
	
	@Column(name="street_nr",nullable = false, length = 50)
	@JsonView(JsonViews.Public.class)
	private String streetNr;
	
	@Column(name="postalcode",nullable = false, length = 50)
	@JsonView(JsonViews.Public.class)
	private String postalCode;
	
	@Column(name="city",nullable = false, length = 50)
	@JsonView(JsonViews.Public.class)
	private String city;
	
	@Column(name="country",nullable = false, length = 50)
	@JsonView(JsonViews.Public.class)
	private String country;

	public Address() {
	}
	
	public Address(String street, String streetNr, String postalCode, String city, String country) {
		this(null,street,streetNr,postalCode,city,country);
	}
	
	public Address(Long id, String street, String streetNr, String postalCode, String city, String country) {
		super();
		this.id = id;
		this.street = street;
		this.streetNr = streetNr;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNr() {
		return streetNr;
	}

	public void setStreetNr(String streetNr) {
		this.streetNr = streetNr;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

}
