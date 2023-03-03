public class Main {
    public static void main(String[] args) {
        SalaryRaiseHandler small = new Supervisor();
        SalaryRaiseHandler medium = new HeadSupervisor();
        SalaryRaiseHandler large = new Ceo();

        small.setNextHandler(medium);
        medium.setNextHandler(large);

        SalaryRaiseRequest smallRequest = new SalaryRaiseRequest("Jukka", 25000, 500);
        SalaryRaiseRequest mediumRequest = new SalaryRaiseRequest("Jarmo", 25000, 1000);
        SalaryRaiseRequest largeRequest = new SalaryRaiseRequest("Jarkko", 25000, 10000);

        small.handleRequest(smallRequest);
        small.handleRequest(mediumRequest);
        small.handleRequest(largeRequest);
    }
}