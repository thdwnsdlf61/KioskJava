package KioskApp.Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Kiosk (List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {
        int number;

        do {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i).foodName + " | " + menuItems.get(i).foodPrice + " | " + menuItems.get(i).description);
            }
            System.out.println("0. 종료 | 종료");
            System.out.println("-------------------");

            System.out.print("메뉴를 선택해주세요: ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            sc.nextLine();
            List<MenuItem> menu1 = this.menuItems;

            if (1<=number && number<=4) {
                System.out.println(number + ". " + menuItems.get(number-1).foodName + " | " + menuItems.get(number-1).foodPrice + " | " + menuItems.get(number-1).description);
            } else if (number == 0) {
                System.out.println("프로그램을 종료합니다.");
            } else {
                System.out.println("잘못된 입력입니다.");
            }

//            if (number == 1) {
//                System.out.println(number + ". " + menuItems.get(number-1).foodName + " | " + menuItems.get(number-1).foodPrice + " | " + menuItems.get(number-1).description);
//            } else if (number == 2) {
//                System.out.println(number + ". " + menuItems.get(number-1).foodName + " | " + menuItems.get(number-1).foodPrice + " | " + menuItems.get(number-1).description);
//            } else if (number == 3) {
//                System.out.println(number + ". " + menuItems.get(number-1).foodName + " | " + menuItems.get(number-1).foodPrice + " | " + menuItems.get(number-1).description);
//            } else if (number == 4) {
//                System.out.println(number + ". " + menuItems.get(number-1).foodName + " | " + menuItems.get(number-1).foodPrice + " | " + menuItems.get(number-1).description);
//            } else if (number == 0) {
//                System.out.println("프로그램을 종료합니다.");
//            } else {
//                System.out.println("잘못된 입력입니다.");
//            }

//            switch (number) {
//                case 1:
//                    System.out.println(number + ". " + menuItems.get(0).foodName + " | " + menuItems.get(0).foodPrice + " | " + menuItems.get(0).description);
//
//                case 2:
//                   System.out.println(number + ". " + menuItems.get(1).foodName + " | " + menuItems.get(1).foodPrice + " | " + menuItems.get(1).description);
//                    break;
//                case 3:
//                    System.out.println(number + ". " + menuItems.get(2).foodName + " | " + menuItems.get(2).foodPrice + " | " + menuItems.get(2).description);
//                    break;
//                case 4:
//                    System.out.println(number + ". " + menuItems.get(number-1).foodName + " | " + menuItems.get(number-1).foodPrice + " | " + menuItems.get(number-1).description);
//                    break;
//                case 0:
//                    System.out.println("프로그램을 종료합니다.");
//                    break;
//                default:
//                    System.out.println("잘못된 입력입니다.");
//                    break;
//            }
        } while (number != 0);
    }
}
