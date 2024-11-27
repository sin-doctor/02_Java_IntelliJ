package com.kh.CollectionEx.pack2.setEx;

public class 회원 {

    //회원가입 번호
    private int id;
    //회원이름
    private String name;
    //회원이메일
    private String email;
    //회원취미
    private String hobby;

    public 회원() {
    }

    public 회원(int id, String name, String email, String hobby) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.hobby = hobby;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public String toString() {
        return "회원{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
