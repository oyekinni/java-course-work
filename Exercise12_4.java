public class Loan {
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;

  public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
    if (annualInterestRate <= 0) {
      throw new IllegalArgumentException("Interest rate must be greater than 0");
    }
    if (numberOfYears <= 0) {
      throw new IllegalArgumentException("Number of years must be greater than 0");
    }
    if (loanAmount <= 0) {
      throw new IllegalArgumentException("Loan amount must be greater than 0");
    }
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
  }

  public double getMonthlyPayment() {
    double monthlyInterestRate = annualInterestRate / 1200;
    return loanAmount * monthlyInterestRate /
      (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
  }

  public double getTotalPayment() {
    return getMonthlyPayment() * numberOfYears * 12;
  }
}
