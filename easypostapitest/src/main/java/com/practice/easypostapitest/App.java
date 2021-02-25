package com.practice.easypostapitest;

import java.util.HashMap;
import java.util.Map;

import com.easypost.EasyPost;
import com.easypost.exception.EasyPostException;
import com.easypost.model.Address;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws EasyPostException {
		EasyPost.apiKey = "EZAK3a0f59a0d33b4d21a83e6eafa48f410cF7O5Be3m7BJQhDua8Fwfjg";
		Map<String, Object> addressHash = new HashMap<String, Object>();

		addressHash.put("street1", "417 Montgomery Street");
		addressHash.put("street2", "5th Floor");
		addressHash.put("city", "amlagora");
		addressHash.put("state", "CA");
		addressHash.put("zip", "94104");
		addressHash.put("country", "US");
		addressHash.put("company", "EasyPost");
		addressHash.put("phone", "415-123-4567");
		Address address1 = Address.retrieve("adr_cb9bd380dad149a38295fe5a925da22c");

		//Address address = Address.create(addressHash);

		//System.out.println(address);
		System.out.println(address1.getId());
		System.out.println(address1.getStreet1());
		System.out.println(address1.getStreet2());
		System.out.println(address1.getCity());
		System.out.println(address1.getZip());
		System.out.println(address1.getCountry());
		System.out.println(address1.getCompany());
		System.out.println(address1.getPhone());
	}
}
