import java.util.Scanner;

public class ZorkGame {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

	
		int option = 1;
		int room = 1;

		do {
			if (room == 1) {

				System.out
						.print("You are standing in the foyer.  You see a dead scorpion. \n"
								+ "{You can (1)to exit to the room north of you, (0)to turn around and leave.}");
				option = keyboard.nextInt();
				//keyboard.nextLine();

				if (option == 1) {
					room = 2;
					//System.out
					//		.print("You are now in the front room. You see a coat rack. \n"
					//				+ "{You can (1)exit south, (2)exit west, (3)exit east, (0)emergency exit house.");
					//option = keyboard.nextInt();
					//keyboard.nextLine();
				}

			}
			if (room == 2) {
				System.out
						.print("You are now in the front room. You see a coat rack. \n"
								+ "{You can (1)exit south, (2)exit west, (3)exit east, (0)emergency exit house.");
				option = keyboard.nextInt();
				//keyboard.nextLine();

				if (option == 1) {
					room = 1;
				}

				else if (option == 2) {
					room = 4;
					//System.out
					//		.print("You are standing in the kitchen. You can exit (1)north, (2)east.");
					//option = keyboard.nextInt();
					//keyboard.nextLine();

				}

				else if (option == 3) {
					room = 3;
					System.out
							.print("You are standing in the Library. You found your favorite book so \n"
									+ "you decided to sit down and read for a little while. About an hour later, you decided it was \n"
									+ "time to go to exit this room (1)exit north, (2)exit west.");
					option = keyboard.nextInt();
					//keyboard.nextLine();
				}

			}
			if (room == 3) {
				System.out
						.print("You are standing in the Library. You found your favorite book so \n"
								+ "you decided to sit down and read for a little while. About an hour later, you decided it was \n"
								+ "time to go to exit this room (1)exit north, (2)exit west.");
				option = keyboard.nextInt();
				//keyboard.nextLine();

				if (option == 1) {
					room = 5;
				}

				else if (option == 2) {
					room = 2;
				}
			}
			if (room == 4) {
				System.out
						.print("You are standing in the kitchen.  You see a steak and decide to eat it.  \n"
								+ "Now you need to exit, (1)exit north, (2)exit east.");
				option = keyboard.nextInt();
				keyboard.nextLine();

				if (option == 1) {
					room = 7;

				}

				else if (option == 2) {
					room = 2;
				}
			}
			if (room == 5) {
				System.out
						.print("You are standing in the vault. You have found the treasure. If you want to keep going through \n"
								+ "the house select (1)exit west, (2)exit south.");
				option = keyboard.nextInt();
				keyboard.nextLine();

				if (option == 1) {
					room = 6;
				} else if (option == 2) {
					room = 3;
				}

			}
			if (room == 6) {

				System.out
						.print("You are standing in the dining room and you see some good steak. Now you need to exit, (1)exit west, (2)exit south, (3)exit east.");
				option = keyboard.nextInt();
				keyboard.nextLine();

				if (option == 1) {
					room = 7;
				}

				else if (option == 2) {
					room = 2;
				}

				else if (option == 3) {
					room = 5;
				}
			}
			if (room == 7) {
					System.out
							.print("You are standing in the Parlor.  You see ice cream and decide to eat it.\n"
									+ "Now you need to exit, (1)exit south, (2)exit east.");
					option = keyboard.nextInt();
					//keyboard.nextLine();

					if (option == 1) {
						room = 4;
					} else if (option == 2) {
						room = 6;
					}
				}
			
			keyboard.close();
		} while (option != 0);
	}
}