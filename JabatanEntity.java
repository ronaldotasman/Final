package com.example.finall.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "jabatan", schema = "tugasdatabase")
public class JabatanEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idJabatan")
    private int idJabatan;
    @Basic
    @Column(name = "namaJabatan")
    private String namaJabatan;
    @Basic
    @Column(name = "gajipokok")
    private int gajipokok;
    @Basic
    @Column(name = "tunjangan")
    private int tunjangan;

    @Override
    public String toString() {
        return idJabatan + namaJabatan ;
    }

    public int getIdJabatan() {
        return idJabatan;
    }

    public void setIdJabatan(int idJabatan) {
        this.idJabatan = idJabatan;
    }

    public String getNamaJabatan() {
        return namaJabatan;
    }

    public void setNamaJabatan(String namaJabatan) {
        this.namaJabatan = namaJabatan;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JabatanEntity that = (JabatanEntity) o;
        return idJabatan == that.idJabatan && gajipokok == that.gajipokok && tunjangan == that.tunjangan && Objects.equals(namaJabatan, that.namaJabatan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idJabatan, namaJabatan, gajipokok, tunjangan);
    }
}
