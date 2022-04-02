package com.tech.one;
public class JavaClassTwo {

	public static void main(String[]args){
		//practiceForloop();
		//practiceWhileLoop();
		//practiceDoWhileLoop();
		//practiceinfiniteLoop();
		practiceNestedForLoop();
	}
public static void practiceForloop(){		
		int i;
		for (i=20; i>-20; i++)
		{
			System.out.println("For Loops Number=" +i);
		}
		}
//while loop
public static void practiceWhileLoop(){
	int i=1;
	while(i<10){
		System.out.println("While Loops Number="+i); 
		i++;
	}
		
	}
//Do While Loop
public static void practiceDoWhileLoop(){
	int i =1 ;
			do {
				System.out.println("Do While Loops Number="+i);
				i++;
				
			}while (i<10);
}
public static void practiceinfiniteLoop(){
	int i;
	for (i=1; ;i--){
		System.out.println("Infinite Loops Numbe="+i);
	}
}
//Nested Loop
public static void practiceNestedForLoop(){
	int i;
	int j;
	for (i=1;i<5;i++){
		for (j=1;j<5;j++)
		System.out.println("For Loops Number="+i+":"+j);
	}
	
	
}
}








