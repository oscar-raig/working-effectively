package raig.org.chapter9.irritatingparameter.nullobjectpattern;

import java.util.List;

public class Finder {

  private final List<Employee> employeesList;

  public Finder(List<Employee> employeesList) {
    this.employeesList = employeesList;
  }

  Employee getEmployeeForId( EmployeeId employeeId) {
    return employeesList.stream()
      .filter(employee -> employee.getId().equals(employeeId))
      .findFirst()
      .get();
  }
}
