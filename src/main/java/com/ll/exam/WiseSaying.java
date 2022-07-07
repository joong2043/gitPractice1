package com.ll.exam;

public class WiseSaying {
    int id;
    String sentence;
    String writer;
    WiseSaying(int id, String sentence, String writer){
        this.id = id;
        this.sentence = sentence;
        this.writer = writer;
    }

    @Override
    public String toString(){
        return "WiseSaying{" +
                "id=" + id +
                ", sentence='" + sentence + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
