package swag2;
import java.util.*;
public class Name {

	public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    
    printName();
    printBirthday();
    printStatus();
    printCitizen();
    printAdress();
    printWork1();
    printWork2();
    printLanguage1();
    printLanguage2();
    printSkill1();
    printSkill2();
    printSkill3();
    printEdward1();
    printEdward2();
    printAge();
    printCGPA();
    printGrade();
    printPhone();
         
   }

   public static void printName() {
	   Scanner input=new Scanner (System.in);
	   
	   System.out.print("Enter Your Name");
	    String name = input.nextLine();
	    System.out.println("name " + name);
	    
   }

   public static void printBirthday() {
	   Scanner input=new Scanner (System.in);
	   
	   System.out.print("Enter Your Birthday");
	    String birthday = input.nextLine();
	    System.out.println("Birthday" + birthday);
	    
   }
   
   public static void printStatus() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Status");
	    String status = input.nextLine();
	    System.out.println("Status" + status);
   
   }
   
   public static void printCitizen() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Citizen");
	    String citizen  = input.nextLine();
	    System.out.println("Citizen" + citizen);
	    
   }
   
   public static void printAdress() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Adress");
	    String adress = input.nextLine();
	    System.out.println("Adress" + adress);
	    
   }
   
   public static void printWork1() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Work1");
	    String work1 = input.nextLine();
	    System.out.println("Work1" + work1);
	    
   }
   
   public static void printWork2() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Work2");
	    String work2 = input.nextLine();
	    System.out.println("Work2" + work2);
	    
   }
   
   public static void printLanguage1() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Languge1");
	    String language1 = input.nextLine();
	    System.out.println("Language1" + language1);
	    
   }
   
   public static void printLanguage2() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Languge2");
	    String language2 = input.nextLine();
	    System.out.println("Language2" + language2);
	    
   }
   
   public static void printSkill1() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Skill1");
	    String skill1 = input.nextLine();
	    System.out.println("Skill1" + skill1);
	    
   }
   
   public static void printSkill2() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Skill2");
	    String skill2 = input.nextLine();
	    System.out.println("Skill2" + skill2);
	    
   }
   
   public static void printSkill3() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Skill3");
	    String skill3 = input.nextLine();
	    System.out.println("Skill3" + skill3);
	    
   }
   
   public static void printEdward1() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Edward1");
	    String edward1 = input.nextLine();
	    System.out.println("Edward1" + edward1);
	    
   }
   
   public static void printEdward2() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Your Edward2");
	    String edward2 = input.nextLine();
	    System.out.println("Edward2" + edward2);
	    
   }
   
   public static void printAge() {
	   Scanner input=new Scanner (System.in);
	   System.out.print(" Enter Your Age");
	    int age=input.nextInt();
	    System.out.println("Age " + age);
	    
   }
   
   public static void printCGPA() {
	   Scanner input=new Scanner (System.in);
	   System.out.print(" Enter Your CGPA");
	    double cgpa=input.nextDouble();
	    System.out.println("CGPA " + cgpa);
	    
   }
   
   public static void printGrade() {
	   Scanner input=new Scanner (System.in);
	   System.out.print("Enter Grade STPM");
	    String str= input.next();
	    char grade = str.charAt(1);
	    System.out.println(" Grade " + grade);
	    
   }

   public static void printPhone() {
	   Scanner input=new Scanner (System.in);
	    System.out.print("Enter Your Phone");
	    int phone = input.nextInt();
	    System.out.println("Phone" + phone);
	    
   }
   
   
  
}