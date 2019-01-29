package adni.adni_gumilang.com.basic4butterknife;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toast)
    Button toast;
    @BindView(R.id.alert)
    Button alert;
    @BindView(R.id.alert2)
    Button alert2;
    @BindView(R.id.iv1)
    ImageView iv1;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.toast, R.id.alert, R.id.alert2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.toast:
                Toast.makeText(MainActivity.this, "Ini Toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.alert:
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Halo");
                builder.setMessage("Hai");
                builder.setNeutralButton("Tutup", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
                break;
            case R.id.alert2:
                break;
        }
    }
}
