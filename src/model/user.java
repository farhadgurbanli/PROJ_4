package model;

public class user {
    private String ad;
    private String soyad;
    private String username;
    private String hashpass;

    public user() {
    }

    public user(String ad, String soyad, String username, String hashpass) {
        this.ad = ad;
        this.soyad = soyad;
        this.username = username;
        this.hashpass = hashpass;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return hashpass;
    }

    public void setPassword(String password) {
        this.hashpass = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", username='" + username + '\'' +
                ", password='" + hashpass + '\'' +
                '}';
    }
}
