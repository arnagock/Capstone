package artGalleryApp.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "profile")
@EqualsAndHashCode(exclude = "id")
public class Profile {


		@Id
		@JsonView(JsonViews.Public.class)
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;

		@Column(name = "artist_name", nullable = false, length = 50)
		@JsonView(JsonViews.Public.class)
		private String artistName;


		@Column(name = "description", nullable = false, length = 250)
		@JsonView(JsonViews.Public.class)
		private String description;
		
		@Column(name = "title", nullable = false, length = 50)
		@JsonView(JsonViews.Public.class)
		private String title;
		

		@OneToMany
		@OrderBy("created_at")
		@JsonView(JsonViews.Public.class)
		@JsonIgnoreProperties({ "owner" })
		private List<Gallery> galleries = new ArrayList<>();
		
		
		public Profile() {
		
		}

		
		public Profile( String artistName, String description, String titel, List<Gallery> galleries) {
			this(null,artistName,description,titel,galleries);
		}


		public Profile(Long id, String artistName, String description, String titel,List<Gallery> galleries) {
			super();
			this.id = id;
			this.artistName = artistName;
			this.description = description;
			this.title = titel;
			this.galleries = galleries;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getArtistName() {
			return artistName;
		}

		public void setArtistName(String artistName) {
			this.artistName = artistName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTitel() {
			return title;
		}

		public void setTitel(String titel) {
			this.title = titel;
		}
		
		


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}



		public List<Gallery> getGalleries() {
			return galleries;
		}

		public void setGalleries(List<Gallery> galleries) {
			this.galleries = galleries;
		}
		
		
}
