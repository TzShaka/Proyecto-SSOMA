package pe.edu.upeu.departamento.ssoma.servicio.implementos;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.departamento.ssoma.modelo.Persona;
import pe.edu.upeu.departamento.ssoma.repositorio.CrudGenericoRepository;
import pe.edu.upeu.departamento.ssoma.servicio.PersonaService;

@Service
@Transactional
@RequiredArgsConstructor
public class PersonaServiceImp extends CrudGenericoServiceImp<Persona, Long> implements PersonaService {
    @Override
    protected CrudGenericoRepository<Persona, Long> getRepo() {
        return null;
    }
}
