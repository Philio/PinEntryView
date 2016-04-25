package me.philio.pinentry;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef(flag=true, value={PinEntryView.ACCENT_NONE, PinEntryView.ACCENT_ALL, PinEntryView.ACCENT_CHARACTER})
@Retention(RetentionPolicy.SOURCE)
public @interface AccentType {}
