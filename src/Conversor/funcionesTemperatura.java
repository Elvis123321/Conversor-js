package Conversor;

import javax.swing.JOptionPane;

public class funcionesTemperatura {
	Cambios TipoDeCambio = new Cambios();
	
	public void VentanaConvertirTemperatura(double temperaturaConvertir) {
		String opcion = JOptionPane.showInputDialog(null,"Elige el tipo de conversión","Conversión", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Celsius a Kelvin","Celsius a Fahrenheit","Kelvin a Celsius","Kelvin a Fahrenheit",
														"Fahrenheit a Celsius", "Fahrenheit a Kelvin"},"Conversor").toString();
		switch (opcion) {
		case "Celsius a Kelvin":
			TipoDeCambio.ConvertirCelsiusAKelvin(temperaturaConvertir);
			break;
		case "Celsius a Fahrenheit":
			TipoDeCambio.ConvertirCelsiusAFarenheit(temperaturaConvertir);
			break;	
		case "Kelvin a Celsius":
			TipoDeCambio.ConvertirKelvinACelsius(temperaturaConvertir);
			break;	
		case "Kelvin a Fahrenheit":
			TipoDeCambio.ConvertirKelvinAFarenheit(temperaturaConvertir);
			break;	
		case "Fahrenheit a Celsius":
			TipoDeCambio.ConvertirFarenheitACelsius(temperaturaConvertir);
			break;
		case "Fahrenheit a Kelvin":
			TipoDeCambio.ConvertirFarenheitAKelvin(temperaturaConvertir);
			break;
		default:
			break;
		}
	}
}
