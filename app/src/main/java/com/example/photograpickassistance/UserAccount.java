package com.example.photograpickassistance;

public class UserAccount {
    private  String idToken;    //Firebase Uid (고유 토큰정)
    private  String emailId;    //이메일 아이디
    private  String password;   //비밀번호

    public UserAccount() { } //파이어베이스 리얼타임 데이터베이스 쓸 때 필수입 !! 빈 생성자 만들기!!!!!

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public void setPassword(String password) {
        this.password = password;

    }
}
