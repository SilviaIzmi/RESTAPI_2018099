package com.example.restapi_2018099;

import java.io.Serializable;

public class Results implements Serializable {

    private String Kecamatan;

    private String Kelurahan;

    private String KodePos;

    private String nomor;

    public String getKecamatan() {
        return this.Kecamatan;
    }

    public void setKecamatan(String Kecamatan) {
        this.Kecamatan = Kecamatan;
    }

    public String getKelurahan() {
        return this.Kelurahan;
    }

    public void setKelurahan(String Kelurahan) {
        this.Kelurahan = Kelurahan;
    }

    public String getKodePos() {
        return this.KodePos;
    }

    public void setKodePos(String KodePos) {
        this.KodePos = KodePos;
    }

    public String getNomor() {
        return this.nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
}

