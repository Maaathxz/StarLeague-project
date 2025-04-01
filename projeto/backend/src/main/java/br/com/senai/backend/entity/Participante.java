package br.com.senai.backend.entity;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;





@Data
@NoArgsConstructor
@Entity
public class Participante{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;


    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;
    

    @OneToMany(mappedBy = "participante", cascade = CascadeType.ALL)
    private List<EntrarEquipe> entrarequipes = new ArrayList<>();

}