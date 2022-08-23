package service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ICientificosDAO;
import dto.Cientificos;

@Service
public class CientificosServiceImpl implements ICientificosService{

	@Autowired
	ICientificosDAO iCientificosDAO;

	@Override
	public List<Cientificos> listarCientificos() {
		return iCientificosDAO.findAll();
	}

	@Override
	public Cientificos guardarCientificos(Cientificos cientificos) {
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public Cientificos cientificos(int id) {
		return iCientificosDAO.findById(id).get();
	}

	@Override
	public Cientificos actualizarCientificos(Cientificos cientificos) {
		return iCientificosDAO.save(cientificos);
	}

	@Override
	public void eliminarCientificos(int id) {
		iCientificosDAO.deleteById(id);
	}
}
