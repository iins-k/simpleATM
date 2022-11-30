package controller;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import atmDTO.CardInfo;
import atmDTO.Deposit;
import atmDTO.Withdraw;
import service.BalanceService;
import service.DepositService;
import service.WithdrawService;

public class ATMController {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("input Your Card ");
			// get pin number
			Thread.sleep(1000);
			String cardNumber = sc.nextLine();

			System.out.println("input Your PassWord");

			String password = sc.nextLine();
			CardInfo cardInfo = new CardInfo();
			cardInfo.setCardNumber(cardNumber);
			cardInfo.setPw(password);
			boolean check = CheckCardNumber.checkCardNum(cardInfo);
			if (check) {
				System.out.println("select Account");
				Map<Integer, String> accountList = CheckCardNumber.getAccountInfo(cardInfo);
				for (int i = 1; i <= accountList.size(); i++) {
					System.out.println(i + ". " + accountList.get(i));
				}

				System.out.println("select accountNumber");
				int selectno = Integer.parseInt(sc.nextLine());
				String accountNo = accountList.get(selectno);
				here: while (true) {

					System.out.println("select Service");
					System.out.println("1. show Balance");
					System.out.println("2. show DepositList");
					System.out.println("3. show WithdrawList");
					System.out.println("4. go MainView");
					int k = Integer.parseInt(sc.nextLine());

					switch (k) {
					case 1:
						int balance = BalanceService.getBalance(cardInfo, accountNo);
						System.out.println(balance);
						break;
					case 2:
						List<Deposit> depositList = DepositService.getDepositList(cardInfo, accountNo);
						for (int i = 0; i < depositList.size(); i++) {
							System.out.print(depositList.get(i).getInputDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " ");
							System.out.print(depositList.get(i).getInputLocation() + "  ");
							System.out.println(depositList.get(i).getMoney());
						}

						break;
					case 3:
						List<Withdraw> withdrawList = WithdrawService.getWithdrawList(cardInfo, accountNo);
						for (int i = 0; i < withdrawList.size(); i++) {
							System.out.print(withdrawList.get(i).getOutputDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + " ");
							System.out.print(withdrawList.get(i).getOutputLocation() + "  ");
							System.out.println(withdrawList.get(i).getMoney());
						}

						break;
					case 4:
						System.out.println("Good Bye");
						Thread.sleep(1000);
						break here;
					}

				}

			} else {
				System.out.println("wrong CardNumber");
			}

		}

	}
}
