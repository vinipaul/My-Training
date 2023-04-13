package utilities;

import java.util.Date;


import com.github.javafaker.Faker;

public class FakerUtility {
	public static String fakeFirstName() {
		Faker faker=new Faker();
		return faker.name().firstName();
	}
	public static String fakeLastName() {
		Faker faker=new Faker();
		return faker.name().lastName();
	}
	public static String fakeCityName() {
		Faker faker=new Faker();
		return faker.address().cityName();
	}
	public static String fakeStateName() {
		Faker faker=new Faker();
		return faker.address().state();
	}
	public static String fakeCountryName() {
		Faker faker=new Faker();
		return faker.address().country();
	}
	public static String fakeCountryCode() {
		Faker faker=new Faker();
		return faker.address().countryCode();
	}
	public static String fakePhoneNumber() {
		Faker faker=new Faker();
		return faker.phoneNumber().cellPhone();
	}
	public static String fakeAnimalName() {
		Faker faker=new Faker();
		return faker.animal().name();
	}
	public static String fakeNationalLanguage() {
		Faker faker=new Faker();
		return faker.nation().language();
	}
	public static Date fakeBirthDay(){
		Faker faker=new Faker();
		return faker.date().birthday();
	}
	public static String fakeEmailAddress(){
		Faker faker=new Faker();
		return faker.internet().emailAddress();
	}
	
	public static String fakePassword(){
		Faker faker=new Faker();
		return faker.internet().password();
	}
	
	
	
}
