package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import atmDTO.CardInfo;
import service.BalanceService;

public class CheckCardNumber {

	public static boolean checkCardNum(CardInfo cardInfo) {
		/// connect bank api

		/// test Code
		if (cardInfo.getCardNumber().equals("1234-1234-1234-1234") && cardInfo.getPw().equals("1q2w3e4r5t")) {

			return true;
		} else {
			return false;
		}

	}

	public static Map<Integer, String> getAccountInfo(CardInfo cardInfo) {
		// connect bank API

		// test Code
		Map<Integer, String> map = new HashMap<>();

		List<String> list = BalanceService.getAccountList(cardInfo);
		
		int idx = 1;
		
		for (String accountNo : list) {
			map.put(idx++, accountNo);
		}

		return map;

	}
}
