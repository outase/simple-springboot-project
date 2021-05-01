package com.simpleproject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

//@SpringBootApplication
//public class Application implements CommandLineRunner {
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//
//    private final ProductsMapper ProductsMapper;
//
//    public Application(ProductsMapper ProductsMapper) {
//        this.ProductsMapper = ProductsMapper; // Mapperをインジェクションする
//    }
//
//    // Spring Boot起動時にCommandLineRunner#runメソッドが呼び出される
//    @Transactional
//    @Override
//    public void run(String... args) throws Exception {
//        Products newProducts = new Products();
//        newProducts.setName("商品１");
//        newProducts.setPrice(45000);
//
//        ProductsMapper.insert(newProducts); // 新しいProductsをインサートする
//
//        Products loadedProducts = ProductsMapper.select(4); // インサートしたProductsを取得して標準出力する
//        System.out.println(loadedProducts.getId());
//    }
//}