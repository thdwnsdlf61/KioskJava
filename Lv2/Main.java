package KioskApp.Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<MenuItem>();
        MenuItem menuItem = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem1 = new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem2 = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menuItem3 = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        menuItems.add(menuItem);
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. " + menuItem.foodName + " | " + menuItem.foodPrice + " | " + menuItem.description);
        System.out.println("2. " + menuItem1.foodName + " | " + menuItem1.foodPrice + " | " + menuItem1.description);
        System.out.println("3. " + menuItem2.foodName + " | " + menuItem2.foodPrice + " | " + menuItem2.description);
        System.out.println("4. " + menuItem3.foodName + " | " + menuItem3.foodPrice + " | " + menuItem3.description);
        System.out.println("0. 종료 | 종료");
        System.out.println("------------");

        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("메뉴를 선택해주세요: ");
            number = sc.nextInt();
            sc.nextLine();
            switch (number) {
                case 1:
                    System.out.println(number + ". " + menuItem.foodName + " | " + menuItem.foodPrice + " | " + menuItem.description);
                    break;
                case 2:
                    System.out.println(number + ". " + menuItem1.foodName + " | " + menuItem1.foodPrice + " | " + menuItem1.description);
                    break;
                case 3:
                    System.out.println(number + ". " + menuItem2.foodName + " | " + menuItem2.foodPrice + " | " + menuItem2.description);
                    break;
                case 4:
                    System.out.println(number + ". " + menuItem3.foodName + " | " + menuItem3.foodPrice + " | " + menuItem3.description);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        } while (number != 0);
    }
}
