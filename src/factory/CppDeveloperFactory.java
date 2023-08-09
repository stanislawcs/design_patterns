package factory;

public class CppDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer create() {
        return new CppDeveloper();
    }
}
