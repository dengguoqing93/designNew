package observer.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * 被观察的产品列表
 *
 * @author dengguoqing
 * @date 2019/5/27
 */
public class ProductList extends Observable {
    private List<String> productList;
    private static ProductList instance;

    private ProductList() {
    }

    /**
     * 获得唯一实例
     *
     * @return 产品列表唯一实例
     */
    public static ProductList getInstance() {

        if (instance == null) {
            instance = new ProductList();
            instance.productList = new ArrayList<>();
        }
        return instance;
    }

    /**
     * 新增产品
     *
     * @param newProduct 新产品
     */
    public void addProduct(String newProduct) {
        productList.add(newProduct);
        System.out.println("产品列表新增了产品: " + newProduct);
        this.setChanged();
        this.notifyObservers(newProduct);

    }


}
