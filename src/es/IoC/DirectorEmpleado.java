package es.IoC;

public class DirectorEmpleado implements Empleados {
	
		//Creación de campo tipo creación informe
		private CreacionInformes informeNuevo;
		
		private String email;
		
		private String nombreEmpresa;
		
		//Creación de constructor que inyecta la dependencia
		public DirectorEmpleado(CreacionInformes informeNuevo) {
			this.informeNuevo=informeNuevo;
		}
		
		@Override
		public String getTareas() {
			// TODO Auto-generated method stub
			return "Gestionar la plantilla de la empresa";
		}

		@Override
		public String getInforme() {
			// TODO Auto-generated method stub
			return "Informe creado por el Secretario: " + informeNuevo.getInforme();
		}

		//Getters y Setters
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getNombreEmpresa() {
			return nombreEmpresa;
		}

		public void setNombreEmpresa(String nombreEmpresa) {
			this.nombreEmpresa = nombreEmpresa;
		}
		
		//método init. Ejecutar tareas antes de que el bean esté disponible
		
		public void metodoInicial() {
			System.out.println("Dentro del método init, aquí irían las tareas a ejecutar antes de que el bean esté listo");
		}
		
		//método destroy. Ejecutar tareas después de que el bean haya sido utilizado
		
		public void metodoFinal() {
			System.out.println("Dentro del método init, aquí irían las tareas a ejecutar después de ejecutar el bean");
		}
}
