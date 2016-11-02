package com.wuzch.animationlearning;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by Administrator on 2016/10/31.
 */

public class CustomAnime extends Animation {
    /**
     * 获取对象的宽高，和获取父级容器的宽高
     * @param width
     * @param height
     * @param parentWidth
     * @param parentHeight
     */
    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
    }

    /**
     * 进行动画的设置
     * @param interpolatedTime
     * @param t
     */
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        t.getMatrix().setTranslate((float) (Math.sin(interpolatedTime*15)*50),(float) (Math.cos(interpolatedTime*15)*50));
        super.applyTransformation(interpolatedTime, t);
    }
}
