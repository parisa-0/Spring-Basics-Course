package com.example.estars;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface EstarsRepository extends JpaRepository<Estars,Long> {
}
