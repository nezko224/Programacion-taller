package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Dao.EstudianteDao;
import Model.Estudiante;

public class EstudianteDaoImp implements EstudianteDao {

    private final String url = "jdbc:mysql://localhost:3307/estudiante?useSSL=false&serverTimezone=UTC";
    private final String usuario = "root";
    private final String password = "";
    private Connection conexion() throws SQLException {
        return DriverManager.getConnection(url, usuario, password);
    }

    @Override
    public void insertarEstudiante(Estudiante e) {
        String sql = "INSERT INTO alumnos (nombre, apellido, dni, curso) VALUES (?, ?, ?, ?)";

        try (
             PreparedStatement ps = conexion().prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCurso());

            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas insertadas: " + filasAfectadas);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Estudiante listarPorId(int id) {
        // TODO: implementar
        return null;
    }

    @Override
    public List<Estudiante> listarTodo() {
        // TODO: implementar
        return null;
    }

    @Override
    public void eliminar(Estudiante e) {
        // TODO: implementar
    }

    @Override
    public void actualizar(Estudiante e) {
        // TODO: implementar
    }
}
