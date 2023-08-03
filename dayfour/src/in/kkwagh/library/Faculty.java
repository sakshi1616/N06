package in.kkwagh.library;
import  in.bkcmet.library.*;
public class Faculty {

	public static void main(String[] args) {
	    Library l=new Library();
	    l.libraryName="Bhujbal Library";
	    l.displayPublic();
	    
	    /*userId and displayPrivate() method is private so we 
	     * cannot access into another package or class, 
	     * only we can access inside the same class*/
	    //l.userId =1234;
	    //l.displayPrivate();
	    
	    /*booksname and displayDefault() method is default ,
	     * we can't access into another package, only we can access it within the same package*/
	    
	     //l.booksName;
	     //l.displayDefault();

	}

}
