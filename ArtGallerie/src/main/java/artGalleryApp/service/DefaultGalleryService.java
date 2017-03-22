package artGalleryApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import artGalleryApp.domain.Gallery;
import artGalleryApp.repository.GalleryRepository;

@Transactional(readOnly = true)
@Service
public class DefaultGalleryService implements GalleryService {
	
	private final GalleryRepository galleryRepository;

	@Autowired
	public DefaultGalleryService(GalleryRepository galleryRepository) {
		this.galleryRepository = galleryRepository;
	}

	@Transactional(readOnly = false)
	@Override
	public Gallery createNewGallery(Gallery gallery) {
		return this.galleryRepository.saveAndFlush(gallery);
	}

	@Override
	public Gallery findById(Long galleryId) {
		return this.galleryRepository.findById(galleryId);
	}

	@Transactional(readOnly = false)
	@Override
	public Gallery update(Gallery gallery) {
		return this.galleryRepository.saveAndFlush(gallery);
	}

	@Override
	public List<Gallery> findAll() {
		return this.galleryRepository.findAll();
	}

	@Transactional(readOnly = false)
	@Override
	public void deleteById(Long galleryId) {
		this.galleryRepository.delete(galleryId);

	}

}
