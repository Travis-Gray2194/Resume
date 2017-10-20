import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String>skills= new ArrayList<String>();
        String name;
        String yes;
        String emailaddress;
        String university;
        String education;
        String jobtitle1;
        String jobtitle2;
        String jobtitle3;
        String jobduty1;
        String jobduty1a;
        String jobduty2;
        String jobduty2a;
        String jobduty3;
        String jobduty3a;




        System.out.println("Please enter your Name: ");
    name = keyboard.nextLine();

    System.out.println("Please enter your email: ");
    emailaddress = keyboard.nextLine();


    System.out.println("Please enter your undergrad Degree (Major,Year): ");
    education = keyboard.nextLine();

    System.out.println("Please enter your undergrad degree university: ");
    university = keyboard.nextLine();


    //Store user input for Job Title 1

    System.out.println("Please enter Job title number one: ");
    jobtitle1 = keyboard.nextLine();

    System.out.println("Please enter first job duty: ");
    jobduty1 = keyboard.nextLine();

        System.out.println("Please enter second job duty:  ");
        jobduty1a=keyboard.nextLine();



        System.out.println("Please enter your first skill and rating: (Skill,Rating)");
    skills.add(keyboard.nextLine());


//        //Store user input for Job Title 2

    System.out.println("Please enter Job Title 2: ");
    jobtitle2 = keyboard.nextLine();

    System.out.println("Please enter first job duty: ");
    jobduty2 = keyboard.nextLine();


    System.out.println("Please enter second job duty: ");
        jobduty2a=keyboard.nextLine();





    System.out.println("Please enter your second skill and rating: (Skill,Rating)");
    skills.add(keyboard.nextLine());


    //Store user input for Job Title 3
    System.out.println("Please enter third Job Title: ");
    jobtitle3 = keyboard.nextLine();

    System.out.println("Please enter first  Job duty: ");
    jobduty3 = keyboard.nextLine();

        System.out.println("Please enter second  Job duty: ");
        jobduty3a = keyboard.nextLine();

    System.out.println("Please enter your third skill and rating: (Skill,Rating)");
    skills.add(keyboard.nextLine());





        //Print Resume Details
    System.out.println("--------------------------------------------");
    System.out.println("--------------------------------------------");
    System.out.println(" " + name);
    System.out.println(" " + emailaddress);

    System.out.println("\n");

    System.out.println(" Education:");
    System.out.println(" " + education);
    System.out.println(" " + university);

    System.out.println("\n");

    System.out.println(" Work Experince:");


    //Need to iterate over for loop list and print ratings, skills etc next to arraylist output instead on standard out.
    //Then
    //Need to loop through arraylist after reading user input to print next to araay.

    //Obtained output:
    //skill,skill
    //job duties ,job duties
    //each rating ,each rating

    //Expected output: //Need to print line to be  able to match job titles in array
    //skill1
    //Skill2
    //Skill3

    //Jobduty1
    //jobduty2
    //jobduty3

    System.out.println("\n");

    System.out.println(" Job Title 1: " + jobtitle1 + "\n Duties: " + jobduty1+"\n Duties: " + jobduty1a+ "\n Skills and Ratings: " + skills.get(0));
    System.out.println(" ");
    System.out.println(" Job Title 2: " + jobtitle2 + "\n Duties: " + jobduty2+"\n Duties: " + jobduty2a+"\n Skills and Ratings: " + skills.get(1));

    System.out.println(" ");
    System.out.println(" Job Title 3: " + jobtitle3 + "\n Duties: " + jobduty3+"\n Duties: " +jobduty3a+ "\n Skills and Ratings: " + skills.get(2));

}

    }
