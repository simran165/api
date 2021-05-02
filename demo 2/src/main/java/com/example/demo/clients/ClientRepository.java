package com.example.demo.clients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ClientRepository extends JpaRepository<client,Long> {
/*
    @Query("Select a from Client a where a.address = ?1")
    Optional<client> findByAdd(String address);

 */
}
