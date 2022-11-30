package service;

import java.util.ArrayList;
import java.util.List;

import atmDTO.CardInfo;
import repository.BalanceDAO;

public class BalanceService {

	public static int getBalance(CardInfo cardInfo,String accountNo) {

		int balance = BalanceDAO.selectBalance(cardInfo,accountNo);

		return balance;
	}
	public static List<String> getAccountList(CardInfo cardInfo) {
		List<String> accountList = new ArrayList<>();
		accountList = BalanceDAO.selectAccountList(cardInfo);	
		return accountList;
	}
}