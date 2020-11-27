package br.edu.univas.view;

import java.util.List;

import br.edu.univas.vo.Pet;

public class PetView {

	public void showMenu() {
		System.out.println("\n**********PET**********\n");
		System.out.println("1 - Cadastrar um novo PET");
		System.out.println("2 - Listar os PETs cadastrados");
		System.out.println("9 - Sair");
	}

	public void showInvalidOption() {
		System.out.println("Opção inválida! Por favor digite uma opção correta!");
	}

	public void showOwnerName() {
		System.out.println("Digite o nome do cliente:");
	}

	public void showCellPhone() {
		System.out.println("Digite o celular do cliente:");
	}

	public void showName() {
		System.out.println("Digite o nome do animal:");
	}

	public void showBreed() {
		System.out.println("Digite a raça do animal:");
	}

	public void showSuccessMessage() {
		System.out.println("PET cadastrado com sucesso!");
	}

	public void showAllPets(List<Pet> list) {
		System.out.println("PETs cadastrados:");
		
		list.forEach(System.out::println);
	}
	
}
