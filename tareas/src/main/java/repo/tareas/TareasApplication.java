package repo.tareas;

import javafx.application.Application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import repo.tareas.presentacion.SistemasTareaFx;

@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TareasApplication.class, args);
		Application.launch(SistemasTareaFx.class, args);
	}

}
