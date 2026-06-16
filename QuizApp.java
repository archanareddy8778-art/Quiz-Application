package com.QUIZAPP;
import java.util.Scanner;

class Quiz {
	public static final String GREEN = "\u001B[32m";
	public static final String BROWN = "\u001B[38;5;94m";
	public static final String RED = "\u001B[31m";
	public static final String RESET = "\u001B[0m";
	public static final String BLUE = "\u001B[34m";
	public static final String YELLOW = "\u001B[33m";
	
	Scanner sc = new Scanner(System.in);
	int reward = 0;
	boolean lifeLineUsed = false;
	
	void login() {
		System.out.println("**********QUIZ APPLICATION**********");
		System.out.println("             ");
		System.out.println("----------------LOGIN---------------");
		
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		
		System.out.println("Enter your Mail:");
		String mobile = sc.nextLine();
		
		System.out.println("LOGIN SUCCESSFULLY");
		System.out.println("*********************************************");
	}
	
	boolean question1() {
		System.out.println("1) Who is Father of JAVA ?");
		System.out.println("a) James Gosling  b) Ronaldo  c) Oak  d)Guido Van Rossum  e) Life line");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
		
		if(ans == 'e' && !lifeLineUsed) {
			lifeLineUsed = true;
			System.out.println("options:1) Audience poll  2) 50-50");
			System.out.println("Select option:");
			int opt = sc.nextInt(); 
			
			if(opt == 1) {
				System.out.println("a) James Gosling---->60%");
				System.out.println("b) Ronaldo---->30%");
				System.out.println("c) Oak---->20%");
				System.out.println("d) Guido Van Rossum---->5%");
				
			}
			System.out.println("select option:");
			ans = sc.next().charAt(0);
			System.out.println(YELLOW+"Life line is used"+RESET);
		}	
		if(ans == 'a') {
			reward += 100;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
				
		}	
	}
   	
	boolean question2(){
	    System.out.println("2) What is JAVA ?");
		System.out.println("a) Platform dependent  b) Platform independent c) Both d)None of this");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
			
		if(ans == 'b') {
			reward += 200;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
		}
			
	}
	
	boolean question3() {
		System.out.println("3) Java original name ?");
		System.out.println("a) Python  b) C c) Oak  d) None of these");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
		
		if(ans == 'c') {
			reward += 100;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
		}
	}
	
	boolean question4() {
		System.out.println("4) When JAVA was developed ?");
		System.out.println("a) 1920  b) 1990 c) 1970  d) 1970");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
		
		if(ans == 'b') {
			reward += 100;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
		}
	}
	
	boolean question5() {
		System.out.println("5) How many types of Variables ?");
		System.out.println("a) 2  b) 1 c) 0  d) 5");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
		
		if(ans == 'a') {
			reward += 100;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
		}
	}
	
	
	boolean question6() {
		System.out.println("6) Which of the following is not a JAVA feature ?");
		System.out.println("a) Object oriented  b) Platform independent c) Secure  d) Use of pointers");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
		
		if(ans == 'd') {
			reward += 100;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
		}
	}
	
	
	boolean question7() {
		System.out.println("7) Which keyword is used to inherit a class in Java ?");
		System.out.println("a) implement  b) inherits c) extends  d) super");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
		
		if(ans == 'c') {
			reward += 100;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
		}
	}
	
	
	boolean question8() {
		System.out.println("8) What is JVM ?");
		System.out.println("a) Java Variable Machine  b) Java Virtual Machine c) Java Visual Model  d) None of these");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
		
		if(ans == 'b') {
			reward += 100;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
		}
	}
	
	
	boolean question9() {
		System.out.println("9) Which data type is used to store decimal values ?");
		System.out.println("a) int  b) char c) float  d)string");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
		
		if(ans == 'c') {
			reward += 100;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
		}
	}
	
	
	boolean question10() {
		System.out.println("10) Which keyword is used to create an object in java ?");
		System.out.println("a) object  b) new c) class  d) create");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
		
		if(ans == 'b') {
			reward += 100;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
		}
	}
	
	
	boolean question11() {
		System.out.println("11) Which access modifier allows access only within the same class ?");
		System.out.println("a) Public  b) protected c) default  d) Private");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
		
		if(ans == 'd') {
			reward += 100;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
		}
	}
	
	
	boolean question12() {
		System.out.println("12) What is Encapsulation ?");
		System.out.println("a) writing multiple classes  b) Hiding data using methods c)Inheting propeties  d)Multiple inheritance");
		System.out.println("Enter your answer:");
		char ans = sc.next().charAt(0);
		
		if(ans == 'b') {
			reward += 100;
			System.out.println(GREEN+"Correct Answer"+RESET);
			System.out.println("reward="+reward);
			return true;
		}
		else {
			System.out.println("Wrong Answer");
			return false;
		}
	}
		 void showResult() {
			 System.out.println(GREEN+"QUIZ COMPLETED"+RESET);
			 System.out.println("Total Reward = "+reward);
		 }
	}
	
	public class QuizApp{
		public static void main(String[] args) {
			Quiz q = new Quiz(); //object creation
			
			q.login();
			
			if(!q.question1()) return;
			System.out.println("--------------------------------------------------");
			
			if(!q.question2()) return;
			System.out.println("--------------------------------------------------");
			
			if(!q.question3()) return;
			System.out.println("--------------------------------------------------");
			
			if(!q.question4()) return;
			System.out.println("--------------------------------------------------");
			
			if(!q.question5()) return;
			System.out.println("--------------------------------------------------");
			
			if(!q.question6()) return;
			System.out.println("--------------------------------------------------");
			
			if(!q.question7()) return;
			System.out.println("--------------------------------------------------");
			
			if(!q.question8()) return;
			System.out.println("--------------------------------------------------");
			
			if(!q.question9()) return;
			System.out.println("--------------------------------------------------");
			
			if(!q.question10()) return;
			System.out.println("--------------------------------------------------");
			
			if(!q.question11()) return;
			System.out.println("--------------------------------------------------");
			
			if(!q.question12()) return;
			
			
			
			
			q.showResult();
		}
		
	
	}	
	
	

	


