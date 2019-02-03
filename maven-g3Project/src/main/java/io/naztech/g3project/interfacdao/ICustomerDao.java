package io.naztech.g3project.interfacdao;

import io.naztech.g3project.model.Customer;

public interface ICustomerDao extends IGetAll<Customer>{
	public Customer findCustomerById(int id);
	

}
