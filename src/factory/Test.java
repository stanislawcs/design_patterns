package factory;

public class Test {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new CppDeveloperFactory();
        Developer cppDeveloper = developerFactory.create();
        cppDeveloper.writeCode();

        DeveloperFactory developerFactory1 = new JavaDeveloperFactory();
        Developer javaDeveloper = developerFactory1.create();
        javaDeveloper.writeCode();
    }
}

