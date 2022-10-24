package com.backend.portfoliobackend.Security.repository;

import com.backend.portfoliobackend.Security.entity.Rol;
import com.backend.portfoliobackend.Security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre (RolNombre rolNombre);
}
