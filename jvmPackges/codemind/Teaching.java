package jvmPackges.codemind;

import java.util.Scanner;

public class Teaching {
	
	int a = 10;
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		Work wObj = new Work();
		
		JavaTrainer obj = new JavaTrainer();
		obj.test();
		
		
		AngularTrainer Aobj = new AngularTrainer();
		
		Scanner sc = new Scanner(System.in);
		
		ScienceTraining Sobj = new ScienceTraining();
		
		System.out.println("Hello");
		
		Teaching tObj = new Teaching();
		tObj.m1();
		
	}
	
	void m1() {
		m2();
		
		for(int i = 0; i< 10;i++) {
			System.out.println("IN For Loop");
		}
	}
	
	void m2() {
		
	}

}

class Work {

}

class Trainer {

}

class ScienceTraining {

}

class AngularTrainer {

}
class JavaTrainer {
	
	public void test() {
		System.out.println("Inside Test method");
	}

}
