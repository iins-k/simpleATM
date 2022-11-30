package atmDTO;

import java.time.LocalDateTime;

public class Withdraw {
	private LocalDateTime outputDate;
	private String outputLocation;
	private int money;

	public Withdraw() {

	}

	public Withdraw(LocalDateTime outputDate, String outputLocation, int money) {
		this.outputDate = outputDate;
		this.outputLocation = outputLocation;
		this.money = money;
	}

	public LocalDateTime getOutputDate() {
		return outputDate;
	}

	public void setOutputDate(LocalDateTime outputDate) {
		this.outputDate = outputDate;
	}

	public String getOutputLocation() {
		return outputLocation;
	}

	public void setOutputLocation(String outputLocation) {
		this.outputLocation = outputLocation;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Withdraw [outputDate=" + outputDate + ", outputLocation=" + outputLocation + ", money=" + money + "]";
	}

}
