package com.example.finall.DAO;

import java.util.List;

public interface DAOInterface<k> {

    public int addData(k data);
    public int delData(k data);
    public int updateData(k data);

    List<k> getAll();
}
