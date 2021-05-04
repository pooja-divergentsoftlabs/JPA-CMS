package com.divergentsl.cmsjpa.java;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergentsl.cmsjpa.entity.Doctor;
import com.divergentsl.cmsjpa.service.DoctorService;

@Component
public class CRUDDoctor {
	
	@Autowired
	DoctorService doctorService;
	
	Scanner sc = new Scanner(System.in);
	
	public void crudDoctor() {
		
		exit:
			while(true) {
				System.out.println("-------CRUD Doctor------");
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
		System.out.println("-------Add Doctor------");
		
		System.out.println("Enter the doctor's id:");
		long did =sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter doctor's name:");
		String dname= sc.nextLine();
		
		System.out.println("Enter doctor's speciality:");
		String speciality = sc.nextLine();
		
		System.out.println("Enter contact-number:");
		String dcontactnumber = sc.nextLine();
		
		System.out.println("Enter the fees:");
		String dfees = sc.nextLine();
		
		doctorService.add(did, dname, speciality, dcontactnumber, dfees);
		
	}
	
	public void delete() {
		System.out.println("\nEnter Doctor Id :");
		long id = sc.nextLong();
		if (this.doctorService.remove(id)) {
			System.out.println("----Deleted----");
		} else {
			System.out.println("Not Found");
		}
	}
	
	public void search() {
		System.out.print("\nEnter Doctor Id : ");
		Scanner sc = new Scanner(System.in);
		long id = sc.nextLong();

		Doctor doctor = doctorService.findById(id);

		if (doctor != null) {
			System.out.println("\n------------------------------------Doctor Data-----------------------------------");

			System.out.printf("| %5s | %10s | %15s | %15s | %15s |\n", doctor.getDid(), doctor.getDname(),
					doctor.getDspeciality(), doctor.getDcontactnumber(),doctor.getDfees());
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("\nRecord Found");
		} else {
			System.out.println("\nDoctor Data Not Found!");
		}

	}
	
	public void list() {
		List<Doctor> doctorList = this.doctorService.list();
		System.out.println("\n---------------------------------Doctor List--------------------------------------");
		for (Doctor doctor : doctorList) {
			System.out.printf("| %5s | %10s | %15s | %15s | %15s |\n", doctor.getDid(), doctor.getDname(),
					doctor.getDspeciality(), doctor.getDcontactnumber(),doctor.getDfees());
		}
		System.out.println("--------------------------------------------------------------------------------------");
	}
	
}
