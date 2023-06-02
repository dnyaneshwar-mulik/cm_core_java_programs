package oopPolymorphism;

class student {
	void studInfo(int rollnum, String name, long mobnum) {

		System.out.println(rollnum + name + mobnum);
	}
}

class stud2 extends student{
	void studInfo(int rollnum, String name, long mobnum) {
		System.out.println(rollnum + name + mobnum);
	}
}

class ram extends student {
	void studInfo(int rollnum, String name, long mobnum, char c) {
		System.out.println(rollnum + name + mobnum+c);
	}
}

class gita extends student{
	void studInfo(char k, int intnum, float fl) {
		System.out.println(""+k+" "+intnum+" "+fl);
	}
}

public class Testruntimepoly {
	public static void main(String[] args) {
		student s = new student();
		s.studInfo(101, "ram", 97485754L);
		
		student st= new stud2();
		st.studInfo(512, "stud2", 7584695123L);
		
		ram r = new ram();
		r.studInfo(202, "shyam", 78485785L , 'm');
		
		gita g= new gita();
		g.studInfo('m', 54123, 94.15f);
		
		
		

	}
}
