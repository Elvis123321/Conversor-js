package Conversor;

import javax.swing.JOptionPane;

public class funcionesMoneda {
	
	Cambios TipoDeCambio = new Cambios();
	
	public void VentanaConvertirMoneda(double montoAConvertir) {
		String opcion = JOptionPane.showInputDialog(null,"Elige el tipo de cambio","Cambios", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Soles a Dolares","Soles a Euros","Soles a Libras","Soles a Yenes",
														"Soles a Wones", "Dolares a Soles", "Euros a Soles"},"Cambio").toString();
		switch (opcion) {
		case "Soles a Dolares":
			TipoDeCambio.ConvertirSolesADolares(montoAConvertir);
			break;
		case "Soles a Euros":
			TipoDeCambio.ConvertirSolesAEuros(montoAConvertir);
			break;	
		case "Soles a Libras":
			TipoDeCambio.ConvertirSolesALibras(montoAConvertir);
			break;	
		case "Soles a Yenes":
			TipoDeCambio.ConvertirSolesAYen(montoAConvertir);
			break;	
		case "Soles a Wones":
			TipoDeCambio.ConvertirSolesAWon(montoAConvertir);
			break;
		case "Dolares a Soles":
			TipoDeCambio.ConvertirDolaresASoles(montoAConvertir);
			break;
		case "Euros a Soles":
			TipoDeCambio.ConvertirEurosASoles(montoAConvertir);
			break;
		default:
			break;
		}
	}
}

