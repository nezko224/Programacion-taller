package Dao;

import java.util.List;
import Model.Empleado;

public interface EmpleadoDao {
    void Crear(Empleado e);
    Empleado listarPorId(int id);
    List<Empleado> listarTodo();
    void actualizar(Empleado e);
	void eliminar(int id);
	Empleado listarPorDni(int dni);
}
