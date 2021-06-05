package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.carsDao;
import entity.carDetailsEntity;
import entity.carsEntity;

public class Menu {
	
	private carsDao CarsDao;
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display cars",
			"Display a car",
			"Create car",
			"Delete car",
			"Create carDetails",
			"Delete carDetails");
	
	public void start() {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();

			try {
				if(selection.equals("1")) {
					displaycars();
				} else if (selection.equals("2")) {
					displaycar();
				} else if (selection.equals("3")) {
					//createcar();
				} else if (selection.equals("4")) {
					//deletecar();
				} else if (selection.equals("5")) {
					//createcarDetails();
				} else if (selection.equals("6")) {
					//deletecarDetails();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
			System.out.println("Press enter to procede..");
			scanner.nextLine();
		} while(selection.equals("-1"));
	}



     private void printMenu() {
    	 System.out.println("Select an option :\n-----");
    	 for (int i = 0; i < options.size(); i++) {
    		 System.out.println(i + 1 + ") " + options.get(i));
    	 }
    	 		
     }
     
     private void displaycars() throws SQLException  {
    	 List<carsEntity> cars = CarsDao.getcars();
    	 for (carsEntity car: cars) {
    		 System.out.println(car.getCarsId() + ": " + car.getModel());
    	 }
     }
     
     private void displaycar() throws SQLException {
    	 System.out.println("Enter car id:");
    	 int id = Integer.parseInt(scanner.nextLine());
    	 carsEntity car = CarsDao.getCarById(id);
    	 System.out.println(car.getCarsId() + ":" + car.getModel());
    	 for(carDetailsEntity Car: car.getCarDetailsEntity());{
    		 System.out.println("carId: " + car.getModel() + "- Name:" + car.getCarDetailsEntity() + "" + car.getCarsId());
    	 }
     }
    	 
    			
}

