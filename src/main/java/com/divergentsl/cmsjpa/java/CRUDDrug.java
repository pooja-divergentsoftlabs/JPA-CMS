package com.divergentsl.cmsjpa.java;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.divergentsl.cmsjpa.entity.Drug;

import com.divergentsl.cmsjpa.service.DrugService;

@Component
public class CRUDDrug {
	
	@Autowired
	DrugService drugService;
	
	Scanner sc = new Scanner(System.in);
	
	public void crudDrug() {
		
		exit:
			while(true) {
				System.out.println("-------CRUD Drug------");
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
		System.out.println("-------Add Drug------");
		
		System.out.println("Enter the drug's id:");
		long drugid =sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter drug's name:");
		String drugname= sc.nextLine();
		
		System.out.println("Enter description:");
		String description = sc.nextLine();
		
		System.out.println("Enter quantity:");
		String quantity = sc.nextLine();
		
		System.out.println("Enter the price:");
		String price = sc.nextLine();
		
		drugService.add(drugid, drugname, description, quantity, price);
		
	}
	
	public void delete() {
		System.out.println("\nEnter Drug Id :");
		long id = sc.nextLong();
		if (this.drugService.remove(id)) {
			System.out.println("----Deleted----");
		} else {
			System.out.println("Not Found");
		}
	}
	
	public void search() {
		System.out.print("\nEnter Drug Id : ");
		Scanner sc = new Scanner(System.in);
		long id = sc.nextLong();

		Drug drug = drugService.findById(id);

		if (drug != null) {
			System.out.println("\n------------------------------------Drug Data-----------------------------------");

			System.out.printf("| %5s | %10s | %15s | %15s | %15s |\n", drug.getDrugid(), drug.getDrugname(),
					drug.getDescription(), drug.getQuantity(),drug.getPrice());
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("\nRecord Found");
		} else {
			System.out.println("\nDrug Data Not Found!");
		}

	}
	
	public void list() {
		List<Drug> drugList = this.drugService.list();
		System.out.println("\n---------------------------------Drug List--------------------------------------");
		for (Drug drug : drugList) {
			System.out.printf("| %5s | %10s | %15s | %15s | %15s |\n",  drug.getDrugid(), drug.getDrugname(),
					drug.getDescription(), drug.getQuantity(),drug.getPrice());
		}
		System.out.println("--------------------------------------------------------------------------------------");
	}
	
	

}
