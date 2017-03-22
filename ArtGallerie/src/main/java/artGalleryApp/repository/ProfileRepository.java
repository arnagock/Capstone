package artGalleryApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import artGalleryApp.domain.ArtObject;
import artGalleryApp.domain.Gallery;
import artGalleryApp.domain.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>{
	
	public Profile findById(Long profileId);
	
	public Profile findByArtistName(String artistName);

	public List<Profile> findAll();

	public void deleteById(Long profileId);
	
	

}
