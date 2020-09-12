package com.sort;

public class PersonAttribute {
    //用户属性
    private int id;

    @Override
    public String toString() {
        return "PersonAttribute{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                '}';
    }

    public PersonAttribute(int id) {
        this.id = id;
    }

    public PersonAttribute(int id, String name, String post) {
        this.id = id;
        this.name = name;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String post;
    public PersonAttribute() {

    }

    public PersonAttribute(String name) {
        this.name = name;
    }


    public PersonAttribute(String name, String post) {
        this.name = name;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

}
