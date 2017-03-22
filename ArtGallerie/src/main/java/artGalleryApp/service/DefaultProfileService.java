package artGalleryApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import artGalleryApp.domain.Profile;
import artGalleryApp.repository.ProfileRepository;


@Transactional(readOnly = true)
@Service
public class DefaultProfileService implements ProfileService {

	private final ProfileRepository profileRepository;

	@Autowired
	public DefaultProfileService(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	
	@Transactional(readOnly = false)
	@Override
	public Profile createNewProfile(Profile profile) {
		return this.profileRepository.saveAndFlush(profile);
	}

	@Override
	public Profile findById(Long profileId) {
		return this.profileRepository.findById(profileId);
	}

	@Transactional(readOnly = false)
	@Override
	public Profile update(Profile profile) {
		return this.profileRepository.saveAndFlush(profile);
	}

	@Override
	public List<Profile> findAll() {
		return this.profileRepository.findAll();
	}

	@Transactional(readOnly = false)
	@Override
	public void deleteById(Long profileId) {
		this.profileRepository.delete(profileId);

	}

	@Override
	public Profile findByArtistName(String artistName) {
		return this.profileRepository.findByArtistName(artistName);
	}


}
