package builder;

import entity.DossierMutuelle;
import entity.Traitement;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class DossierBuilder {

    public String nomAssure;
    public String numeroAffiliation;
    public String immatriculation;
    public String lienParente;
    public double montantTotalFrais;
    public double prixConsultation;
    public int nombrePiecesJointes;
    public Date dateConsultation;
    public Date dateDepot;
    public List<Traitement> traitements;

    public DossierBuilder nomAssure(String nomAssure) {
        this.nomAssure = nomAssure;
        return this;
    }

    public DossierBuilder numeroAffiliation(String numeroAffiliation) {
        this.numeroAffiliation = numeroAffiliation;
        return this;
    }

    public DossierBuilder immatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
        return this;
    }

    public DossierBuilder lienParente(String lienParente){
        this.lienParente = lienParente;
        return this;
    }
    public DossierBuilder montantTotalFrais(double montantTotalFrais){
        this.montantTotalFrais = montantTotalFrais;
        return this;
    }
    public DossierBuilder prixConsultation(double prixConsultation){
        this.prixConsultation = prixConsultation;
        return this;
    }
    public DossierBuilder nombrePiecesJointes(int nombrePiecesJointes){
        this.nombrePiecesJointes = nombrePiecesJointes;
        return this;
    }
    public DossierBuilder dateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
        return this;
    }

    public DossierBuilder dateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
        return this;
    }

    public DossierBuilder traitements(List<Traitement> traitements) {
        this.traitements = traitements;
        return this;
    }

    public DossierMutuelle build() {
        return new DossierMutuelle(this);
    }
}
