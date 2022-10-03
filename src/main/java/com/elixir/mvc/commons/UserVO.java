package com.elixir.mvc.commons;

import java.util.Date;

public class UserVO {

    private int user_code;
    private String user_id;
    private String user_pw;
    private String user_name;
    private String user_nickname;
    private String user_birth;
    private String user_phone;
    private String add;
    private String add_detail;
    private String add_post;
    private Date reg_date;
    private Date update_date;
    private Date visit_date;
    private char member_yn;

    public int getUser_code() {
        return user_code;
    }

    public void setUser_code(int user_code) {
        this.user_code = user_code;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_pw() {
        return user_pw;
    }

    public void setUser_pw(String user_pw) {
        this.user_pw = user_pw;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getUser_birth() {
        return user_birth;
    }

    public void setUser_birth(String user_birth) {
        this.user_birth = user_birth;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAdd_detail() {
        return add_detail;
    }

    public void setAdd_detail(String add_detail) {
        this.add_detail = add_detail;
    }

    public String getAdd_post() {
        return add_post;
    }

    public void setAdd_post(String add_post) {
        this.add_post = add_post;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public Date getVisit_date() {
        return visit_date;
    }

    public void setVisit_date(Date visit_date) {
        this.visit_date = visit_date;
    }

    public char getMember_yn() {
        return member_yn;
    }

    public void setMember_yn(char member_yn) {
        this.member_yn = member_yn;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "user_code=" + user_code +
                ", user_id='" + user_id + '\'' +
                ", user_pw='" + user_pw + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_nickname='" + user_nickname + '\'' +
                ", user_birth='" + user_birth + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", add='" + add + '\'' +
                ", add_detail='" + add_detail + '\'' +
                ", add_post='" + add_post + '\'' +
                ", reg_date=" + reg_date +
                ", update_date=" + update_date +
                ", visit_date=" + visit_date +
                ", member_yn=" + member_yn +
                '}';
    }
}
