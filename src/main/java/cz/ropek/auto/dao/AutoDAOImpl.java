package cz.ropek.auto.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.ropek.auto.entity.Auto;

@Repository
public class AutoDAOImpl implements AutoDAO {

	private EntityManager entityManager;

	@Autowired
	public AutoDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Auto> findAll() {

		Session currentSession = entityManager.unwrap(Session.class);

		Query<Auto> theQuery = currentSession.createQuery("from Auto", Auto.class);

		List<Auto> auto = theQuery.getResultList();

		return auto;
	}

	@Override
	public Auto findById(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);

		Auto auto = currentSession.get(Auto.class, theId);

		return auto;
	}

	@Override
	public void save(Auto auto) {

		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(auto);
	}

	@Override
	public void deleteById(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);

		Query theQuery = currentSession.createQuery("delete from Auto where id=:ID");
		theQuery.setParameter("ID", theId);

		theQuery.executeUpdate();
	}

}
