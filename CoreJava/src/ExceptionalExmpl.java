
public class ExceptionalExmpl {
public void m() {
	try {
	int n = 45/0;
	}
	catch(Exception e) {
	System.out.println("EXCEPETION");
}
}
public void n() {
	System.out.println("METHOD M");
	try {
	m();
	}
	catch(Exception e){
		System.out.println(e.getMessage()+"EXCEPTION THROWN");
	}
}
	
public void o() {
	System.out.println("METHOD O");
	n();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionalExmpl exc = new ExceptionalExmpl();
		exc.o();
	}

}
