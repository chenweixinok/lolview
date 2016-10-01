package com.example.lenovo.lolview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;


public class MainActivity extends ActionBarActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar sb1, sb2, sb3, sb4, sb5, sb6, sb7;
    LolView lol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lol = (LolView) findViewById(R.id.mv);

        sb1 = (SeekBar) findViewById(R.id.sb1);
        sb1.setOnSeekBarChangeListener(this);

        sb2 = (SeekBar) findViewById(R.id.sb2);
        sb2.setOnSeekBarChangeListener(this);

        sb3 = (SeekBar) findViewById(R.id.sb3);
        sb3.setOnSeekBarChangeListener(this);

        sb4 = (SeekBar) findViewById(R.id.sb4);
        sb4.setOnSeekBarChangeListener(this);

        sb5 = (SeekBar) findViewById(R.id.sb5);
        sb5.setOnSeekBarChangeListener(this);

        sb6 = (SeekBar) findViewById(R.id.sb6);
        sb6.setOnSeekBarChangeListener(this);

        sb7 = (SeekBar) findViewById(R.id.sb7);
        sb7.setOnSeekBarChangeListener(this);


    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        float values = (float) (seekBar.getProgress() / 10.0);
        switch (seekBar.getId()) {
            case R.id.sb1:
                lol.setValue1(values);
                break;
            case R.id.sb2:
                lol.setValue2(values);
                break;
            case R.id.sb3:
                lol.setValue3(values);
                break;
            case R.id.sb4:
                lol.setValue4(values);
                break;
            case R.id.sb5:
                lol.setValue5(values);
                break;
            case R.id.sb6:
                lol.setValue6(values);
                break;
            case R.id.sb7:
                lol.setValue7(values);
                break;
        }
        
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
