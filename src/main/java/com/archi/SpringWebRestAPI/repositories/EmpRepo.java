package com.archi.SpringWebRestAPI.repositories;

import com.archi.SpringWebRestAPI.entities.EmpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<EmpEntity,Long> {
}
