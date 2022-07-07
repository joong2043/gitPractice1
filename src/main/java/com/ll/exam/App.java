package com.ll.exam;

import java.util.Scanner;

public class App {
    public void run(){
        System.out.println("====명언====");

        Scanner sc = new Scanner(System.in);

        outer:
        while(true){
            System.out.printf("명령) ");
            String cmd = sc.nextLine().trim();

            switch (cmd){
                case "등록":
                    System.out.println("명언 : ");
                    String sentence = sc.nextLine().trim();
                    System.out.println("작가 : ");
                    String writer = sc.nextLine().trim();
                    System.out.println("명언이 등록되었습니다.");


                    break;

                case "목록":
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("------------------");
                case "종료":
                    break outer;
            }
        }
        sc.close();
    }
}
