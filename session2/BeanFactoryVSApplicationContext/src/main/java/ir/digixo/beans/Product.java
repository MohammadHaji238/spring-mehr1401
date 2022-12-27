package ir.digixo.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class Product {

    public static boolean isBeanInstantiated = false;

    public static boolean isIsBeanInstantiated() {
        return isBeanInstantiated;
    }

    public static void setIsBeanInstantiated(boolean isBeanInstantiated) {
        Product.isBeanInstantiated = isBeanInstantiated;
    }

    public void init() {
        setIsBeanInstantiated(true);
    }


}
