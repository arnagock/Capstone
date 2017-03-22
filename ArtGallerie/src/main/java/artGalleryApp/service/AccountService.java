package artGalleryApp.service;

import java.util.List;

import artGalleryApp.domain.Account;
import artGalleryApp.domain.Gallery;
import artGalleryApp.domain.Profile;

public interface AccountService {

	public Account registerNewAccount(Account account);

	public Account findById(Long accountId);
	
	public Account findByEmail(String email);
	
	public Account findByUsername(String userName);
	
	public Account findByFirstNameAndLastName(String firstName, String lastName);
	
	public Account findByProfile(Profile profile);
	
	public Account update(Account account);
	
	public List<Account> findAll();
	
	public void deleteById(Long accountId);
	

}
