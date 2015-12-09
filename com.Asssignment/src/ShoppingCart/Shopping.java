package ShoppingCart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Shopping  {

	/* This is how to declare HashMap */
	HashMap<String, Item> hmap = new HashMap<String, Item>();

	/* Adding elements to HashMap */
	public void addmethod() {
		Item item1 = new Item();
		item1.itemName = "Book";
		item1.itemPrice = "30";
		item1.itemQuantity ="5";
		
		Item item2 = new Item();
		item2.itemName = "Pen";
		item2.itemPrice = "20";
		item2.itemQuantity ="10";
		
		Item item3 = new Item();
		item3.itemName = "Pencil";
		item3.itemPrice = "10";
		item3.itemQuantity ="15";
		
		hmap.put("Book", item1);
		hmap.put("Pen", item2);
		hmap.put("Pencil", item3);
		

		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("Item is: " + mentry.getKey() + " & Price is: ");
			Item i =(Item) mentry.getValue();
			System.out.println(i.getItemPrice());
		}

	}
	
	public int shoppingCart(String strinput){
		if(hmap.containsKey(strinput)){
			Item item = hmap.get(strinput);
			return Integer.parseInt(item.getItemPrice());
		}
		return 0;
		
	}
	
	public boolean checkquantity(String str,String q){
		if(hmap.containsKey(str)){
			Item item = hmap.get(str);
			int userq = Integer.parseInt(q);
			int actualq = Integer.parseInt(item.getItemQuantity());
			if(userq<actualq)
				return true;
			else
				return false;
		}
		return false; 
	}

	
	public boolean checkinput(String str){
		return hmap.containsKey(str);
	}
	
	
	

}
