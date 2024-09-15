package pe.edu.upeu.departamento.ssoma.dtos;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PuestoDTO {
    private Long id;
    @NotNull
    @Size(min = 5, max = 40,message = "minimo 5 caracteres ")
    private String nombrePuesto;

}
