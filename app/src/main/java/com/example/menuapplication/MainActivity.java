package com.example.menuapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

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
                StringBuilder result = new StringBuilder();
                result.append("Selected Items:");
                if (Pizza.isChecked()) {
                    result.append("\nPizza 12000 TND");
                    totalAmount += 12000;
                }
                if (Burger.isChecked()) {
                    result.append("\nBurger 8000 TND");
                    totalAmount += 8000;
                }
                if (Pasta.isChecked()) {
                    result.append("\nPasta 10000 TND");
                    totalAmount += 10000;
                }
                if (Salad.isChecked()) {
                    result.append("\nSalad 5000 TND");
                    totalAmount += 5000;
                }
                if (Coke.isChecked()) {
                    result.append("\nCoke 2000 TND");
                    totalAmount += 2000;
                }
                if (Sprite.isChecked()) {
                    result.append("\nSprite 2000 TND");
                    totalAmount += 2000;
                }
                if (Water.isChecked()) {
                    result.append("\nWater 1000 TND");
                    totalAmount += 1000;
                }
                result.append("\nTotal: " + totalAmount + " TND");
                // Display the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
    }
});
    }
}