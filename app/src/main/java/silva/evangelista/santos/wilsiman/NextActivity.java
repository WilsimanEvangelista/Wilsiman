package silva.evangelista.santos.wilsiman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        //declarando intent e pegando ela para ser manipulada
        Intent i = getIntent();
        //declarando o texto digitado e pegando ele pelo nome
        String textoDigitado = i.getStringExtra("Texto");
        //pegando caixa de texto criada no arquivo xml para ser manipulada
        TextView tvText = findViewById(R.id.tvText);
        //pegando caixa de texto desta activity e colocando o texto digitado nele que foi recebido por meio da intent
        tvText.setText(textoDigitado);
    }
}