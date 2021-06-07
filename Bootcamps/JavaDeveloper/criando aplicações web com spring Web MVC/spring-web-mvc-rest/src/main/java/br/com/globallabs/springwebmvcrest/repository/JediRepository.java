package br.com.globallabs.springwebmvcrest.repository;

import java.util.List;

import br.com.globallabs.springwebmvcrest.model.Jedi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JediRepository extends JpaRepository<Jedi, Long> {

    List<Jedi> findByNameContainingIgnoreCase(final String name);

}
