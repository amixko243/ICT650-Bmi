package net.amir.bmi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BmiCalcu extends AppCompatActivity {
    EditText weighh,heighh,resultt;
    String calculationn,BmiResultt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calcu);

        weighh = findViewById(R.id.weighh);
        heighh = findViewById(R.id.heighh);
        resultt = findViewById(R.id.resultt);
    }


    public void CalculateBmii(View view) {
        String S1 = weighh.getText().toString();
        String S2 = heighh.getText().toString();

        float w = Float.parseFloat(S1);
        float h = Float.parseFloat(S2);

        float bmi = w/(h*h);

        if(bmi < 18.4){
            BmiResultt = "Underweight";
        }else if(bmi >18.5 && bmi < 24.9){
            BmiResultt = "Normal weight";
        }else if(bmi > 25 && bmi < 29.9){
            BmiResultt = "Overweight";
        }else if(bmi > 30 && bmi <34.9){
            BmiResultt = "Moderatey obese";
        }else if(bmi > 35 && bmi < 39.9){
            BmiResultt = "Severely obese";
        }else{
            BmiResultt = "Very severely obese";
        }

        calculationn = "Result:\n\n" + bmi + "\n" + BmiResultt;

        resultt.setText(calculationn);
    }
}