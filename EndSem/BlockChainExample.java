package EndSem;

import java.util.Scanner;

public class BlockChainExample {

	public static void main(String args[]) {

		SLL1 tcpCoin = new SLL1();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while (choice != 5) {
			System.out.println("1.Enter data into blockchain");
			System.out.println("2.Display the Blockchain ");
			System.out.println("3.Get scammed");
			System.out.println("4.Validity");
			System.out.println("5.Stop");
			System.out.println();
			System.out.println("Enter a choice value : ");
			choice = sc.nextInt();
			sc.nextLine();
			System.out.println();
			switch (choice) {
			case 1:
				String s1;
				System.out.println("Enter the string: ");
				s1 = sc.nextLine();
				Block1 a = new Block1(new java.util.Date(), s1);
				tcpCoin.insertBack(a);
				break;
			case 2:
				tcpCoin.displayChain();
				System.out.println();
				break;
			case 3:
				int y;
				System.out.println("Enter the block number to be scammed: ");
				y = sc.nextInt();
				tcpCoin.GetNth(SLL1.head, y);
				tcpCoin.displayChain();
				System.out.println();
				break;
			case 4:
				tcpCoin.isValid();
				System.out.println();
				break;
			}
		}
	}

}