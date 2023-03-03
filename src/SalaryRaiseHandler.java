public interface SalaryRaiseHandler {
    void handleRequest(SalaryRaiseRequest request);

    void setNextHandler(SalaryRaiseHandler nextHandler);
}
