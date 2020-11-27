package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.dao.PetDAO;
import br.edu.univas.view.PetView;
import br.edu.univas.vo.Pet;

public class PetController {

	private PetDAO dao;
	private PetView view;
	
	public PetController() {
		dao = new PetDAO();
		view = new PetView();
	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		
		do {
			view.showMenu();
			option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				newPet(scanner);
			} else if (option == 2) {
				list();
			} else if (option != 9) {
				view.showInvalidOption();
			}
			
		} while(option != 9);
		
		scanner.close();
	}

	private void newPet(Scanner scanner) {

		view.showOwnerName();
		String ownerName = scanner.nextLine();
		view.showCellPhone();
		String cellPhone = scanner.nextLine();
		view.showName();
		String name = scanner.nextLine();
		view.showBreed();
		String breed = scanner.nextLine();

		// eae rodrigo, acho que vc colocou errado aqui de propósito, pq como errou na sequencia do construtor da classe, ele mostrava na ordem errada.
		// pra facilitar a construção da classe, Builder Pattern na veia
		Pet pet = new Pet.Builder()
				.withOwnerName(ownerName)
				.withCellPhone(cellPhone)
				.withName(name)
				.withBreed(breed)
				.build();

		dao.insert(pet);
		
		view.showSuccessMessage();
	}
	
	private void list() {
		view.showAllPets(dao.list());
	}

	
}
