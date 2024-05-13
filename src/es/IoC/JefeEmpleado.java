package es.IoC;

public class JefeEmpleado implements Empleados {
	
	//Creación de campo tipo creación informe
	private CreacionInformes informeNuevo;
		
	public void setInformeNuevo(CreacionInformes informeNuevo) {
			this.informeNuevo = informeNuevo;
	}
	
	//Creacion de informe que inyecta la dependencia
		public JefeEmpleado(CreacionInformes informeNuevo) {
			this.informeNuevo=informeNuevo;
		}
		
	public String getTareas(){
		return "Gestiono las cuestiones relativas amis empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Jefe: " + informeNuevo.getInforme();
	}

}
