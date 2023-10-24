package BuilderProduction;


public class Client {
    public static void main(String[] args) {
    Student st = Student.getBuilder()
                    .setAge(21)
                    .setName("Harish")
                    .setGradYear(2022)
                    .build();

    }
}
