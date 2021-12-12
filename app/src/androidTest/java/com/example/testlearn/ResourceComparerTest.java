package com.example.testlearn;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

//import static org.junit.Assert.*;

public class ResourceComparerTest {
    private ResourceComparer resourceComparer = new ResourceComparer();

    @Test
    boolean stringResourceSameAsGivenString_returnsTrue(){
        Context context = ApplicationProvider.getApplicationContext();
        boolean result = resourceComparer.isEqual(context, R.string.app_name, "TestLearn");
        assertThat();
    }
}