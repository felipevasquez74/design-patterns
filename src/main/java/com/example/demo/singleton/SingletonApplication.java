package com.example.demo.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		System.out.println("Si ves el mismo valor, quiere decir que la instancia de singleton fue usada nuevamente" +
				"\n" + "Si ves un valor diferente, quiere decir que se creo una nueva instancia de la clase singleton" +
				"\n" + "RESULTADO: ");
		Singleton singleton = Singleton.getInstance("Instancia 1");
		Singleton singleton2 = Singleton.getInstance("Instancia 2");
		System.out.println(singleton.value);
		System.out.println(singleton2.value);

	}
}