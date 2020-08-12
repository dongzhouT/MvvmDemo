package com.haierac.mvvmdemo;

public class User {
    private int iconId;
    private String like;
    private String content;

    public User(int iconId, String like, String content) {
        this.iconId = iconId;
        this.like = like;
        this.content = content;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
