/*
	40.	Create a class Student having data members name, roll no., age and score.
	 Write a program to accept 10 records of student and store them in an array. 
	 And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].
*/

import java.util.Scanner;

class Student{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Student : ");
		int n = sc.nextInt();
		String name[] = new String[n];
		int[] rn= new int[n];
		int[] age= new int[n];
		int[] score= new int[n];
		
		for(int i=0;i<n;i++){
			System.out.println("Enter "+(i+1)+" student - name, rollNo, age, score : ");
			name[i] = sc.next();
			rn[i] = sc.nextInt();
			age[i] = sc.nextInt();
			score[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			if(score[i]<=50){
				System.out.println("Student record lies in group [0-50]");
					System.out.println("rollno = "+ name[i]); 
					System.out.println("name = "+ rn[i]);  
					System.out.println("age = "+ age[i]);  
					System.out.println("Score = "+ score[i]);  
			}
			else if(score[i]>50 && score[i]<=65){
				System.out.println("Student record lies in group [50-65]");
					System.out.println("rollno = "+ name[i]); 
					System.out.println("name = "+ rn[i]);  
					System.out.println("age = "+ age[i]);  
					System.out.println("Score = "+ score[i]);  
			}
			else if(score[i]>65 && score[i]<=80){
				System.out.println("Student record lies in group [65-80]");
					System.out.println("rollno = "+ name[i]); 
					System.out.println("name = "+ rn[i]);  
					System.out.println("age = "+ age[i]);  
					System.out.println("Score = "+ score[i]);  
			}
			else if(score[i]>80 && score[i]<=100){
				System.out.println("Student record lies in group [80-100]");
					System.out.println("rollno = "+ name[i]); 
					System.out.println("name = "+ rn[i]);  
					System.out.println("age = "+ age[i]);  
					System.out.println("Score = "+ score[i]);  
			}
			else{
			System.out.println("Record not found!");
			}
		}
	}
}