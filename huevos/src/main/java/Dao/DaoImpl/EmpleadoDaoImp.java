package Dao.DaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.EmpleadoDao;
import Model.Empleado;

public class EmpleadoDaoImp implements EmpleadoDao {

    private final String url = "jdbc:mysql://localhost:3307/globand_db?useSSL=false&serverTimezone=UTC";
    private final String usuario = "root";
    private final String password = "";
    private Connection conexion() throws SQLException {
        return DriverManager.getConnection(url, usuario, password);
    }

    @Override
    public void Crear(Empleado e) {
        String sql = "INSERT INTO empleados (nombre, apellido, dni, cargo, salario, activo) VALUES (?, ?, ?, ?, ?, ?)";

        try (
             PreparedStatement ps = conexion().prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setDouble(5, e.getSalario());
            ps.setBoolean(6, e.getActivo());

            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas insertadas: " + filasAfectadas);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Empleado listarPorId(int id) {
    	String sql = "SELECT id, nombre, apellido, dni, cargo, salario, activo FROM empleados WHERE id = ?";

        try (PreparedStatement ps = conexion().prepareStatement(sql);
        	 ResultSet rs = ps.executeQuery()) {

            ps.setInt(1, id);

            if (rs.next()) {
            	Empleado empleado = new Empleado();
            			empleado.setId(rs.getInt("id"));
            			empleado.setNombre(rs.getString("nombre"));
            			empleado.setApellido(rs.getString("apellido"));
            			empleado.setDni(rs.getInt("dni"));
            			empleado.setCargo(rs.getString("cargo"));
            			empleado.setSalario(rs.getDouble("salario"));
            			empleado.setActivo(rs.getBoolean("activo"));
            			return empleado;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Empleado> listarTodo() {
    	String sql = "SELECT id, nombre, apellido, dni, cargo, salario, activo = true FROM empleados";
        List<Empleado> lista = new ArrayList<>();

        try (PreparedStatement ps = conexion().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
            	Empleado empleado = new Empleado();
    			empleado.setId(rs.getInt("id"));
    			empleado.setNombre(rs.getString("nombre"));
    			empleado.setApellido(rs.getString("apellido"));
    			empleado.setDni(rs.getInt("dni"));
    			empleado.setCargo(rs.getString("cargo"));
    			empleado.setSalario(rs.getDouble("salario"));
                lista.add(empleado);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;
    }

    @Override
    public void eliminar(int id) {
    	String sql = "UPDATE FROM empleados SET activo = false WHERE id = ?";

        try (PreparedStatement ps = conexion().prepareStatement(sql)) {
            ps.setInt(2, id);

            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas eliminadas: " + filasAfectadas);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actualizar(Empleado e) {
        String sql = "UPDATE empleados SET nombre = ?, apellido = ?, dni = ?, cargo = ?, salario = ?, activo = ? WHERE id = ?";
        try (PreparedStatement ps = conexion().prepareStatement(sql)) {
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setDouble(5, e.getSalario());
            ps.setBoolean(6, e.getActivo());
            ps.setInt(7, e.getId());

            int filasAfectadas = ps.executeUpdate();
            System.out.println("Filas actualizadas: " + filasAfectadas);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public Empleado listarPorDni(int dni) {
        String sql = "SELECT id, nombre, apellido, dni, cargo, salario, activo FROM empleados WHERE dni = ?";

        try (PreparedStatement ps = conexion().prepareStatement(sql)) {

            ps.setInt(1, dni);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Empleado empleado = new Empleado();
                    empleado.setId(rs.getInt("id"));
                    empleado.setNombre(rs.getString("nombre"));
                    empleado.setApellido(rs.getString("apellido"));
                    empleado.setDni(rs.getInt("dni"));
                    empleado.setCargo(rs.getString("cargo"));
                    empleado.setSalario(rs.getDouble("salario"));
                    empleado.setActivo(rs.getBoolean("activo"));
                    return empleado;
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
