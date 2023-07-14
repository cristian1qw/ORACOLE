package sprint1;

import javax.swing.JOptionPane;

public class interfaz {
	private static boolean isNumber(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		 int resp=0;
		 String valor2=null;
		 int valor1=0;
		 int Dolar= 4500;
		 int Euro=5000;
		 int Libra=3500;
		 boolean valid=false;
		 double conversor=0;
		 String factor=null;
		 

		
		 Object[] possibleValues = { "Conversor de moneda", "Conversor de Temperatura" };
		 Object[] possibleValues2 = { "De Pesos a Dolar", "De Pesos a Euro","De Pesos a libra" };
		 Object[] possibleValues3 = { "De Kelvin a Celsius", "Fahrenheit a Kelvin","Celsius a Farenheit" };
		
		
		 Object selectedValue = JOptionPane.showInputDialog(null,
		             "Elige una opción de conversión",null,
		             JOptionPane.INFORMATION_MESSAGE, null,
		             possibleValues, possibleValues[0]);
		 while(resp==0) {
			 	if(selectedValue=="Conversor de moneda") {
			 		valor2 = JOptionPane.showInputDialog(null,"Ingresa la cantidad que deseas convertir:");
			 		if(valor2!=null) {
			 	while(!isNumber(valor2)) {
			 			JOptionPane.showMessageDialog(null, "Por favor digite un numero", "Por favor digite un numero", JOptionPane.ERROR_MESSAGE);
			 			valor2 = JOptionPane.showInputDialog(null,"Ingresa la cantidad que deseas convertir:");
			 }}
			 		else {
			 			break;
			 		}
			 		valor1= Integer.parseInt(valor2);
			
			 		Object selectedValues2 = JOptionPane.showInputDialog(null,
		             "Elige la moneda que deseas convertir tu dinero:", null,
		             JOptionPane.INFORMATION_MESSAGE, null,
		             possibleValues2, possibleValues2[0]);
	
			
			 		if(selectedValues2=="De Pesos a Dolar") {			 
			 			
				 			conversor= Dolar*valor1;
				 			factor="Dolares";
			 }
			 		if(selectedValues2=="De Pesos a Euro") {
			 			
				 			conversor= Euro*valor1;
				 			factor="Euros";}
			  		if(selectedValues2=="De Pesos a libra") {
			  		
			  				conversor= Libra*valor1;
			  				factor="Libras";}
			  		JOptionPane.showInternalMessageDialog(null,"Equivale a "+ conversor+" "+factor, 
				             "información", JOptionPane.INFORMATION_MESSAGE);
			  		resp =JOptionPane.showConfirmDialog(null, "¿Deseas Continuar?:",
			                "Blog masqueprogramar", JOptionPane.YES_NO_CANCEL_OPTION,
			                JOptionPane.INFORMATION_MESSAGE, null);
		 }
		 
		 
			 if(selectedValue=="Conversor de Temperatura") {
			 Object selectedValues3 = JOptionPane.showInputDialog(null,
		             "Elige la Temperatura a la que deseas convertir:", null,
		             JOptionPane.INFORMATION_MESSAGE, null,
		             possibleValues3, possibleValues3[0]);
			 		valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la temperatura:"));
				 	
			 	if(selectedValues3=="De Kelvin a Celsius") {			  			
				 			conversor= valor1-273.15;
				 			factor="Celsius";
			 }
			 	if(selectedValues3=="Fahrenheit a Kelvin") {
			 			
				 			conversor= (valor1+459.67)*(0.5555);
				 			factor="Kelvin";
				 			}
			  	if(selectedValues3=="Celsius a Farenheit") {
			  			
			  				conversor= (valor1*(9/5))+32;
			  				factor="Farenheit";}
			  	JOptionPane.showInternalMessageDialog(null,"Equivale a "+ conversor+" "+factor, 
			             "información", JOptionPane.INFORMATION_MESSAGE);
		  	 resp =JOptionPane.showConfirmDialog(null, "¿Deseas Continuar?:",
		                "Blog masqueprogramar", JOptionPane.YES_NO_CANCEL_OPTION,
		                JOptionPane.INFORMATION_MESSAGE, null);
			 
			 }}
			 JOptionPane.showInternalMessageDialog(null, "Programa Terminado", 
		 
	             "información", JOptionPane.INFORMATION_MESSAGE);
	
		 }}
		
	 
	

