package com.tech.four;

public class HomeWork {

	public static void main(String[] args) {
		int age=80;
		
	//ifelse(age);
	int day=1;
	switchCase(day);
			
	
	}
    public static void ifelse(int age){ 

				if (age<13){
	System.out.println("You are a children");
				}else if(age<18 && age>18){
				System.out.println("You are Teenager");
				}else if(age>60){
		
					//Nested If Else Statement
				if(age>100){
					System.out.println("You are Hero");
				}else{
					System.out.println("You are Senior");
							}
				}else{
			System.out.println("You are adult");
		}
	}

//SwitchCase
public static void switchCase(int day){
	switch (day){
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Tuesday");
		break;
	case 5:
		System.out.println("Tuesday");
		break;
	}
}
}








