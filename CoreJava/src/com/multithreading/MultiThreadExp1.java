package com.multithreading;

public class MultiThreadExp1 extends Thread{
	MultiThreadExp1(){
		super("My Extending thread");
		System.out.println("MY THREAD IS STARTED NICELY");
		start();
	}
	public void run() {
		try {
			for(int i=0;i < 10;i++) {
				System.out.println("Printing the count"+i);
				Thread.sleep(1500);
			}
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadExp1 mul = new MultiThreadExp1();
		try {
			while(mul.isAlive()) {
				System.out.println("THIS THREAD IS STILL ALIVE");
				Thread.sleep(15000);
			}
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
