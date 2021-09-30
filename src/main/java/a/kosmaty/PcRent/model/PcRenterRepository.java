package a.kosmaty.PcRent.model;

import a.kosmaty.PcRent.pc.Cpu;

import a.kosmaty.PcRent.pc.PcRenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface PcRenterRepository extends JpaRepository<PcRenter, Integer> {
}

