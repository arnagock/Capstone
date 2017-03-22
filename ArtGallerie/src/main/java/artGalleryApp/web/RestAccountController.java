package artGalleryApp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import artGalleryApp.domain.Account;
import artGalleryApp.domain.JsonViews;
import artGalleryApp.service.AccountService;

/**
*
* @author Adrian Gross
*/
@RestController
@RequestMapping("/accounts")
public class RestAccountController {

	private final AccountService accountService;

	@Autowired
	public RestAccountController(AccountService accountService) {
		this.accountService = accountService;

	}

	@JsonView(JsonViews.Public.class)
	@GetMapping("/{accountId}")
	public Account retrieveAccountById(@PathVariable Long accountId) {
		return this.accountService.findById(accountId);
	}
	

	@JsonView(JsonViews.Public.class)
	@GetMapping
	public List<Account> listAllAccounts() {
		return this.accountService.findAll();
	}
	/*
	@JsonView(JsonViews.NewUser.class)
	@PostMapping("/register")
	public HttpEntity<Void> registerNewUser(@RequestBody User postedUser) {
		User savedUser = userservice.registerNewUser(postedUser);

		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/register")
				.buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}*/

	
	
}
