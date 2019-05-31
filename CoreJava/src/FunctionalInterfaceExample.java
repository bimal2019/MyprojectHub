import java.util.Optional;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfunctionalInterface inf = (String a)->System.out.println(a);
	    String str = null;
	    inf.message("Hey there ");
	  
	    Optional<String> opt = Optional.ofNullable(str);
	    if(opt.isPresent()) {
	    System.out.println(opt.map(String::toUpperCase));
	}
	}
	
	public interface IfunctionalInterface{
		void message(String msg);
	}

}
