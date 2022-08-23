package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Asignado;

public interface IAsignadoDAO extends JpaRepository<Asignado, Integer> {

}