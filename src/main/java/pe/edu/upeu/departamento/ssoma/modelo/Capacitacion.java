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
@Table(name = "ssoma_capacitación")
public class Capacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Basic(optional = false)
    @Column(name = "fecha_nac", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate fecha;


    @Column(name = "tipo",length = 50, nullable = false)
    private String tipo;

    @Column(name = "descripcion",length = 100, nullable = false)
    private String descripcion;

    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Persona personaId;

}
