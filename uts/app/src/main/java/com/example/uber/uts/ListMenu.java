package com.example.uber.uts;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.uber.uts.adapter.Product;
import com.example.uber.uts.adapter.ProductListAdapter;
import com.example.uber.uts.utils.SharedPreference;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uber on 23/10/16.
 */
public class ListMenu extends AppCompatActivity{

    public static final String ARG_ITEM_ID = "product_list";

    ListView productListView;
    List<Product> products, favorite;
    ProductListAdapter productListAdapter;

    SharedPreference sharedPreference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_produk);

        setProducts();
        sharedPreference = new SharedPreference();
        productListAdapter = new ProductListAdapter(getApplicationContext(), products);

        productListView = (ListView) findViewById(R.id.list_product);
        productListView.setAdapter(productListAdapter);

    }

    private void setProducts() {

        Product product1 = new Product(1, "Nasi Kuning", "Nasi Ini Kuning", 60000);
        Product product2 = new Product(2, "Kupat Tahu",
                "Menggunakan tahu sumedang", 50000);
        Product product3 = new Product(3, "Pecel Ayam",
                "Tersedia ayam kampung", 45000);
        Product product4 = new Product(4, "Pecel Lele",
                "Lele Nusakambangan", 46000);
        Product product5 = new Product(5, "Nasi Goreng",
                "Digoreng dadakan", 48000);
        Product product6 = new Product(6, "Mie Tektek Goreng", "Mie tektek tidak menggunakan kuah",
                50000);
        Product product7 = new Product(7, "Mie Tektek Kuah",
                "Mie tektek dengan kuah kaldu", 40000);
        Product product8 = new Product(8, "Kwetiau",
                "Menggunakan taburan bawang goreng", 38000);
        Product product9 = new Product(9, "Puyughay",
                "Dengan menggunakan dagin sapi pilihan", 39000);
        Product product10 = new Product(10, "Nasi Mawut",
                "Campuran nasi goreng dan mie goreng spesial", 50000);

        products = new ArrayList<Product>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
    }
}
