package br.edu.ifmg.escola.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_task")
public class Task  extends Lesson{

    private String description;
    private Integer questionCount;
    private Integer approvalCount;
    private double weight;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant dueDate;

   }
