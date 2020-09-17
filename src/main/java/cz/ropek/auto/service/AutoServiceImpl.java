package cz.ropek.auto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.ropek.auto.dao.AutoDAO;
import cz.ropek.auto.entity.Auto;

@Service
public class AutoServiceImpl implements AutoService {

	private AutoDAO autoDAO;

	@Autowired
	public AutoServiceImpl(AutoDAO theAutoDAO) {
		autoDAO = theAutoDAO;
	}

	@Override
	@Transactional
	public List<Auto> findAll() {
		return autoDAO.findAll();
	}

	@Override
	@Transactional
	public Auto findById(int theId) {
		return autoDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Auto theAutoDAO) {
		autoDAO.save(theAutoDAO);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		autoDAO.deleteById(theId);
	}

}
