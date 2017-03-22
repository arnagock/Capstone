package artGalleryApp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import artGalleryApp.domain.Gallery;
import artGalleryApp.domain.JsonViews;
import artGalleryApp.service.GalleryService;

/**
*
* @author Adrian Gross
*/
@RestController
@RequestMapping("/galleries")
public class RestGalleryController {

	private final GalleryService galleryService;

	@Autowired
	public RestGalleryController(GalleryService galleryService) {
		this.galleryService = galleryService;

	}

	@JsonView(JsonViews.Public.class)
	@GetMapping("/{galleryId}")
	public Gallery retrieveGalleryById(@PathVariable Long galleryId) {
		return this.galleryService.findById(galleryId);
	}
	

	@JsonView(JsonViews.Public.class)
	@GetMapping
	public List<Gallery> listAllGalleries() {
		return this.galleryService.findAll();
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
