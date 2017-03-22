package artGalleryApp.service;

import java.util.List;

import artGalleryApp.domain.ArtObject;


public interface ArtObjectService {

	public ArtObject createNewArtObject(ArtObject artObject);

	public ArtObject findById(Long artObjectId);
	
	public ArtObject update(ArtObject artObject);
	
	public List<ArtObject> findAll();
	
	public void deleteById(Long artObjectId);
	
	
}
