package com.example.finall.DAO;

import com.example.finall.model.JabatanEntity;
import com.example.finall.utility.hibernate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class JabatanDAO implements DAOInterface<JabatanEntity> {
    @Override
    public int addData(JabatanEntity data) {
        return 0;
    }

    @Override
    public int delData(JabatanEntity data) {
        return 0;
    }

    @Override
    public int updateData(JabatanEntity data) {
        return 0;
    }

    @Override
    public ObservableList<JabatanEntity> getAll() {

        Session s = hibernate.getSession();
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery query = builder.createQuery(JabatanEntity.class);

        Root<JabatanEntity> root = query.from(JabatanEntity.class);


        List<JabatanEntity> jlist = s.createQuery(query).getResultList();
        s.close();

        return FXCollections.observableArrayList(jlist);
    }
}
