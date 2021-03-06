package com.devsuperior.dslearnbds.resources;

import com.devsuperior.dslearnbds.dtos.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverResource {
    @Autowired
    private DeliverService deliverService;
    
    @PutMapping("/{id}")
    public ResponseEntity<Void> createDeliverRevision(@PathVariable Long id, @RequestBody DeliverRevisionDTO deliverRevision) {
        deliverService.createRevision(id, deliverRevision);
        return ResponseEntity.noContent().build();
    }
}
