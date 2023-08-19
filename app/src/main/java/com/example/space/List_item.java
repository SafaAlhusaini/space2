package com.example.space;

public class List_item
{
    private int image;
    private int icon1;
    private int icon2;
    private int icon3;
    private int icon4;
    private String likes;
    private String comments;

    public List_item(int image, int icon1, int icon2,int icon3,int icon4, String likes,String comments){

        this.image = image;
        this.icon1 = icon1;
        this.icon2 = icon2;
        this.icon3 = icon3;
        this.icon4 = icon4;
        this.likes = likes;
        this.comments = comments;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getIcon1() {
        return icon1;
    }

    public void setIcon1(int icon1) {
        this.icon1 = icon1;
    }

    public int getIcon2() {
        return icon2;
    }

    public void setIcon2(int icon2) {
        this.icon2 = icon2;
    }

    public int getIcon3() {
        return icon3;
    }

    public void setIcon3(int icon3) {
        this.icon3 = icon3;
    }

    public int getIcon4() {
        return icon4;
    }

    public void setIcon4(int icon4) {
        this.icon4 = icon4;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}