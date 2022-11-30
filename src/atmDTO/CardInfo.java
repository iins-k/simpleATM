package atmDTO;

import java.util.ArrayList;
import java.util.List;

public class CardInfo {
	private int pin;
	private String pw;
	private int expYear;
	private int expMonth;
	private String cardNumber;
	private List<AccountInfo> connectedBankList = new ArrayList<>();

	public CardInfo() {

	}

	public CardInfo(int pin, String pw, int expYear, int expMonth, String cardNumber,
			List<AccountInfo> connectedBankList) {
		super();
		this.pin = pin;
		this.pw = pw;
		this.expYear = expYear;
		this.expMonth = expMonth;
		this.cardNumber = cardNumber;
		this.connectedBankList = connectedBankList;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public int getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public List<AccountInfo> getConnectedBankList() {
		return connectedBankList;
	}

	public void setConnectedBankList(List<AccountInfo> connectedBankList) {
		this.connectedBankList = connectedBankList;
	}

	@Override
	public String toString() {
		return "CardInfo [pin=" + pin + ", pw=" + pw + ", expYear=" + expYear + ", expMonth=" + expMonth
				+ ", cardNumber=" + cardNumber + ", connectedBankList=" + connectedBankList + "]";
	}

}
