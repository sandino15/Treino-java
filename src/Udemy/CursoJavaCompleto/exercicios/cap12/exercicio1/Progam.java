package Udemy.CursoJavaCompleto.exercicios.cap12.exercicio1;

import Udemy.CursoJavaCompleto.exercicios.cap12.exercicio1.entities.Department;
import Udemy.CursoJavaCompleto.exercicios.cap12.exercicio1.entities.HourContract;
import Udemy.CursoJavaCompleto.exercicios.cap12.exercicio1.entities.Worker;
import Udemy.CursoJavaCompleto.exercicios.cap12.exercicio1.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Progam {
    public static void main(String [] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.print("Enter departament is name: ");
        String departmanetName = sc.next();

        System.out.println("Enter worker date: ");

        System.out.print("name: ");
        String workerName = sc.next();

        System.out.print("Level ");
        String workerLevel = sc.next();

        System.out.print("Base salary ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary,new Department(departmanetName));

        System.out.println("How many contracts to this woker? ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("Enter contract # " + i + " data:");
            System.out.print("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour,hours);
            worker.addContract(contract);



        }
        System.out.println();
        System.out.println("Enter moth and year to calculete income (MM/YYYY)");
        String mothAndYear = sc.next();
        int moth = Integer.parseInt(mothAndYear.substring(0,2));
        int year = Integer.parseInt(mothAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for: " + mothAndYear + ": " + worker.income(year,moth));

    }
}
