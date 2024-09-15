package pe.edu.upeu.departamento.ssoma.dtos;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonaDTO {
    private Long id;

    @NotNull(message = "El nombre completo es requerido")
    @Size(min = 3, max = 100, message = "El nombre completo debe tener entre 3 y 100 caracteres")
    private String nombreCompleto;

    @NotNull(message = "El apellido completo es requerido")
    @Size(min = 3, max = 100, message = "El apellido completo debe tener entre 3 y 100 caracteres")
    private String apellidoCompleto;

    @NotNull(message = "El DNI es requerido")
    @Pattern(regexp = "^[0-9]{8}$", message = "El DNI debe tener 8 dígitos numéricos")
    private String dni;

    @NotNull(message = "La fecha de nacimiento es requerida")
    @Past(message = "La fecha de nacimiento no puede ser en el futuro")
    private LocalDate fechaNacimiento;

    @NotNull(message = "El correo electrónico es requerido")
    @Email(message = "El correo electrónico debe tener un formato válido")
    private String correo;

    @NotNull(message = "El teléfono es requerido")
    @Pattern(regexp = "^[0-9]{9}$", message = "El teléfono debe tener 9 dígitos numéricos")
    private String telefono;

    @NotNull(message = "La dirección es requerida")
    @Size(min = 5, max = 100, message = "La dirección debe tener entre 5 y 100 caracteres")
    private String direccion;

    @NotNull(message = "La matrícula es requerida")
    @Size(min = 3, max = 30, message = "La matrícula debe tener entre 3 y 30 caracteres")
    private String matricula;

    @NotNull(message = "La fecha de contratación es requerida")
    @Past(message = "La fecha de contratación no puede ser en el futuro")
    private LocalDate fecha;

    @NotNull(message = "La persona a la que se realizó el examen es requerida")
    private PersonaDTO personaDtoId;
}
