package ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Shopping {
	public static List<String> answers = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getinput();

	}

	public static void getinput() {
		Shopping sh = new Shopping();
		sh.addmethod();

		System.out.println("enter the item you want to buy:");
		Scanner item = new Scanner(System.in);
		String s = item.nextLine();
		if (sh.checkinput(s)) {
			int price = sh.shoppingCart(s);
			System.out.println("the price is" + price);
			System.out.println("enter the quantity you want to buy:");
			Scanner quantity = new Scanner(System.in);
			String t = quantity.nextLine();
			if(sh.checkquantity(s, t))
			System.out.println("Total Price is :" + price * Integer.parseInt(t));
			else
				System.out.println("Sorry We dont have enought quantity");

			getinput();

		} else {
			getinput();
		}

	}

}
