package test01;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ManageGoodsList ql = new ManageGoodsList();

        ql.addGoods(new Food("F1", "Gạo", 1, 1000,
                LocalDate.of(2024, 5, 5), LocalDate.of(2025, 5, 4), "kaopiz"));

        ql.addGoods(new Electronics("E1", "Ti vi", 10, 7500000,
                24, 2));

        ql.addGoods(new Clothing("C1", "Áo", 1, 120000,
                "", LocalDate.now().minusDays(30)));

        ql.addGoods(new Food("F2", "Rau", 0, 15000,
                LocalDate.of(2024, 3, 10), LocalDate.of(2025, 3, 10), ""));
        ql.PrintGoodsList();
    }
}
