package BuilderProduction;


public class Student {
    String name;
    int age;
    double psp;
    int gradYear;
    String universityName;
    String batch;
    long id;
    String phoneNumber;
    public static Builder getBuilder(){

        return new Builder();
    }
    private Student(Builder builder){
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.gradYear= builder.getGradYear();
    }
    public static class Builder {
        String name;
        int age;
        double psp;
        int gradYear;
        String universityName;
        String batch;
        long id;
        String phoneNumber;

        public String getName() {

            return name;
        }

        public Builder setName(String name) {

            this.name = name;
            return this;
        }

        public int getAge() {

            return age;
        }

        public Builder setAge(int age) {

            this.age = age;
            return this;
        }

        public double getPsp() {

            return psp;
        }

        public void setPsp(double psp) {

            this.psp = psp;
        }

        public int getGradYear() {

            return gradYear;
        }

        public Builder setGradYear(int gradYear) {

            this.gradYear = gradYear;
            return this;
        }

        public String getUniversityName() {

            return universityName;
        }

        public void setUniversityName(String universityName) {

            this.universityName = universityName;
        }

        public String getBatch() {

            return batch;
        }

        public Builder setBatch(String batch) {

            this.batch = batch;
            return this;
        }

        public long getId() {

            return id;
        }

        public void setId(long id) {

            this.id = id;
        }

        public String getPhoneNumber() {

            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {

            this.phoneNumber = phoneNumber;
        }

        public Student build(){
            //responsibility of build() is to build the PrototypeandRegistryDesignPattern.Student object
            //validation starts
            if(getGradYear()>2022){
                throw new IllegalArgumentException("Invalid");
            }
            //validations ends
            return new Student(this);

        }
    }


}
