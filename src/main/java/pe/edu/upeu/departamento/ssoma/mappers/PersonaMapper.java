package pe.edu.upeu.departamento.ssoma.mappers;

import org.mapstruct.Mapper;
import pe.edu.upeu.departamento.ssoma.dtos.PersonaDTO;
import pe.edu.upeu.departamento.ssoma.modelo.Persona;

@Mapper(componentModel = "spring")
public interface PersonaMapper extends GenericMapper<PersonaDTO, Persona> {
}
