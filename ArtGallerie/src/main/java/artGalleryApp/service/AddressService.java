package artGalleryApp.service;

import artGalleryApp.domain.Address;

public interface AddressService {
	
	public void createNewLocation(Address location);
	
	public Address findById(Long locationId);

	public void deleteById(Long locationId);
}
