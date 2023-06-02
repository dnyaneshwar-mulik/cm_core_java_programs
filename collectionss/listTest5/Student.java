package collectionss.listTest5;

public class Student implements Comparable<Student>
{
	
	int rno;
	String name;
	String add;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	//@Override
	public int compareTo(Student o) {
		
		
		  if(rno == o.rno) { return 0; }else if(rno > o.rno) { return 1; }else { return
		  -1; }
		 
		
		//return name.compareTo(o.name);
		
	}
	
	

}
