package me.philio.pinentry.demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

import me.philio.pinentry.PinEntryView;

public class MainActivity extends ActionBarActivity {

    private PinEntryView pinEntryView;

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
        /*EditText yourEditText= ((PinEntryView) findViewById(R.id.pin_entry_colors_drawable)).getEditText();
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(yourEditText, InputMethodManager.SHOW_IMPLICIT);
        ((PinEntryView) findViewById(R.id.pin_entry_colors_drawable)).getEditText().requestFocus();*/
        findViewById(R.id.pin_entry_colors_drawable).requestFocus();
    }

}
