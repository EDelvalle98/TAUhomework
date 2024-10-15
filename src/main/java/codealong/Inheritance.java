package codealong;

public class Inheritance {
    public static void main(String[] args) {



    }

    public static class Person {
        private String name;
        private int age;
        private String gender;

        public Person(String name){
            System.out.println("2nd constructor");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }

    public static class Employee extends Person {

        private String employeeID;
        private String title;

        public Employee(){
            super("Efrain");

        }

        public String getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(String employeeID) {
            this.employeeID = employeeID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
