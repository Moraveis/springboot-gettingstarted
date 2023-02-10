package me.joao.springboot.gettingstarted.repository;

import me.joao.springboot.gettingstarted.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {
}
