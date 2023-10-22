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
//        Student iqStudent = new IntelligentStudent();
//        iqStudent.setBatchName(iqStudent.getBatchName());
//        iqStudent.setAvgPsp(iqStudent.getAvgPsp());
//        return iqStudent;
        return new IntelligentStudent(this);
    }
}
