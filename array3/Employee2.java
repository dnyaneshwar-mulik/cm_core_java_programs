package array3;

public class Employee2 {
	
	private int empId;
	private String empName;
	private long mobNo;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		if(empId > 0) {
			this.empId = empId;
		} else {
			System.out.println("EmpId Value is incorrect");
		}
		
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	
	
	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + ", mobNo=" + mobNo + "]";
	}
	
}
