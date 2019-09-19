package upc.edu.upc.servideimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import upc.edu.upc.dao.IMotorDao;
import upc.edu.upc.entity.Motor;
import upc.edu.upc.service.IMotorService;


@Named
@RequestScoped
public class MotorServiceImpl implements IMotorService, Serializable {
	private static final long serialVersionUID = 1L;
    @Inject
    private IMotorDao mD;
	@Override
	public void insertar(Motor motor) {
		mD.insertar(motor);	
	}

	@Override
	public List<Motor> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idMotor) {
		mD.eliminar(idMotor);
		
	}
}
