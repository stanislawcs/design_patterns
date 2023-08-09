package factory;

public class JavaDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer create() {
        return new JavaDeveloper();
    }
}
