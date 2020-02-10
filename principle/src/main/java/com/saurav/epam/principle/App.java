package com.saurav.epam.principle;

import java.util.Scanner;

class Math_operation
{
	private int First_number, Second_number, Output;
	public void Add(Scanner in)
	{
		System.out.println("ADDITION\nEnter Two numbers: ");
		this.First_number = in.nextInt();
		this.Second_number = in.nextInt();
		this.Output = First_number + Second_number;
		System.out.println(First_number + " + " + Second_number + " = " + Output);
	}
	public void Subtract(Scanner in)
	{
		System.out.println("SUBTRACTION\nEnter Two numbers: ");
		this.First_number = in.nextInt();
		this.Second_number = in.nextInt();
		this.Output = First_number - Second_number;
		System.out.println(First_number + " - " + Second_number + " = " + Output);
	}
	public void Divide(Scanner in)
	{
		System.out.println("DIVISION\nEnter Two numbers: ");
		this.First_number = in.nextInt();
		this.Second_number = in.nextInt();
		this.Output = First_number / Second_number;
		System.out.println(First_number + " / " + Second_number + " = " + Output);
	}
	public void Multiply(Scanner in)
	{
		System.out.println("MULTIPLICATION\nEnter Two numbers: ");
		this.First_number = in.nextInt();
		this.Second_number = in.nextInt();
		this.Output = First_number * Second_number;
		System.out.println(First_number + " * " + Second_number + " = " + Output);
	}
	Math_operation()
	{
		this.First_number = 0;
		this.Second_number = 0;
		this.Output = 0;
	}
}

public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Math Operation" );
        Scanner in = new Scanner(System.in);
        Math_operation Math = new Math_operation();
        int choice;
        do
        {
        	System.out.println("Press 1 for Addition\n Press 2 for Subtractiom\n Press 3 for Division\n Press 4 for Multiplication\n Press 5 for exit");
        	choice = in.nextInt();
        	switch(choice)
        	{
        	case 1:
        		Math.Add(in);
        		break;
        	case 2: 
        		Math.Subtract(in);
        		break;
        	case 3:
        		Math.Divide(in);
        		break;
        	case 4:
        		Math.Multiply(in);
        		break;
        	case 5:
        		break;
        	default:
        		System.out.println("Invalid Input");
        		break;
        	}
        }while(choice!=5);
    }
}
