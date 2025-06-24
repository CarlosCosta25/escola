package br.edu.ifmg.escola.entities;

import br.edu.ifmg.escola.constants.ResourceType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)


@Entity
@Table(name = "tb_resource")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String title;
    private  String description;
    private Integer position;
    private String imgUri;
    @Enumerated(EnumType.STRING)
    private ResourceType resourceType;

    @ManyToOne
    @JoinColumn(name = "offer_id", nullable = false)
    private Offer offer;

}
