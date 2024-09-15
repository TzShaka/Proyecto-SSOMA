package pe.edu.upeu.departamento.ssoma.controlador;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.departamento.ssoma.dtos.PersonaDTO;
import pe.edu.upeu.departamento.ssoma.mappers.PersonaMapper;
import pe.edu.upeu.departamento.ssoma.servicio.PersonaService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/persona")
public class PersonaController {
    private final PersonaService personaService;
    private final PersonaMapper personaMapper;

    @GetMapping("/list")
    public ResponseEntity<List<PersonaDTO>> findAll() {
        List<PersonaDTO> p=personaMapper.toDTOs(personaService.findAll());
        return ResponseEntity.ok(p);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<PersonaDTO> findByPersona(@PathVariable Long id) {
        PersonaDTO p=personaMapper.toDTO(personaService.findById(id));
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardar(@Valid @RequestBody PersonaDTO persona) {
        personaService.save(personaMapper.toEntity(persona));
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        personaService.delete(id);
    }
}
