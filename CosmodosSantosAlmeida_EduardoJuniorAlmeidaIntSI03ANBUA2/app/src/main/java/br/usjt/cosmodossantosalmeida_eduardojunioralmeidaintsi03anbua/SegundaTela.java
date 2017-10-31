package br.usjt.cosmodossantosalmeida_eduardojunioralmeidaintsi03anbua;

import android.content.Intent;
import android.net.sip.SipAudioCall;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        Intent intentReceber = getIntent();
        Bundle parametros = intentReceber.getExtras();

        if (parametros != null) {

            if(parametros.get("chave_assunto").toString().equalsIgnoreCase("tecnico")) {

                String nome = parametros.getString("chave_nome");
                Toast.makeText(SegundaTela.this, "Bem Vindo(a),  " + nome, Toast.LENGTH_SHORT).show();

                ListView lista = (ListView) findViewById(R.id.listaLivros);
                String [] livrosTecnicos = new String[] {"Concreates Mathematics", "The c++ Programming Language"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, livrosTecnicos);
                lista.setAdapter(adapter);

            } else {
                ListView lista = (ListView) findViewById(R.id.listaLivros);
                String [] livrosTecnicos = new String[] {"Capitães da areia", "A culpa é das estrelas", "Orgulho e preconceito", "1984"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, livrosTecnicos);
                lista.setAdapter(adapter);
            }
        }

        /*String nome = parametros.getString("chave_nome");
        String assunto = parametros.getString("chave_assunto");

        Toast.makeText(SegundaTela.this, "Nome: " + nome + "Assunto: " + assunto, Toast.LENGTH_SHORT).show();*/
    }
}
