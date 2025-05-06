package test01;

public class Electronics extends Goods {
    float warrantyPeriod;
    float electricalPower;

    @Override
    public String salesLevel() {
        if (quantityInStock < 3) {
            return "Bán được hàng";
        }
        return "";
    }

    @Override
    public double setVat() {
        double vat = 0.15;
        return quantityInStock * unitPrice * vat;
    }

    public float getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public float getElectricalPower() {
        return electricalPower;
    }

    public Electronics(String code, String name, float quantityInStock, double unitPrice, float warrantyPeriod, float electricalPower) {
        super(code, name, quantityInStock, unitPrice);
        if (warrantyPeriod < 0) {
            throw new IllegalArgumentException("Thời gian bảo hành phải lớn hơn hoặc bằng 0.");
        }
        this.warrantyPeriod = warrantyPeriod;

        if (electricalPower < 0) {
            throw new IllegalArgumentException("Công suất phải lớn hơn hoặc bằng 0.");
        }
        this.electricalPower = electricalPower;
    }
}
