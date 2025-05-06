package test01;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ManageGoodsList {
    List<Goods> listGoods = new ArrayList<>();

    public void addGoods (Goods goods) {
        for (Goods i : listGoods) {
            if (i.getCode().equals(goods.getCode())) {
                System.out.println("Không thể tạo mới. Mã hàng đã tồn tại.");
                return;
            }
        }
        listGoods.add(goods);
    }

    public void PrintGoodsList() {
        if (listGoods.isEmpty()) {
            System.out.println("📭 Danh sách rỗng.");
            return;
        }

        Map<String, List<Goods>> type = new LinkedHashMap<>();
        type.put("Food", new ArrayList<>());
        type.put("Electronics", new ArrayList<>());
        type.put("Clothing", new ArrayList<>());


        for (Goods i : listGoods) {
            if (i instanceof Food) {
                type.get("Food").add(i);
            }
            else if (i instanceof Electronics) {
                    type.get("Electronics").add(i);
                }
            else if (i instanceof Clothing) {
                type.get("Clothing").add(i);
            }
        }

        for (Map.Entry<String, List<Goods>> entry : type.entrySet()) {
            System.out.println( "Type: " + entry.getKey());
            for (Goods i : entry.getValue()) {
                if (i instanceof Food) {
                    System.out.printf("    ▸ Code: %s, Name: %s, QuantityInStock: %s, UnitPrice: %s, ProductionDate: %s, ExpirationDate: %s, Supplier: %s, VAT: %.2f, salesLevel: %s\n"
                            , i.getCode(), i.getName(), i.getQuantityInStock(), i.getUnitPrice(), ((Food) i).getProductionDate(), ((Food) i).getExpirationDate(), ((Food) i).getSupplier(), i.setVat(), i.salesLevel());

                } else if (i instanceof Electronics) {
                    System.out.printf("    ▸ Code: %s, Name: %s, QuantityInStock: %s, UnitPrice: %s, WarrantyPeriod: %f, ElectricalPower: %f, VAT: %.2f, salesLevel: %s\n"
                            , i.getCode(), i.getName(), i.getQuantityInStock(), i.getUnitPrice(), ((Electronics) i).getWarrantyPeriod(), ((Electronics) i).getElectricalPower(), i.setVat(), i.salesLevel());
                } else if (i instanceof Clothing) {
                    System.out.printf("    ▸ Code: %s, Name: %s, QuantityInStock: %s, UnitPrice: %s, Manufacturer: %s, WarehouseEntryDate: %s, VAT: %.2f, salesLevel: %s\n"
                            , i.getCode(), i.getName(), i.getQuantityInStock(), i.getUnitPrice(), ((Clothing) i).getManufacturer(), ((Clothing) i).getWarehouseEntryDate(), i.setVat(), i.salesLevel());
                }
            }

        }
    }
}
