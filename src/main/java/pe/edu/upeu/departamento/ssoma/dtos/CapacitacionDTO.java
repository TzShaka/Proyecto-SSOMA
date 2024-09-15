package pe.edu.upeu.departamento.ssoma.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CapacitacionDTO {
    private Long id;
    @NotNull(message = "La fecha de la capacitación es requerida")
    private LocalDate fecha;

    @NotNull(message = "El tipo de capacitación es requerido")
    @Size(min = 3, max = 50, message = "El tipo de capacitación debe tener entre 3 y 50 caracteres")
    private String tipo;

    @NotNull(message = "La descripción de la capacitación es requerida")
    @Size(min = 10, max = 255, message = "La descripción debe tener entre 10 y 255 caracteres")
    private String descripcion;

    @NotNull(message = "La persona a la que va dirigida la capacitación es requerida")
    private PersonaDTO personaDtoId;
}
