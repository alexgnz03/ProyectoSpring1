package es.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		
		//carga de XML de configuración
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//petición de beans al contenedor Spring
		
		SecretarioEmpleado Juan=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria);
		System.out.println(Juan);
		
		if(Maria==Juan) System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");
	}

}
