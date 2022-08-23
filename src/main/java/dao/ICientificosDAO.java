package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Cientificos;

public interface ICientificosDAO extends JpaRepository<Cientificos, Integer> {
	 
}