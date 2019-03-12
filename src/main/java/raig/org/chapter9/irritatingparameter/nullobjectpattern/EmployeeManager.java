package raig.org.chapter9.irritatingparameter.nullobjectpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {
  private Finder finder;

  public EmployeeManager(Finder finder) {
    this.finder = finder;
  }

  public void printPayEmployee(List<EmployeeId> listEmployeeId) {

    for (Iterator it = listEmployeeId.iterator(); it.hasNext();) {
      EmployeeId id = (EmployeeId) it.next();
      Employee employee =  finder.getEmployeeForId(id);
      employee.pay();
    }
  }

  public int countEmployeePaid(List<EmployeeId> listEmployeeId) {

    int employeesPaid = 0;
    for (Iterator it = listEmployeeId.iterator(); it.hasNext();) {
      EmployeeId id = (EmployeeId) it.next();
      try {
        Employee employee = finder.getEmployeeForId(id);
        employeesPaid++;
      } catch (Exception e) {
        System.out.print("Employee " + id + " not exist");
      }

    }
    return employeesPaid;
  }
}
