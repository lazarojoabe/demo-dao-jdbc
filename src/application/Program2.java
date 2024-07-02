package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao dep = DaoFactory.createDepartmentDao();
        System.out.println("===TEST 1: deparment find by id ====");
        Department department = dep.findById(4);
        System.out.println(department);

    }
}
