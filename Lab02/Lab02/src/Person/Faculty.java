/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.util.ArrayList;
import java.util.List;


public class Faculty implements EmailRecipient
{
    private String emailAddress;
    private String name;
    public List<Teacher> teachers = new ArrayList<>();
    
    public Faculty(String name, String emailAddress)
    {
        this.name = name;
        this.emailAddress = emailAddress;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public List<Teacher> getTeachers()
    {
        for(Teacher teacher : teachers)
        {
            System.out.println(teacher);
        }
        return teachers;
    }
    public void addTeacher(Teacher teacher)
    {
        teachers.add(teacher);
    }
    
    @Override
    public String getEmailAddress()
    {
        return emailAddress;
    }
}
