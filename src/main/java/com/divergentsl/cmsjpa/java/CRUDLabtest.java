package com.divergentsl.cmsjpa.java;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.divergentsl.cmsjpa.entity.Labtest;
import com.divergentsl.cmsjpa.service.LabtestService;

@Component
public class CRUDLabtest {
	
	@Autowired
	LabtestService labtestService;
	
	Scanner sc = new Scanner(System.in);
	
	public void crudLabtest() {
		
		exit:
			while(true) {
				System.out.println("-------CRUD Labtest------");
				System.out.println("1.Add");
				System.out.println("2.Delete");
				System.out.println("3.Search");
				System.out.println("4.List");
				System.out.println("5.Exit");
				
				System.out.println("Enter your choice:");
				int input = sc.nextInt();
				sc.nextLine();
				
				switch(input) {
				case 1:
					add();
					break;
				case 2:
					delete();
					break;
				case 3:
					search();
					break;
				case 4:
					list();
					break;
				case 5:
					
					break exit;
					
				}
			}
		
	}
	
	public void add() {
		System.out.println("-------Add Labtest------");
		
		System.out.println("Enter the labtest id:");
		long id =sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter test name:");
		String testName= sc.nextLine();
		
		System.out.println("Enter patient id:");
		String patientId = sc.nextLine();
				
		System.out.println("Enter the fees:");
		String testFee = sc.nextLine();
		
		labtestService.add(id, testName, patientId, testFee);
		
	}
	
	public void delete() {
		System.out.println("\nEnter Labtest Id :");
		long id = sc.nextLong();
		if (this.labtestService.remove(id)) {
			System.out.println("----Deleted----");
		} else {
			System.out.println("Not Found");
		}
	}
	
	public void search() {
		System.out.print("\nEnter Labtest Id : ");
		Scanner sc = new Scanner(System.in);
		long id = sc.nextLong();

		Labtest labtest = labtestService.findById(id);

		if (labtest != null) {
			System.out.println("\n------------------------------------Labtest Data-----------------------------------");

			System.out.printf("| %5s | %10s | %15s | %15s |\n", labtest.getId(), labtest.getTestName(),
					labtest.getPatientId(), labtest.getTestFee());
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("\nRecord Found");
		} else {
			System.out.println("\nLabtest Data Not Found!");
		}

	}
	
	public void list() {
		List<Labtest> labtestList = this.labtestService.list();
		System.out.println("\n---------------------------------Doctor List--------------------------------------");
		for (Labtest labtest : labtestList) {
			System.out.printf("| %5s | %10s | %15s | %15s |\n", labtest.getId(), labtest.getTestName(),
					labtest.getPatientId(), labtest.getTestFee());
		}
		System.out.println("--------------------------------------------------------------------------------------");
	}
	

}
