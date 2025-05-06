package test01;

public abstract class Goods {
    final String code;
    String name;
    float quantityInStock;
    double unitPrice;

    public Goods(String code, String name, float quantityInStock, double unitPrice) {
        if (code == null || code.isEmpty()) {
            throw new IllegalArgumentException("Mã hàng không được để trống.");
        } else {
            this.code = code;
        }

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Tên hàng không được để trống.");
        } else {
            this.name = name;
        }

        if (quantityInStock < 0) {
            throw new IllegalArgumentException("Số lượng hàng tồn phải nhập lớn hơn hoặc bằng 0.");
        } else {
            this.quantityInStock = quantityInStock;
        }

        if (unitPrice < 0) {
            throw new IllegalArgumentException("Số lượng hàng tồn phải nhập lớn hơn hoặc bằng 0.");
        } else {
            this.unitPrice = unitPrice;
        }
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public float getQuantityInStock() {
        return quantityInStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public abstract String salesLevel();
    public abstract double setVat();

}
