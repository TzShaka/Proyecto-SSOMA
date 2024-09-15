package pe.edu.upeu.departamento.ssoma.mappers;

import org.mapstruct.Mapper;
import pe.edu.upeu.departamento.ssoma.dtos.PuestoDTO;
import pe.edu.upeu.departamento.ssoma.modelo.Puesto;

@Mapper(componentModel = "spring")
public interface PuestoMapper extends GenericMapper<PuestoDTO, Puesto>{
}
