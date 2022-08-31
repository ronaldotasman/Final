module com.example.finall {
    requires java.naming;
    requires javafx.controls;
    requires java.sql;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires java.persistence;


    opens com.example.finall to javafx.fxml;
    exports com.example.finall;
    exports com.example.finall.controller;
    exports com.example.finall.utility;
    opens com.example.finall.controller to javafx.fxml;
}