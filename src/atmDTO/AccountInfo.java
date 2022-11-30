package atmDTO;

public class AccountInfo {

	private UserInfo user;
	private String bank;
	private int accountNo; 
	private int balance;

	public AccountInfo() {
	}

	public AccountInfo(UserInfo user, int balance) {
		this.user = user;
		this.balance = balance;
	}
	public AccountInfo(String bank, int accountNo) {
		this.bank = bank;
		this.accountNo = accountNo;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public String toString() {
		return "AccountInfo [user=" + user + ", balance=" + balance + "]";
	}

}
