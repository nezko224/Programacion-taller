package Service;

import Dao.PouDao;
import Dao.DaoImpl.PouDaoImp;
import Model.Pou;

public class PouService {

    private final PouDao estudianteDao;

    public PouService() {
        this.estudianteDao = new PouDaoImp();
    }

    public void registrar(String nombre, String apellido, int dni, String curso) {
        Pou e = new Pou(nombre, apellido, dni, curso);
        estudianteDao.insertarEstudiante(e);
    }
}
