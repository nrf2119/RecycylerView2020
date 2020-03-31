package com.example.android.recycylerview2020;

public class President {
    private String name;
    private String info;
    private int photoId;

    public President(String name, String info, int photoId) {
        this.name = name;
        this.info = info;
        this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
}
