public class SalariedEmployee extends Employee{
  public String socialSecurityNumber;
  public double fixedMonthlyPayment;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    this.employeeId = employeeId;
    this.name = name;
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return this.socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return this.fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  @Override
  public void calculatePay() {
    averageMonthlySalary = getFixedMonthlyPayment();
  }
}
