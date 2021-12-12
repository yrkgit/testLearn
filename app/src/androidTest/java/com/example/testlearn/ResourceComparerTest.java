package com.example.testlearn;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

//import static org.junit.Assert.*;

public class ResourceComparerTest {
    private ResourceComparer resourceComparer;

    @Before
    void setup(){
        resourceComparer= new ResourceComparer();
    }
    @After
    void teardown(){

    }

    @Test
    void stringResourceSameAsGivenString_returnsTrue(){
        Context context = ApplicationProvider.getApplicationContext();
        boolean result = resourceComparer.isEqual(context, R.string.app_name, "TestLearn");
        assertThat(result).isTrue();

    }
    void stringResourceSameAsGivenString_returnsFasle(){
        Context context = ApplicationProvider.getApplicationContext();
        boolean result = resourceComparer.isEqual(context, R.string.app_name, "tst");
        assertThat(result).isFalse();
    }
}