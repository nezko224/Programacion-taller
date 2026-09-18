package Dao;

import java.util.List;
import Model.Pou;

public interface PouDao {
    void insertarEstudiante(Pou e);
    Pou listarPorId(int id);
    List<Pou> listarTodo();
    void eliminar(Pou e);
    void actualizar(Pou e);
}
