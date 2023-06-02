package assignments_programs;


public class Ad{
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		
		Student obj1 = new Student();
		
		boolean res =obj.equals(obj1); 
		
		System.out.println("Object class Equals Method-"+res); //false
		
		boolean res1 = obj.equals(obj);
		
		System.out.println("Object class Equals Method-"+res1); //true
		
		System.out.println("Equal Operator on Student Class-"+ (obj==obj1)); //false
		System.out.println("Equal Operator on Student Class-"+ (obj==obj)); //true
		
		String sObj = new String("Umesh");
		
		String sObj1 = new String("Umesh");
		
		boolean sRes = sObj.equals(sObj1); //true
		
		System.out.println("String class Equals Method-"+sRes); //true
		
		System.out.println("Equal Operator on String Class-"+ (sObj==sObj1)); //false
		
		System.out.println("Equal Operator on String Class-"+ (sObj==sObj)); //true
		
		
		String lsObj = "Ramesh";
		String lsObj1 = "Ramesh";
		
		System.out.println("String class equalas method on litral-"+lsObj.equals(lsObj1));
		
		System.out.println(lsObj==lsObj1); //true
		
		String sc = "Umesh";
		String sc1 = "Umesh";
		String sc2 = "Umesg";
		
		System.out.println(sc.compareTo(sc1)); //0
		System.out.println(sc.compareTo(sc2)); //+ve
		System.out.println(sc2.compareTo(sc)); //-ve
		
		String a = "A";
		String b = "B";
		
		System.out.println(b.compareTo(b));
	}

}
