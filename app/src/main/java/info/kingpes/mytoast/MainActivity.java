package info.kingpes.mytoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        new MyToast.makeToast(MainActivity.this,"Some random here", MyToast.LENGTHTOOLONG, MyToast.SUCCESSTOAST, MyToast.BOTTOM,R.drawable.ic_android_black_24dp, "#EC407A").show();
    }
}
