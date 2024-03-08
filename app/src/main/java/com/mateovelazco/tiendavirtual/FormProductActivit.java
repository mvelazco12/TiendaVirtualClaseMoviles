package com.mateovelazco.tiendavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class FormProductActivit extends AppCompatActivity {

    private Button btnsaveform;
    private TextInputLayout nameTextField, descriptionTextField, priceTextfield;
    private TextInputLayout urlTextField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_product);

        btnsaveform = findViewById(R.id.btn_save_product_form);

        nameTextField = findViewById(R.id.ET_name_product_form);
        descriptionTextField = findViewById(R.id.rt_description_form);
        priceTextfield = findViewById(R.id.et_precio_form);
        urlTextField = findViewById(R.id.et_url_form);


        btnsaveform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo lo que se escriba de aqui para abajo se activa cuando se presiona el boton gracias al método


                String name = nameTextField.getEditText().getText().toString().trim();//trim le quita los espacios en blancos, get TExt obtiene el texto, se transforma a String porque sino bota un objetio View.
                String descripcioin = descriptionTextField.getEditText().getText().toString().trim();
                String prais = priceTextfield.getEditText().getText().toString().trim();
                String urlimage = urlTextField.getEditText().getText().toString().trim();

                if(name.isEmpty()){//si el campo queda vacio le sale en rojo y le dice que ponga el este en rojo
                    nameTextField.setError("Por favor ingresar el nombre");
                    return;
                }else if(name.length()>20){
                    nameTextField.setError("ome se pasó");
                }

                if(descripcioin.isEmpty()){//si el campo queda vacio le sale en rojo y le dice que ponga el este en rojo
                    descriptionTextField.setError("Por favor ingresar la descrición");
                    return;
                }

                if(prais.isEmpty()){//si el campo queda vacio le sale en rojo y le dice que ponga el este en rojo
                    priceTextfield.setError("Por favor ingresar el precio");
                    return;
                }

                if(urlimage.isEmpty()){//si el campo queda vacio le sale en rojo y le dice que ponga el este en rojo
                    urlTextField.setError("Por favor ingresar la URL");
                    return;
                }

                Product mNewProdcut = new Product("Computador", "descriçión", 50000000, "No hay por ahora");
                Toast.makeText(FormProductActivit.this, "oe ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}