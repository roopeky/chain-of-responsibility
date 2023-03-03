public class Ceo implements SalaryRaiseHandler {
    private SalaryRaiseHandler nextHandler;

    @Override
    public void handleRequest(SalaryRaiseRequest request) {
        System.out.println("Large raise handler needs to review " + request.getEmployeeName() + "'s salary raise request. " + "The salary raise percent is " + request.getRequestedRaise() / request.getCurrentSalary() * 100);
    }

    @Override
    public void setNextHandler(SalaryRaiseHandler nextHandler) {
        throw new UnsupportedOperationException("Large raise handler is the final handler on raise requests!");
    }
}
