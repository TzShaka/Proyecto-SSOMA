package pe.edu.upeu.departamento.ssoma.controlador;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.departamento.ssoma.dtos.PuestoDTO;
import pe.edu.upeu.departamento.ssoma.mappers.PuestoMapper;
import pe.edu.upeu.departamento.ssoma.servicio.PuestoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/puesto")
public class PuestoController {
    private final PuestoService puestoService;
    private final PuestoMapper puestoMapper;

    @GetMapping("/list")
    public ResponseEntity<List<PuestoDTO>> findAll() {
        List<PuestoDTO> p=puestoMapper.toDTOs(puestoService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<PuestoDTO> findByPeriodo(@PathVariable Long id) {
        PuestoDTO p=puestoMapper.toDTO(puestoService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody PuestoDTO puesto) {
        puestoService.save(puestoMapper.toEntity(puesto));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        puestoService.delete(id);
    }


}
