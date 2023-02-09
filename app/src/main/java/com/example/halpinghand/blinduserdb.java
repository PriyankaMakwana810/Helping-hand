package com.example.halpinghand;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "blindUser")
class blinduserdb {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "Name")
    private String name;
    @ColumnInfo(name = "Email")
    private String email;
    @ColumnInfo(name = "Contact")
    private int contact;
    @ColumnInfo(name = "Password")
    private String password;
    @ColumnInfo(name = "City")
    private String city;
    @ColumnInfo(name = "College")
    private String college;
    @ColumnInfo(name = "Medium")
    private String medium;

    blinduserdb(int id, String name, String email, int contact, String password, String city, String college, String medium){
        this.id = id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.city = city;
        this.college = college;
        this.medium = medium;
    }
    @Ignore
    blinduserdb(String name, String email, int contact, String password, String city, String college, String medium){
        this.name = name;
        this.email = email;
        this.contact =contact;
        this.password = password;
        this.city = city;
        this.college = college;
        this.medium = medium;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }
}


