public class SalaryRaiseRequest {
    private String employeeName;
    private double currentSalary;
    private double requestedRaise;

    public SalaryRaiseRequest(String employeeName, double currentSalary, double requestedRaise) {
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
        this.requestedRaise = requestedRaise;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public double getRequestedRaise() {
        return requestedRaise;
    }
}
