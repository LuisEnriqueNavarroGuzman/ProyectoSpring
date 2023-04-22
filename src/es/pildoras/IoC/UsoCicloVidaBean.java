package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		//Carga de XML de configuración 
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		//Obtención del bean
		Empleados juan =  contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(juan.getInforme());
		//cerrar el contexto
		contexto.close();
		
	}

}
