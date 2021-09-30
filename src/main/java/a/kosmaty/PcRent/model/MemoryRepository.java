package a.kosmaty.PcRent.model;

import a.kosmaty.PcRent.pc.Cpu;
import a.kosmaty.PcRent.pc.Memory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource
public interface MemoryRepository extends JpaRepository<Memory, Integer> {

}
