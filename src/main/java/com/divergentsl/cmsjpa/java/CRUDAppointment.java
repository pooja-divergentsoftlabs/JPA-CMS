package com.divergentsl.cmsjpa.java;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergentsl.cmsjpa.entity.Appointment;
import com.divergentsl.cmsjpa.service.AppointmentService;

@Component
public class CRUDAppointment {
	
	@Autowired
	AppointmentService appointmentService;
	
	Scanner sc = new Scanner(System.in);
	
	public void crudAppointment() {
		
		exit:
			while(true) {
				System.out.println("-------CRUD Appointment------");
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
		System.out.println("-------Add Appointment------");
		
		System.out.println("Enter the appointment id:");
		long aid =sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter patient id:");
		String ptId = sc.nextLine();
			
		System.out.println("Enter patient name:");
		String ptName= sc.nextLine();
		
		System.out.println("Enter app date:");
		String appdate = sc.nextLine();
		
		appointmentService.add(aid, ptId, ptName, appdate);
		
	}
	
	public void delete() {
		System.out.println("\nEnter Appointment Id :");
		long id = sc.nextLong();
		if (this.appointmentService.remove(id)) {
			System.out.println("----Deleted----");
		} else {
			System.out.println("Not Found");
		}
	}
	
	public void search() {
		System.out.print("\nEnter App Id : ");
		Scanner sc = new Scanner(System.in);
		long id = sc.nextLong();

		Appointment appointment = appointmentService.findById(id);

		if (appointment != null) {
			System.out.println("\n------------------------------------Appointment Data-----------------------------------");

			System.out.printf("| %5s | %10s | %15s | %15s |\n", appointment.getAid(), appointment.getPid(),
					appointment.getPname(), appointment.getAppdate());
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("\nRecord Found");
		} else {
			System.out.println("\nApp Data Not Found!");
		}

	}
	
	public void list() {
		List<Appointment> appointmentList = this.appointmentService.list();
		System.out.println("\n--------------------------------Appointment List--------------------------------------");
		for (Appointment appointment : appointmentList) {
			System.out.printf("| %5s | %10s | %15s | %15s |\n", appointment.getAid(), appointment.getPid(),
					appointment.getPname(), appointment.getAppdate());
		}
		System.out.println("--------------------------------------------------------------------------------------");
	}

}
