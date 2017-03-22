package artGalleryApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import artGalleryApp.domain.Account;
import artGalleryApp.domain.Profile;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	public Account findById(Long accountId);
	
	public Account findByProfile(Profile profile);

	public List<Account> findAll();

	public void deleteById(Long accountId);

	public Account findByFirstNameAndLastName(String firstName, String lastName);
	
	public Account findByUserName(String userName);
	
	public Account findByEmail(String email);
}
