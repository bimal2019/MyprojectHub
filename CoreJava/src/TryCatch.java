
public abstract class TryCatch {

	public static void main(String[] args) {
		try {
			//System.exit(0);
			double n =34.0/0.0;
			
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
finally{
	System.out.println("FINALLY");
}
	}

}
