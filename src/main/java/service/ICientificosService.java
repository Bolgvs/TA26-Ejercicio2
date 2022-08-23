package service;

import java.util.List;

import dto.Cientificos;

public interface ICientificosService {
	
	public List<Cientificos> listarCientificos();
	
	public Cientificos guardarCientificos(Cientificos cientificos);
	
	public Cientificos cientificos(int id);
	
	public Cientificos actualizarCientificos(Cientificos cientificos);
	
	public void eliminarCientificos(int id);
	
}
