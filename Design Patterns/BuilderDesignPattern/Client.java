package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Varun");
        builder.setAge(27);
        builder.setPsp(87.05);
        builder.setGradYear(2022);
        Student student = new Student(builder);
        System.out.println("DEBUG");
    }
}
