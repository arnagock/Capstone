
package artGallery.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.jdbc.JdbcTestUtils;

import artGallery.AbstractArtGalleryIntegrationTests;
import artGalleryApp.repository.AccountRepository;
import artGalleryApp.repository.ArtObjectRepository;
import artGalleryApp.repository.GalleryRepository;
import artGalleryApp.repository.AddressRepository;
import artGalleryApp.repository.ProfileRepository;
import artGalleryApp.service.AccountService;

public class AccountRepositoryTests extends AbstractArtGalleryIntegrationTests {

	/**
	 * Number of events created in test-data.sql.
	 */
	private static final int NUM_TEST_ACCOUNTS = 1;

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	ProfileRepository profileRepository;
	
	@Autowired
	GalleryRepository galleryRepository;
	
	@Autowired
	ArtObjectRepository artObjectRepository;
	
	@Autowired
	AddressRepository locationRepository;
	
	@Autowired
	AccountService service;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	public void count() {
		assertThat(accountRepository.count()).isEqualTo(NUM_TEST_ACCOUNTS);
	}

	@Test
	public void save() {
		createOneAccount();
		assertNumEvents(NUM_TEST_ACCOUNTS+ 1);
	}


	public void createOneAccount() {


	}

	private void assertNumEvents(int expected) {
		assertThat(JdbcTestUtils.countRowsInTable(jdbcTemplate, "events")).isEqualTo(expected);
	}

}
