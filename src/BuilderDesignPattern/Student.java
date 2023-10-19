package BuilderDesignPattern;

public class Student {
    String name;
    int age;
    double psp;
    int gradYear;
    String universityName;
    String batch;
    long id;
    String phoneNumber;
    public Student(Builder builder){
        if(builder.getGradYear()>2022){
            throw new IllegalArgumentException("Invalid");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.gradYear= builder.getGradYear();
    }

}
