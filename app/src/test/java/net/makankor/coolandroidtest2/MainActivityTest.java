package net.makankor.coolandroidtest2;

import android.widget.Button;
import android.widget.TextView;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * Created by addy on 4/22/15.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, emulateSdk = 21)
public class MainActivityTest {
    private MainActivity instance;

    @Before
    public void setup() {
        instance = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void initialCondition() {
        TextView textView = (TextView) instance.findViewById(R.id.text_view);
        Assert.assertEquals("Hello world!", textView.getText().toString());
    }

    @Test
    public void buttonClickShouldTransformText() {
        Button button = (Button) instance.findViewById(R.id.button);
        TextView textView = (TextView) instance.findViewById(R.id.text_view);
        button.performClick();
        Assert.assertEquals("HELLO WORLD!", textView.getText().toString());
    }


}