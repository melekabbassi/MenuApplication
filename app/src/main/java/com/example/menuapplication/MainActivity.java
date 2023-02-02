package com.example.menuapplication;

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
                    result += "\nPizza 12000";
                    totalAmount += 12000;
                }
                if (Burger.isChecked()) {
                    result += "\nBurger 10000";
                    totalAmount += 10000;
                }
                if (Pasta.isChecked()) {
                    result += "\nPasta 15000";
                    totalAmount += 15000;
                }
                if (Salad.isChecked()) {
                    result += "\nSalad 8000";
                    totalAmount += 8000;
                }
                if (Coke.isChecked()) {
                    result += "\nCoke 3000";
                    totalAmount += 3000;
                }
                if (Sprite.isChecked()) {
                    result += "\nSprite 3000";
                    totalAmount += 3000;
                }
                if (Water.isChecked()) {
                    result += "\nWater 2000";
                    totalAmount += 2000;
                }
                result += "\nTotal: " + totalAmount + " TND";
                // Display the message on the AlertDialog
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("Order Summary");
                builder.setMessage(result.toString());
                builder.show();
    }
});
    }
}