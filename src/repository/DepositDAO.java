package repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import atmDTO.CardInfo;
import atmDTO.Deposit;

public class DepositDAO {

	public static List<Deposit> selectDeposit(CardInfo cardInfo, String accountNo) {
		List<Deposit> list = new ArrayList<>();

		/// connect Bank API
		// temp Code
		LocalDateTime time = LocalDateTime.now();
		Deposit deposit1 = new Deposit(time.minusDays(60), "place1", 1000);
		Deposit deposit2 = new Deposit(time.minusDays(50), "place2", 2000);
		Deposit deposit3 = new Deposit(time.minusDays(40), "place3", 3000);
		Deposit deposit4 = new Deposit(time.minusDays(30), "place4", 4000);
		list.add(deposit1);
		list.add(deposit2);
		list.add(deposit3);
		list.add(deposit4);

		return list;

	}
}
