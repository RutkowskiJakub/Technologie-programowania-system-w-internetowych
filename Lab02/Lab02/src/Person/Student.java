package Person;

public class Student extends Person
{
    private String groupId;
    private Double ocena;

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
}
