package com.mateovelazco.tiendavirtual;



import static com.mateovelazco.tiendavirtual.R.id.iv_profile_home_user;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private ArrayList<Product> listProducts = new ArrayList<>();

        private RecyclerView rvProductMain;

        private Toolbar topAppBar;

        private User userSession = new User();

        private ImageView userImageProfile;//x


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFakeData();

        userImageProfile = findViewById(R.id.iv_profile_home_user);
        Picasso.get().load(userSession.getUrlImageProfile()).into(userImageProfile);

        rvProductMain = findViewById(R.id.rv_products_main);
        //ProductAdapter myAdapter = new ProductAdapter(listProducts);
        //rvProductMain.setAdapter(myAdapter);

        topAppBar = findViewById(R.id.topAppBar_home);

        topAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if(item.getItemId()==R.id.add_item_product){
                    startActivity(new Intent(MainActivity.this, FormProductActivit.class));
                    return true;
                }else if(item.getItemId()==R.id.item_add_category){
                    Toast.makeText(MainActivity.this, "click en add Category", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });

        ProductAdapter myAdapter = new ProductAdapter(listProducts);
        rvProductMain.setAdapter(myAdapter);

        StaggeredGridLayoutManager myStrg = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        GridLayoutManager myGrid = new GridLayoutManager(getApplicationContext(), 3);
        //rvProductMain.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));//getaplication contect da la pantalla o activity en la que estáa y las columnas
        LinearLayoutManager linlayout = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvProductMain.setLayoutManager(myStrg);
    }

    private void loadFakeData(){
        Product product1 = new Product("Computador ASUS","El mejor en el mercado", 8000000.0, "https://www.google.com/search?q=mac&tbm=isch&hl=en&tbs=ic:trans&rlz=1C1JZAP_esCO949CO949&sa=X&ved=0CAMQpwVqFwoTCKiihdma8oQDFQAAAAAdAAAAABAE&biw=1519&bih=730#imgrc=NTradxGIAHL_tM");
        Product product2 = new Product("Teclado ASUS","El mejor en el mercado", 100000.0, "https://www.google.com/search?q=mac&tbm=isch&hl=en&tbs=ic:trans&rlz=1C1JZAP_esCO949CO949&sa=X&ved=0CAMQpwVqFwoTCKiihdma8oQDFQAAAAAdAAAAABAE&biw=1519&bih=730#imgrc=NTradxGIAHL_tM");
        Product product3 = new Product("Celular Rog","El mejor en el mercado", 500000.0, "https://www.google.com/url?sa=i&url=https%3A%2F%2Frog.asus.com%2Fes%2Fphones%2Frog-phone-3-model%2F&psig=AOvVaw0pjHc1b6D71ZyMDK1klI1X&ust=1710455006107000&source=images&cd=vfe&opi=89978449&ved=0CBMQjRxqFwoTCIin1cmj8oQDFQAAAAAdAAAAABAE");
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);

        userSession.setName("Mateo");
        userSession.setEmail("mvelazco.661@unab.edu.co");
        userSession.setPassword("scasdsada");
        userSession.setPhone("3022222");
        userSession.setUrlImageProfile("https://www.google.com/search?sca_esv=1b5df2f04fcae8b7&rlz=1C1JZAP_esCO949CO949&sxsrf=ACQVn09wKrnl2huCI5idHcYMZeYM3tgdVA:1710972182972&q=profile&tbm=isch&source=lnms&prmd=ivsnmbtz&sa=X&ved=2ahUKEwja376J7IOFAxUvRDABHfidBVMQ0pQJegQIDhAB&biw=1536&bih=730&dpr=1.25#imgrc=3RknOq-nQokWDM");

    }
}