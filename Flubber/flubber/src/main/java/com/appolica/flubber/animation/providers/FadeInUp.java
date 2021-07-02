package com.appolica.flubber.animation.providers;

import android.animation.ObjectAnimator;
import android.view.View;

import androidx.annotation.NonNull;

import com.appolica.flubber.AnimationBody;
import com.appolica.flubber.utils.DimensionUtils;

public class FadeInUp extends BaseFadeIn {

    @NonNull
    protected ObjectAnimator getTranslation(AnimationBody animationBody, View view) {

        final float startY = DimensionUtils.dp2px(300) * animationBody.getForce();
        final float endY = 0f;

        final ObjectAnimator translateAnimation =
                ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, startY, endY);

        return translateAnimation;
    }
}
