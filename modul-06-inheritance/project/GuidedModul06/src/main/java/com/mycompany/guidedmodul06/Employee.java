package guidedmodul06;

public class Employee {
    private String name;
    String departemen;

    public Employee(String s) {
        name = s;
    }

    public void tampilNama() {
        System.out.println("nama : " + name);
    }
}