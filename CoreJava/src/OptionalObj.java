import java.util.Optional;

public class OptionalObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str =null;
Optional<String> option = Optional.ofNullable(str);

if(option.isPresent()) {
		
		String str2 = str.substring(0, 5);
	System.out.println(str);
}


	}

}
