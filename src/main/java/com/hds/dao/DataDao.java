package com.hds.dao;

import java.util.List;

import com.hds.model.Employee;

public interface DataDao {

	public boolean addEmployee(Employee employee) throws Exception;
	public Employee getEmployeeById(long id) throws Exception;
	public List<Employee> getEmployees() throws Exception;
	public boolean deleteEmployee(long id) throws Exception;
}
