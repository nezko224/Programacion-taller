package Service;

import java.util.List;

import Dao.EmpleadoDao;
import Dao.DaoImpl.EmpleadoDaoImp;
import Model.Empleado;

public class EmpleadoService {

    private final EmpleadoDao empleadoDao;

    public EmpleadoService() {
        this.empleadoDao = new EmpleadoDaoImp();
    }

    public void registrar(String nombre, String apellido, int dni, String cargo, double salario, boolean activo) {
        Empleado e = new Empleado(nombre, apellido, dni, cargo, salario, activo);
        EmpleadoDao.Crear(empleado e);
    }
}
