package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao dep = DaoFactory.createDepartmentDao();
        System.out.println("===TEST 1: deparment find by id ====");
        Department department = dep.findById(4);
        System.out.println(department);

        System.out.println("===TEST 2: department find all ====");
        List<Department> list = dep.findAll();
        for(Department i : list){
            System.out.println(i);
        }

        System.out.println("===TEST 3: department insert ====");
        Department newDepartment = new Department(1, "Music");
        dep.insert(newDepartment);
        list = dep.findAll();
        for(Department i : list){
            System.out.println(i);
        }

        System.out.println("===TEST 4: department update ====");
        Department dep2 = dep.findById(2);
        dep2.setName("Music");
        dep.update(newDepartment);
        list = dep.findAll();
        for(Department i : list){
            System.out.println(i);
        }

        System.out.println("===TEST 5: department delete ====");
        dep.deleteById(6);
        list = dep.findAll();
        for(Department i : list){
            System.out.println(i);
        }
    }
}
