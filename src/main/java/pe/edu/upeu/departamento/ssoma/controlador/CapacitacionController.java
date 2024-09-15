package pe.edu.upeu.departamento.ssoma.controlador;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.departamento.ssoma.dtos.CapacitacionDTO;
import pe.edu.upeu.departamento.ssoma.mappers.CapacitacionMapper;
import pe.edu.upeu.departamento.ssoma.servicio.CapacitacionService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/capacitacion")
public class CapacitacionController {
    private final CapacitacionService capacitacionService;
    private final CapacitacionMapper capacitacionMapper;

    @GetMapping("/list")
    public ResponseEntity<List<CapacitacionDTO>> findAll() {
        List<CapacitacionDTO> p=capacitacionMapper.toDTOs(capacitacionService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<CapacitacionDTO> findByCapacitacion(@PathVariable Long id) {
        CapacitacionDTO p=capacitacionMapper.toDTO(capacitacionService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody CapacitacionDTO capacitacion) {
        capacitacionService.save(capacitacionMapper.toEntity(capacitacion));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        capacitacionService.delete(id);
    }
}
