import java.io.*;
import java.util.*;

public class Person {
    private int age;	
    public Person(int initialAge) {
	 if(initialAge < 0){ // initial age is invalid
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
        else{ // set age to valid initial age
           // this.age = initialAge;
			System.out.println(+initialAge);
			System.out.println("this.age = initialAge;");

        }
    }

    public void amIOld() {
        if(age>=13){
			System.out.println("age<13");
			System.out.println("You are a teenager.");
             
			 System.out.println(+age);
        }else if(age<13){
			System.out.println("age>=13 && age<18");
			System.out.println("You are young.");
			System.out.println(+age);
                 
             }if(age>18){
				 System.out.println("age>18");
                 System.out.println("You are old.");
             }
        }
         
  public void yearPasses() {
	  System.out.println(" yearPasses");
	  this.age++;
	  System.out.println(" yearPasses"+age);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age");
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}