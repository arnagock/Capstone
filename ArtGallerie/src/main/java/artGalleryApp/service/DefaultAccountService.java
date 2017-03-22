package artGalleryApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import artGalleryApp.domain.Account;
import artGalleryApp.domain.Profile;
import artGalleryApp.repository.AccountRepository;


@Transactional(readOnly = true)
@Service
public class DefaultAccountService implements AccountService {

	
	private final AccountRepository accountRepository;

	@Autowired
	public DefaultAccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@Transactional(readOnly = false)
	@Override
	public Account registerNewAccount(Account account) {
		return this.accountRepository.saveAndFlush(account);
	}

	@Override
	public Account findById(Long accountId) {
		return this.accountRepository.findById(accountId);
	}

	@Override
	public Account findByEmail(String email) {
		return this.accountRepository.findByEmail(email);
	}

	@Override
	public Account findByUsername(String userName) {
		return this.accountRepository.findByUserName(userName);
	}

	@Override
	public Account findByProfile(Profile profile) {
		return this.accountRepository.findByProfile(profile);
	}

	@Transactional(readOnly = false)
	@Override
	public Account update(Account account) {
		return this.accountRepository.saveAndFlush(account);
	}

	@Override
	public List<Account> findAll() {
		return this.accountRepository.findAll();
	}

	@Transactional(readOnly = false)
	@Override
	public void deleteById(Long accountId) {
		this.accountRepository.delete(accountId);
		
	}

	@Override
	public Account findByFirstNameAndLastName(String firstName, String lastName) {
		return 	this.accountRepository.findByFirstNameAndLastName(firstName, lastName);
	}

}
