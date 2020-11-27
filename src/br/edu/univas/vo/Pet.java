package br.edu.univas.vo;



public class Pet {

	private String name;
	private String breed;
	private String ownerName;
	private String cellPhone;
	
	public Pet(String name, String breed, String ownerName, String cellPhone) {
		super();
		this.name = name;
		this.breed = breed;
		this.ownerName = ownerName;
		this.cellPhone = cellPhone;
	}

	public static class Builder {
		private String name;
		private String breed;
		private String ownerName;
		private String cellPhone;
		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		public Builder withBreed(String breed) {
			this.breed = breed;
			return this;
		}
		public Builder withOwnerName(String ownerName) {
			this.ownerName = ownerName;
			return this;
		}
		public Builder withCellPhone(String cellPhone) {
			this.cellPhone = cellPhone;
			return this;
		}
		public Pet build() {
			return new Pet(name, breed,
					ownerName, cellPhone);
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", breed=" + breed + ", ownerName=" + ownerName + ", cellPhone=" + cellPhone + "]";
	}
	
}
