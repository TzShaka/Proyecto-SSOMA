package pe.edu.upeu.departamento.ssoma.mappers;

import org.mapstruct.Mapper;
import pe.edu.upeu.departamento.ssoma.dtos.CapacitacionDTO;
import pe.edu.upeu.departamento.ssoma.modelo.Capacitacion;

@Mapper(componentModel = "spring")
public interface CapacitacionMapper extends GenericMapper<CapacitacionDTO, Capacitacion> {
}
