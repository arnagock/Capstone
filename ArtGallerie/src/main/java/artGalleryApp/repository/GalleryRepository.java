package artGalleryApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import artGalleryApp.domain.ArtObject;
import artGalleryApp.domain.Gallery;
import artGalleryApp.domain.Profile;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long>{

	public Gallery findById(Long galleryId);
	
	public Gallery findAllByOwner(Profile owner);

	public List<Gallery> findAll();

	public void deleteById(Long galleryId);
	

}
