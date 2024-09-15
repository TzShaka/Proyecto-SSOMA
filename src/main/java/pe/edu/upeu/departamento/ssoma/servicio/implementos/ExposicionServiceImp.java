package pe.edu.upeu.departamento.ssoma.servicio.implementos;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.departamento.ssoma.modelo.Exposicion;
import pe.edu.upeu.departamento.ssoma.repositorio.CrudGenericoRepository;
import pe.edu.upeu.departamento.ssoma.servicio.ExposicionService;

@Service
@Transactional
@RequiredArgsConstructor
public class ExposicionServiceImp extends CrudGenericoServiceImp<Exposicion,Long> implements ExposicionService {
    @Override
    protected CrudGenericoRepository<Exposicion, Long> getRepo() {
        return null;
    }
}
