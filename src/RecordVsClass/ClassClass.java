package RecordVsClass;


import java.util.ArrayList;
import java.util.List;

public class ClassClass {

    public static void start(){
        List<ThisIsClass> classList = new ArrayList<>();
        for (int i = 0; i < Main.SIZE ; i++) {
            String firstName = "name" + i;
            String lastName = "lastname" + i;
            double age = i + 0.5;
            long id = (long) i *2*3*7 + 1;
            classList.add( new ThisIsClass(firstName,lastName,age,id));
        }

        for (int i = 0; i < Main.SIZE; i++) {
            ThisIsClass isClass = classList.get(i);
            if (isClass.getIdNumber() == 0){
                System.out.println("This is redundant");
            }
        }
    }
    public static class ThisIsClass {

        String firstName;
        String lastName;
        double age;
        long idNumber;

        public ThisIsClass(String firstName, String lastName, double age, long idNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.idNumber = idNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getAge() {
            return age;
        }

        public void setAge(double age) {
            this.age = age;
        }

        public long getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(long idNumber) {
            this.idNumber = idNumber;
        }
    }

}