//program to demonstrate on access specifier
package in.bkcmet.library;

public class Library {
//different access specifier
	  public String libraryName;
	  private long userId;
	  String booksName;
	  
	  public void displayPublic()
	  {
		  System.out.println("Library name: "+libraryName);
	  }
	  
	  private void displayPrivate()
	  {
		  System.out.println("User Id: "+userId);
	  } 
	  void displayDefault()
	  {
		  System.out.println("BookName is: " +booksName);
	  }
}
