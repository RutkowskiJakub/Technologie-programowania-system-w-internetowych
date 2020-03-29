package Person;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person
{
    private String groupId;
    private List<Double> grades = new ArrayList<>();

    public Student(String firstName, String lastName, String emailAddress, String groupId)
    {
        super(firstName, lastName, emailAddress);
        this.groupId = groupId;
    }
    public String getGroupId()
    {
        return groupId;
    }
    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }
    public List<Double> getGrades()
    {
        return grades;
    }
    public void addGrade(double grade)
    {
        grades.add(grade);
    }
    public void getGradesAverage()
    {
        double sumaOcen=0;
        double avg=0;
        int counter=0;
        for(Double grade : grades)
        {
            sumaOcen+=grade;
            counter++;
            avg=sumaOcen/counter;
        }
        System.out.println(avg);
    }
}
