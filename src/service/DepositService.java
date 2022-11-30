package service;

import java.util.ArrayList;
import java.util.List;

import atmDTO.CardInfo;
import atmDTO.Deposit;
import repository.DepositDAO;

public class DepositService {

	public static List<Deposit> getDepositList(CardInfo cardInfo, String accountNo) {
		List<Deposit> list = new ArrayList<>();

		list = DepositDAO.selectDeposit(cardInfo, accountNo);

		return list;
	}
}
