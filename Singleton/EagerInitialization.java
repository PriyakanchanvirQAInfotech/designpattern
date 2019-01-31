import java.util.*;
public class EagerInitialization {
		private static EagerInitialization obj = new EagerInitialization();

	    //private constructor.
	    private EagerInitialization(){
	    	System.out.println("This is an Eager Itialization Singleton Class.");
	    }

	    public static EagerInitialization getInstance() {
	        return obj;
	    }

	    public static void main(String args[]) {
	    	EagerInitialization ei= EagerInitialization.getInstance();
	    	System.out.println("Eager Itialization Singleton Class."); 	
	    }
}
