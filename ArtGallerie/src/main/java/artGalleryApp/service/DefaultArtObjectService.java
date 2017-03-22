package artGalleryApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import artGalleryApp.domain.ArtObject;
import artGalleryApp.repository.ArtObjectRepository;

@Transactional(readOnly = true)
@Service
public class DefaultArtObjectService implements ArtObjectService {

	private final ArtObjectRepository artObjectRepository;

	@Autowired
	public DefaultArtObjectService(ArtObjectRepository artObjectRepository) {
		this.artObjectRepository = artObjectRepository;
	}
	
	@Transactional(readOnly = false)
	@Override
	public ArtObject createNewArtObject(ArtObject artObject) {
		return this.artObjectRepository.saveAndFlush(artObject);
	}

	@Override
	public ArtObject findById(Long artObjectId) {
		return this.artObjectRepository.findById(artObjectId);
	}

	@Transactional(readOnly = false)
	@Override
	public ArtObject update(ArtObject artObject) {
		return this.artObjectRepository.saveAndFlush(artObject);
	}

	@Override
	public List<ArtObject> findAll() {
		return this.artObjectRepository.findAll();
	}

	@Override
	public void deleteById(Long artObjectId) {
		this.artObjectRepository.delete(artObjectId);

	}

}
