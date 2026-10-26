package guidedmodul06;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("superclass :");
        superclass.x = 3;
        superclass.y = 4;
        superclass.tampilXY();

        System.out.println("subclass :");
        // member superclass dapat diakses dari subclassnya
        subclass.x = 1;
        subclass.y = 2;
        subclass.tampilXY();

        // member tambahan hanya ada di subclass
        subclass.z = 5;
        subclass.jumlahXY();
    }
}