package compane.view;

import java.util.Scanner;

public class HandlerUI {
    static UI ui = new UI();

    public static void starter() {
        System.out.println("Приветствую!");
        ui.infoByUser();
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        while (b) {
            b = ui.processing(String.valueOf(scanner.nextLine()));
        }
    }
}
