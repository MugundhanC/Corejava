package oops.encap;

public class Employeedetails {

	

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setEmpid(1930);
		emp.setEmpname("Mugundhan");
		emp.setEmpaddress("DPI");
		emp.setEmpphno(8248304767L);
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpaddress());
		System.out.println(emp.getEmpphno());

	}

}
