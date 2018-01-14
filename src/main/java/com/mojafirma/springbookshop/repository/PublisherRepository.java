package com.mojafirma.springbookshop.repository;

import com.mojafirma.springbookshop.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublisherRepository extends JpaRepository<Publisher, Long>{

    public Optional<Publisher> findById(Long id);
}
