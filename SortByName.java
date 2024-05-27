import java.util.ArrayList;

public class SortByName {

        public void SortByFirstName(ArrayList<Student> students){
            Student temp = new Student();
            for(int i = 0; i < students.size()-1; i++) {
                int min = i;
                for (int j = i+1; j < students.size(); j++) {
                    if(students.get(j).firstName.compareToIgnoreCase(students.get(min).firstName) < 0)
                        min = j;
                }
                    temp = students.get(min);
                    students.set(min, students.get(i));
                    students.set(i, temp);



            }

    }
    public void SortByLastName(ArrayList<Student> students){
        Student temp = new Student();
        for(int i = 0; i < students.size()-1; i++) {
            int min = i;
            for (int j = i+1; j < students.size(); j++) {
                if( students.get(j).lastName.compareToIgnoreCase(students.get(min).lastName) < 0 )
                    min = j;
            }
                temp = students.get(i);
                students.set(i, students.get(min));
                students.set(min, temp);



        }

    }

}
