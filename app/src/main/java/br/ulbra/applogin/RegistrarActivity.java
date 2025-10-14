package br.ulbra.applogin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrarActivity extends AppCompatActivity {
    EditText txtNome, txtLogin, txtSenha1, txtSenha2;
    Button btnCadastrar;
    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        db = new DBHelper(this);

        txtNome = (EditText)findViewById(R.id.txtNome);
        txtLogin = (EditText)findViewById(R.id.txtLogin);
        txtSenha1 = (EditText)findViewById(R.id.txtSenha1);
        txtSenha2 = (EditText)findViewById(R.id.txtSenha2);


        btnCadastrar = (Button)findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = txtLogin.getText().toString();
                String pas1 = txtSenha1.getText().toString();
                String pas2 = txtSenha2.getText().toString();
                if (userName.equals("")) {
                    Toast.makeText(RegistrarActivity.this, "Insira o LOGIN DO USUÁRIO", Toast.LENGTH_SHORT).show();
                } else if (pas1.equals("") || pas2.equals("")){
                    Toast.makeText(RegistrarActivity.this, "Insira a SENHA DO USUÁRIO", Toast.LENGTH_SHORT).show();
                }else if(!pas1.equals(pas2)){
                    Toast.makeText(RegistrarActivity.this, "As senhas não correspondem ao login do usuário", Toast.LENGTH_SHORT).show();
                }else{
                    long res = db.criarUtilizador(userName,pas1);
                    if(res>0){
//nesta parte você poderá chamar a tela principal do sistema autenticado
                        Toast.makeText(RegistrarActivity.this, "Resgistro OK", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(RegistrarActivity.this, "Senha inválida!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


}
