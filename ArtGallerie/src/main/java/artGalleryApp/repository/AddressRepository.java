package artGalleryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import artGalleryApp.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

	public Address findById(Long locationId);
}
