package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Empleados Empleado1 = new DirectorEmpleado();
		  System.out.println(Empleado1.getTareas());
		*/
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado juan =  contexto.getBean("miEmpleado", DirectorEmpleado.class);
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		System.out.println(juan.getEmail());
		System.out.println(juan.getNombreEmpresa());

		/*
		SecretarioEmpleado maria =  contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(maria.getTareas());
		System.out.println(maria.getInforme());
		System.out.println(maria.getEmail());
		System.out.println(maria.getNombreEmpresa());
		*/
		contexto.close();
	
	}

}
