PinEntryView
============

## About

A PIN entry view widget for Android based on the Android 5 Material Theme via the AppCompat v7
support library.

Uses a hidden `EditText` to handle input, hence behaves much in the same was as an `EditText` on the
screen and supports similar features.

## Download

### Gradle

Add the following to your `build.gradle`:

    compile 'me.philio:pinentryview:1.0.0'

## Styling

### Attributes

* numDigits - The number of digits in the PIN, default 4.
* digitWidth - The width of the digit view, default 50dp.
* digitHeight - The heigh of the digit view, default 50dp.
* digitSpacing - The distance between the digit views, default 20dp.
* digitBackground - A resource to use for the digit views, supports drawables or colours and can
  be used with a custom selector as an alternative to using the built in accent support (by setting
  the `accentColor` as transparent). Defaults to `android:windowBackground` from the current theme.
* digitTextSize - The size of the text in the digit view, default 15sp.
* digitTextColor - The colour of the text in the digit view, defaults to `android:textColorPrimary`
  from the current theme.
* mask - A character to use as a mask for the entered PIN value, can be set to an empty string to
  show typed numbers, default *.
* accentColor - The colour of the accent to use to highlight the view when it's in focus, defaults
  to `android:colorAccent` from the current theme.
* accentWidth - The width of the accent highlight, default 3dp.
* accentType - Defines the behaviour of the accent:
  * none - Disabled
  * all - highlights each separate digit view
  * character - highlights a single digit view to represent the position of the cursor
  defaults to none.