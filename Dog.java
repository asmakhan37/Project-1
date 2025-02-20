/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogexample;

public class Dog {
    private String name;
    private String breed;
    private int age;
    
    public Dog()
     { name = "";
     breed = "";
     age=0;          
     }
    public Dog(String n, String b, int a)
     { name = n;
     breed = b;
     age=a;          
     }
    
    public String getName()
    {
        return name;
        
    }
    public String getBreed()
    {
        return breed;
        
    }
    public int getAge()
    {
        return age;
        
    }
    
    public void setName(String n)
    {
        name=n;
    }
    public void setBreed(String b)
    {
        breed=b;
    }
    public void setAge(int a)
    {
        age=a;
    }
    
    public String toString()
    {
        return name + " is a " + age + " year old " + breed;
    }
            
}
