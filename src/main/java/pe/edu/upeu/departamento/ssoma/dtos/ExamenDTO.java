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
public class ExamenDTO {
    private Long id;

    @NotNull(message = "La fecha del examen es requerida")
    private LocalDate fecha;

    @NotNull(message = "El tipo de examen es requerido")
    @Size(min = 3, max = 50, message = "El tipo de examen debe tener entre 3 y 50 caracteres")
    private String tipo;

    @NotNull(message = "El resultado del examen es requerido")
    @Size(min = 10, max = 200, message = "El resultado del examen debe tener entre 10 y 200 caracteres")
    private String resultado;

    @NotNull(message = "La recomendación del examen es requerida")
    @Size(min = 10, max = 100, message = "La recomendación del examen debe tener entre 10 y 100 caracteres")
    private String recomendacion;

    @NotNull(message = "La persona a la que se realizó el examen es requerida")
    private PersonaDTO personaDtoId;
}
