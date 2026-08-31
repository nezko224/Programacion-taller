package Service;

import Dao.EstudianteDao;
import Dao.DaoImpl.EstudianteDaoImp;
import Model.Estudiante;

public class EstudianteService {

    private final EstudianteDao estudianteDao;

    public EstudianteService() {
        this.estudianteDao = new EstudianteDaoImp();
    }

    public void registrar(String nombre, String apellido, int dni, String curso) {
        Estudiante e = new Estudiante(nombre, apellido, dni, curso);
        estudianteDao.insertarEstudiante(e);
    }
}
