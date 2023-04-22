package es.pildoras.IoC;

public class JefeEmpleado implements Empleados{
	//Creación de campo tipo CreaciónInforme (interfaz)
	private CreacionInformes informeNuevo;
	//Creación de constructor que inyecta la depedencia
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	public String getTareas() {
		
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}

}
