package ua.lviv.lgs.hbm.xml;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Car {
	private Integer id;
	private String carModel;
	private Set<Person> persons = new HashSet<>();
	
	public Car() {
	}

	public Car(String carModel) {
		super();
		this.carModel = carModel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carModel, id, persons);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(carModel, other.carModel) && Objects.equals(id, other.id)
				&& Objects.equals(persons, other.persons);
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", carModel=" + carModel + ", persons=" + persons + "]";
	}

	
	
	
}
