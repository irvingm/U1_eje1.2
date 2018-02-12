package ittepic.edu.mx.u1_ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button multiplicacion;
    EditText n;
    SeekBar m;
    TextView resultado, bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n = (EditText)findViewById(R.id.etnum);
        m= (SeekBar) findViewById(R.id.seekBar);
        multiplicacion= (Button) findViewById(R.id.btncalcular);
        resultado = (TextView) findViewById(R.id.tvresultado);
        bar = (TextView) findViewById(R.id.textView2);



        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numN, numM;
                String resultado1= "";

                numN = Integer.parseInt(n.getText().toString());
                numM = m.getProgress();

                for (int i=1;i<=numM;i++){
                    resultado1+= numN+" x "+i+" = "+(numN*i)+"\n";
                }
                resultado.setText(resultado1);
            }
        });
        m.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                bar.setText("Multiplicar por: "+m.getProgress());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}

