package artGalleryApp.service;

import java.util.List;

import artGalleryApp.domain.Gallery;

public interface GalleryService {
	
	public Gallery createNewGallery(Gallery gallery);

	public Gallery findById(Long galleryId);
	
	public Gallery update(Gallery gallery);
	
	public List<Gallery> findAll();
	
	public void deleteById(Long galleryId);
}
