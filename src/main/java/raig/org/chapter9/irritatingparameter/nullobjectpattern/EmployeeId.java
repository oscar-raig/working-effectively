package raig.org.chapter9.irritatingparameter.nullobjectpattern;

public class EmployeeId {

  protected String id;

  public EmployeeId(String id) {
    this.id = id;
  }

  public boolean equals(EmployeeId otherEmployeeId) {
    return this.id.equals(otherEmployeeId.id);
  }

}
