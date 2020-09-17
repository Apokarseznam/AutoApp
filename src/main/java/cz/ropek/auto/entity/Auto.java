package cz.ropek.auto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "Auto")
public class Auto {

	@NotBlank(message = "Zadejte výkon")
	@Pattern(regexp = "[0-9]+", message = "Pouze čísla")
	@Size(max = 4, message = "Maximalně 4 znaky")
	@Column(name = "Power")
	private String power;

	@NotBlank(message = "Zadejte barvu")
	@Size(max = 20, message = "Maximalně 20 znaků")
	@Column(name = "Colour")
	private String colour;

	@NotBlank(message = "Zadejte model")
	@Size(max = 20, message = "Maximalně 20 znaků")
	@Column(name = "Model")
	private String model;

	@NotBlank(message = "Zadejte značku")
	@Size(max = 20, message = "Maximalně 20 znaků")
	@Column(name = "Make")
	private String make;

	@Id
	@Column(name = "ID")
	private int id;

	public Auto() {
	}

	public Auto(String make, String model, String colour, String power, int id) {
		this.power = power;
		this.colour = colour;
		this.model = model;
		this.make = make;
		this.id = id;
	}

	public Auto(String make, String model, String colour, String power) {
		this.power = power;
		this.colour = colour;
		this.model = model;
		this.make = make;

	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", power=" + power + ", colour=" + colour + ", make=" + make + ", model=" + model
				+ "]";
	}

}
