package me.philio.pinentry.demo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

import me.philio.pinentry.PinEntryView;

public class MainActivity extends AppCompatActivity {
    private PinEntryView pinEntryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pinEntryView = findViewById(R.id.pin_entry_simple);
        pinEntryView.setOnPinEnteredListener(new PinEntryView.OnPinEnteredListener() {
            @Override
            public void onPinEntered(String pin) {
                Toast.makeText(MainActivity.this, "Pin entered: " + pin, Toast.LENGTH_LONG).show();
            }
        });
    }

}
