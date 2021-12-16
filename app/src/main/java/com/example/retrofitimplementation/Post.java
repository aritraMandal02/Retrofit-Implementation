package com.example.retrofitimplementation;

import com.google.gson.annotations.SerializedName;
//
//public class Post {
//
//    private int userId;
//
//    private int id;
//
//    private String title;
//
//    @SerializedName("body")
//    private String text;
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getText() {
//        return text;
//    }
//}

public class Post {
    private String cnt;

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public Post(String cnt) {
        this.cnt = cnt;
    }

}