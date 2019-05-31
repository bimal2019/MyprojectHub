package com.multithreading;

public class TestMultiThreading extends Thread{
	public void run() {
		 synchronized ("Sync") { 
		System.out.println("THIS IS THREAD RUNNING NICELY"+Thread.currentThread().getName());
	}
	}
	private void synchronize(String string) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestMultiThreading t=new TestMultiThreading();
		
		
		
		Thread t1 = new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		
		t3.setPriority(1);
		t1.setPriority(NORM_PRIORITY);
		t2.setPriority(8);
		t1.setName("Bimal");
		
		
		
		t3.join(1500);
		t3.start();
		t3.setName("Chris");
		
		t1.sleep(1400);
		t1.start();
		t1.setName("Bob");
		t1.sleep(1400);
		t2.join(1500);
		t2.start();
		t2.setName("Bimal");
		t2.sleep(1400);
		
		
		
		System.out.println(t1.getPriority()+ " "+t2.getPriority()+ " "+ t3.getPriority());
	}
}
