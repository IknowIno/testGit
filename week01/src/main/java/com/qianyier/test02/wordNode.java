package com.qianyier.test02;

public class wordNode {
    public String word;
    public int num;

    public wordNode() {
    }

    public wordNode(String word, int num) {
        this.word = word;
        this.num = num;
    }

    @Override
    public String toString() {
        return "wordNode{" +
                "word='" + word + '\'' +
                ", num=" + num +
                '}';
    }
}
