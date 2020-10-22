package com.dumichelle.customapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.app.FragmentManager;
        import android.app.FragmentTransaction;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;


public class FragmentMain extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment);
        //get intent!
        Intent intent = getIntent();
        String sign = intent.getStringExtra("com.dumichelle.customapp.FragmentMain.MESSAGE");

    }
    public void ChangeFragment(View view) {
        if (view == findViewById(R.id.buttonfr1)) {
            FragmentOne fr1 = new FragmentOne();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, fr1);
            ft.commit();
        }
        if (view == findViewById(R.id.buttonfr2)) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place, new FragmentTwo());
            ft.commit();
        }
    }
    public void returnHome(View view) {
        Intent returnBtn = new Intent(getApplicationContext(),
                MainActivity.class);
        startActivity(returnBtn);
    }
}
