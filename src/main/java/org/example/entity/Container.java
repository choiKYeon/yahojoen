package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.member.entity.Member;

import java.util.Scanner;

@Getter
@Setter

public class Container {
    private static Member checkedmembers = null;

    private static Scanner sc;
    public static void init(){
        sc = new Scanner(System.in);
    }
    public static void close(){
        sc.close();
    }
    public static Scanner getSc() {
        return sc;
    }

    public static Member getCheckedmembers() {
        return checkedmembers;
    }

    public static void setCheckedmembers(Member checkedmembers) {
        Container.checkedmembers = checkedmembers;
    }
}
