package javaAdvance;

import org.apache.commons.compress.utils.CharsetNames;

import com.fasterxml.jackson.core.sym.Name;

public class Employee extends Person{
	private String employeeId;
	private String title;
	
	public Employee() {
//		super("Datch");
		System.out.println("In Employee default constructor");
	}
	

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setName(String name) {
		System.out.println(name + "*****");
	}
}
