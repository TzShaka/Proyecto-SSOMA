package pe.edu.upeu.departamento.ssoma.controlador;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.departamento.ssoma.dtos.ExposicionDTO;
import pe.edu.upeu.departamento.ssoma.mappers.ExposicionMapper;
import pe.edu.upeu.departamento.ssoma.servicio.ExposicionService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/exposicion")
public class ExposicionController {
    private final ExposicionService exposicionService;
    private final ExposicionMapper exposicionMapper;

    @GetMapping("/list")
    public ResponseEntity<List<ExposicionDTO>> findAll() {
        List<ExposicionDTO> p=exposicionMapper.toDTOs(exposicionService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<ExposicionDTO> findByExposicion(@PathVariable Long id) {
        ExposicionDTO p=exposicionMapper.toDTO(exposicionService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody ExposicionDTO exposicion) {
        exposicionService.save(exposicionMapper.toEntity(exposicion));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        exposicionService.delete(id);
    }
}
