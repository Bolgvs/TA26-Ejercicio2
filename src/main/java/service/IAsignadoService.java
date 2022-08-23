package service;

import java.util.List;

import dto.Asignado;

public interface IAsignadoService {
	
	public List<Asignado> listarAsignado();
	
	public Asignado guardarAsignado(Asignado asignado);
	
	public Asignado asignado(int id);
	
	public Asignado actualizarAsignado(Asignado asignado);
	
	public void eliminarAsignado(int id);
	
}
