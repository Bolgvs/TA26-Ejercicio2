package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IAsignadoDAO;
import dto.Asignado;

@Service
public class AsignadoServiceImpl implements IAsignadoService{

	@Autowired
	IAsignadoDAO iAsignadoDAO;

	@Override
	public List<Asignado> listarAsignado() {
		return iAsignadoDAO.findAll();
	}

	@Override
	public Asignado guardarAsignado(Asignado asignado) {
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public Asignado asignado(int id) {
		return iAsignadoDAO.findById(id).get();
	}

	@Override
	public Asignado actualizarAsignado(Asignado asignado) {
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public void eliminarAsignado(int id) {
		iAsignadoDAO.deleteById(id);
	}
}
