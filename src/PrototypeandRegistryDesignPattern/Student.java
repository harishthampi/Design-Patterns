package PrototypeandRegistryDesignPattern;

public class Student {
   private String name;
   private int age;
   private double psp;
   private String batchName;
   private double avgPsp;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public double getAvgPsp() {
        return avgPsp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setAvgPsp(double avgPsp) {
        this.avgPsp = avgPsp;
    }
    Student(){

    }
    Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batchName = student.batchName;
        this.avgPsp = student.avgPsp;
    }
    Student Clone(){
//        PrototypeandRegistryDesignPattern.Student student = new PrototypeandRegistryDesignPattern.Student();
//        student.setAvgPsp(this.getAvgPsp());
//        student.setBatchName(this.getBatchName());
//        return student;
        return new Student(this);
    }
}
