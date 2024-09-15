package pe.edu.upeu.departamento.ssoma.servicio.implementos;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.departamento.ssoma.modelo.Examen;
import pe.edu.upeu.departamento.ssoma.repositorio.CrudGenericoRepository;
import pe.edu.upeu.departamento.ssoma.servicio.ExamenService;

@Service
@Transactional
@RequiredArgsConstructor
public class ExamenServiceImp extends CrudGenericoServiceImp<Examen, Long> implements ExamenService {
    @Override
    protected CrudGenericoRepository<Examen, Long> getRepo() {
        return null;
    }
}
