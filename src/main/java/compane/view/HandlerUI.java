package compane.view;

import java.util.Scanner;

/**
 * Этот класс
 * S
 * Задача данного класса только управление интерфейсом
 * O
 * Реализация данного класс не предполагает изменений уже написаных методов  и не открывает доступ к экземпляру класса UI.
 * Требут поддержания торлько одного метота (starter) который является API;
 * L
 * Единственный метод данного класса  на вход ничего не принемает.
 * Предполагается что в клиентском коде не должно быть возможности изменять реализацию API. Однако для ее изменения не придется переписывать данный класс
 * I
 * не имплементирует интерфейсы
 * D
 * Не наследуется
 */
public final class  HandlerUI {
  private  static UI ui = new UIExecution();

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
