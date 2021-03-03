package com.example.repository;

import com.example.models.Erole;
import com.example.models.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tnhncn
 */


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(Erole name);

}
