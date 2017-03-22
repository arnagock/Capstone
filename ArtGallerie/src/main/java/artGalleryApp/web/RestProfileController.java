package artGalleryApp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import artGalleryApp.domain.JsonViews;
import artGalleryApp.domain.Profile;
import artGalleryApp.service.ProfileService;

/**
*
* @author Adrian Gross
*/
@RestController
@RequestMapping("/profiles")
public class RestProfileController {

	private final ProfileService profileService;

	@Autowired
	public RestProfileController(ProfileService profileService) {
		this.profileService = profileService;

	}

	@JsonView(JsonViews.Public.class)
	@GetMapping("/{profileId}")
	public Profile retrieveProfileById(@PathVariable Long profileId) {
		return this.profileService.findById(profileId);
	}
	

	@JsonView(JsonViews.Public.class)
	@GetMapping
	public List<Profile> listAllProfiles() {
		return this.profileService.findAll();
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
