
public interface Iinterface<T> {
//public void message();
 int add(int a ,int b) ;
 default void message(T t) {
	
	 System.out.println(t);
 }
}
