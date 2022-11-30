package service;

import java.util.ArrayList;
import java.util.List;

import atmDTO.CardInfo;
import atmDTO.Withdraw;
import repository.WithdrawDAO;

public class WithdrawService {

	public static List<Withdraw> getWithdrawList(CardInfo cardInfo, String accountNo) {
		List<Withdraw> list = new ArrayList<>();

		list = WithdrawDAO.selectWithdrawList(cardInfo, accountNo);
		return list;
	}
}
