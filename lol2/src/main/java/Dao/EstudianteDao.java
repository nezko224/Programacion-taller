package Dao;

import java.util.List;
import Model.Estudiante;

public interface EstudianteDao {
    void insertarEstudiante(Estudiante e);
    Estudiante listarPorId(int id);
    List<Estudiante> listarTodo();
    void eliminar(Estudiante e);
    void actualizar(Estudiante e);
}
