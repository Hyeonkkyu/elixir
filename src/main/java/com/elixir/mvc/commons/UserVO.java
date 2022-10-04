package com.elixir.mvc.commons;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class UserVO {

    private int user_code;
    private String user_id;
    private String user_pw;
    private String user_name;
    private String user_nickname;
    private String user_birth;
    private String user_phone;
    private String user_add;
    private String user_add_detail;
    private String user_add_post;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date reg_date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Date update_date;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
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

    public String getUser_add() {
        return user_add;
    }

    public void setUser_add(String user_add) {
        this.user_add = user_add;
    }

    public String getUser_add_detail() {
        return user_add_detail;
    }

    public void setUser_add_detail(String user_add_detail) {
        this.user_add_detail = user_add_detail;
    }

    public String getUser_add_post() {
        return user_add_post;
    }

    public void setUser_add_post(String user_add_post) {
        this.user_add_post = user_add_post;
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
                ", user_add='" + user_add + '\'' +
                ", user_add_detail='" + user_add_detail + '\'' +
                ", user_add_post='" + user_add_post + '\'' +
                ", reg_date=" + reg_date +
                ", update_date=" + update_date +
                ", visit_date=" + visit_date +
                ", member_yn=" + member_yn +
                '}';
    }
}
