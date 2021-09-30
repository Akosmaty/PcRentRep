package a.kosmaty.PcRent.controller;


import a.kosmaty.PcRent.model.CpuRepository;
import a.kosmaty.PcRent.model.MemoryRepository;
import a.kosmaty.PcRent.model.PcRenterRepository;

import a.kosmaty.PcRent.model.ProcesorRepository;
import a.kosmaty.PcRent.pc.PcRenter;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class PcRenterController {
    private PcRenterRepository repository;
    private MemoryRepository memoryRepository;
    private ProcesorRepository procesorRepository;
    private CpuRepository cpuRepository;




    @Transactional
    @PatchMapping("/PcRenters/{id}")
    public ResponseEntity<?> toggleTask(@PathVariable int id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        int memid = repository.findById(id).get().getIdmem();
        repository.findById(id)
                .ifPresent(pcRenter -> pcRenter.setMemprice(memoryRepository.findById(memid).get().getPrice()));
        int cpuid = repository.findById(id).get().getIdcpu();
        repository.findById(id)
                .ifPresent(pcRenter -> pcRenter.setCpuprice(cpuRepository.findById(cpuid).get().getPrice()));
        int prcid = repository.findById(id).get().getIdprc();
        repository.findById(id)
                .ifPresent(pcRenter -> pcRenter.setPrcprice(procesorRepository.findById(prcid).get().getPrice()));

        repository.findById(id).ifPresent(pcRenter -> pcRenter.setFullprice(
                pcRenter.getCpuprice()+ pcRenter.getMemprice()+pcRenter.getPrcprice()
        ));
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/PcRenters/{id}")
   ResponseEntity<PcRenter> readPcRenters(@PathVariable int id){
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }

}
