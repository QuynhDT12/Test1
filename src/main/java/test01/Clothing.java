package test01;

import java.time.LocalDate;

public class Clothing extends Goods {
    String manufacturer;
    LocalDate warehouseEntryDate;

    @Override
    public String salesLevel() {
        LocalDate today = LocalDate.now();
        LocalDate ngayLuuKho = today.minusDays(20);
        if (quantityInStock > 60 && warehouseEntryDate.isBefore(ngayLuuKho)) {
            return "Hàng bán chậm";
        }
        return "";
    }

    @Override
    public double setVat() {
        double vat = 0.15;
        return quantityInStock * unitPrice * vat;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public LocalDate getWarehouseEntryDate() {
        return warehouseEntryDate;
    }

    public Clothing(String code, String name, float quantityInStock, double unitPrice, String manufacturer, LocalDate warehouseEntryDate) {
        super(code, name, quantityInStock, unitPrice);
        this.manufacturer = manufacturer;
        this.warehouseEntryDate = warehouseEntryDate;
    }
}
