package PrototypeandRegistryDesignPattern;
public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegister(studentRegistry);
        Student Harish = studentRegistry .get("Feb2023Batch").Clone();
        Harish.setName("Harish B");
        Harish.setAge(28);
        Harish.setPsp(95.15);

        Student Adhil = studentRegistry .get("Feb2023Batch").Clone();
        Adhil.setName("Adhil H");
        Adhil.setAge(25);
        Adhil.setPsp(85);

        Student Asha = studentRegistry.get("March2023Batch").Clone();
        Asha.setName("Asha Suresh");
        Asha.setAge(22);
        Asha.setPsp(79);

        Student Rakhi = studentRegistry.get("IntelligentStudentMarch").Clone();
        Rakhi.setName("Rakhi Ramesh");
        Rakhi.setAge(26);
        Rakhi.setPsp(97);

    }


    public static void fillRegister(StudentRegistry studentRegistry) {
        Student febStudent = new Student();
        febStudent.setBatchName("Feb2023Batch");
        febStudent.setAvgPsp(87.75);
        studentRegistry.register("Feb2023Batch",febStudent);
        Student marchStudent = new Student();
        marchStudent.setBatchName("March2023Batch");
        marchStudent.setAvgPsp(75.05);
        studentRegistry.register("March2023Batch",marchStudent);
        IntelligentStudent intelligentStudentMarch = new IntelligentStudent();
        intelligentStudentMarch.setBatchName("IntelligentStudentMarch2023Batch");
        intelligentStudentMarch.setAvgPsp(98.00);
        intelligentStudentMarch.iq=185;
        studentRegistry.register("IntelligentStudentMarch",intelligentStudentMarch);
    }
}
