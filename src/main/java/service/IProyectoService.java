package service;

import java.util.List;

import dto.Proyecto;

public interface IProyectoService {

			public List<Proyecto> listarProyecto();
			
			public Proyecto guardarProyecto(Proyecto proyecto);	
			
			public Proyecto proyecto(int id); 
			
			public Proyecto actualizarProyecto(Proyecto proyecto);
			
			public void eliminarProyecto(int id);
			
}