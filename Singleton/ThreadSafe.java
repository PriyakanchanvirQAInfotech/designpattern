import java.util.*;
public class ThreadSafe {

	  private static ThreadSafe obj; 
	  
	  private ThreadSafe() { 
	    	System.out.println("This is an Thread Safe Singleton Class."); 
	  } 
	  
	 //synchronized method to control simultaneous access 
	  synchronized public static ThreadSafe getInstance()  
	  { 
	    if (obj == null)  
	    { 
	      // if instance is null, initialize 
	      obj = new ThreadSafe(); 
	    } 
	    return obj; 
	  }  
	  public static void main(String args[]) {
	    	ThreadSafe ts= ThreadSafe.getInstance();
	    	System.out.println("Thread Safe Singleton Class."); 
	    }
}
