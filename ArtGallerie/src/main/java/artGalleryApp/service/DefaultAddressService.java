package artGalleryApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import artGalleryApp.domain.Address;
import artGalleryApp.repository.AddressRepository;

@Transactional(readOnly = true)
@Service
public class DefaultAddressService implements AddressService {

	private final AddressRepository locationRepository;

	@Autowired
	public DefaultAddressService(AddressRepository locationRepository) {
		super();
		this.locationRepository = locationRepository;
	}

	@Override
	public Address findById(Long locationId) {

		return locationRepository.findById(locationId);
	}

	@Override
	public void deleteById(Long locationId) {

		locationRepository.delete(locationId);

	}

	@Override
	public void createNewLocation(Address location) {
		locationRepository.saveAndFlush(location);
		
	}

}
