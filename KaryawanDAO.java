package com.example.finall.DAO;

import com.example.finall.model.KaryawanEntity;
import com.example.finall.utility.hibernate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class KaryawanDAO implements DAOInterface<KaryawanEntity>{

    @Override
    public int addData(KaryawanEntity data) {

        Session s = hibernate.getSession();
        Transaction t = s.beginTransaction();
        s.save(data);

        t.commit();
        s.close();

        return 0;
    }

    @Override
    public int delData(KaryawanEntity data) {
        Session s = hibernate.getSession();
        Transaction t = s.beginTransaction();
        s.delete(data);

        t.commit();
        s.close();

        return 0;
    }

    @Override
    public int updateData(KaryawanEntity data) {
        Session s = hibernate.getSession();
        Transaction t = s.beginTransaction();
        s.update(data);

        t.commit();
        s.close();

        return 0;
    }

    @Override
    public ObservableList<KaryawanEntity> getAll() {

        Session s = hibernate.getSession();
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery query = builder.createQuery(KaryawanEntity.class);

        Root<KaryawanEntity> root = query.from(KaryawanEntity.class);

        List<KaryawanEntity> klist = s.createQuery(query).getResultList();
        s.close();

        return FXCollections.observableArrayList(klist);
    }
}
