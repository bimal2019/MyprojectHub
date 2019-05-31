
public class Fibnosis {
int[] fib

	for(int i =0;i < 5;i++) {
		System.out.println(fibnosis(i));
	}

	private char[] fibnosis(int i2) {
		// TODO Auto-generated method stub
		if(i2==1 || i==2)
			return 1;
		return fibnosis(i2-1)-fibnosis(i2-2);
	}
}
