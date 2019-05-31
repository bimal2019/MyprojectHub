package com.multithreading;
/**
 * This program demostrates the inner communication between two threads there are 
 * 3 classes are created one is A wait() ,notify() method is call.  
 * @author bimal3
 *
 */
class A{
	int num;
	boolean valueSet=false;
	synchronized void put(int num1) {
		
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("PUT:" + num);
		this.num=num1;
		valueSet=true;
		notify();
		
	}
	synchronized  int get() {
		
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("GET:"+num);
		valueSet=false;
		notify();
		return num;
		
	}
}

class Producer implements Runnable{
	private A a;
	public Producer(A q) {
		this.a = q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i =0;
		while(true) {
			a.put(i++);
			try {Thread.sleep(5000);}catch(Exception e) {}
			
		}
	}
	
}
class Consumer implements Runnable{
	private A a;
	public Consumer(A q) {
		this.a = q;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			a.get();
			try {Thread.sleep(500);}catch(Exception e) {}
			
		}
	}
	
}
public class ThreadExp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//A a = new A();
			// int num=5;
		//	new Producer(a);
		//	new Consumer(a);
			
			String str1 = "first";
			String str2 = new String("first");
			
			if(str1.equals(str2))
			{System.out.println("TRR");
	}

	
}
