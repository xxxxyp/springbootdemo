package com.example.springbootdemo.annotation;

@Table("persion")
public class Persion {

    @Column("name")
    private String name;
    @Column("id")
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
