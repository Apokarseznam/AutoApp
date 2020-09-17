package cz.ropek.auto.service;

import java.util.List;

import cz.ropek.auto.entity.Auto;

public interface AutoService {

	public List<Auto> findAll();

	public Auto findById(int theId);

	public void save(Auto auto);

	public void deleteById(int theId);

}
