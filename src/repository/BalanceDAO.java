package repository;

import java.util.ArrayList;
import java.util.List;

import atmDTO.CardInfo;

public class BalanceDAO {

	public static int selectBalance(CardInfo cardInfo,String accountNo) {

		// connection Bank API

		// test Code;
		int balance = 1000000;
		
		return balance;

	}
	public static List<String> selectAccountList(CardInfo cardInfo) {
		List<String> list = new ArrayList<>();
		
		/// connect bank APi
		
		 /// test code 
		list.add("123423-12-123456");
		list.add("1234-1234-1234");
		list.add("34556-666-1111111");
		
		return list;
	}
}
