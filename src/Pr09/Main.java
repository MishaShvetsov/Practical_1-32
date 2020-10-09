package Pr09;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.doThings(new HandleImployees() {
            @Override
            public void doEverything(Employee employee) {
                System.out.println(employee.getBirthDate());
            }
        });
        company.doThings(employee -> employee.setPhoneNumber(89264819928L));
        letsDoSomeThings handle = new letsDoSomeThings();
        company.doThings(handle);
    }
}

class letsDoSomeThings implements HandleImployees {
    @Override
    public void doEverything(Employee employee) {
        employee.setName("Vova");
    }

}
