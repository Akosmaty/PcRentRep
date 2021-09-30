
package a.kosmaty.PcRent.bootstrap;

import a.kosmaty.PcRent.model.MemoryRepository;
import a.kosmaty.PcRent.model.PcRenterRepository;
import a.kosmaty.PcRent.pc.Memory;
import a.kosmaty.PcRent.pc.PcRenter;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/*
@Component
@AllArgsConstructor
public class BootstrapRunner implements CommandLineRunner {

    private final MemoryRepository memoryRepository;
    private final PcRenterRepository pcRenterRepository;

    @Override
    public void run(String... args) throws Exception {
        pcRenterRepository.deleteAll();
        memoryRepository.deleteAll();
        if(!pcRenterRepository.existsById(1)) {
            pcRenterRepository.save(PcRenter.builder()
                    .id(1)
                    .cpuprice(5)
                    .idcpu(2)
                    .idmem(3)
                    .idprc(4)
                    .memprice(10)
                    .prcprice(15)
                    .build());
        }
        if(!memoryRepository.existsById(3)) {
            memoryRepository.save(Memory.builder()
                    .id(3)
                    .mem(500)
                    .price(30)
                    .name("Memory mem 500 id3")
                    .build()
            );
        }
    }
}
*/