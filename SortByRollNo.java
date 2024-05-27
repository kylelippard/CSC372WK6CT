import java.util.ArrayList;

public class SortByRollNo {

    public SortByRollNo(ArrayList<Student> students){

        for(int i = 0; i < students.size()-1; i++) {
            int min = i;
            for (int j = i+1; j < students.size(); j++) {
                if( students.get(j).rollNo < students.get(min).rollNo ) min = j;


                Student temp = new Student();
                temp = students.get(i);
                students.set(i, students.get(min));
                students.set(min, temp);

            }

        }
        //return students;

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
