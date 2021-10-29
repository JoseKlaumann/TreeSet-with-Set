package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Users;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Users> set = new TreeSet<>(); //Necessario colocar a interface comparable na classe
				
		System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        	set.add(new Users(sc.nextInt()));
        }
        
        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        	set.add(new Users(sc.nextInt()));
        }
        
        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        	set.add(new Users(sc.nextInt()));
        }
        
        System.out.println("Total students: " + set.size());
        
		sc.close();
	}

}
