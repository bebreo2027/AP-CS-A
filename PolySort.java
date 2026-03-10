/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polysort;
import java.text.DecimalFormat;

/**
 *
 * @author bebreo2027
 */
public class PolySort {

public static void main(String[] args)
{
    Contact[] friends = new Contact[9];
    friends[0] = new Contact("John", "Smith", 6105557384L);
    friends[1] = new Contact("Sarah", "Barnes", 2155553827L);
    friends[2] = new Contact("Aaron", "Riley", 7335552969L);
    friends[3] = new Contact("Laura", "Ramone", 6635553984L);
    friends[4] = new Contact("Larry", "Smith", 4645553489L);
    friends[5] = new Contact("Frank", "Phelps", 3225552284L);
    friends[6] = new Contact("Mario", "Guzman", 8045559066L);
    friends[7] = new Contact("Marsha", "Grant", 4645553489L);
    friends[8] = new Contact("Joey", "Ramone", 4645553489L);
    
    //calling the sort on the array, which implements Comparable
    
    Sorting.selectionSort(friends);
    System.out.println("*** Sort by Numbers ***");
    for (Contact friend : friends)
    System.out.println(friend);
}


}
class Sorting{
    public static void selectionSort(Comparable[] list)
    {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0){
                    min = scan;
                }
                // Swap the values
                temp = list[min];
                list[min] = list[index];
                list[index] = temp;
        }
    }
    /**
    * @param args the command line arguments
    */
    public static void insertionSort(Comparable[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable key = list[index];
            int position = index;
            // Shift larger values to the right
            while (position > 0 && key.compareTo(list[position-1]) < 0)
            {
            }
            list[position] = key;
    }
}
}
class Contact implements Comparable
{
    private String firstName, lastName;
    private long phone;
    //-----------------------------------------------------------------
    // Constructor: Sets up this contact with the specified data.
    //-----------------------------------------------------------------
    public Contact(String first, String last, long telephone)
    {
        firstName = first;
        lastName = last;
        phone = telephone;
    }
    //-----------------------------------------------------------------
    // Returns a description of this contact as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        //DecimalFormat df = new DecimalFormat("###.###.####");
        return (lastName + ", " + firstName + "\t" + String.valueOf(phone).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
    }
    //-----------------------------------------------------------------
    // Returns a description of this contact as a string.
    //-----------------------------------------------------------------
    public boolean equals(Object other)
    {
        return (lastName.equals(((Contact)other).getLastName()) &&
        firstName.equals(((Contact)other).getFirstName()));
    }
    //-----------------------------------------------------------------
    // Uses both last and first names to determine ordering.
    //-----------------------------------------------------------------
    public int compareTo(Object other)
    {
        int result;
        String otherFirst = ((Contact)other).getFirstName();
        String otherLast = ((Contact)other).getLastName();
        long otherPhone = ((Contact)other).getPhone();
        
        if (phone != otherPhone)
        {
            result = Long.compare(phone, otherPhone);
        }
        else if (lastName.equals(otherLast))
        {
            result = firstName.compareTo(otherFirst);
        }
        else
        {
            result = lastName.compareTo(otherLast);
        }
        
        return result;
    }
    
    //-----------------------------------------------------------------
    // First name accessor.
    //-----------------------------------------------------------------
    public String getFirstName()
    {
        return firstName;
    }
    //-----------------------------------------------------------------
    // Last name accessor.
    //-----------------------------------------------------------------
    public String getLastName()
    {
        return lastName;
    }
    public long getPhone()
    {
        return phone;
    }
    
}