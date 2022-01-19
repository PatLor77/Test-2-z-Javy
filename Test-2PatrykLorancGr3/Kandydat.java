package com.company;

public class Kandydat implements Comparable, Cloneable {
    private String nazwa;
    private int wiek;
    private String wyksztalcony;
    private int lataDoswiadczenia;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getWyksztalcony() {
        return wyksztalcony;
    }

    public void setWyksztalcony(String wyksztalcony) {
        this.wyksztalcony = wyksztalcony == "licencjat" || wyksztalcony == "mistrzowie" ? wyksztalcony : null;
    }

    public int getLataDoswiadczenia() {
        return lataDoswiadczenia;
    }

    public void setLataDoswiadczenia(int lataDoswiadczenia) {
        this.lataDoswiadczenia = lataDoswiadczenia;
    }

    public Kandydat(String nazwa, int wiek, String wyksztalcony, int lataDoswiadczenia) {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcony = wyksztalcony;
        this.lataDoswiadczenia = lataDoswiadczenia;
    }

    @Override
    public int compareTo(Object o) {
        Kandydat other = (Kandydat) o;

        if (this.wyksztalcony.equals("mistrzowie") && !this.wyksztalcony.equals(other.wyksztalcony)) {
            return -1;
        } else if (other.wyksztalcony.equals("mistrzowie") && !this.wyksztalcony.equals(other.wyksztalcony)) {
            return 1;
        } else {
            if (this.wiek > other.wiek) {
                return 1;
            } else if (this.wiek < other.wiek) {
                return -1;
            } else {
                if (this.lataDoswiadczenia < other.lataDoswiadczenia) {
                    return 1;
                } else if (this.lataDoswiadczenia > other.lataDoswiadczenia) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Kandydat{" +
                "nazwa='" + nazwa + '\'' +
                ", wiek=" + wiek +
                ", wyksztalcony='" + wyksztalcony + '\'' +
                ", lataDoswiadczenia=" + lataDoswiadczenia +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Kandydat(this.nazwa,this.wiek,this.wyksztalcony,this.lataDoswiadczenia);
    }
}
