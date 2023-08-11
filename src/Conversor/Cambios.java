package Conversor;

import javax.swing.JOptionPane;

public class Cambios {

	public void ConvertirSolesADolares(double montoSoles) {
		double montoDolar = Math.round((montoSoles*100.0)/3.7)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en dolares es "+montoDolar);
	}
	public void ConvertirSolesAEuros(double montoSoles) {
		double montoEuro = Math.round((montoSoles*100.0)/4.06)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+montoEuro);
	}
	public void ConvertirSolesALibras(double montoSoles) {
		double montoLibra = Math.round((montoSoles*100.0)/4.71)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+montoLibra);
	}
	public void ConvertirSolesAYen(double montoSoles) {
		double montoYen = Math.round((montoSoles*100.0)/0.026)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+montoYen);
	}
	public void ConvertirSolesAWon(double montoSoles) {
		double montoWon = Math.round((montoSoles*100.0)/0.0028)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+montoWon);
	}
	public void ConvertirDolaresASoles(double montoSoles) {
		double montoSol = Math.round((montoSoles*100.0)/0.27)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+montoSol);
	}
	public void ConvertirEurosASoles(double montoSoles) {
		double montoSol = Math.round((montoSoles*100.0)/0.25)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+montoSol);
	}
	public void ConvertirCelsiusAKelvin(double temperatura) {
		double temperaturaKelvin = Math.round((temperatura+273.15)*100.0)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+temperaturaKelvin);
	}
	public void ConvertirCelsiusAFarenheit(double temperatura) {
		double temperaturaFarenheit = (Math.round((temperatura*900.0)/5.0)/100.0)+32.0;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+temperaturaFarenheit);
	}
	public void ConvertirKelvinACelsius(double temperatura) {
		double temperaturaCelsius = Math.round((temperatura-273.15)*100.0)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+temperaturaCelsius);
	}
	public void ConvertirKelvinAFarenheit(double temperatura) {
		double temperaturaCelsius = (Math.round((temperatura-273.15)*900.0)/5.0)+32.0;;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+temperaturaCelsius);
	}
	public void ConvertirFarenheitACelsius(double temperatura) {
		double temperaturaCelsius = (Math.round((temperatura*500.0)/9.0)/100.0)+32.0;;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+temperaturaCelsius);
	}
	public void ConvertirFarenheitAKelvin(double temperatura) {
		double temperaturaKelvin = (Math.round((temperatura-32.0)*500.0)/9.0)+273.15;
		JOptionPane.showMessageDialog(null, "El monto en euros es "+temperaturaKelvin);
	}
}
