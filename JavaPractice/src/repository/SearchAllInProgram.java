package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entity.Product;

public class SearchAllInProgram implements SearchProduct {

    private List<Product> products;

    {
        this.products = new ArrayList<>();
        this.products.add(new Product("0001", "野菜", "玉ねぎ"));
        this.products.add(new Product("0002", "果物", "みかん"));
        this.products.add(new Product("0003", "果物", "みかん"));
        this.products.add(new Product("0004", "果物", "りんご"));
        this.products.add(new Product("0005", "果物", "みかん"));
        this.products.add(new Product("0006", "野菜", "玉ねぎ"));
        this.products.add(new Product("0006", "果物", "りんご"));
        this.products.add(new Product("0007", "野菜", "玉ねぎ"));
        this.products.add(new Product("0008", "果物", "りんご"));
        this.products.add(new Product("0009", "野菜", "にんじん"));
        this.products.add(new Product("0010", "果物", "みかん"));
        this.products.add(new Product("0011", "果物", "みかん"));
        this.products.add(new Product("0012", "果物", "みかん"));
    }

    @Override
    public List<Product> searchAll() throws Exception {
        return this.products;
    }

    @Override
    public List<Product> searchByKbn(String kbn) throws Exception {
        List<Product> filtereProducts = products.stream().filter(product -> product.getKbn().equals(kbn)).collect(Collectors.toList());
        return filtereProducts;
    }

    @Override
    public int searchByName(String productName) throws Exception {
        return (int)products.stream().filter(product -> product.getName().equals(productName)).count();
    }
}
