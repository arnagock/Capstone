package artGalleryApp.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
/**
*
* @author Adrian Gross
*/
@Data
@Entity
@Table(name = "account")
@EqualsAndHashCode(exclude = "id")
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@JsonView(JsonViews.Public.class)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "first_name", nullable = false, length = 50)
	@JsonView(JsonViews.Public.class)
	private String firstName;

	@Column(name = "last_name", nullable = false, length = 50)
	@JsonView(JsonViews.Public.class)
	private String lastName;
	
	@Column(name = "user_name", nullable = false, length = 50)
	@JsonView(JsonViews.Public.class)
	private String userName;

	@JsonView(JsonViews.Public.class)
	@OneToOne
	private Address location;
	
	@JsonView(JsonViews.Public.class)
	@OneToOne
	@JsonIgnoreProperties({"owner"})
	private Profile profile;

	@Column(name = "email", nullable = false, length = 50)
	@JsonView(JsonViews.Public.class)
	private String email;

	@Column(name = "password", nullable = false, length = 76)
	private String password;

	@Column(name = "created_at", updatable = false,insertable=false, nullable = false)
	@JsonView(JsonViews.Public.class)
	private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
	/*
	@OrderBy("created_at")
	@JsonView(JsonViews.Public.class)
	private List<ArtObject> sold = new ArrayList<>();

	@OrderBy("created_at")
	@JsonView(JsonViews.Public.class)
	private List<ArtObject> bought = new ArrayList<>();
	*/
	/*
	@ManyToMany
	@OrderBy("artist_name")
	@JsonView(JsonViews.Public.class)
	private List<Profile> favoriteArtists = new ArrayList<>();
*/
	public Account() {
	}

	public Account(String firstName, String lastName,String userName, Address location,
			Profile profile, String email, String password,Timestamp createdAt) {
		
		this(null, firstName, lastName,userName, location,profile, email, password,createdAt);
	}

	public Account(Long id, String firstName, String lastName,String userName, Address location,
			Profile profile, String email, String password,Timestamp createdAt) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.location = location;
		this.profile = profile;
		this.email = email;
		this.password = password;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Address getLocation() {
		return location;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
/*
	public List<ArtObject> getSold() {
		return sold;
	}

	public void setSold(List<ArtObject> sold) {
		this.sold = sold;
	}

	public List<ArtObject> getBought() {
		return bought;
	}

	public void setBought(List<ArtObject> bought) {
		this.bought = bought;
	}

	public List<Profile> getFavoriteArtists() {
		return favoriteArtists;
	}

	public void setFavoriteArtists(List<Profile> favoriteArtists) {
		this.favoriteArtists = favoriteArtists;
	}
*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
