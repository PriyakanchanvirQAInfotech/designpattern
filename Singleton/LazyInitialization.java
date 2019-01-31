import java.util.*;
public class LazyInitialization {
	private static LazyInitialization obj;

    private LazyInitialization(){
    	System.out.println("This is an Lazy Itialization Singleton Class.");
    }  //private constructor.

    public static LazyInitialization getInstance(){
        if (obj == null){ //if there is no instance available... create new one
            obj = new LazyInitialization();
        }

        return obj;
    }
    public static void main(String args[]) {
    	LazyInitialization li= LazyInitialization.getInstance();
    	System.out.println("Lazy Itialization Singleton Class.");
    }
}
