package pe.edu.upeu.departamento.ssoma.repositorio;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.departamento.ssoma.modelo.Examen;

@Repository
public interface ExamenRepository extends CrudGenericoRepository<Examen, Long>{
}
