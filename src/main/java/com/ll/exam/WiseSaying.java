package com.ll.exam;

public class WiseSaying {
    int id;
    String content;
    String author;
    WiseSaying(int id, String content, String author){
        this.id = id;
        this.content = content;
        this.author = author;
    }

    WiseSaying(){

    }

    @Override
    public String toString(){
        return "WiseSaying{" +
                "id=" + id +
                ", sentence='" + content + '\'' +
                ", writer='" + author + '\'' +
                '}';
    }
}
