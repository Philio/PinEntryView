PinEntryView
============

## About

A PIN entry view widget for Android with support for Android 5 Material Theme features via the
AppCompat v7 support library.

<img src="https://philio.me/content/images/2014/11/PinEntryView-Demo.gif" width="360" height="640" />

Uses a hidden `EditText` to handle input, hence behaves much in the same was as an `EditText` on the
screen and supports similar features.

## Demo

The demo app running the latest release build is also available on Google Play:

<a href="https://play.google.com/store/apps/details?id=me.philio.pinentry.demo&utm_source=global_co&utm_medium=prtnr&utm_content=Mar2515&utm_campaign=PartBadge&pcampaignid=MKT-AC-global-none-all-co-pr-py-PartBadges-Oct1515-1"><img alt="Get it on Google Play" src="https://play.google.com/intl/en_us/badges/images/apps/en-play-badge.png" /></a>

## Change log

* 1.0.6 - Added `pinInputType` attribute to allow changing the input type, fixed #7
* 1.0.5 - Added `setText` and `clearText` methods, updated build to API 22
* 1.0.4 - Changed attribute name `accentColor` to `pinAccentColor` to avoid conflicts with other
libraries
* 1.0.3 - Fixed #2, gravity of digits now correctly displayed
* 1.0.2 - Add support for elevation on the digits in Lollipop
* 1.0.1 - Minor fixes
* 1.0.0 - Initial release

## Download

### Gradle

Add the following to your `build.gradle`:

    compile 'me.philio:pinentryview:1.0.6'

## Styling

### Attributes

* `numDigits` - The number of digits in the PIN, default 4.
* `digitWidth` - The width of the digit view, default 50dp.
* `digitHeight` - The heigh of the digit view, default 50dp.
* `digitSpacing` - The distance between the digit views, default 20dp.
* `digitBackground` - A resource to use for the digit views, supports drawables or colours and can
  be used with a custom selector as an alternative to using the built in accent support (by setting
  the `accentColor` as transparent). Defaults to `android:windowBackground` from the current theme.
* `digitTextSize` - The size of the text in the digit view, default 15sp.
* `digitTextColor` - The colour of the text in the digit view, defaults to `android:textColorPrimary`
  from the current theme.
* `digitElevation` - Set the elevation of the digit views, API 21+ only, default 0dp.
* `mask` - A character to use as a mask for the entered PIN value, can be set to an empty string to
  show typed numbers, default *.
* `pinAccentColor` - The colour of the accent to use to highlight the view when it's in focus, defaults
  to `android:colorAccent` from the current theme.
* `accentWidth` - The width of the accent highlight, default 3dp.
* `accentType` - Defines the behaviour of the accent, default none, options:
  * `none` - disabled
  * `all` - highlights each separate digit view
  * `character` - highlights a single digit view to represent the position of the cursor
* `accentRequiresFocus` - show accent only when focused, default true
* `pinInputType` - Set the input type, default number, options:
  * `text` - full keyboard, any available character allowed
  * `number` - numeric keyboard, only numbers allowed

## License

Copyright 2014-2015 Phil Bayfield

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

&nbsp;&nbsp;&nbsp;&nbsp;http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.