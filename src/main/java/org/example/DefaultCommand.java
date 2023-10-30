package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class DefaultCommand {
    private static String defaultCommand;
    public static void DefaultCommand(){
        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
    }
}
