package pe.edu.upeu.departamento.ssoma.repositorio;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.departamento.ssoma.modelo.Persona;

@Repository
public interface PersonaRepository extends CrudGenericoRepository<Persona, Long>{
}
