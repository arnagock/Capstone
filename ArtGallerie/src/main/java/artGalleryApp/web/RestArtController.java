package artGalleryApp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import artGalleryApp.domain.ArtObject;
import artGalleryApp.domain.JsonViews;
import artGalleryApp.service.ArtObjectService;

/**
*
* @author Adrian Gross
*/
@RestController
@RequestMapping("/artObjects")
public class RestArtController {

	private final ArtObjectService artObjectService;

	@Autowired
	public RestArtController(ArtObjectService artObjectService) {
		this.artObjectService = artObjectService;

	}

	@JsonView(JsonViews.Public.class)
	@GetMapping("/{artObjectId}")
	public ArtObject retrieveArtById(@PathVariable Long artObjectId) {
		return this.artObjectService.findById(artObjectId);
	}
	

	@JsonView(JsonViews.Public.class)
	@GetMapping
	public List<ArtObject> listAllArtObjects() {
		return this.artObjectService.findAll();
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
