import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGUI extends JFrame implements ActionListener {
    // create buttons for sorting algorithm
    JButton rollButton = new JButton("Sort by RollNo");
    JButton fNameButton = new JButton("Sort by First Name");
    JButton lNameButton = new JButton("Sort by Last Name");
    ArrayList<Student> students = new ArrayList<>();
    JFrame frame = new JFrame();
    JPanel tablePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JTable table = new JTable();
    StudentTableModel model = new StudentTableModel(students);
    JScrollPane scrollPane = new JScrollPane(table);

    public StudentGUI() {
        // Create new array list and add Students
        students.add(new Student(378562622, "Karie", "DuFray", "028 Northfield Park"));
        students.add(new Student(723864680, "Dunstan", "Croft", "0 Randy Junction"));
        students.add(new Student(620035606, "Prisca", "McGuinness", "36 Westport Crossing"));
        students.add(new Student(873804931, "Ethel", "Abbyss", "31281 Hollow Ridge Street"));
        students.add(new Student(789687827, "Kristin", "Woodfine", "375 Rowland Place"));
        students.add(new Student(251019778, "Skye", "Marcroft", "34144 Delladonna Park"));
        students.add(new Student(925942911, "Frieda", "Kornilov", "029 Loftsgordon Crossing"));
        students.add(new Student(700313096, "Natala", "Delong", "82 Mockingbird Trail"));
        students.add(new Student(682375187, "Karole", "Cluatt", "6 Katie Circle"));
        students.add(new Student(658624658, "Berta", "Tree", "5 Delaware Lane"));

        table.setModel(model);
        frame.getContentPane().add(tablePanel, BorderLayout.CENTER);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        tablePanel.add(scrollPane);

        //add buttons to panel
        buttonPanel.add(rollButton);
        buttonPanel.add(fNameButton);
        buttonPanel.add(lNameButton);
        //add button listeners
        rollButton.addActionListener(this);
        fNameButton.addActionListener(this);
        lNameButton.addActionListener(this);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Sort By RollNo
        if(e.getSource() == rollButton) {
            SortByRollNo sBRN = new SortByRollNo(students);
            frame.repaint();
        //Sort by First Name
        } else if (e.getSource() == fNameButton) {
            SortByName sBFN = new SortByName();
            sBFN.SortByFirstName(students);
            frame.repaint();
        //Sort by Last Name
        } else if (e.getSource() == lNameButton) {
            SortByName sBLN = new SortByName();
            sBLN.SortByLastName(students);
            frame.repaint();
        }

    }
}
