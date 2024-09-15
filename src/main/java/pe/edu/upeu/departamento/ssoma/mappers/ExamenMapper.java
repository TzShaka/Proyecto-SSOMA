package pe.edu.upeu.departamento.ssoma.mappers;

import org.mapstruct.Mapper;
import pe.edu.upeu.departamento.ssoma.dtos.ExamenDTO;
import pe.edu.upeu.departamento.ssoma.modelo.Examen;

@Mapper(componentModel = "spring")
public interface ExamenMapper extends GenericMapper<ExamenDTO, Examen> {
}
