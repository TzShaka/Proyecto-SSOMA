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
@Table(name = "ssoma_exposicion")
public class Exposicion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Basic(optional = false)
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate fecha;

    @Column(name = "tipo",length = 50, nullable = false)
    private String tipo;

    @Column(name = "descripcion",length = 200, nullable = false)
    private String descripcion;

    @Column(name = "duracion",length = 40, nullable = false)
    private String duracion;

    @JoinColumn(name = "persona_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Persona personaId;

}
