
package artGallery.domain;

import java.sql.Timestamp;

import artGalleryApp.domain.Account;
import artGalleryApp.domain.Address;
import artGalleryApp.domain.Profile;

public class EntityTestUtils {

	
	public static Address createlocation1() {
		return new Address("bahnhof", "1234", "8008", "aarau", "schweiz");
	}
	
	public static Profile createprofile1(Account account) {
		return new Profile("das Bo", account, "I am Das Bo! Fear my BoBo Power", "Lord of Bo");
	}
	
	
	public static Account createAccount1() {
		Account account1 = new Account("adrian", "gross", "arna", createlocation1(), null, "ad@ad", "passord", new Timestamp(System.currentTimeMillis()));
		Profile profile1 = createprofile1(account1);
		account1.setProfile(profile1);
		return account1;
	}


	
	
}
