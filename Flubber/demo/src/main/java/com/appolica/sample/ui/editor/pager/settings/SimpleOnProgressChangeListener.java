package com.appolica.sample.ui.editor.pager.settings;

import org.adw.library.widgets.discreteseekbar.DiscreteSeekBar;

public class SimpleOnProgressChangeListener implements DiscreteSeekBar.OnProgressChangeListener {

    public static DiscreteSeekBar.OnProgressChangeListener forProgressChanged(OnProgressChangedListener listener) {
        return new SimpleOnProgressChangeListener() {
            @Override
            public void onProgressChanged(DiscreteSeekBar seekBar, int value, boolean fromUser) {
                listener.onProgressChanged(seekBar, value, fromUser);
            }
        };
    }

    public static DiscreteSeekBar.OnProgressChangeListener forStartTrackingTouch(OnStartTrackingTouchListener listener) {
        return new SimpleOnProgressChangeListener() {
            @Override
            public void onStartTrackingTouch(DiscreteSeekBar seekBar) {
                listener.onStartTrackingTouch(seekBar);
            }
        };
    }

    public static DiscreteSeekBar.OnProgressChangeListener forStopTrackingTouch(OnStopTrackingTouchListener listener) {
        return new SimpleOnProgressChangeListener() {
            @Override
            public void onStopTrackingTouch(DiscreteSeekBar seekBar) {
                listener.onStopTrackingTouch(seekBar);
            }
        };
    }

    @Override
    public void onProgressChanged(DiscreteSeekBar seekBar, int value, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(DiscreteSeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(DiscreteSeekBar seekBar) {

    }

    public interface OnProgressChangedListener {
        void onProgressChanged(DiscreteSeekBar seekBar, int value, boolean fromUser);
    }

    public interface OnStartTrackingTouchListener {
        void onStartTrackingTouch(DiscreteSeekBar seekBar);
    }

    public interface OnStopTrackingTouchListener {
        void onStopTrackingTouch(DiscreteSeekBar seekBar);
    }
}
