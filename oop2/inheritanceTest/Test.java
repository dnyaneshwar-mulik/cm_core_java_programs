package oop2.inheritanceTest;

public class Test {
	
	public static void main(String[] args) {
		
		SWDeveloper obj = new SWDeveloper();
		obj.setEmpid(10);
		obj.setName("Umesh");
		obj.setMobNo(4588795);
		obj.setEmail("usb@gmail.com");
		obj.setSalary(100000.50f);
		obj.setBonus(6000f);

		
		System.out.println(obj.getName());
		System.out.println(obj.getSWDevSalary());
		
		Tester tObj = new Tester();
		tObj.setEmpid(11);
		tObj.setName("Suraj");
		tObj.setMobNo(458798);
		tObj.setEmail("suraj@gmail.com");
		tObj.setSalary(50000);
		tObj.setShiftAllowance(8000);
		
		System.out.println(tObj.getName());
		System.out.println(tObj.getTesterSalary());
		
	}

}
