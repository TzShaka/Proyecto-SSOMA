package pe.edu.upeu.departamento.ssoma.controlador;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.departamento.ssoma.dtos.ExamenDTO;
import pe.edu.upeu.departamento.ssoma.mappers.ExamenMapper;
import pe.edu.upeu.departamento.ssoma.servicio.ExamenService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/examen")
public class ExamenController {
    private final ExamenService examenService;
    private final ExamenMapper examenMapper;

    @GetMapping("/list")
    public ResponseEntity<List<ExamenDTO>> findAll() {
        List<ExamenDTO> p=examenMapper.toDTOs(examenService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<ExamenDTO> findByPeriodo(@PathVariable Long id) {
        ExamenDTO p=examenMapper.toDTO(examenService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody ExamenDTO examen) {
        examenService.save(examenMapper.toEntity(examen));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        examenService.delete(id);
    }
}
