package com.tech.four;

public class JavaPractice {
	public static void main(String[] args) {
		//practiceForLoop();
		//practiceWhileLoop();
		practiceDoWhileLoop();
	}
		
		
	public static void practiceForLoop(){
			int i;
		    for(i=1;i<30;i++){
		System.out.println("For Loops Number="+i);
	}
}

public static void practiceWhileLoop(){
	int i=1;
	while(i<10){
	System.out.println("While Loops Number="+i);
	i++;
}
}
public static void practiceDoWhileLoop(){
	int i=1;
	do{
		System.out.println("Do While Loops Number="+i);
		i++;
	}while(i<18);
		
}
}