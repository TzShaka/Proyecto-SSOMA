package pe.edu.upeu.departamento.ssoma.modelo;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "ssoma_persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_completo",length = 100, nullable = false)
    private String nombreCompleto;
    @Column(name = "apellido_completo",length = 100, nullable = false)
    private String apellidoCompleto;
    @Column(name = "dni",length = 8, nullable = false)
    private String dni;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Basic(optional = false)
    @Column(name = "fecha_nacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate fechaNacimiento;

    @Column(name = "correo",length = 100, nullable = false)
    private String correo;
    @Column(name = "telefono",length = 9, nullable = false)
    private String telefono;
    @Column(name = "direccion",length = 100, nullable = false)
    private String direccion;
    @Column(name = "matricula",length = 30, nullable = false)
    private String matricula;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Basic(optional = false)
    @Column(name = "fecha_contratacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate  fechaContratacion;

    @JoinColumn(name = "puesto_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Puesto puestoId;

}
