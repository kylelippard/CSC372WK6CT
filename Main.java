import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(378562622,"Karie","DuFray","028 Northfield Park"));
        students.add(new Student(723864680,"Dunstan","Croft","0 Randy Junction"));
        students.add(new Student(620035606,"Prisca","McGuinness","36 Westport Crossing"));
        students.add(new Student(873804931,"Ethel","Abbyss","31281 Hollow Ridge Street"));
        students.add(new Student(789687827,"Kristin","Woodfine","375 Rowland Place"));
        students.add(new Student(251019778,"Skye","Marcroft","34144 Delladonna Park"));
        students.add(new Student(925942911,"Frieda","Kornilov","029 Loftsgordon Crossing"));
        students.add(new Student(700313096,"Natala","Delong","82 Mockingbird Trail"));
        students.add(new Student(682375187,"Karole","Cluatt","6 Katie Circle"));
        students.add(new Student(658624658,"Berta","Tree","5 Delaware Lane"));


        System.out.print("Sort by Roll Number\n");
        SortByRollNo sBRN = new SortByRollNo(students);
        for (Student value : students) {
            System.out.print(value.toString());
        }
        System.out.print("Sort by First Name\n");
        SortByName sBFN = new SortByName();
        sBFN.SortByFirstName(students);
        for (Student student : students) {
            System.out.print("\n" + student.firstName);
        }
        sBFN.SortByLastName(students);
        for (Student student : students) {
            System.out.print("\n" + student.lastName);
        }
        for (Student student : students) {
            System.out.print(student.toString());
        }
        System.out.print("Sort by Last Name\n");
        SortByName sBLN = new SortByName();
        sBLN.SortByLastName(students);
        for (Student student : students) {
            System.out.print(student.toString());
        }

    }
}