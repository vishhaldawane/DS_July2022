package com.ds;

public class Country
{
	private String name;
	private String capital;
	private String primeMinister;
	private String population;
	private String currency;
	
	
	
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(String name, String capital, String primeMinister, String population, String currency) {
		super();
		this.name = name;
		this.capital = capital;
		this.primeMinister = primeMinister;
		this.population = population;
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + ", primeMinister=" + primeMinister + ", population="
				+ population + ", currency=" + currency + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}