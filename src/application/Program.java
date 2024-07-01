package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST1: seller find by ID: ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST2: department find by ID: ====");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST3: seller find all ====");
        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }

    }
}
