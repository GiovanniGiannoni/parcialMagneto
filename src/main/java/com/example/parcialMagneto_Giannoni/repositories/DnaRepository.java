package com.example.parcialMagneto_Giannoni.repositories;


import com.example.parcialMagneto_Giannoni.entities.Dna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DnaRepository extends JpaRepository<Dna, Long> {
    Dna findByDna(String dna);
    long countByMutant(boolean mutant);
}
