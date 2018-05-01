package aneto.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button button;

    private EditText editText;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.botaoIdadeId);
        editText = findViewById(R.id.textBoxAgeId);
        textView = findViewById(R.id.resultadoIdadeId);


        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = editText.getText().toString();

                if(age.isEmpty()){
                    textView.setText("Nenhum número digitado!");

                }else{
                    int numberAge = Integer.parseInt(age);
                    numberAge = numberAge * 7;

                    textView.setText("A idade do cachorro em anos humanos é de " + numberAge + " anos!");
                }
            }
        });
    }
}
