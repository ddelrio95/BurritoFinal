package com.example.finalburrito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import static com.example.finalburrito.R.layout.activity_burrito2;

public class Burrito2 extends AppCompatActivity {
    TextView orderTextView;
    TextView priceTextView;

    CheckBox lettuceCheckbox;
    CheckBox spinachCheckbox;
    CheckBox tomatoCheckBox;
    CheckBox cornCheckBox;
    CheckBox brownRiceCheckBox;
    CheckBox redBeansCheckBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_burrito2);
        orderTextView = (TextView) findViewById(R.id.orderTextView);
        priceTextView = (TextView) findViewById(R.id.priceTextView);



        lettuceCheckbox = (CheckBox) findViewById(R.id.lettuceCheckBox);

        spinachCheckbox = (CheckBox) findViewById(R.id.spinachCheckBox);

        tomatoCheckBox = (CheckBox) findViewById(R.id.tomatoesCheckBox);

        cornCheckBox = (CheckBox) findViewById(R.id.cornCheckBox);

        brownRiceCheckBox = (CheckBox) findViewById(R.id.brownRiceCheckBox);

        redBeansCheckBox = (CheckBox) findViewById(R.id.redBeansCheckBox);
    }

    public void checkOrder(View view) {
        String myOrder = "";
        double price = 4.95;
        if (lettuceCheckbox.isChecked()){
            myOrder += "Lettuce";

        }
        if (spinachCheckbox.isChecked()){
            myOrder += " Spinach";
        }
        if (cornCheckBox.isChecked()){
            myOrder += " Corn";
            price = price + 1.00;
        }
        if (tomatoCheckBox.isChecked()){
            myOrder += " Tomatoes";
        }
        if (brownRiceCheckBox.isChecked()){
            myOrder += " Brown Rice";
        }
        if (redBeansCheckBox.isChecked()){
            myOrder += " Red Beans";
        }

        orderTextView.setText(myOrder);
        String totalPrice = Double.toString(price);

        priceTextView.setText(String.format("$"+totalPrice));
    }
}


