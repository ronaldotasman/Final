package com.example.finall.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "karyawan", schema = "tugasdatabase", catalog = "")
public class KaryawanEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idKaryawan")
    private int idKaryawan;
    @Basic
    @Column(name = "namaKaryawan")
    private String namaKaryawan;
    @Basic
    @Column(name = "emailKaryawan")
    private String emailKaryawan;
    @Basic
    @Column(name = "notelpKaryawan")
    private int notelpKaryawan;
    @Basic
    @Column(name = "alamatKaryawan")
    private String alamatKaryawan;

    public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getEmailKaryawan() {
        return emailKaryawan;
    }

    public void setEmailKaryawan(String emailKaryawan) {
        this.emailKaryawan = emailKaryawan;
    }

    public int getNotelpKaryawan() {
        return notelpKaryawan;
    }

    public void setNotelpKaryawan(int notelpKaryawan) {
        this.notelpKaryawan = notelpKaryawan;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KaryawanEntity that = (KaryawanEntity) o;
        return idKaryawan == that.idKaryawan && notelpKaryawan == that.notelpKaryawan && Objects.equals(namaKaryawan, that.namaKaryawan) && Objects.equals(emailKaryawan, that.emailKaryawan) && Objects.equals(alamatKaryawan, that.alamatKaryawan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKaryawan, namaKaryawan, emailKaryawan, notelpKaryawan, alamatKaryawan);
    }
}
