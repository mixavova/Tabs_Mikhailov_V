package com.example.tabs_mikhailov_v;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Third extends Fragment
{
    @Nullable
    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @Nullable Bundle savedInstaceState)
    {
        return inflater.inflate(R.layout.third_main, container, false);
    }
}
