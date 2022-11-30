package atmDTO;

public class UserInfo {
	private String name;
	private int birthday;
	private int identifiedNumber;
	private String address;
	private String phoneNumber;

	public UserInfo() {

	}

	public UserInfo(String name, int birthday, int identifiedNumber, String address, String phoneNumber) {
		this.name = name;
		this.birthday = birthday;
		this.identifiedNumber = identifiedNumber;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public int getIdentifiedNumber() {
		return identifiedNumber;
	}

	public void setIdentifiedNumber(int identifiedNumber) {
		this.identifiedNumber = identifiedNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", birthday=" + birthday + ", identifiedNumber=" + identifiedNumber
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

}
