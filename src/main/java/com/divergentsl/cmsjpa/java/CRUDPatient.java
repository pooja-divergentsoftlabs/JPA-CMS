package com.divergentsl.cmsjpa.java;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergentsl.cmsjpa.entity.Patient;
import com.divergentsl.cmsjpa.service.PatientService;



@Component
public class CRUDPatient {
	
	@Autowired
	PatientService patientService;
	
	Scanner sc = new Scanner(System.in);
	
	public void crudPatient() {
		
		exit:
			while(true) {
				System.out.println("-------CRUD Patient------");
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
		System.out.println("-------Add Patient------");
		
		System.out.println("Enter the patient's id:");
		long pid =sc.nextLong();
		sc.nextLine();

		System.out.println("Enter name=");
		String pname = sc.nextLine();

		System.out.println("Enter address=");
		String address = sc.nextLine();

		System.out.println("Enter contact number=");
		String pcontactnumber = sc.nextLine();

		System.out.println("Enter age=");
		String page = sc.nextLine();

		System.out.println("Enter weight=");
		String pweight = sc.nextLine();
		
		patientService.add(pid, pname, address, pcontactnumber, page, pweight);
		
	}
	
	public void delete() {
		System.out.println("\nEnter Patient Id :");
		long id = sc.nextLong();
		if (this.patientService.remove(id)) {
			System.out.println("----Deleted----");
		} else {
			System.out.println("Not Found");
		}
	}
	
	public void search() {
		System.out.print("\nEnter Doctor Id : ");
		Scanner sc = new Scanner(System.in);
		long id = sc.nextLong();

		Patient patient = patientService.findById(id);

		if (patient != null) {
			System.out.println("\n------------------------------------Doctor Data-----------------------------------");

			System.out.printf("| %5s | %10s | %15s | %15s | %15s| %15s |\n", patient.getPid(), patient.getPname(),
					patient.getAddress(), patient.getPcontactnumber(),patient.getPage(),patient.getPweight());
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("\nRecord Found");
		} else {
			System.out.println("\nPatient Data Not Found!");
		}

	}
	
	public void list() {
		List<Patient> patientList = this.patientService.list();
		System.out.println("\n---------------------------------Doctor List--------------------------------------");
		for (Patient patient : patientList) {
			System.out.printf("| %5s | %10s | %15s | %15s | %15s |\n", patient.getPid(), patient.getPname(),
					patient.getAddress(), patient.getPcontactnumber(),patient.getPage(),patient.getPweight());
		}
		System.out.println("--------------------------------------------------------------------------------------");
	}
	

}
