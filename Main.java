/*@author: Gabrielle Henning

Done in August 2022, as my first java case.
The case proposed was to develop a program that would read and store the input from the user, creating a list with name and age,
    creating new users. Also, it would list considering 2 parameters: name and age. And also point out to which category the person 
    belongs according to its age:
    -- From (0 until 12] - Child
    -- From (12 until 19) - Teenager
    -- From (20 until 65] - Adult
    -- From (65 or +) - Elderly. 
And then it prints the final list considering all the information.*/

package caseghenning;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import caseghenning.user;




public class Main {
    
	public static void main(String[] args) {

		Scanner infos = new Scanner(System.in);
		ArrayList<user>List = new ArrayList<user>();
		
		char control = 'y';
		do {
            System.out.println("Hello, my name is Gabrielle and this is my resolution for the challenge proposed!");
            System.out.println("Its main purpose is to read the data input to register new users and show an organized");
            System.out.println("list with the data already stored, according to age, name and category.");
            System.out.println("You can choose between organizing the users by age, by name or categories.");

            System.out.println("You will be asked to insert the information for the new user below.");
    
            System.out.println("Insert the new user's name: ");
			String name = infos.next();
			System.out.println("Insert the new user's age: ");
			int age= infos.nextInt();
			user p = new user (name,age);
			finalList.add(new user(name, age));

            //Here the program will ask an input to understand what the user would like
			System.out.println("Would you like to add a new user?");
            System.out.println("Type Y to continue or any other letter to finish.");
			control = infos.next().charAt(0);

            //And the program is not case sensitive
						
		}while(control == 'y' || control == 'Y');
		
				
    }	
        Collections.sort(infos, new Comparator<user>();
    
    {		@Override
		public int compare(user p1, user p2);
                

                    if (p1.getAge() != p2.getAge()) {
                        
                               []
                                
				return p1.getAge() - p2.getAge();
                                return p1.getName().compareTo(p2.getName());
			}
                    
			
		}
    
        String goodbye = "This is the end of my case. Thank you so much!/n Oh, last but not least, my LinkedIn is https://www.linkedin.com/in/gabriellehenning/\";
        String breakingLine = "------------------------";
        
        System.out.println(List);
        System.out.println(breakingLine);
	System.out.printl(goodbye);
	}
	
        
	

