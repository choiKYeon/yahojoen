package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.example.DB.DBConnection;
import org.example.member.entity.Member;

import java.util.Scanner;



public class Container {
    private static DBConnection dbConnection;
    @Getter
    @Setter
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

    public static DBConnection getDBconnection() {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
