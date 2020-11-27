package br.edu.univas.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.vo.Pet;

public class PetDAO {

	private static List<Pet> pets = new ArrayList<>();
	
	public void insert(Pet pet) {
		pets.add(pet);
	}
	
	public List<Pet> list() {
		return pets;
	}
}
