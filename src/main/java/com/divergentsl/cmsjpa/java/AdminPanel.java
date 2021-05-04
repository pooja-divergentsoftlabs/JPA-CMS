package com.divergentsl.cmsjpa.java;

import java.util.Scanner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminPanel {

	@Autowired
	private CRUDDoctor crudDoctor;
	@Autowired
	private CRUDPatient crudPatient;
	@Autowired
	private CRUDDrug crudDrug;
	@Autowired
	private CRUDLabtest crudLabtest;
	@Autowired
	private CRUDAppointment crudAppointment;

	public void adminPanel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----Admin Panel-----");
		
		exit:
			while(true) {
				
				
				System.out.println("--------Admin Panel-------");
				System.out.println("1.CRUD Patient");
				System.out.println("2.CRUD Doctor");
				System.out.println("3.CRUD Drug");
				System.out.println("4.CRUD Lab Test");
				System.out.println("5.CRUD Appointment");
				System.out.println("6.Exit");
				
				System.out.println("Enter your choice=");
				int input = sc.nextInt();
		
				
		

		switch (input) {
		case 1:
			crudPatient.crudPatient();
			break;
		case 2:
			crudDoctor.crudDoctor();
			break;
		case 3:
			crudDrug.crudDrug();
			break;
		case 4:
            crudLabtest.crudLabtest();
			break;
		case 5:
			crudAppointment.crudAppointment();
			break;
		case 6:
			break exit;
		}
	}

}
}
