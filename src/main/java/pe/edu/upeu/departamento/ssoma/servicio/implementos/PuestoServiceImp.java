package pe.edu.upeu.departamento.ssoma.servicio.implementos;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.departamento.ssoma.modelo.Puesto;
import pe.edu.upeu.departamento.ssoma.repositorio.CrudGenericoRepository;
import pe.edu.upeu.departamento.ssoma.repositorio.PuestoRepository;
import pe.edu.upeu.departamento.ssoma.servicio.PuestoService;

@Service
@Transactional
@RequiredArgsConstructor
public class PuestoServiceImp extends CrudGenericoServiceImp<Puesto, Long> implements PuestoService {
    private final PuestoRepository repo;
    @Override
    protected CrudGenericoRepository<Puesto, Long> getRepo() {
        return repo;
    }

}
