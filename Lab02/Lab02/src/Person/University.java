/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author Student
 */
public class University implements EmailRecipient
{
    private String emailAddress;
    private String name;
    
    public University(String name, String emailAddress)
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
    
    @Override
    public String getEmailAddress()
    {
        return emailAddress;
    }
        
    
}