package repo.tareas.respositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import repo.tareas.modelo.Tarea;

public interface TareaRepositorio extends JpaRepository <Tarea, Integer> {
}
