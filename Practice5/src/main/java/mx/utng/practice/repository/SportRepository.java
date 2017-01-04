package mx.utng.practice.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Customer;
import mx.utng.practice.model.Sport;

@Repository
public interface SportRepository extends JpaRepository<Sport, Long>{
	@Query("select sport from Sport sport")
	public List<Sport> findAll();

}
