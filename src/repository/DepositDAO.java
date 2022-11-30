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

		Deposit deposit1 = new Deposit(LocalDateTime.now(), "place1", 1000);
		Deposit deposit2 = new Deposit(LocalDateTime.now(), "place2", 2000);
		Deposit deposit3 = new Deposit(LocalDateTime.now(), "place3", 3000);
		Deposit deposit4 = new Deposit(LocalDateTime.now(), "place4", 4000);
		list.add(deposit1);
		list.add(deposit2);
		list.add(deposit3);
		list.add(deposit4);

		return list;

	}
}
