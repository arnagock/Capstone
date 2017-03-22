package artGalleryApp.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name = "art")
@EqualsAndHashCode(exclude = "id")
public class ArtObject {

	@Id
	@JsonView(JsonViews.Public.class)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	@Column(name = "description", nullable = false, length = 250)
	@JsonView(JsonViews.Public.class)
	private String description;
	
	@Column(name = "picture", nullable = false, length = 150)
	@JsonView(JsonViews.Public.class)
	private String picture;
	
	@Column(name = "title", nullable = false, length = 150)
	@JsonView(JsonViews.Public.class)
	private String title;

	@Column(name = "rating", nullable = true)
	@JsonView(JsonViews.Public.class)
	private Byte rating;
	
	//Make Date unchangeable
	@Column(name = "created_at", updatable = false,insertable=false, nullable = false)
	@JsonView(JsonViews.Public.class)
	private Timestamp createdAt = new Timestamp(System.currentTimeMillis());

	
	@Column(name = "is_sold", nullable = false)
	@JsonView(JsonViews.Public.class)
	private Boolean isSold = false;
	
	@Column(name = "price", nullable = true)
	@JsonView(JsonViews.Public.class)
	private Long price;


	
	public ArtObject() {
	}

	
	public ArtObject( String description, String picture,String title, Byte rating, Long price,Timestamp createdAt, Boolean isSold) {
		
		this(null,  description,  picture, title,  rating,  price,createdAt, isSold);
	}
	
	
	public ArtObject(Long id, String description, String picture,String title, Byte rating, Long price,Timestamp createdAt, Boolean isSold) {
		super();
		this.id = id;
		this.description = description;
		this.picture = picture;
		this.rating = rating;
		this.price = price;
		this.title = title;
		this.createdAt = createdAt;
		this.isSold = isSold;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Byte getRating() {
		return rating;
	}

	public void setRating(Byte rating) {
		this.rating = rating;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}


	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}
	
}
