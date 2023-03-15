package silva.evangelista.santos.wilsiman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Criação de um novo botão já declarado no arquivo xml pegando ele pelo id
        Button btnEnviar = findViewById(R.id.btnEnviar);
        //vinculando o botão enviar com a classe onClick de forma que ela receba quando foi clicado
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            //Classe criada para adicionar funcionalidade ao botão quando é clicado
            public void onClick(View view) {
                //pegando campo de texto declarado no arquivo xml pelo id
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                //pegando texto que foi digitado no campo de texto declarado
                String textoDigitado = etDigiteAqui.getText().toString();
                //criando uma intenção e passando como parâmetro a tela que está inicialmente a intenção e para onde as infromações irão
                Intent intent = new Intent(MainActivity.this,NextActivity.class);
                //passando como parâmetro para o intent a mensagem que irá aparecer
                intent.putExtra("Texto", textoDigitado);
                //iniciando a intenção
                startActivity(intent);
            }
        });
    }
}