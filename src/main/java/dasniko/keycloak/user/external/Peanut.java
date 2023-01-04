package dasniko.keycloak.user.external;

import lombok.Data;

import java.util.List;

/**
 * @author Niko Köbler, https://www.n-k.de, @dasniko
 */
@Data
public class Peanut {
	private String username;
	private String name;
	private String address;
	private String city;
	private String contactPerson;
	private String contactNo;
	private String emailId;
	private String firstName;
	private String lastName;
	private List<String> groups;
	private List<String> roles;
}
