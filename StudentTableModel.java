import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

class StudentTableModel extends AbstractTableModel {

    String[] columnNames = {"Roll Number","First Name", "Last Name","Address"};
    ArrayList<Student> students = new ArrayList<>();

    public StudentTableModel(ArrayList<Student> list){
        students = list;

    }

//    Object[][] students = {
//        //
//        {378562622, "Karie", "DuFray", "028 Northfield Park"},
//        {723864680, "Dunstan", "Croft", "0 Randy Junction"},
//        {620035606, "Prisca", "McGuinness", "36 Westport Crossing"},
//        {873804931, "Ethel", "Abbyss", "31281 Hollow Ridge Street"},
//        {789687827, "Kristin", "Woodfine", "375 Rowland Place"},
//        {251019778, "Skye", "Marcroft", "34144 Delladonna Park"},
//        {925942911, "Frieda", "Kornilov", "029 Loftsgordon Crossing"},
//        {700313096, "Natala", "Delong", "82 Mockingbird Trail"},
//        {682375187, "Karole", "Cluatt", "6 Katie Circle"},
//        {658624658, "Berta", "Tree", "5 Delaware Lane"}
//
//    };

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student entity = null;
        entity = students.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return entity.GetRollNo();
            case 1:
                return entity.GetFirstName();
            case 2:
                return entity.GetLastName();
            case 3:
                return entity.GetAddress();
            default:
            return "";
        }

        }
        public String getColumnName(int columnIndex) {
            return columnNames[columnIndex];
        }
}
