package com.example.menuapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox Pizza, Burger, Pasta, Salad, Coke, Sprite, Water;
    Button Order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pizza = (CheckBox) findViewById(R.id.CheckBoxPizza);
        Burger = (CheckBox) findViewById(R.id.CheckBoxBurger);
        Pasta = (CheckBox) findViewById(R.id.CheckBoxPasta);
        Salad = (CheckBox) findViewById(R.id.CheckBoxSalad);
        Coke = (CheckBox) findViewById(R.id.CheckBoxCoke);
        Sprite = (CheckBox) findViewById(R.id.CheckBoxSprite);
        Water = (CheckBox) findViewById(R.id.CheckBoxWater);

        Order = (Button) findViewById(R.id.ButtonOrder);

        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalAmount = 0;
                String result = "Selected Items:";
                if (Pizza.isChecked()) {
                    result = result.concat("\nPizza 12000 TND");
                    totalAmount += 12000;
                }
                if (Burger.isChecked()) {
                    result = result.concat("\nBurger 10000 TND");
                    totalAmount += 10000;
                }
                if (Pasta.isChecked()) {
                    result = result.concat("\nPasta 15000 TND");
                    totalAmount += 15000;
                }
                if (Salad.isChecked()) {
                    result = result.concat("\nSalad 8000 TND");
                    totalAmount += 8000;
                }
                if (Coke.isChecked()) {
                    result = result.concat("\nCoke 5000 TND");
                    totalAmount += 5000;
                }
                if (Sprite.isChecked()) {
                    result = result.concat("\nSprite 5000 TND");
                    totalAmount += 5000;
                }
                if (Water.isChecked()) {
                    result = result.concat("\nWater 3000 TND");
                    totalAmount += 3000;
                }

                result = result.concat("\nTotal: " + totalAmount + " TND");
                System.out.println(result);

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("Order Summary");
                builder.setMessage(result);
                builder.show();
    }
});
    }
}