package com.hds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hds.dao.DataDao;
import com.hds.model.Employee;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	
	@Override
	public boolean addEmployee(Employee employee) throws Exception {
		return dataDao.addEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(long id) throws Exception {
		return dataDao.getEmployeeById(id);
	}

	@Override
	public List<Employee> getEmployees() throws Exception {
		return dataDao.getEmployees();
	}

	@Override
	public boolean deleteEmployee(long id) throws Exception {
		return dataDao.deleteEmployee(id);
	}

}
