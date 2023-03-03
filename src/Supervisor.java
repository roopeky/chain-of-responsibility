public class Supervisor implements SalaryRaiseHandler {

    private SalaryRaiseHandler nextHandler;

    @Override
    public void handleRequest(SalaryRaiseRequest request) {
        if (request.getRequestedRaise() <= 0.02 * request.getCurrentSalary()) {
            System.out.println("Small raise handler approved " + request.getEmployeeName() + "'s salary raise request. " + "The salary raise percent is " + request.getRequestedRaise() / request.getCurrentSalary() * 100);
        } else {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SalaryRaiseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
