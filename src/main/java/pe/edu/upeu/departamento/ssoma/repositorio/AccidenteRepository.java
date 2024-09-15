package pe.edu.upeu.departamento.ssoma.repositorio;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.departamento.ssoma.modelo.Accidente;

@Repository
public interface AccidenteRepository extends CrudGenericoRepository<Accidente, Long>{
}
