/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.CompteBancaire;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Ing paulin
 */
@Stateless
@LocalBean
public class GestionnaireDeCompteBancaire {

    @PersistenceContext(unitName = "GEStionBanqueHT-ejbPU")
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void creerCompte(CompteBancaire c){
    
    }
    
    public  List<CompteBancaire> getAllComptes(){
        Query query=em.createNamedQuery("CompteBancaire.findALL");
    return query.getResultList();
    
    }
    
    public void creerComptesTest(){
        
        creerCompte(new CompteBancaire("John Lennon",150000));
        creerCompte(new CompteBancaire("Paul MCCartney",950000));
        creerCompte(new CompteBancaire("Ringo Starr", 20000));
        creerCompte(new CompteBancaire("Georges Harrisson", 100000));
        
    
    }

    public void persist(Object object) {
        em.persist(object);
    }

    public int getNBComptes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<CompteBancaire> getLazyComptes(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
