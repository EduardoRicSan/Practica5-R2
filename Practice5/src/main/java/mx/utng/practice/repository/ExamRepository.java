package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Exam;


@Repository
public interface ExamRepository extends JpaRepository <Exam, Long>{
	@Query("select exam from Exam exam")
	public List<Exam> findAll();

}
