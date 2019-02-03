package io.naztech.g3project.interfacdao;

import io.naztech.g3project.model.Employee;

public interface IEmployeeDao extends IGetAll<Employee> {
	
	public Employee findEmployeeByName(String name);

}
