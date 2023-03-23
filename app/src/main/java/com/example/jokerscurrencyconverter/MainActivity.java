package com.example.jokerscurrencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner spinnerfrom;
    private Spinner spinnerto;
//    Button convert = findViewById(R.id.convertbtn);
    private static final String[] paths = {"Pakistani Rupee (PKR)", "United States Dollar (USD)", "Japanese Yen (YEN)", "Chinese Yuan (YUAN)", "British Pound (POUND)"};

//    Pakistani Rupee (PKR), United States Dollar (USD), Japanese Yen (YEN),
//    Chinese Yuan (YUAN), and British Pound (POUND).

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = getWindow();
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.red));

        spinnerfrom = (Spinner)findViewById(R.id.from);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerfrom.setAdapter(adapter);
        spinnerfrom.setOnItemSelectedListener(this);

        spinnerto = (Spinner)findViewById(R.id.to);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerto.setAdapter(adapter2);
//        spinnerto.setOnItemSelectedListener(this);


    }

    public void convert(View view){
        Spinner from = findViewById(R.id.from);
        String fromValue = from.getSelectedItem().toString();
        Spinner to = findViewById(R.id.to);
        String toValue = to.getSelectedItem().toString();
        EditText main_value = findViewById(R.id.actualvalue);
        double actual_value;
        double new_value;
        double roundedValue;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        TextView result_name = findViewById(R.id.resultname);
        TextView result_value = findViewById(R.id.resultvalue);
//        Toast.makeText(this,selectedValue,Toast.LENGTH_SHORT).show();
        if(!main_value.getText().toString().isEmpty()) {
            switch (fromValue) {
                case "Pakistani Rupee (PKR)":
//                Toast.makeText(this,main_value.getText().toString(),Toast.LENGTH_SHORT).show();
                    switch (toValue) {
                        case "Pakistani Rupee (PKR)":
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 1;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Pakistani Rupee (PKR)");
                            break;
                        case "United States Dollar (USD)":
//                        Toast.makeText(this,"2",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 0.0035;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("United States Dollar (USD)");
                            break;
                        case "Japanese Yen (YEN)":
//                        Toast.makeText(this,"3",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 0.47;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Japanese Yen (YEN)");
                            break;

                        case "Chinese Yuan (YUAN)":
//                        Toast.makeText(this,"4",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 0.024;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Chinese Yuan (YUAN)");
                            break;
                        case "British Pound (POUND)":
//                        Toast.makeText(this,"5",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 0.0029;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("British Pound (POUND)");
                            break;
                    }

                    break;


                case "United States Dollar (USD)":
//                Toast.makeText(this,"2",Toast.LENGTH_SHORT).show();
                    switch (toValue) {
                        case "Pakistani Rupee (PKR)":
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 281.62;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Pakistani Rupee (PKR)");
                            break;
                        case "United States Dollar (USD)":
//                        Toast.makeText(this,"2",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 1;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("United States Dollar (USD)");
                            break;
                        case "Japanese Yen (YEN)":
//                        Toast.makeText(this,"3",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 131.29;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Japanese Yen (YEN)");
                            break;

                        case "Chinese Yuan (YUAN)":
//                        Toast.makeText(this,"4",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 6.83;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Chinese Yuan (YUAN)");
                            break;
                        case "British Pound (POUND)":
//                        Toast.makeText(this,"5",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 0.81;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("British Pound (POUND)");
                            break;
                    }

                    break;
                case "Japanese Yen (YEN)":
//                Toast.makeText(this,"3",Toast.LENGTH_SHORT).show();
                    switch (toValue) {
                        case "Pakistani Rupee (PKR)":
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 2.15;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Pakistani Rupee (PKR)");
                            break;
                        case "United States Dollar (USD)":
//                        Toast.makeText(this,"2",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 0.0076;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("United States Dollar (USD)");
                            break;
                        case "Japanese Yen (YEN)":
//                        Toast.makeText(this,"3",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 1;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Japanese Yen (YEN)");
                            break;

                        case "Chinese Yuan (YUAN)":
//                        Toast.makeText(this,"4",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 0.052;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Chinese Yuan (YUAN)");
                            break;
                        case "British Pound (POUND)":
//                        Toast.makeText(this,"5",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 0.0062;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("British Pound (POUND)");
                            break;
                    }
                    break;
                case "Chinese Yuan (YUAN)":
//                Toast.makeText(this,"4",Toast.LENGTH_SHORT).show();
                    switch (toValue) {
                        case "Pakistani Rupee (PKR)":
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 41.24;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Pakistani Rupee (PKR)");
                            break;
                        case "United States Dollar (USD)":
//                        Toast.makeText(this,"2",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 0.15;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("United States Dollar (USD)");
                            break;
                        case "Japanese Yen (YEN)":
//                        Toast.makeText(this,"3",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 19.22;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Japanese Yen (YEN)");
                            break;

                        case "Chinese Yuan (YUAN)":
//                        Toast.makeText(this,"4",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 1;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Chinese Yuan (YUAN)");
                            break;
                        case "British Pound (POUND)":
//                        Toast.makeText(this,"5",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 0.12;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("British Pound (POUND)");
                            break;
                    }
                    break;
                case "British Pound (POUND)":
//                Toast.makeText(this,"5",Toast.LENGTH_SHORT).show();
                    switch (toValue) {
                        case "Pakistani Rupee (PKR)":
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 346.17;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Pakistani Rupee (PKR)");
                            break;
                        case "United States Dollar (USD)":
//                        Toast.makeText(this,"2",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 1.23;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("United States Dollar (USD)");
                            break;
                        case "Japanese Yen (YEN)":
//                        Toast.makeText(this,"3",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 161.34;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Japanese Yen (YEN)");
                            break;

                        case "Chinese Yuan (YUAN)":
//                        Toast.makeText(this,"4",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 8.39;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("Chinese Yuan (YUAN)");
                            break;
                        case "British Pound (POUND)":
//                        Toast.makeText(this,"5",Toast.LENGTH_SHORT).show();
                            actual_value = Double.parseDouble(main_value.getText().toString());
                            new_value = actual_value * 1;
                            roundedValue = Double.parseDouble(decimalFormat.format(new_value));
                            result_value.setText(Double.toString(roundedValue));
                            result_name.setText("British Pound (POUND)");
                            break;
                    }
                    break;
            }
        }else {
            Toast.makeText(this,"Nooice Tryy ;)",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {
        TextView fromname = findViewById(R.id.fromname);
        switch (position) {
            case 0:
                fromname.setText("Pakistani Rupee (PKR)");
                break;
            case 1:
                // Whatever you want to happen when the second item gets selected
//                Toast.makeText(this,"test",Toast.LENGTH_LONG).show();
                fromname.setText("United States Dollar (USD)");
                break;
            case 2:
                // Whatever you want to happen when the thrid item gets selected
                fromname.setText("Japanese Yen (YEN)");
                break;
            case 3:
                // Whatever you want to happen when the thrid item gets selected
                fromname.setText("Chinese Yuan (YUAN)");
                break;
            case 4:
                // Whatever you want to happen when the thrid item gets selected
                fromname.setText("British Pound (POUND)");
                break;

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}