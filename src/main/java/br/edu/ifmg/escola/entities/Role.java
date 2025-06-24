package br.edu.ifmg.escola.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
@Table(name = "tb_role")
public class Role {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull // entra no construtor required
    private String authority;

}
