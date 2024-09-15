package pe.edu.upeu.departamento.ssoma.mappers;

import org.mapstruct.Mapper;
import pe.edu.upeu.departamento.ssoma.dtos.ExposicionDTO;
import pe.edu.upeu.departamento.ssoma.modelo.Exposicion;

@Mapper(componentModel = "spring")
public interface ExposicionMapper extends GenericMapper<ExposicionDTO, Exposicion> {
}
