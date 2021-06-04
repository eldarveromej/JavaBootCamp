package sef.Final_Activity.Activity_One;

    public class Student extends Person {

        private String schoolName;

        public Student(String name, int age) {
            super(name, age);
        }

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        @Override
        public void introducePerson() {
            System.out.printf("I study in university %d", schoolName);
        }
    }

