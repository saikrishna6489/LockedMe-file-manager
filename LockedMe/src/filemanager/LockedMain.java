package filemanager;

import java.util.Scanner;


public class LockedMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Operations op = new Operations();
		int ch = 0;
		String name;

		System.out.println("");
		System.out.println("        Welcome to LockedMe application");
		System.out.println("****************************************************");
		System.out.println("Developer : sai krishna ch");
		System.out.println("Developer email : chsaikrishna6489@gmail.com");
		System.out.println("****************************************************");
		System.out.println("");
		
		op.file_list();
		
		System.out.println("    ** please enter your name **");
		name = sc.nextLine();
		System.out.println("        *** HELLO " + name.toUpperCase()+ " ***");
		System.out.println("");
		op.setname(name);
		do {
			System.out.println("------------------------------------------------");
			System.out.println("                   MAIN MENU");
			System.out.println("------------------------------------------------");
			System.out.println("   Enter (1) to list the file names");
			System.out.println("   Enter (2) for file operation menu");
			System.out.println("   Enter (3) to exit from the application");
			System.out.println("");
			System.out.println("   * " + name.toUpperCase() + "  Please enter your appropriate choice(1-3) *");
			System.out.println("");
			try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
			}
			switch (ch) {
			case 1:
				System.out.println("          FILE NAMES");
				System.out.println("--------------------------------");
			    op.print_file_list();
			    System.out.println("--------------------------------");
			    System.out.println("");
			    ch = 0;
				break;
			case 2:
			    op.operator();
			    ch = 0;
				break;
			case 3:
				System.out.println("    ***** " + name.toUpperCase() + " thanku for using our application LockedMe *****");
				break;
			default:
				System.out.println("   ***Wrong Choice... Please choose between 1-4 only***");
				System.out.println("");
				break;
			}
		} while (ch != 3);
		sc.close();
	}

}
