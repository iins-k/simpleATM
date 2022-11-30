package repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import atmDTO.CardInfo;
import atmDTO.Withdraw;

public class WithdrawDAO {

	public static List<Withdraw> selectWithdrawList(CardInfo cardInfo, String accountNo) {
		List<Withdraw> list = new ArrayList<>();

		/// connection Back API

		// temp Code;

		Withdraw withdraw1 = new Withdraw(LocalDateTime.now(), "place1", -1000);
		Withdraw withdraw2 = new Withdraw(LocalDateTime.now(), "place2", -2000);
		Withdraw withdraw3 = new Withdraw(LocalDateTime.now(), "place3", -3000);
		Withdraw withdraw4 = new Withdraw(LocalDateTime.now(), "place4", -4000);
		list.add(withdraw1);
		list.add(withdraw2);
		list.add(withdraw3);
		list.add(withdraw4);
		return list;

	}
}
