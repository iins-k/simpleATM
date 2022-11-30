package atmDTO;

import java.time.LocalDateTime;

public class Deposit {
	private LocalDateTime inputDate;
	private String inputLocation;
	private int money;

	public Deposit() {

	}

	public Deposit(LocalDateTime inputDate, String inputLocation, int money) {
		this.inputDate = inputDate;
		this.inputLocation = inputLocation;
		this.money = money;
	}

	public LocalDateTime getInputDate() {
		return inputDate;
	}

	public void setInputDate(LocalDateTime inputDate) {
		this.inputDate = inputDate;
	}

	public String getInputLocation() {
		return inputLocation;
	}

	public void setInputLocation(String inputLocation) {
		this.inputLocation = inputLocation;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Deposit [inputDate=" + inputDate + ", inputLocation=" + inputLocation + ", money=" + money + "]";
	}

}
