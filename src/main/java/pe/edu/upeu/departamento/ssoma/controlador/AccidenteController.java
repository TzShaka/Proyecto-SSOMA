package pe.edu.upeu.departamento.ssoma.controlador;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.departamento.ssoma.dtos.AccidenteDTO;
import pe.edu.upeu.departamento.ssoma.mappers.AccidenteMapper;
import pe.edu.upeu.departamento.ssoma.servicio.AccidenteService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/accidente")
public class AccidenteController {
    private final AccidenteService accidenteService;
    private final AccidenteMapper accidenteMapper;

    @GetMapping("/list")
    public ResponseEntity<List<AccidenteDTO>> findAll() {
        List<AccidenteDTO> p=accidenteMapper.toDTOs(accidenteService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<AccidenteDTO> findByAccidente(@PathVariable Long id) {
        AccidenteDTO p=accidenteMapper.toDTO(accidenteService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody AccidenteDTO accidente) {
        accidenteService.save(accidenteMapper.toEntity(accidente));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        accidenteService.delete(id);
    }
}
