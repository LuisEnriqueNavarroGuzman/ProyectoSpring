package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Carga de XML de configuración 
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		//Petición de bean al contenedor de spring
		SecretarioEmpleado maria =  contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado pedro =  contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(maria);
		System.out.println(pedro);
		if(maria == pedro) System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");
	}

}
