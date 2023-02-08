package me.joao.springboot.gettingstarted.dao;

import me.joao.springboot.gettingstarted.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();
}
