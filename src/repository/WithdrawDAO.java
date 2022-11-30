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
		LocalDateTime time = LocalDateTime.now();

		Withdraw withdraw1 = new Withdraw(time.minusDays(60), "place1", -1000);
		Withdraw withdraw2 = new Withdraw(time.minusDays(40), "place2", -2000);
		Withdraw withdraw3 = new Withdraw(time.minusDays(30), "place3", -3000);
		Withdraw withdraw4 = new Withdraw(time.minusDays(10), "place4", -4000);
		list.add(withdraw1);
		list.add(withdraw2);
		list.add(withdraw3);
		list.add(withdraw4);
		return list;

	}
}
