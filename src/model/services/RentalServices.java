package model.services;

import model.entities.CarRental;

public class RentalServices {
	private Double pricePerHour;
	private Double pricePerDay;

	private BrazilTaxService taxService;

	public RentalServices() {
		
	}

	public RentalServices(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		super();
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public BrazilTaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}
	public void processInvoice(CarRental carRental) {
		long t1 =carRental.getStart().getTime();
		long t2 =carRental.getFinish().getTime();
		double hours = (double)(t2-t1) / 1000 / 60 / 60;
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}
		else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
			
		}
	}

}
