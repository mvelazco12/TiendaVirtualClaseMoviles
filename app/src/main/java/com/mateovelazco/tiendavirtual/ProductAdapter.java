package com.mateovelazco.tiendavirtual;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>{
    //constructor es para inicializar una clase
    private ArrayList<Product> listObjects;

    public ProductAdapter(ArrayList<Product> listObjects) {
        this.listObjects = listObjects;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder holder, int position) {

        holder.associate(listObjects.get(position));


    }

    @Override
    public int getItemCount() {
        return listObjects.size();
        }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView myimage;
        private TextView nameProducts, priceProduct;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            myimage = itemView.findViewById(R.id.imageview_product);
            nameProducts = itemView.findViewById(R.id.tv_nombre);
            priceProduct = itemView.findViewById(R.id.tv_price);



        }

        public void associate(Product myProduct){//asocia la informacion, el precio con el precio del producto
            nameProducts.setText(myProduct.getName());
            priceProduct.setText(myProduct.getPrice().toString());

            Picasso.get().load(myProduct.getUrlImage()).into(myimage);

        }
    }
}
