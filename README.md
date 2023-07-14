# ORACOLE
nombre del proyecto : interfaz.java
El proyecto consiste en un conversor de monedas es decir de pesos a dolares, euros o libras ademas de un conversor de temperaturas de Kelvin a Celsius, Fahrenheit a Kelvin,Celsius a Farenheit
y su codigo es el siguiente

creamos una lista con los posbiles valores para nuestra lista despegable tanto para la primera pregunta
## Object[] possibleValues = { "Conversor de moneda", "Conversor de Temperatura"};
para la segunda pregunta segun la opcion

              Object[] possibleValues2 = { "De Pesos a Dolar", "De Pesos a Euro","De Pesos a libra" };
		             Object[] possibleValues3 = { "De Kelvin a Celsius", "Fahrenheit a Kelvin","Celsius a Farenheit" };
     
   una vez creado nuestras lista , inicializamos nuestro dialogo con un JOptionPane.showInputDialog en la que realizaremos la comparacion
    de la primera lista possibleValues , este dialogo lo guardaremos con una varible de tipo Object llamada selectedValue 
    que nos permitira guardar la opcion escogida 
		 
     Object selectedValue = JOptionPane.showInputDialog(null,
		             "Elige una opción de conversión",null,
		             JOptionPane.INFORMATION_MESSAGE, null,
		             possibleValues, possibleValues[0]);
              
        while(resp==0) {

  comparamos el selectvalue es igual a las opciones de la lista para seguir con las funciones de esta opcion.
  
			 	        if(selectedValue=="Conversor de moneda") {
			 		    valor2 = JOptionPane.showInputDialog(null,"Ingresa la cantidad que deseas convertir:");
			 		 
        
  validamos que lo ingresado por el input y que esta guardado es valor 2 es un numero con el Metodo isNumber
 				
		 if(valor2!=null) {
			 	while(!isNumber(valor2)) {
			 			JOptionPane.showMessageDialog(null, "Por favor digite un numero", "Por favor digite un numero", JOptionPane.ERROR_MESSAGE);
			 			valor2 = JOptionPane.showInputDialog(null,"Ingresa la cantidad que deseas convertir:");
			 }}
			 		else {
			 			break;
			 		}

  una vez validado que sea numero , se convierte a el texto (String) ingresado en el input a numero
    
			 		valor1= Integer.parseInt(valor2);

   y realizamos como en el panel inicial la eleccion de las opciones 
   
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

  mostramos el mensaje con los valores guardados en conversor y factor
    
			  		JOptionPane.showInternalMessageDialog(null,"Equivale a "+ conversor+" "+factor, 
				             "información", JOptionPane.INFORMATION_MESSAGE);
 
 esta linea nos permite determinar si cerramos nuestro ciclo basados en la opcion que escojamos , donde es 0 es yes, 1 es not y 2 es cancelar
 nuestros ciclo se cierra con el numero 1 o 2. ver linea 22.
 
			  		resp =JOptionPane.showConfirmDialog(null, "¿Deseas Continuar?:",
			                "Blog masqueprogramar", JOptionPane.YES_NO_CANCEL_OPTION,
			                JOptionPane.INFORMATION_MESSAGE, null);
		 }

   lo mismo para la temperatura
		 
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
una vez se cierre el ciclo de la linea 22 , termina nuestro programa

			 JOptionPane.showInternalMessageDialog(null, "Programa Terminado", 
		 
	             "información", JOptionPane.INFORMATION_MESSAGE);
	
		 }}

este metodo nos permite validar si lo que ingresa en nuestro input es de tipo numerico
	
 	private static boolean isNumber(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

    

