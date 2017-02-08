import java.util.Arrays;
import java.util.*;
//Lock In
//Code Book 
//Hyperbole and a Half
//What if 
//Nerdy Nummies 


public class BookShelf {
	
	public static void main(String args[]){
			/////array: get- O(1); contains - O(N)//////
			String[] books = {"Lock In", "Code Book", "Hyberbole and a Half", "What if"}; 
			System.out.println("You have " + books.length + " books");
			System.out.println("You own: " + books.toString()); 
			
			/////add - O(N)/////
			String[] newBooks = new String[5]; 
			for (int i = 0; i < books.length; i++){
				newBooks[i] = books[i]; 
			} 
			newBooks[4] = "Nerdy Nummies"; 
			System.out.println("You have " + newBooks.length + " books");
			
			/////remove - O(N)//////
			String[] lessBooks = new String[3]; 
			lessBooks = Arrays.copyOf(newBooks, 3); 
			System.out.println("You have " + lessBooks.length + " books"); 
			
			//////sort - O(NlnN)/////
			Arrays.sort(newBooks);
			
///////////////////////////////////////////////////////////////////////////////
		
			/////array-list: get- O(1); contains - O(N)/////
			ArrayList booksAL = new ArrayList(); 
			
			/////add - O(1)//////
			booksAL.add("Nerdy Nummies"); 
			booksAL.add("Lock In"); 
			booksAL.add(1, "What If"); 
			System.out.println("You have " + booksAL.size() + " books");
			System.out.println("You own " + booksAL); 
			
			/////remove - O(N)/////
			booksAL.remove("Lock In"); 
			System.out.println("You have " + booksAL.size() + " books");
			System.out.println("You own " + booksAL); 
			
			/////sort - O(N)/////
			Collections.sort(booksAL);
			
//////////////////////////////////////////////////////////////////////////////////
		
	
			//linked list: get -O(N); contains -O(N)/////
			LinkedList booksList = new LinkedList(); 
			
			/////add - O(1)/////
			booksList.add("Nerdy Nummies"); 
			booksList.add("Lock In"); 
			booksList.add(1, "Hyperbole and a Half"); 
			System.out.println("You have " + booksList.size() + " books");
			System.out.println("You own " + booksList); 
			
			/////remove - O(1)//////
			booksList.remove("Nerdy Nummies"); 
			System.out.println("You have " + booksList.size() + " books");
			System.out.println("You own " + booksList); 
			
			//sort - O(N)
	}
}
