package com.mybatis.test.dao;

import com.mybatis.test.beans.Employee;

public interface EmployeeMapper {

	public Employee getEmployeeById(Integer id);
	//添加
	public void addEmployee(Employee litemallAd);
	
	//删除
	public Integer deleteEmployee(Integer id);
	
	//修改
	public void updateEmployee(Employee employee);
}
