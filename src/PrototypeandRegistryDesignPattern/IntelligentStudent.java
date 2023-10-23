package PrototypeandRegistryDesignPattern;

public class IntelligentStudent extends Student {
     int iq;

    IntelligentStudent(){

    }
    IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }


    @Override
    public IntelligentStudent clone(){
//        PrototypeandRegistryDesignPattern.Student iqStudent = new PrototypeandRegistryDesignPattern.IntelligentStudent();
//        iqStudent.setBatchName(iqStudent.getBatchName());
//        iqStudent.setAvgPsp(iqStudent.getAvgPsp());
//        return iqStudent;
        return new IntelligentStudent(this);
    }
}
