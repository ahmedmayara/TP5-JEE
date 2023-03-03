import com.ahmed.tp5.dao.ProduitDaoImpl;
import entities.Produits;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ProduitDaoImpl produitDao = new ProduitDaoImpl();

        List<Produits> produitsList = produitDao.produitsParMC("Iphone");
        produitsList.forEach(System.out::println);
    }
}
