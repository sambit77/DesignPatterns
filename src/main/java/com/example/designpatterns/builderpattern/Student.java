package com.example.designpatterns.builderpattern;

public class Student {
    
    private final String firstName; // mandatory
    private final String lastName; // mandatory
    private final String age; // optional
    private final String gender; // optional
    private final boolean isGraduate; // optional
    private final boolean hasExperience; // optional
    private final String city; // optional
    private final String state; // optional
    private final boolean isEarning; // optional

    public Student(Builder builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.isEarning = builder.isEarning;
        this.isGraduate = builder.isGraduate;
        this.hasExperience = builder.hasExperience;
        this.city = builder.city;
        this.state = builder.state;
    }
    static class Builder {
        private  String firstName; // mandatory
        private  String lastName; // mandatory
        private  String age; // optional
        private  String gender; // optional
        private  boolean isGraduate; // optional
        private  boolean hasExperience; // optional
        private  String city; // optional
        private  String state; // optional
        private  boolean isEarning; // optional

        public Builder(String firstName,String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder setAge(String age)
        {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender)
        {
            this.gender = gender;
            return this;
        }

        public Builder setIsGraduate(boolean isGraduate)
        {

            this.isGraduate = isGraduate;
            return this;
        }

        public Builder sethasExperience(boolean hasExperience)
        {
            this.hasExperience = hasExperience;
            return this;
        }

        public Builder setCity(String city)
        {
            this.city = city;
            return this;
        }

        public Builder setState(String state)
        {
            this.state = state;
            return this;
        }

        public Builder setisEarning(boolean isEarning)
        {
            this.isEarning = isEarning;
            return this;
        }

        public Student build()
        {
            return new Student(this);
        }

    
        
    }


   

    public static void main(String args[])
    { 
        Student student = new Student.Builder("Sambit", "Pradhan")
                            .setAge("24")
                            .setCity("Bnagalore")
                            .setGender("male")
                            .build();
        System.out.println(student.toString());
     }




    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
                + ", isGraduate=" + isGraduate + ", hasExperience=" + hasExperience + ", city=" + city + ", state="
                + state + ", isEarning=" + isEarning + "]";
    }
}
