package me.philio.pinentry.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import me.philio.pinentry.PinEntryView;

public class MainActivity extends AppCompatActivity {

    private PinEntryView pinEntryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pinEntryView = (PinEntryView) findViewById(R.id.pin_entry_simple);
        pinEntryView.setDigits(3);
        pinEntryView.setOnPinEnteredListener(new PinEntryView.OnPinEnteredListener() {
            @Override
            public void onPinEntered(String pin) {
                Log.d("PIN",pin);
            }
        });
    }

}
