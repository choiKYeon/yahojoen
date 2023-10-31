package org.example;


import org.example.entity.Container;
import org.example.entity.DefaultCommand;

public class Area {
    // 지역을 선택하는 메인화면
    public void areaSelcet(){
        MountainController mountainController = new MountainController();

        while (true) {
            System.out.println("\n== 지역을 선택해주세요. ==");
            System.out.println("\n1.경기도 / 2.강원도 / 3.충청도 / 4.전라도 / 5.경상도 / 6.제주도");
            System.out.print("입력 :");
            String commandArea = Container.getSc().nextLine().trim();

            switch (commandArea) {
                case "경기도":
                    mountainController.gyeonggiDo();
                    break;
                case "강원도":
                    mountainController.gangwonDo();
                    break;
                case "충청도":
                    mountainController.chungcheongDo();
                    break;
                case "전라도":
                    mountainController.jeollaDo();
                    break;
                case "경상도":
                    mountainController.kyongsangDo();
                    break;
                case "제주도":
                    mountainController.jejuDo();
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }
}