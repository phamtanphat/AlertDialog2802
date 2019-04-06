package khoapham.ptp.phamtanphat.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAlertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlertDialog = findViewById(R.id.buttonAlertDialog);


        btnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Bạn có muốn thoát ứng dụng hay không?");

                builder.setIcon(R.mipmap.ic_launcher);
                builder.setCancelable(false);

                final String mangmonhoc[] = {"Android","React native","ios","php","css"};


                builder.setSingleChoiceItems(mangmonhoc, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position) {
                        Toast.makeText(MainActivity.this, mangmonhoc[position], Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });
    }
    public void setAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Bạn có muốn thoát ứng dụng hay không?");
        builder.setMessage("Bạn xác nhận bên dưới");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setCancelable(false);

        builder.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Co", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNeutralButton("Huy", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }
}
