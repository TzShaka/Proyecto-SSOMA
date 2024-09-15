package pe.edu.upeu.departamento.ssoma.servicio.implementos;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.departamento.ssoma.modelo.Capacitacion;
import pe.edu.upeu.departamento.ssoma.repositorio.CrudGenericoRepository;
import pe.edu.upeu.departamento.ssoma.servicio.CapacitacionService;

@Service
@Transactional
@RequiredArgsConstructor
public class CapacitacionServiceImp extends CrudGenericoServiceImp<Capacitacion, Long> implements CapacitacionService {
    @Override
    protected CrudGenericoRepository<Capacitacion, Long> getRepo() {
        return null;
    }
}
