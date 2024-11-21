package entity;

import builder.DossierBuilder;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class DossierMutuelle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomAssure;
    private String numeroAffiliation;
    private String immatriculation;
    private String lienParente;
    private double montantTotalFrais;
    private double prixConsultation;
    private int nombrePiecesJointes;
    private Date dateConsultation;
    private Date dateDepot;

    @ElementCollection
    private List<Traitement> traitements;

    public DossierMutuelle(DossierBuilder builder) {
        this.nomAssure = builder.nomAssure;
        this.numeroAffiliation = builder.numeroAffiliation;
        this.immatriculation = builder.immatriculation;
        this.lienParente = builder.lienParente;
        this.montantTotalFrais = builder.montantTotalFrais;
        this.prixConsultation = builder.prixConsultation;
        this.nombrePiecesJointes = builder.nombrePiecesJointes;
        this.dateConsultation = builder.dateConsultation;
        this.dateDepot = builder.dateDepot;
        this.traitements = builder.traitements;
    }

    protected DossierMutuelle() {
        // Nécessaire pour JPA
    }

    // getters
    public String getNomAssure() {

        return nomAssure;
    }

    public String getNumeroAffiliation() {

        return numeroAffiliation;
    }

    public String getImmatriculation() {

        return immatriculation;
    }

    public Date getDateConsultation() {

        return dateConsultation;
    }

    public Date getDateDepot() {

        return dateDepot;
    }

    public List<Traitement> getTraitements() {

        return traitements;
    }

    public String getLienParente() {

        return lienParente;
    }

    public double getMontantTotalFrais() {

        return montantTotalFrais;
    }
    public void setMontantTotalFrais(double montantTotalFrais) {
        this.montantTotalFrais = montantTotalFrais;
    }
    public double getPrixConsultation() {

        return prixConsultation;
    }

    public int getNombrePiecesJointes() {

        return nombrePiecesJointes;
    }
}
