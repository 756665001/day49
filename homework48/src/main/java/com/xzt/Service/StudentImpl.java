package com.xzt.Service;

public class StudentImpl implements Student {
    public StudentImpl() {
    }

    @Override
    public void readBook() {
        System.out.println("我在看书");
    }

    @Override
    public void playGame() {
        System.out.println("我在打游戏");
    }
}
