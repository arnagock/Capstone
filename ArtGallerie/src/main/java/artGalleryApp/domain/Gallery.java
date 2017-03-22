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
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
*
* @author Adrian Gross
*/

@Data
@Entity
@Table(name = "gallery")
@EqualsAndHashCode(exclude = "id")
public class Gallery {

	@Id
	@JsonView(JsonViews.Public.class)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name", nullable = false, length = 50)
	@JsonView(JsonViews.Public.class)
	private String name;


	@Column(name = "description", nullable = false, length = 250)
	@JsonView(JsonViews.Public.class)
	private String description;
	
	
	//Make Date unchangeable
	@Column(name = "created_at", updatable = false,insertable=false, nullable = false)
	@JsonView(JsonViews.Public.class)
	private Timestamp createdAt = new Timestamp(System.currentTimeMillis());


	@ManyToOne
	@JsonView(JsonViews.Public.class)
	@JsonIgnoreProperties({"galleries","owner"})
	private Profile owner;

	@OneToMany
	@OrderBy("created_at")
	@JsonView(JsonViews.Public.class)
	@JsonIgnoreProperties({"gallery"})
	private List<ArtObject> artObjects = new ArrayList<>();

	public Gallery() {
		
	}
	
	public Gallery(String name, String description, Timestamp createdAt,Profile owner, List<ArtObject> artObjects) {
		this(null,name, description, createdAt,owner,artObjects);
	}
	
	public Gallery(Long id, String name, String description, Timestamp createdAt,Profile owner,List<ArtObject> artObjects) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.createdAt = createdAt;
		this.owner = owner;
		this.artObjects = artObjects;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Profile getOwner() {
		return owner;
	}

	public void setOwner(Profile owner) {
		this.owner = owner;
	}

	public List<ArtObject> getArtObjects() {
		return artObjects;
	}

	public void setArtObjects(List<ArtObject> artObjects) {
		this.artObjects = artObjects;
	}


	
}
