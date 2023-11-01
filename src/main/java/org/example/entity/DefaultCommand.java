package org.example.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DefaultCommand {
    private static String defaultCommand;
    public static void defaultError(){
        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
    }
    public static void areaDeafaultCommand() {
        System.out.println("올바른 지역명을 입력해주세요.");
    }
    public static void mountainDeafaultCommand() {
        System.out.println("올바른 산이름을 입력해주세요.");
    }
}
        