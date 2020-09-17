package cz.ropek.auto.dao;

import java.util.List;

import cz.ropek.auto.entity.Auto;

public interface AutoDAO {

	public List<Auto> findAll();

	public Auto findById(int theId);

	public void save(Auto auto);

	public void deleteById(int theId);

}
