package net.amir.bmi2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMICalculation extends AppCompatActivity{

    Button btnHome;
    Button btnReset;
    EditText weight, height;
    TextView result;
    String calculation, BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i_calculation);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        result = findViewById(R.id.result);

        btnReset = findViewById(R.id.btnReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weight.getText().clear();
                height.getText().clear();
            }
        });

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Calculate Now");




    }

    public void calculateBMI(View view) {
        String S1 = weight.getText().toString();
        String S2 = height.getText().toString();

        float weightValue = Float.parseFloat(S1);
        float heightValue = Float.parseFloat(S2)/100;

        float bmi = weightValue/(heightValue*heightValue);

        if(bmi < 18.4){
            BMIresult = "Underweight";
        }else if(bmi >18.5 && bmi < 24.9){
            BMIresult = "Normal weight";
        }else if(bmi > 25 && bmi < 29.9){
            BMIresult = "Overweight";
        }else if(bmi > 30 && bmi <34.9){
            BMIresult = "Moderatey obese";
        }else if(bmi > 35 && bmi < 39.9){
            BMIresult = "Severely obese";
        }else{
            BMIresult = "Very severely obese";
        }

        calculation = bmi + "\n" + BMIresult;

        result.setText(calculation);
    }


    public void resetBox(View v) {
    }
}