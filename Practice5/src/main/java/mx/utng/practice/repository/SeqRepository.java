package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import mx.utng.practice.model.Seq;

@Repository
public interface SeqRepository extends JpaRepository<Seq, Long> {
	@Query("select seq from Seq seq")
	public List<Seq> findAll();
}
