package pe.edu.upeu.departamento.ssoma.dtos;


import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccidenteDTO {
    private Long id;

    @NotNull(message = "La fecha del accidente es requerida")
    @Past(message = "La fecha del accidente debe ser anterior a la fecha actual")
    private LocalDate fecha;

    @NotNull(message = "La descripción del accidente es requerida")
    @Size(min = 20, max = 100,message = "minimo 20 caracteres ")
    private String descripcion;

    @NotNull(message = "El tipo de accidente es requerido")
    @Size(min = 5, max = 50,message = "minimo 5 caracteres ")
    private String tipo;

    @NotNull(message = "El lugar del accidente es requerido")
    @Size(min = 5, max = 100,message = "minimo 5 caracteres ")
    private String lugar;

    @NotNull(message = "La persona involucrada es requerida")
    private PersonaDTO personaDtoId;
}
