package ma.ensa.pizza.service;

import java.util.ArrayList;
import java.util.List;


import ma.ensa.pizza.classes.Produit;
import ma.ensa.pizza.dao.IDao;

public class ProduitService implements IDao<Produit> {
    private List <Produit> produits;
    private static ProduitService instance;

    private ProduitService() {
        this.produits = new ArrayList<>();
    }

    public static ProduitService getInstance() {
        if(instance == null)
            instance =  new ProduitService();
        return instance;
    }

    public boolean create(Produit o) {
        return produits.add(o);
    }

    public boolean update(Produit o) {
        return false;
    }

    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    public Produit findById(int id) {
        for(Produit f : produits){
            if(f.getId() == id)
                return f;
        }
        return null;
    }

    public List<Produit> findAll() {
        return produits;
    }
}