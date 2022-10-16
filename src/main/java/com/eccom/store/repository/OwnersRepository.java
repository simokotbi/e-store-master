package com.eccom.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eccom.store.model.Owner;

public interface OwnersRepository extends JpaRepository<Owner, Long> {
    
}
