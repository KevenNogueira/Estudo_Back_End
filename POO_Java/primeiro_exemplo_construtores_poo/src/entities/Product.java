package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public Product() {

	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;

	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removePruducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());

	}

}

/*
 * Abordado neste pequeno programa os conceitos de construtores e também de
 * sobrecarga! Construtor força com que o usuario entre com os valores, se este
 * for personalizado, como no caso dos construtores que tem parametros. Caso não
 * se crie nenhum construtor a classe mesmo o cria de forma padrão sem, porém
 * não se e visivel, ele é iniciado no mendo da instaciação do objeto! A
 * sobrecarga e o conceito de se ter 2 construtores, dando assim uma opção de
 * como aquele produto pode ser iniciado!
 */