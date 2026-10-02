package com.ifpb.cz.sinanapi.controller;

import com.ifpb.cz.sinanapi.dto.NotificationRequestDTO;
import com.ifpb.cz.sinanapi.dto.NotificationResponseDTO;
import com.ifpb.cz.sinanapi.service.NotificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notificacao")
public class NotificationController {

    private final NotificationService service;

    public NotificationController(NotificationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<NotificationResponseDTO> create(@RequestBody NotificationRequestDTO dto) {
        var saved = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(NotificationResponseDTO.fromEntity(saved));
    }

    @GetMapping
    public ResponseEntity<List<NotificationResponseDTO>> findAll(
            @RequestParam(required = false, defaultValue = "false") boolean duplicadas,
            @RequestParam(required = false) String agravo,
            @RequestParam(required = false) String paciente) {

        List<NotificationResponseDTO> result = service.findAll(duplicadas, agravo, paciente)
                .stream()
                .map(NotificationResponseDTO::fromEntity)
                .toList();

        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotificationResponseDTO> findById(@PathVariable Long id) {
        var notification = service.findById(id);
        return ResponseEntity.ok(NotificationResponseDTO.fromEntity(notification));
    }

    @PutMapping("/{id}")
    public ResponseEntity<NotificationResponseDTO> update(@PathVariable Long id, @RequestBody NotificationRequestDTO dto) {
        var updated = service.update(id, dto);
        return ResponseEntity.ok(NotificationResponseDTO.fromEntity(updated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}