package br.usjt.cosmodossantosalmeida_eduardojunioralmeidaintsi03anbua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeiraTela extends AppCompatActivity {

    private EditText nomeText;
    private EditText assuntoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);

        nomeText = (EditText) findViewById(R.id.nomeText);
        assuntoText = (EditText) findViewById(R.id.assuntoText);

    }

    public void onClickBotaoEnviar(View view) {

        String nome = nomeText.getText().toString();
        String assunto = assuntoText.getText().toString();

        Intent intentEnviar = new Intent(getApplicationContext(), SegundaTela.class);
        Bundle parametros = new Bundle();

        parametros.putString("chave_nome", nome);
        parametros.putString("chave_assunto", assunto);

        intentEnviar.putExtras(parametros);
        startActivity(intentEnviar);

    }
}
