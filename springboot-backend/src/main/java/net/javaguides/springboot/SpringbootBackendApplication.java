package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("YX");
//		employee.setLastName("C");
//		employee.setEmailId("123@qq.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("LL");
//		employee1.setLastName("C");
//		employee1.setEmailId("0525@qq.com");
//		employeeRepository.save(employee1);
//
//		Employee employee2 = new Employee();
//		employee2.setFirstName("SY");
//		employee2.setLastName("L");
//		employee2.setEmailId("666@qq.com");
//		employeeRepository.save(employee2);
	}
}
