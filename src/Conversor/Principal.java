package Conversor;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		boolean ejecucion = true; 
		funcionesMoneda funcionMoneda = new funcionesMoneda();
		funcionesTemperatura funcionesTemperatura = new funcionesTemperatura();
		
		while(ejecucion) {
			try {
			String tipoConversor= JOptionPane.showInputDialog(null, "Seleccione una opción de conversión:", "Menu",JOptionPane.QUESTION_MESSAGE,null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion").toString();
			switch (tipoConversor) {
			case "Conversor de Moneda": {
				String divisa = JOptionPane.showInputDialog("Ingrese el monto de dinero a cambiar");
				if(ValidarMonto(divisa)) {
					double montoValido = Double.parseDouble(divisa);
					funcionMoneda.VentanaConvertirMoneda(montoValido);
					int continuar =  JOptionPane.showConfirmDialog(null, "Desea hacer otro cambio monetario");
					if (JOptionPane.OK_OPTION == continuar) {
						System.out.println("Selecciona olcion afirmativa");
					}else {
						ejecucion=false;
						JOptionPane.showMessageDialog(null, "Nos vemos");
						break;
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Complete los espacios");
					break;
				}
			}
			case "Conversor de Temperatura": {
				String Temperatura = JOptionPane.showInputDialog("Ingrese la temperatura a convertir");
				if(ValidarTemperatura(Temperatura)) {
					double temperaturaValida = Double.parseDouble(Temperatura);
					funcionesTemperatura.VentanaConvertirTemperatura(temperaturaValida);
					int continuar =  JOptionPane.showConfirmDialog(null, "Desea hacer otro cambio monetario");
					if (JOptionPane.OK_OPTION == continuar) {
						System.out.println("Selecciona olcion afirmativa");
					}else {
						ejecucion=false;
						JOptionPane.showMessageDialog(null, "Nos vemos");
						break;
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Complete los espacios");
					break;
				}
			}
			default:
				break;
			}
		
			}catch(NullPointerException e) {
				break;
			}
		}
	
}

	public static boolean ValidarMonto(String divisa) {
		try {
			double x = Double.parseDouble(divisa);
			if(x>0) {
				return true;
			}
		}catch(NumberFormatException exeption){
			return false;
		}
		JOptionPane.showMessageDialog(null,"Ingrese un monto de dinero valido");
		return false;
	}
	public static boolean ValidarTemperatura(String temperatura) {
		try {
			double x = Double.parseDouble(temperatura);
			if(x>-273.15) {
				return true;
			}
		}catch(NumberFormatException exeption){
			return false;
		}
		JOptionPane.showMessageDialog(null,"No se puede pasar al cero absoluto, Ingrese una temperatura valida");
		return false;
	}
}