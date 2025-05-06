package test01;

import java.time.LocalDate;

public class Food extends Goods {
    LocalDate productionDate;
    LocalDate expirationDate;
    String supplier;

    @Override
    public String salesLevel() {
        LocalDate today = LocalDate.now();
        if (quantityInStock > 0 && expirationDate.isBefore(today)) {
           return "Hàng khó bán";
        }
        return "";
    }

    @Override
    public double setVat() {
        double vat = 0.08;
        return quantityInStock * unitPrice * vat;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public Food(String code, String name, float quantityInStock, double unitPrice, LocalDate productionDate, LocalDate expirationDate, String supplier) {
        super(code, name, quantityInStock, unitPrice);
        this.productionDate = productionDate;

        if (expirationDate.isAfter(productionDate)) {
            this.expirationDate = expirationDate;
        } else {
            throw new IllegalArgumentException("Ngày hết hạn phải lớn hơn ngày sản xuất.");
        }

        this.supplier = supplier;

    }
}
