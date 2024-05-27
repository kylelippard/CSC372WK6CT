public class Student {
    int rollNo;
    String firstName;
    String lastName;
    String address;

    Student() {

    }

    public  Student(int rollNo, String firstName, String lastName, String address){
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;

    }

    public String GetFirstName() {
        return this.firstName;
    }
    public String GetLastName() {
        return this.lastName;
    }
    public int GetRollNo() {
        return this.rollNo;
    }
    @Override
    public String toString() {
        return this.firstName.toString()+" "+this.lastName.toString()+"\n" +this.address+"\n" + this.rollNo+"\n"+"\n";
    }

}
