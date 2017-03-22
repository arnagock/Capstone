package artGalleryApp.service;

import java.util.List;

import artGalleryApp.domain.ArtObject;
import artGalleryApp.domain.Gallery;
import artGalleryApp.domain.Profile;



public interface ProfileService {

	public Profile createNewProfile(Profile profile);

	public Profile findById(Long profileId);
	
	public Profile update(Profile profile);
	
	public List<Profile> findAll();
	
	public void deleteById(Long profileId);

	public Profile findByArtistName(String artistName);
	
	
	
}
