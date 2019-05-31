import java.util.Locale;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = s1.concat("hello");
		String s3 = new String("hello");
		String str = "THis is good";
		Locale loc = Locale.getDefault();
		
		System.out.println(loc.getLanguage()+"\n"+loc.getCountry());
		/*for(int i=0;i < str.length();i++) {
			String[] words = str.split(" ");
			System.out.println(str+":"+words.length);
		}*/
		
	}

}
