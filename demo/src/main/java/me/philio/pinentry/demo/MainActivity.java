package me.philio.pinentry.demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import me.philio.pinentry.PinEntryView;

public class MainActivity extends ActionBarActivity {

    private PinEntryView pinEntryView;
    private CheckBox disableCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pinEntryView = (PinEntryView) findViewById(R.id.pin_entry_simple);
        pinEntryView.setOnPinEnteredListener(new PinEntryView.OnPinEnteredListener() {
            @Override
            public void onPinEntered(String pin) {
                Toast.makeText(MainActivity.this, "Pin entered: " + pin, Toast.LENGTH_LONG).show();
            }
        });

        disableCheck = (CheckBox) findViewById(R.id.disableCheck);
        disableCheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                pinEntryView.setFocusable(!b);
                pinEntryView.setFocusableInTouchMode(!b);
            }
        });
    }
}
