import java.util.Scanner;

public class resume1 {


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
			
		printName();
		printAge();
		printBirthday();
		printPhone();
		printHome();
		printGrade();
		printCgpa();
		printMarital();
		printCitizenship();
		printWork();
		printlanguage();
		printAward();
		printSkill();
			
	}
		
		public static void printName() {
			Scanner input = new Scanner (System.in);
		
			System.out.print("Enter Your Name : ");
			String name = input.next();
			System.out.println("Name " + name);
	}	
		
		public static void printAge() {
			Scanner input = new Scanner (System.in);

			System.out.print("Enter Your Age : ");
			int age = input.nextInt();
			System.out.println("Age " + age);
	}
		
		public static void printBirthday() {
			Scanner input = new Scanner (System.in);
				
			System.out.print("Enter Birthday : ");
			double birthday = input.nextDouble();
			System.out.println("Birthday " + birthday);
	}
		
		public static void printPhone() {
			Scanner input = new Scanner (System.in);
		
			System.out.print("Enter Your Phone : ");
			String phone = input.next();
			System.out.println("Phone " + phone);
	}	
		
		public static void printHome() {
			Scanner input = new Scanner (System.in);
		
			System.out.print("Enter Your Home : ");
			String home = input.next();
			System.out.println("Home " + home);
	}	
				
		public static void printGrade() {
			Scanner input = new Scanner (System.in);
			
			System.out.print("Enter Grade STIA1113 : ");
			String str = input.next();
			char grade = str.charAt(1);
			System.out.println("Grade " + grade);
	}
			
		public static void printCgpa() {
			Scanner input = new Scanner (System.in);
				
			System.out.print("Enter CGPA Semester 1 : ");
			double num1 = input.nextDouble();
			System.out.print("Enter CGPA Semester 2 : ");
			double num2 = input.nextDouble();
				
			double sum = num1+num2;
			double totalcgpa = sum/2;
			System.out.println("CGPA for current semester is " + totalcgpa);
	}
		
		public static void printMarital() {
			Scanner input = new Scanner (System.in);
		
			System.out.print("Enter Your Marital : ");
			String marital = input.next();
			System.out.println("Marital " + marital);
	}	
		
		public static void printCitizenship() {
			Scanner input = new Scanner (System.in);
		
			System.out.print("Enter Your Citizenship : ");
			String citizenship = input.next();
			System.out.println("Citizenship " + citizenship);
	}	
		
		public static void printWork() {
			Scanner input = new Scanner (System.in);
		
			System.out.print("Enter Your Work : ");
			String work = input.next();
			System.out.println("Work " + work);
	}	
		
		public static void printlanguage() {
			Scanner input = new Scanner (System.in);
		
			System.out.print("Enter Your Language : ");
			String language = input.next();
			System.out.println("Language " + language);
	}	
		
		public static void printAward() {
			Scanner input = new Scanner (System.in);
		
			System.out.print("Enter Your Award : ");
			String award = input.next();
			System.out.println("Award " + award);
	}	
		public static void printSkill() {
			Scanner input = new Scanner (System.in);
		
			System.out.print("Enter Your Skill : ");
			String skill = input.next();
			System.out.println("Skill " + skill);
	}	
}
