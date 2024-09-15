package pe.edu.upeu.departamento.ssoma.servicio.implementos;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.departamento.ssoma.modelo.Accidente;
import pe.edu.upeu.departamento.ssoma.repositorio.AccidenteRepository;
import pe.edu.upeu.departamento.ssoma.repositorio.CrudGenericoRepository;
import pe.edu.upeu.departamento.ssoma.servicio.AccidenteService;

@Service
@Transactional
@RequiredArgsConstructor
public class AccidenteServiceImp extends CrudGenericoServiceImp<Accidente, Long> implements AccidenteService {
    private final AccidenteRepository repo;
    @Override
    protected CrudGenericoRepository<Accidente, Long> getRepo() {
        return repo;
    }


}
