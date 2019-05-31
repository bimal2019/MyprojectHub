
public class TestDeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lock1 = "lock1";
		String lock2 = "lock2";
		
		CreateDeadLock cr = new CreateDeadLock(lock1,lock2);
		CreateDeadLock2 cr2 = new CreateDeadLock2(lock1,lock2);
		
		Thread t1=new Thread(cr,"t1");
		Thread t2 = new Thread(cr2,"t2");
		
		t1.start();
	t2.start();
		
	}

}
