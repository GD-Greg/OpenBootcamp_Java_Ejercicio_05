package poo.ejercicio;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save(CocheCRUDImpl coche) {
        System.out.println("save");
    }

    @Override
    public List<CocheCRUDImpl> findAll() {
        System.out.println("List");

        return null;
    }

    @Override
    public void delete(CocheCRUDImpl coche) {
        System.out.println("delete");
    }
}
