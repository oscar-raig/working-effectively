package raig.org.chapter9.irritatingparameter.nullobjectpattern;

public class Employee {
  EmployeeId employeeId;

  public Employee(EmployeeId employeeId) {
    this.employeeId = employeeId;
  }

  public EmployeeId getId() {
    return employeeId;
  }

  public void pay() {
    System.out.print("Paying");
  }


}
