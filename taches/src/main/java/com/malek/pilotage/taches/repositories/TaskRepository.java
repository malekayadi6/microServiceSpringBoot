package com.malek.pilotage.taches.repositories;

import com.malek.pilotage.taches.entities.Task;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task , Long> {
    @Query("select t from Task t where t.nomTask like :mc")
     public Page<Task> tasksByMc(@Param("mc") String mc , Pageable pageable);
}
