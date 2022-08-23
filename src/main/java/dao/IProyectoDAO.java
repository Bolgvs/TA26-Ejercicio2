package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, Integer> {

}