package collectionss.listTest5;

import java.util.Comparator;

public class EmpIDSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.id == o2.id) {
			return 0;
		}else if ((o1.id > o2.id)) {
			return 40;
			
		}else{
			return -2;
		}
		
	}

}
