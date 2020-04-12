public class Employee implements Payable {
  public String employeeId;
  public String name;
  public double averageMonthlySalary;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public Employee() {}

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void calculatePay() {}

  public double getAverageMonthlySalary() {
    return this.averageMonthlySalary;
  }

  @Override
  public String toString() {
    String format = "%.2f";
    String s = String.format(format, averageMonthlySalary);
    return this.employeeId + ", " + this.name + ", " + s;
  }
}
