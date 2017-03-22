package artGalleryApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import artGalleryApp.domain.ArtObject;
import artGalleryApp.domain.Profile;

@Repository
public interface ArtObjectRepository extends JpaRepository<ArtObject, Long>{

	public ArtObject findById(Long artObjectId);

	public List<ArtObject> findAll();

	public void deleteById(Long artObjectId);

	
}
