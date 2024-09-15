package pe.edu.upeu.departamento.ssoma.mappers;

import org.mapstruct.Mapper;
import pe.edu.upeu.departamento.ssoma.dtos.AccidenteDTO;
import pe.edu.upeu.departamento.ssoma.modelo.Accidente;

@Mapper(componentModel = "spring")
public interface AccidenteMapper extends GenericMapper<AccidenteDTO, Accidente> {
}
