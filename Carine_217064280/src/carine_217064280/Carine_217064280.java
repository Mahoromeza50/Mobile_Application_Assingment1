/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carine_217064280;

import java.util.Scanner;

/**
 *
 * @author Teacher
 */
public class Carine_217064280 {
    static int Emp_No;
    static String Emp_Name ;
    static int Emp_Salary;
    static int Emp_Hours;
    
    static void getdata()
    {
        Scanner k = new Scanner (System.in);
        int op;
        System.out.println("Choose an option, Write [ 1 ] for Monthly, [ 2 ] for Weekly and [ 3 ] for Hourly");
        op=k.nextInt();
        
        if(op==1){
        System.out.print("Enter The Employee No: ");
        Emp_No = k.nextInt();
        
        System.out.print("Enter The Employee Name: ");
        Emp_Name= k.next();
        
        System.out.print("Enter The Employee salary: ");
        Emp_Salary=k.nextInt();
        
        int result;
        result = Emp_Salary -(((Emp_Salary*30)/100)+((Emp_Salary*3)/100)+((Emp_Salary*5)/100));
        System.out.println("The Employee named" + Emp_Name + " with No='" + Emp_No + "' will get the salary '"+result + "' Per Month");
        }
        else if(op==2){
        System.out.print("Enter The Employee No: ");
        Emp_No = k.nextInt();
        
        System.out.print("Enter The Employee Name: ");
        Emp_Name = k.next();
        
        System.out.print("Enter The Employee salary: ");
        Emp_Salary = k.nextInt();
        
        int result;
        result= Emp_Salary - ((Emp_Salary*3)/100);
        System.out.println("The Employee named" + Emp_Name + " with No='" + Emp_No + "' will get the salary '"+result + "' Per Week");
        }	
        else if(op==3){
            System.out.print("Enter The Employee No: ");
            Emp_No = k.nextInt();

            System.out.print("Enter The Employee Name: ");
            Emp_Name = k.next();

            System.out.print("Enter The Employee Hourly rate: ");
            Emp_Salary = k.nextInt();

            System.out.print("Enter The Employee Hours: ");
            Emp_Hours = k.nextInt();

            int result;
            result = Emp_Salary*Emp_Hours;
            System.out.println("The Employee named " + Emp_Name + " with No='" + Emp_No + "' will get the salary '"+result + "' Per Month");	
        }
        else{
            System.out.println("Invalid option!");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getdata();
    }
    
}
