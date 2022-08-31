package com.example.finall.controller;

import com.example.finall.DAO.JabatanDAO;
import com.example.finall.DAO.KaryawanDAO;
import com.example.finall.model.JabatanEntity;
import com.example.finall.model.KaryawanEntity;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class maincontroller {

    public TableView table1;
    public TableColumn kolomid;
    public TableColumn kolomnama;
    public TableColumn kolomjabatan;
    public TableColumn kolomemail;
    public ComboBox cmbjabatan;
    public Button btnadd;
    public Button btnupdate;
    public Button btndelete;
    public TextField ipid;
    public TextField ipnama;
    public TextField ipemail;

    ObservableList<JabatanEntity> jlist;

    ObservableList<KaryawanEntity> klist;

    public void initialize(){
        JabatanDAO dao = new JabatanDAO();
        jlist = dao.getAll();
        cmbjabatan.setItems(jlist);

        KaryawanDAO dao2 = new KaryawanDAO();
        klist = dao2.getAll();
        table1.setItems(klist);

        TableColumn kol = (TableColumn) table1.getColumns().get(0);
        kol.setCellValueFactory(new PropertyValueFactory("idKaryawan"));
        TableColumn kol1 = (TableColumn) table1.getColumns().get(1);
        kol1.setCellValueFactory(new PropertyValueFactory("namaKaryawan"));
        TableColumn kol2 = (TableColumn) table1.getColumns().get(2);
        kol2.setCellValueFactory(new PropertyValueFactory("jabatan_idJabatan"));
        TableColumn kol3 = (TableColumn) table1.getColumns().get(3);
        kol3.setCellValueFactory(new PropertyValueFactory("emailKaryawan"));

    }

    public void refresh(){
        JabatanDAO dao = new JabatanDAO();
        jlist = dao.getAll();

        KaryawanDAO dao2 = new KaryawanDAO();
        klist = dao2.getAll();
        table1.setItems(klist);

        table1.refresh();
    }

    public void setadd(ActionEvent actionEvent) {

        KaryawanDAO dao = new KaryawanDAO();
        KaryawanEntity data = new KaryawanEntity();
        data.setNamaKaryawan(ipnama.getText());
        data.setIdKaryawan(Integer.parseInt(ipid.getText()));
        data.setEmailKaryawan(ipemail.getText());

        JabatanEntity pilih = jlist.get(1);
        data.setIdJabatan(pilih);

        dao.addData(data);

        refresh();
    }

    public void setdelete(ActionEvent actionEvent) {
        KaryawanEntity pilih2 = (KaryawanEntity) table1.getSelectionModel().getSelectedItem();
        KaryawanDAO dao = new KaryawanDAO();
        dao.delData(pilih2);

        refresh();

    }

    public void setupdate(ActionEvent actionEvent) {
        KaryawanEntity pilih2 = (KaryawanEntity) table1.getSelectionModel().getSelectedItem();
        KaryawanDAO dao = new KaryawanDAO();
        
        dao.updateData(pilih2);

        refresh();
    }
}